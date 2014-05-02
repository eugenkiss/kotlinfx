package kotlinfx.kalium

private var enclosing: Pair<Any, String>? = null
private val calcMap: MutableMap<Pair<Any, String>, () -> Unit> = hashMapOf()

// To not set redundant listeners
private var isConstruction = false
private val listenerMap: MutableMap<Pair<Any, String>, MutableSet<Any>> = hashMapOf()

public fun javafx.scene.Node.disable(f: (() -> Boolean)? = null): Boolean {
    if (f == null) {
        if (enclosing != null &&
        (isConstruction || !listenerMap.containsKey(enclosing) || !listenerMap.get(enclosing)!!.contains(this))) {
            val e = enclosing!!
            listenerMap.getOrPut(e) { hashSetOf() } .add(this)
            disableProperty()!!.addListener { (v: Any?, o: Any?, n: Any?) -> calcMap.get(e)!!() }
        }
    }
    else {
        val e = Pair(this, "disable")
        val g = { enclosing = e; this.setDisable(f()); enclosing = null }
        calcMap.put(e, g)
        isConstruction = true; g(); isConstruction = false
    }
    return this.isDisabled()
}

public fun javafx.scene.Node.style(f: (() -> String)? = null): String {
    if (f == null) {
        if (enclosing != null &&
        (isConstruction || !listenerMap.containsKey(enclosing) || !listenerMap.get(enclosing)!!.contains(this))) {
            val e = enclosing!!
            listenerMap.getOrPut(e) { hashSetOf() } .add(this)
            styleProperty()!!.addListener { (v: Any?, o: Any?, n: Any?) -> calcMap.get(e)!!() }
        }
    }
    else {
        val e = Pair(this, "style")
        val g = { enclosing = e; this.setStyle(f()); enclosing = null }
        calcMap.put(e, g)
        isConstruction = true; g(); isConstruction = false
    }
    return this.getStyle()!!
}

public fun javafx.scene.control.ComboBoxBase<String>.value(f: (() -> String)? = null): String {
    if (f == null) {
        if (enclosing != null &&
        (isConstruction || !listenerMap.containsKey(enclosing) || !listenerMap.get(enclosing)!!.contains(this))) {
            val e = enclosing!!
            listenerMap.getOrPut(e) { hashSetOf() } .add(this)
            valueProperty()!!.addListener { (v: Any?, o: Any?, n: Any?) -> calcMap.get(e)!!() }
        }
    }
    else {
        val e = Pair(this, "value")
        val g = { enclosing = e; this.setValue(f()); enclosing = null }
        calcMap.put(e, g)
        isConstruction = true; g(); isConstruction = false
    }
    return this.getValue()!!
}

public fun javafx.scene.control.TextInputControl.text(f: (() -> String)? = null): String {
    if (f == null) {
        if (enclosing != null &&
        (isConstruction || !listenerMap.containsKey(enclosing) || !listenerMap.get(enclosing)!!.contains(this))) {
            val e = enclosing!!
            listenerMap.getOrPut(e) { hashSetOf() } .add(this)
            textProperty()!!.addListener { (v: Any?, o: Any?, n: Any?) -> calcMap.get(e)!!() }
        }
    }
    else {
        val e = Pair(this, "text")
        val g = { enclosing = e; this.setText(f()); enclosing = null }
        calcMap.put(e, g)
        isConstruction = true; g(); isConstruction = false
    }
    return this.getText()!!
}


