package genpropertiesext

import java.nio.file.Paths
import java.io.FileWriter
import org.reflections.util.ClasspathHelper
import org.reflections.Reflections
import org.reflections.util.ConfigurationBuilder
import org.reflections.scanners.SubTypesScanner
import org.reflections.scanners.ResourcesScanner
import java.lang.reflect.Modifier
import java.lang.reflect.Method
import genkaliumext.stdExtractValueType

fun main(args: Array<String>) {
    // TODO Extract to helper function
    // http://stackoverflow.com/questions/520328/can-you-find-all-classes-in-a-package-using-reflection
    val c1 = ClasspathHelper.contextClassLoader()
    val c2 = ClasspathHelper.staticClassLoader()
    val reflections = Reflections(ConfigurationBuilder()
        .setScanners(SubTypesScanner(false), ResourcesScanner())!!
        .setUrls(ClasspathHelper.forClassLoader(c1, c2))!!
        .filterInputsBy { it!!.startsWith("javafx") && !it.startsWith("javafx.embed") }
    )
    [suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")]
    val classes = reflections.getSubTypesOf(javaClass<Object>())!!

    val projectRoot = Paths.get(javaClass<Unit>().getClassLoader()!!.getResource(".")!!.getPath()!!)!!.
    getParent()!!.getParent()!!.getParent()!!.toFile().getAbsolutePath();
    val propPath = Paths.get(projectRoot, "kotlinfx-core", "src", "main", "kotlin", "kotlinfx", "properties")!!.toFile().getAbsolutePath()
    val propPaths = listOf(1, 2, 3, 4).map { Paths.get(propPath, "Generated$it.kt")!!.toFile() }
    var fw: FileWriter? = null

    var i = 0
    var j = 0
    for (clazz in classes) {
        if (clazz.getCanonicalName() == null) continue;
        if (!Modifier.isPublic(clazz.getModifiers())) continue

        val className = clazz.getCanonicalName()!!
        var classNamePrinted = false // to not print class name as a comment more than once
        val allMethods = clazz.getMethods().toList()
        val methods = clazz.getDeclaredMethods().toList()
        // Actually, using methods should be enough, but for some reaseon Kotlin sometimes
        // has problems to use an extension property defined on a super class. For instance,
        // Labeled.text is generated and Labeled is a super class of TextField. Yet Kotlin
        // does not finde the text property for a text field. Other times it works (e.g. with disable
        // which is only defined for Node but can be used e.g. on a Button)
        // TODO: Once Kotlin is smarter use methods instead of allMethods to not generate so much code.
        val xetterPairs = allMethods.
                filter { val name = it.getName()!!; val modifiers = it.getModifiers()
                         (name.startsWith("get") || name.startsWith("set")) &&
                         name.length > 3 &&
                         // getter => must have 0 parameters, setter => must have 1 parameter
                         (!name.startsWith("get") || it.getParameterCount() == 0) &&
                         (!name.startsWith("set") || it.getParameterCount() == 1) &&
                         // TODO Static xetters are not supported yet
                         !Modifier.isStatic(modifiers) &&
                         Modifier.isPublic(modifiers)}.
                groupBy { it.getName()!!.substring(3) }

//        if (className != "javafx.scene.Node") continue
        for ((suffix, xetters) in xetterPairs) {

            val name = dekeyword(suffix.first().toString().toLowerCase() + suffix.substring(1))

            // We don't need a property for getClass()
            if (name == "clazz") continue

//            println(name + ": " + xetters.map { it.getName()!! })
            if (name.contains("impl_")) continue // For public types that should be treated as private
            // Getter returns double[] but setter accepts double.., Kotlin does not like this
            if (name == "dividerPositions") continue
            // Not worth the trouble maybe provide them manually
            if (name == "cssMetaData") continue
            if (/*className == "javafx.scene.control.ResizeFeaturesBase" &&*/ name == "column") continue
            if (/*className == "javafx.scene.control.TableColumnBase" &&*/ (name == "parentColumn" || name == "columns")) continue
            if (/*className == "javafx.scene.control.TablePosition" &&*/ name == "tableColumn") continue
            if (className == "javafx.scene.control.TableFocusModel") continue
            if (className == "javafx.scene.control.TableView.TableViewFocusModel") continue
            if (className == "javafx.scene.control.TreeTableView.TreeTableViewFocusModel") continue
            if (className == "javafx.collections.transformation.SortedList") continue
            if (className == "javafx.beans.value.WritableListValue") continue
            if (className == "javafx.beans.value.ObservableListValue") continue
            if (className == "javafx.beans.binding.NumberExpressionBase") continue
            if (className == "javafx.beans.value.ObservableBooleanValue") continue
            if (className == "javafx.beans.value.WritableIntegerValue") continue
            if (className == "javafx.beans.value.WritableMapValue") continue
            if (className == "javafx.beans.value.WritableBooleanValue") continue
            if (className == "javafx.beans.value.WritableLongValue") continue
            if (className == "javafx.beans.value.WritableFloatValue") continue
            if (className == "javafx.beans.value.WritableNumberValue") continue
            if (className == "javafx.beans.value.ObservableSetValue") continue
            if (className == "javafx.beans.value.ObservableMapValue") continue
            if (className == "javafx.beans.value.WritableSetValue") continue
            if (className == "javafx.beans.value.ObservableLongValue") continue
            if (className == "javafx.beans.value.WritableStringValue") continue
            if (className == "javafx.beans.value.WritableDoubleValue") continue
            if ("$className.$name" == "javafx.css.FontCssMetaData.converter") continue
            if ("$className.$name" == "javafx.collections.transformation.FilteredList.source") continue
            if ("$className.$name" == "javafx.scene.control.TreeTableView.TreeTableViewSelectionModel.selectedIndices") continue
            if ("$className.$name" == "javafx.scene.control.TreeTableView.TreeTableViewSelectionModel.selectedItem") continue
            if ("$className.$name" == "javafx.scene.control.TreeTableView.TreeTableViewSelectionModel.selectedItems") continue
            if ("$className.$name" == "javafx.scene.control.TableView.TableViewSelectionModel.selectedIndices") continue
            if ("$className.$name" == "javafx.scene.control.TableView.TableViewSelectionModel.selectedItem") continue
            if ("$className.$name" == "javafx.scene.control.TableView.TableViewSelectionModel.selectedItems") continue
            if ("$className.$name" == "javafx.scene.control.cell.ProgressBarTableCell.item") continue
            if ("$className.$name" == "javafx.scene.control.cell.ProgressBarTreeTableCell.item") continue
            if ("$className.$name" == "javafx.scene.control.DateCell.item") continue
            if ("$className.$name" == "javafx.scene.chart.CategoryAxis.tickMarks") continue


            var getter0 = xetters.firstOrNull { it.getName()!!.startsWith("get") }
            val setter = xetters.firstOrNull { it.getName()!!.startsWith("set") }

            // Kotlin does not support write-only properties.
            // Still, for example, Button has setDisable without getDisable but there is disableProperty().get().
            // There are approx. 100 situations like this so it is worthwhile to solve the problem in general
            // That is, get the getter from the property.
            val getterAlt = allMethods.firstOrNull { it.getName()!!.endsWith(name+"Property") }
            var b = false
            if (getter0 == null && getterAlt == null) continue
            if (getter0 == null && getterAlt != null) {
                getter0 = getterAlt
                b = true
            }
            val getter = getter0!!
            println(name + ": " + xetters.map { it.getName()!! })
//            if (getter.getParameterCount() > 0) continue

            val va = if (setter == null) "val" else "var"
            var ty: String? = kotlinfyType(getter.getGenericReturnType()!!.getTypeName()!!)
            if (b) ty = stdExtractValueType(ty!!)
            // Special cases
            if (className == "javafx.scene.control.TableSelectionModel" && name == "selectedIndices")
                ty = "javafx.collections.ObservableList<Int>"
            if ("$className.$name" == "javafx.scene.control.ColorPicker.value")
                ty = "javafx.scene.paint.Color"
            if ("$className.$name" == "javafx.scene.control.DatePicker.value")
                ty = "java.time.LocalDate"
            if ("$className.$name" == "javafx.beans.value.ObservableStringValue.value")
                ty = "String"
            if ("$className.$name" == "javafx.beans.value.ObservableDoubleValue.value")
                ty = "Number"
            if ("$className.$name" == "javafx.beans.value.ObservableFloatValue.value")
                ty = "Number"
            if ("$className.$name" == "javafx.beans.value.ObservableIntegerValue.value")
                ty = "Number"
            if ("$className.$name" == "javafx.beans.value.ObservableNumberValue.value")
                ty = "Number"
            if ("$className.$name" == "javafx.beans.binding.NumberBinding.value")
                ty = "Number"
            if ("$className.$name" == "javafx.beans.binding.NumberExpression.value")
                ty = "Number"
            if ("$className.$name" == "javafx.scene.control.cell.ProgressBarTreeTableCell.item")
                ty = "S"
            if (name == "value" && ty == "Any" && (className.contains("property") || className.contains("Property")))
                ty = when{
                    className.contains("string") || className.contains("String") -> "String"
                    className.contains("boolean") || className.contains("Boolean") -> "Boolean"
                    else -> "Number"
                }
            if (ty == "javafx.print.PageRange[]") continue // Problem
            val tyParamList = clazz.getTypeParameters().toArrayList()
            var tyParams = if (tyParamList.isEmpty()) "" else "<${tyParamList.join(", ")}>"
            // The complexity is due to having to consider bounds on generic parameters
            var tyParamsFirst = when {
                "$className.$name" == "javafx.fxml.FXMLLoader.root" ||
                "$className.$name" == "javafx.fxml.FXMLLoader.controller" -> "<T>" // Special case
                tyParamList.isEmpty() -> ""
                else ->
                    "<${tyParamList map {
                        val bs = it!!.getBounds()!! map { kotlinfyTypeBound(it.toString()!!) } filterNot { it == "Any" }
                        val bounds = if (bs.isEmpty()) "" else ":" + bs.join(", ")
                        "$it$bounds" } join ", "}>"
            }
            if (name == "value" &&
                className in listOf("javafx.beans.binding.NumberExpressionBase"
                                   ,"javafx.beans.value.ObservableBooleanValue"
                                   ,"javafx.beans.value.WritableIntegerValue"
                                   )) {
                tyParams = "<T>"
                tyParamsFirst = "<T>"
            }
            if (name == "tickMarks" && className == "javafx.scene.chart.NumberAxis") {
                continue
                tyParams = "<T>"
                tyParamsFirst = "<T>"
            }
            if (name == "tickLabelFormatter" && className == "javafx.scene.chart.NumberAxis") {
                continue
                tyParams = "<T>"
                tyParamsFirst = "<T>"
            }
            val template =
"""
[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public $va $tyParamsFirst $className$tyParams.$name: $ty
    get() = ${if (!b) "get$suffix" else "${name}Property()!!.get"}()!!
${if (setter != null)
"    set(v) = set$suffix(v)" else ""}
"""
            // 16800 are approx the number of allMethods that are spit out
            val k = 16800/4
            if (i % k == 0) {
                if (fw != null) fw!!.close()
                fw = FileWriter(propPaths.get(j))
                j++
                fw!!.append("package kotlinfx.properties$j\n\n")
            }
            i++
            if (!classNamePrinted) {
                fw!!.append("\n// "+className+"\n")
                classNamePrinted = true
            }
            fw!!.append(template)
        }
    }

    println(i)
    fw!!.close()
}

