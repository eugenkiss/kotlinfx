package kotlinfx.kalium

import javafx.beans.value.ObservableValue
import javafx.beans.value.WritableValue
import javafx.scene.Node
import javafx.scene.control.ComboBoxBase
import javafx.scene.control.TextInputControl

private var enclosing: Pair<Any, String>? = null
private val calcMap: MutableMap<Pair<Any, String>, () -> Unit> = hashMapOf()

// To not set redundant listeners
private var isConstruction = false
private val listenerMap: MutableMap<Pair<Any, String>, MutableSet<Any>> = hashMapOf()

private fun template<T>(name: String, f: (() -> T)?, thiz: Any, property: ObservableValue<T>): T {
    if (f == null) {
        if (enclosing != null &&
        (isConstruction || !listenerMap.containsKey(enclosing) || !listenerMap.get(enclosing)!!.contains(thiz))) {
            val e = enclosing!!
            listenerMap.getOrPut(e) { hashSetOf() } .add(thiz)
            property.addListener { (v: Any?, o: Any?, n: Any?) -> calcMap.get(e)!!() }
        }
    }
    else {
        if (property is WritableValue<*>) {
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

public fun Node.style(f: (() -> String)? = null): String =
    template<String>("style", f, this, styleProperty()!!)

public fun ComboBoxBase<String>.value(f: (() -> String)? = null): String =
    template<String>("value", f, this, valueProperty()!!)

public fun TextInputControl.text(f: (() -> String)? = null): String =
    template<String>("text", f, this, textProperty()!!)
