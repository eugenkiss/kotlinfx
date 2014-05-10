package util

import org.reflections.util.ClasspathHelper
import org.reflections.Reflections
import org.reflections.util.ConfigurationBuilder
import org.reflections.scanners.SubTypesScanner
import org.reflections.scanners.ResourcesScanner
import java.nio.file.Paths
import java.lang.reflect.TypeVariable

public val projectRoot: String =
    Paths.get(javaClass<Unit>().getClassLoader()!!.getResource(".")!!.getPath()!!)!!.
          getParent()!!.getParent()!!.getParent()!!.toFile().getAbsolutePath()

[suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")]
public fun allJavaFXClasses(): Set<Class<out Object>> {
    // http://stackoverflow.com/questions/520328/can-you-find-all-classes-in-a-package-using-reflection
    val c1 = ClasspathHelper.contextClassLoader()
    val c2 = ClasspathHelper.staticClassLoader()
    val reflections = Reflections(ConfigurationBuilder()
        .setScanners(SubTypesScanner(false), ResourcesScanner())!!
        .setUrls(ClasspathHelper.forClassLoader(c1, c2))!!
        .filterInputsBy { it!!.startsWith("javafx") && !it.startsWith("javafx.embed") }
    )
    return reflections.getSubTypesOf(javaClass<Object>())!!
}

public fun genFirstTypeParamsString(typeParams: MutableList<TypeVariable<out Class<out Object>?>?>): String =
    if (typeParams.isEmpty()) "" else
    // The complexity is due to having to consider bounds on generic parameters
        "<${typeParams map {
            val bs = it!!.getBounds()!! map { kotlinfyTypeBound(it.toString()!!) } filterNot { it == "Any" }
            val bounds = if (bs.isEmpty()) "" else ":" + bs.join(", ")
            "$it$bounds" } join ", "}>"

public fun genTypeParamsString(typeParams: MutableList<TypeVariable<out Class<out Object>?>?>): String =
    if (typeParams.isEmpty()) "" else "<${typeParams.join(", ")}>"

public fun kotlinfyTypeBound(ty: String): String {
    val t = genproperties.kotlinfyType(ty)
    return when(t) {
        "javafx.scene.control.TreeTableColumn<S,T>" ->
        "javafx.scene.control.TreeTableColumn<*,*>"
        else -> t
    }
}

public fun kotlinfyType(ty: String): String {
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
    return t
}

// Map is left out as there were problems.
public fun getPropertyValueType(ty: String): String? = getPropertyValueType0(
    ty, listOf("Object", "List", "Set"), listOf("Boolean", "Double", "Float", "Long", "Integer", "String"))

fun getPropertyValueType0(ty: String, xs: List<String>, ys: List<String>): String? {
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

public fun dekeyword(n: String): String = when (n) {
    "type" -> "typ"
    "class" -> "clazz"
    else -> n
}

public fun <T> Iterable<T>.join(separator: String): String {
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

