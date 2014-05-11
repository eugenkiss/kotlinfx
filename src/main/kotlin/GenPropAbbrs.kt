package genpropabbrs

import util.join
import util.dekeyword
import util.getPropertyValueType
import util.allJavaFXClasses
import util.projectRoot
import java.nio.file.Paths
import java.io.FileWriter
import java.lang.reflect.Modifier

fun main(args: Array<String>) {
    val abbrPath = Paths.get(projectRoot, "kotlinfx-core", "src", "main", "kotlin", "kotlinfx", "abbreviations", "Generated.kt")!!
    val fw = FileWriter(abbrPath.toFile())
    fw.append("package kotlinfx.abbreviations\n\n")

    for (clazz in allJavaFXClasses()) {
        if (clazz.getCanonicalName() == null) continue;
        if (!Modifier.isPublic(clazz.getModifiers())) continue

        val className = clazz.getCanonicalName()!!
        var classNamePrinted = false

        for (method in clazz.getDeclaredMethods()) {
            val name = method.getName()!!

            if (!name.endsWith("Property")) continue
            if (name.contains("impl_")) continue // For public types that should be treated as private
            if (!Modifier.isPublic(method.getModifiers())) continue
            // TODO JavaFX properties that take a parameter are not supported yet
            if (method.getParameterCount() > 0) continue
            // TODO Static properties are not supported yet
            if (Modifier.isStatic(method.getModifiers())) continue
            // Not worth the trouble.
            // TODO Provide manually.
            val fullName = "$className.$name"
            if (fullName in listOf(
                "javafx.print.JobSettings.pageRangesProperty",
                "javafx.scene.control.TableView.TableViewFocusModel.focusedCellProperty",
                "javafx.scene.control.TableCell.tableRowProperty",
                "javafx.scene.control.TableView.columnResizePolicyProperty",
                "javafx.scene.control.TreeTableView.columnResizePolicyProperty"
            )) continue

            val shortName = dekeyword(name.substring(0..name.length-9)) + "p"

            val ty = kotlinfyType(method.getGenericReturnType()!!.getTypeName()!!)
            val tyParamList = clazz.getTypeParameters().toArrayList()
            val tyParams = util.genTypeParamsString(tyParamList)
            val tyParamsFirst = util.genFirstTypeParamsString(tyParamList)
            val template =
"""
[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val $tyParamsFirst $className$tyParams.$shortName: $ty
    get() = $name()!!
"""
            if (!classNamePrinted) {
                fw.append("\n// "+className+"\n")
                classNamePrinted = true
            }
            fw.append(template)
            println(className); println("  "+name)
        }
    }

    fw.close()
}

fun kotlinfyType(ty: String): String {
    var t = util.kotlinfyType(ty)
    // The following are special cases where I could not think of a general solution
    t = t.replace("TableView.ResizeFeatures", "TableView.ResizeFeatures<S>")
    t = t.replace("in javafx.scene.transform.TransformChangedEvent",
                  "in javafx.scene.transform.TransformChangedEvent?")
    t = t.replace("javafx.scene.input.MouseDragEvent", "javafx.scene.input.MouseDragEvent?")
    t = t.replace("javafx.scene.input.MouseEvent", "javafx.scene.input.MouseEvent?")
    t = t.replace("javafx.scene.input.SwipeEvent", "javafx.scene.input.SwipeEvent?")
    t = t.replace("javafx.scene.input.ScrollEvent", "javafx.scene.input.ScrollEvent?")
    t = t.replace("javafx.scene.input.ZoomEvent", "javafx.scene.input.ZoomEvent?")
    t = t.replace("javafx.scene.input.ContextMenuEvent", "javafx.scene.input.ContextMenuEvent?")
    t = t.replace("javafx.scene.input.RotateEvent", "javafx.scene.input.RotateEvent?")
    t = t.replace("javafx.scene.input.KeyEvent", "javafx.scene.input.KeyEvent?")
    t = t.replace("javafx.scene.input.TouchEvent", "javafx.scene.input.TouchEvent?")
    t = t.replace("javafx.scene.input.InputMethodEvent", "javafx.scene.input.InputMethodEvent?")
    t = t.replace("javafx.scene.input.DragEvent", "javafx.scene.input.DragEvent?")
    if (t == "javafx.scene.control.TablePosition") t = "javafx.scene.control.TablePosition<*,*>"
    if (t == "javafx.scene.control.TableRow") t = "javafx.scene.control.TableRow<*>"
    return t
}

