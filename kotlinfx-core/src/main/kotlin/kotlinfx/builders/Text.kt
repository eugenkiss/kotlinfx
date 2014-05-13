// http://docs.oracle.com/javase/8/javafx/api/javafx/scene/text/package-summary.html
package kotlinfx.builders

// For javafx.scene.text.Font a builder does not make sense.

public fun Text(
    f: javafx.scene.text.Text.() -> Unit = {}): javafx.scene.text.Text
{
    val x = javafx.scene.text.Text()
    x.f()
    return x
}

public fun Text(
    text: String,
    f: javafx.scene.text.Text.() -> Unit = {}): javafx.scene.text.Text
{
    val x = javafx.scene.text.Text(text)
    x.f()
    return x
}

public fun Text(
    x: Double,
    y: Double,
    text: String,
    f: javafx.scene.text.Text.() -> Unit = {}): javafx.scene.text.Text
{
    val x = javafx.scene.text.Text(x, y, text)
    x.f()
    return x
}

public fun TextFlow(
    vararg children: javafx.scene.Node?,
    f: javafx.scene.text.TextFlow.() -> Unit = {}): javafx.scene.text.TextFlow
{
    val x = javafx.scene.text.TextFlow(*children)
    x.f()
    return x
}

public fun TextFlow(
    vararg children: javafx.scene.Node?): javafx.scene.text.TextFlow
{
    val x = javafx.scene.text.TextFlow(*children)
    return x
}
