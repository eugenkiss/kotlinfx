// http://docs.oracle.com/javase/8/javafx/api/javafx/scene/canvas/package-summary.html
package kotlinfx.builders

public fun Canvas(
    width: Double = 0.0,
    height: Double = 0.0,
    f: javafx.scene.canvas.Canvas.() -> Unit = {}): javafx.scene.canvas.Canvas
{
    val x = javafx.scene.canvas.Canvas(width, height)
    x.f()
    return x
}
// For javafx.scene.canvas.GraphicsContext a builder does not make sense I think.
