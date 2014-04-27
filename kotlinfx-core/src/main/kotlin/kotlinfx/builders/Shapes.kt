package kotlinfx.builders

import javafx.scene.shape.Rectangle as JRectangle


// Shapes
// ------

public fun Rectangle(f: JRectangle.() -> Unit = {}): JRectangle {
    val r = JRectangle()
    r.f()
    return r
}

