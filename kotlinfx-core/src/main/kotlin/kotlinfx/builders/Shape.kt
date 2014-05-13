// http://docs.oracle.com/javase/8/javafx/api/javafx/scene/shape/package-summary.html
package kotlinfx.builders

// TODO

public fun Rectangle(
    f: javafx.scene.shape.Rectangle.() -> Unit = {}): javafx.scene.shape.Rectangle
{
    val x = javafx.scene.shape.Rectangle()
    x.f()
    return x
}