//TODO use in kal
fun dekeyword(n: String) = when (n) {
    "type" -> "typ"
    "class" -> "clazz"
    else -> n
}

fun extractValueType(ty: String, xs: List<String>, ys: List<String>): String? {
    for (x in xs) {
        val a = "javafx.beans.property.${x}Property<"
        val b = "javafx.beans.property.${x}PropertyBase<"
        val c = "javafx.beans.property.ReadOnly${x}Property<"
        val d = "javafx.beans.property.ReadOnly${x}PropertyBase<"
        val e = "javafx.beans.property.Simple${x}Property<"
        when {
            ty.startsWith(a) -> return ty.substring(a.length..ty.length - 2)
            ty.startsWith(b) -> return ty.substring(b.length..ty.length - 2)
            ty.startsWith(c) -> return ty.substring(c.length..ty.length - 2)
            ty.startsWith(d) -> return ty.substring(d.length..ty.length - 2)
            ty.startsWith(e) -> return ty.substring(e.length..ty.length - 2)
        }
    }
    for (y in ys) {
        val a = "javafx.beans.property.${y}"
        val b = "javafx.beans.property.ReadOnly${y}"
        val c = "javafx.beans.property.Simple${y}"
        if (ty.startsWith(a) || ty.startsWith(b) || ty.startsWith(c))
            return if (y == "Integer") "Int" else y
    }
    return null
}

