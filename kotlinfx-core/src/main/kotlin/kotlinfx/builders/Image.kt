// http://docs.oracle.com/javase/8/javafx/api/javafx/scene/image/package-summary.html
package kotlinfx.builders

// For immutable javafx.scene.image.Image a builder does not make sense.

public fun ImageView(
    f: javafx.scene.image.ImageView.() -> Unit = {}): javafx.scene.image.ImageView
{
    val x = javafx.scene.image.ImageView()
    x.f()
    return x
}

public fun ImageView(
    image: javafx.scene.image.Image,
    f: javafx.scene.image.ImageView.() -> Unit = {}): javafx.scene.image.ImageView
{
    val x = javafx.scene.image.ImageView(image)
    x.f()
    return x
}

public fun ImageView(
    url: String,
    f: javafx.scene.image.ImageView.() -> Unit = {}): javafx.scene.image.ImageView
{
    val x = javafx.scene.image.ImageView(url)
    x.f()
    return x
}

// For abstract javafx.scene.image.PixelFormat<T extends java.nio.Buffer> a builder does not make sense.
// For immutable javafx.scene.image.WritableImage a builder does not make sense.
// For abstract javafx.scene.image.WritablePixelFormat<T extends java.nio.Buffer> a builder does not make sense.
