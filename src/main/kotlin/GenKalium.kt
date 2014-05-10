package genkalium

import util.join
import util.dekeyword
import util.getPropertyValueType
import util.allJavaFXClasses
import util.projectRoot
import java.nio.file.Paths
import java.io.FileWriter
import java.lang.reflect.Modifier

fun main(args: Array<String>) {
    val kaliumPath = Paths.get(projectRoot, "kotlinfx-core", "src", "main", "kotlin", "kotlinfx", "kalium", "Generated.kt")!!
    val fw = FileWriter(kaliumPath.toFile())
    fw.append("package kotlinfx.kalium\n\n")
    fw.append("import kotlinfx.kalium.template\n\n")
    fw.append("import javafx.beans.value.ObservableValue\n\n")

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

            val shortName = dekeyword(name.substring(0..name.length-9))

            // See http://docs.oracle.com/javafx/2/api/javafx/beans/property/package-summary.html
            val ty = method.getGenericReturnType()!!.getTypeName()!!
            val valTy: String? = getPropertyValueType(ty)
            if (valTy == null) {
                println("ERROR: $ty")
                continue
            }

            val valTyKt = kotlinfyType(valTy)
            val tyParamList = clazz.getTypeParameters().toArrayList()
            val tyParams = util.genTypeParamsString(tyParamList)
            val tyParamsFirst = util.genFirstTypeParamsString(tyParamList)
            val template =
"""
[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun $tyParamsFirst $className$tyParams.$shortName(f: (() -> $valTyKt)? = null): $valTyKt =
    template<$valTyKt>("$shortName", f, this, ${name}()!! as ObservableValue<$valTyKt>)
"""
            if (!classNamePrinted) {
                fw.append("\n// "+className+"\n")
                classNamePrinted = true
            }
            fw.append(template)
            println(className); println("  "+valTyKt)
        }
    }

    fw.close()
}

fun kotlinfyType(ty: String): String {
    var t = util.kotlinfyType(ty)
    // The following are special cases where I could not think of a general solution
    t = t.replace("TableView.ResizeFeatures", "TableView.ResizeFeatures<S>")
    if (t == "javafx.scene.control.TablePosition") t = "javafx.scene.control.TablePosition<*,*>"
    if (t == "javafx.scene.control.TableRow") t = "javafx.scene.control.TableRow<*>"
    return t
}