fun kotlinfyTypeBound(ty: String): String {
    val t = kotlinfyType(ty)
    return when(t) {
        "javafx.scene.control.TreeTableColumn<S,T>" ->
        "javafx.scene.control.TreeTableColumn<*,*>"
        else -> t
    }
}

//fun kotlinfyTypeBound(ty: String): String {
//    var t = kotlinfyType(ty)
//    when (t) {
//            "javafx.scene.control.TreeTableColumn<S,T>" ->
//     return "javafx.scene.control.TreeTableColumn<*,*>"
//    }
//    return t
//}

// TODO: basicKotlinfyType
fun kotlinfyType(ty: String): String {
    // Primitive Types
    when (ty) {
        "boolean" -> return "Boolean"
        "boolean[]" -> return "BooleanArray"
        "double" -> return "Double"
        "double[]" -> return "DoubleArray"
        "float" -> return "Float"
        "float[]" -> return "FloatArray"
        "long" -> return "Long"
        "long[]" -> return "LongArray"
        "int" -> return "Int"
        "int[]" -> return "IntArray"
        "short" -> return "Short"
        "short[]" -> return "ShortArray"
        "byte" -> return "Byte"
        "byte[]" -> return "ByteArray"
        "char" -> return "Char"
        "char[]" -> return "CharArray"
    }
    // Non-primitive Types
    var t = ty
    // Sometimes generic bounds start with 'class ' or 'interface '
    if (t.startsWith("class ")) t = t.substring(6)
    if (t.startsWith("interface ")) t = t.substring(10)
    // Somehow, inner classes often look something like this:
    //   javafx.scene.control.TreeTableColumn.javafx.scene.control.TreeTableColumn$CellEditEvent
    // But we want:
    //   javafx.scene.control.TreeTableColumn.CellEditEvent
    t = t.replaceAll("""\.javafx.*?\$""", ".")
    // Also sometimes they look like this:
    //   javafx.scene.control.TreeTableColumn$CellEditEvent
    // But we want:
    //   javafx.scene.control.TreeTableColumn.CellEditEvent
    t = t.replace("\$", ".")
    // '? super', '? extends' and '?' are kotlinfied
    t = t.replace("? super", "in").replace("? extends", "out").replace("?", "*")
    // 'java.util.Set' etc. are kotlinfied
    t = t.replace("java.util.List", "MutableList")
    t = t.replace("java.util.Map", "MutableMap")
    t = t.replace("java.util.Set", "MutableSet")
    // 'java.lang.Boolean' etc. are kotlinfied
    t = t.replace("java.lang.Object", "Any")
    t = t.replace("java.lang.Integer", "Int")
    t = t.replace("java.lang.", "")
    // The following are special cases where I could not think of a general solution
    t = t.replace("TableView.ResizeFeatures", "TableView.ResizeFeatures<S>")
    t = t.replace("javafx.util.Callback<javafx.scene.control.TreeTableView.ResizeFeatures<S>",
                  "javafx.util.Callback<javafx.scene.control.TreeTableView.ResizeFeatures<*>")
    t = t.replace("javafx.scene.image.PixelFormat", "javafx.scene.image.PixelFormat<*>")
    t = t.replace("javafx.collections.ObservableList<javafx.scene.control.TableColumn<S, *>>",
                  "javafx.collections.ObservableList<out javafx.scene.control.TableColumn<S, *>?>")
    t = t.replace("javafx.collections.ObservableList<javafx.scene.control.TreeTableColumn<S, *>>",
                  "javafx.collections.ObservableList<out javafx.scene.control.TreeTableColumn<S, *>?>")
    t = t.replace("javafx.scene.control.TableColumnBase", "javafx.scene.control.TreeTableColumn<S,T>")
    t = t.replace("javafx.css.Styleable", "javafx.css.Styleable?")
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
    if (t == "javafx.scene.control.TablePosition") return "javafx.scene.control.TablePosition<*,*>"
    if (t == "javafx.scene.control.TableRow") return "javafx.scene.control.TableRow<*>"
    if (t == "javafx.collections.ObservableList") return "javafx.collections.ObservableList<T>"
    if (t == "javafx.util.Callback<javafx.scene.control.TableView.ResizeFeatures<S>, Boolean>")
      return "javafx.util.Callback<javafx.scene.control.TableView.ResizeFeatures<*>, Boolean>"
    if (t == "javafx.collections.ObservableList<javafx.scene.control.TablePosition>")
      return "javafx.collections.ObservableList<javafx.scene.control.TablePosition<*,*>>"
    if (t == "javafx.event.EventHandler<in javafx.scene.transform.TransformChangedEvent>")
      return "javafx.event.EventHandler<in javafx.scene.transform.TransformChangedEvent?>"
    return t
}

fun <T> Iterable<T>.join(separator: String): String {
    val names = StringBuilder()
    forit (this) {
        names.append(it.next())
        if (it.hasNext()) names.append(separator)
    }
    return names.toString()
}

fun <T> forit(col: Iterable<T>, f: (Iterator<T>) -> Unit) {
    val it = col.iterator()
    while (it.hasNext()) f(it)
}

