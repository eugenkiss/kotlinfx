// The purpose of this file is to be able to test new implementation ideas without
// needing to generate all the bindings

package kotlinfx.kalium.test

import javafx.beans.value.ObservableValue
import javafx.beans.value.WritableValue
import javafx.beans.property.Property
import javafx.scene.Node
import javafx.scene.control.ComboBoxBase
import javafx.scene.control.TextInputControl
import javafx.scene.control.ProgressBar
import javafx.scene.control.ProgressIndicator
import javafx.scene.control.Slider
import java.util.Observable
import javafx.scene.control.Label
import javafx.scene.shape.Rectangle
import javafx.scene.paint.Paint
import javafx.scene.shape.Shape


private var enclosing: Pair<Any, String>? = null
private val calcMap: MutableMap<Pair<Any, String>, () -> Unit> = hashMapOf()

// To not set redundant listeners
private var isConstruction = false
private val listenerMap: MutableMap<Pair<Any, String>, MutableSet<Any>> = hashMapOf()


public class V<T>(private var value: T) {
    val callbacks: MutableList<() -> Unit> = arrayListOf()

    fun invoke(): T {
        if (enclosing != null &&
        (isConstruction || !listenerMap.containsKey(enclosing) || !listenerMap.get(enclosing)!!.contains(this))) {
            val e = enclosing!!
            listenerMap.getOrPut(e) { hashSetOf() } .add(this)
            callbacks.add { calcMap.get(e)!!() }
        }
        return value
    }

    fun u(newValue: T) {
        value = newValue
        for (callback in callbacks) {
            callback()
        }
    }
}

public class K<T>(private val calc: () -> T) {
    init {
        val e = Pair(this, "K")
        calcMap.put(e, {})
        isConstruction = true; enclosing = e; calc(); enclosing = null; isConstruction = false
    }
    val callbacks: MutableList<() -> Unit> = arrayListOf()

    fun invoke(): T {
        if (enclosing != null &&
        (isConstruction || !listenerMap.containsKey(enclosing) || !listenerMap.get(enclosing)!!.contains(this))) {
            val e = enclosing!!
            listenerMap.getOrPut(e) { hashSetOf() } .add(this)
            callbacks.add { calcMap.get(e)!!() }
        }
        return calc()
    }
}


private fun template<T>(name: String, f: (() -> T)?, thiz: Any, property: ObservableValue<T>): T {
    if (f == null) {
        if (enclosing != null &&
        (isConstruction || !listenerMap.containsKey(enclosing) || !listenerMap.get(enclosing)!!.contains(thiz))) {
            val e = enclosing!!
            listenerMap.getOrPut(e) { hashSetOf() } .add(thiz)
            property.addListener { v: Any?, o: Any?, n: Any? -> calcMap.get(e)!!() }
        }
    }
    else {
        if (property is WritableValue<*>) {
            [suppress("UNCHECKED_CAST", "NAME_SHADOWING")]
            val property = property as WritableValue<T>
            val e = Pair(thiz, name)
            val g = { enclosing = e; property.setValue(f()); enclosing = null }
            calcMap.put(e, g)
            isConstruction = true; g(); isConstruction = false
        }
    }
    return property.getValue()!!
}

public fun Node.disable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("disable", f, this, disableProperty()!!)

public fun Node.hover(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("hover", f, this, hoverProperty()!!)

public fun Node.style(f: (() -> String)? = null): String =
    template<String>("style", f, this, styleProperty()!!)

public fun ComboBoxBase<String>.value(f: (() -> String)? = null): String =
    template<String>("value", f, this, valueProperty()!!)

public fun TextInputControl.text(f: (() -> String)? = null): String =
    template<String>("text", f, this, textProperty()!!)

public fun Label.text(f: (() -> String)? = null): String =
    template<String>("text", f, this, textProperty()!!)

[suppress("UNCHECKED_CAST")]
public fun ProgressIndicator.progress(f: (() -> Double)? = null): Double =
    template<Double>("progress", f, this, progressProperty()!! as ObservableValue<Double>)

[suppress("UNCHECKED_CAST")]
public fun Slider.value(f: (() -> Double)? = null): Double =
    template<Double>("slider", f, this, valueProperty()!! as ObservableValue<Double>)

public fun Shape.fill(f: (() -> Paint)? = null): Paint =
    template<Paint>("fill", f, this, fillProperty()!!)
