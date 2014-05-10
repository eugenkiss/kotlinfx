package genkaliumext

import java.nio.file.Paths
import java.io.FileWriter
import org.reflections.util.ClasspathHelper
import org.reflections.Reflections
import org.reflections.util.ConfigurationBuilder
import org.reflections.scanners.SubTypesScanner
import org.reflections.scanners.ResourcesScanner
import java.lang.reflect.Modifier

fun main(args: Array<String>) {
    val projectRoot = Paths.get(javaClass<Unit>().getClassLoader()!!.getResource(".")!!.getPath()!!)!!.
                            getParent()!!.getParent()!!.getParent()!!.toFile().getAbsolutePath();
    val kaliumPath = Paths.get(projectRoot, "kotlinfx-core", "src", "main", "kotlin", "kotlinfx", "kalium", "Generated.kt")!!
    val fw = FileWriter(kaliumPath.toFile())
    fw.append("package kotlinfx.kalium\n\n")
    fw.append("import kotlinfx.kalium.template\n\n")
    fw.append("import javafx.beans.value.ObservableValue\n\n")

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

    for (clazz in classes) {
        if (clazz.getCanonicalName() == null) continue;
        if (!Modifier.isPublic(clazz.getModifiers())) continue

        val className = clazz.getCanonicalName()!!
        var classNamePrinted = false // to not print class name as a comment more than once

        for (method in clazz.getDeclaredMethods()) {
            val name = method.getName()!!

            if (!name.endsWith("Property")) continue
            if (name.contains("impl_")) continue // For public types that should be treated as private
            if (!Modifier.isPublic(method.getModifiers())) continue
            // TODO JavaFX properties that take a parameter are not supported yet
            if (method.getParameterCount() > 0) continue
            // TODO Static properties are not supported yet
            if (Modifier.isStatic(method.getModifiers())) continue

            if (!classNamePrinted) {
                fw.append("\n// "+className+"\n")
                classNamePrinted = true
            }

            var shortName = name.substring(0..name.length-9)
            shortName = when (shortName) {
                "type" -> "typ" // type is a keyword in Kotlin
                else -> shortName
            }

            // See http://docs.oracle.com/javafx/2/api/javafx/beans/property/package-summary.html
            val ty = method.getGenericReturnType()!!.getTypeName()!!
            val valTy: String? = stdExtractValueType(ty)
            if (valTy == null) {
                println("ERROR: $ty")
                continue
            }

            val valTyKt = kotlinfyType(valTy)
            println(className); println("  "+valTyKt)
            val tyParamList = clazz.getTypeParameters().toArrayList()
            val tyParams = if (tyParamList.isEmpty()) "" else "<${tyParamList.join(", ")}>"
            // The complexity is due to having to consider bounds on generic parameters
            val tyParamsFirst = if (tyParamList.isEmpty()) "" else
                "<${tyParamList map {
                    val bs = it!!.getBounds()!! map { kotlinfyType(it.toString()!!.substring(6)) } filterNot { it == "Any" }
                    val bounds = if (bs.isEmpty()) "" else ":" + bs.join(", ")
                    "$it$bounds" } join ", "}>"
            val template =
"""
[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun $tyParamsFirst $className$tyParams.$shortName(f: (() -> $valTyKt)? = null): $valTyKt =
    template<$valTyKt>("$shortName", f, this, ${name}()!! as ObservableValue<$valTyKt>)
"""
            fw.append(template)
        }
    }

    fw.close()
}

// Map is left out as there were problems.
public fun stdExtractValueType(ty: String): String? = extractValueType(
    ty, listOf("Object", "List", "Set"), listOf("Boolean", "Double", "Float", "Long", "Integer", "String"))

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

fun kotlinfyType(ty: String): String {
    var t = ty
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
    t = t.replace("java.util.Set", "MutableSet")
    // 'java.lang.Boolean' etc. are kotlinfied
    t = t.replace("java.lang.Object", "Any")
    t = t.replace("java.lang.Integer", "Int")
    t = t.replace("java.lang.", "")
    // The following are special cases where I could not think of a general solution
    t = t.replace("TableView.ResizeFeatures", "TableView.ResizeFeatures<S>")
    if (t == "javafx.scene.control.TablePosition") t = "javafx.scene.control.TablePosition<*,*>"
    if (t == "javafx.scene.control.TableRow") t = "javafx.scene.control.TableRow<*>"
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

