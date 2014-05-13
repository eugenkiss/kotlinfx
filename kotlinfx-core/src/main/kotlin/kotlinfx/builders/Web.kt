// http://docs.oracle.com/javase/8/javafx/api/javafx/scene/web/package-summary.html
package kotlinfx.builders

public fun HTMLEditor(
    f: javafx.scene.web.HTMLEditor.() -> Unit = {}): javafx.scene.web.HTMLEditor
{
    val x = javafx.scene.web.HTMLEditor()
    x.f()
    return x
}

// For immutable javafx.scene.web.PopupFeatures a builder does not make sense.
// For immutable javafx.scene.web.PromptData a builder does not make sense.

public fun WebEngine(
    f: javafx.scene.web.WebEngine.() -> Unit = {}): javafx.scene.web.WebEngine
{
    val x = javafx.scene.web.WebEngine()
    x.f()
    return x
}

public fun WebEngine(
    url: String,
    f: javafx.scene.web.WebEngine.() -> Unit = {}): javafx.scene.web.WebEngine
{
    val x = javafx.scene.web.WebEngine(url)
    x.f()
    return x
}

// For javafx.scene.web.WebErrorEvent a builder does not make sense.
// For javafx.scene.web.WebEvent<T> a builder does not make sense.
// For javafx.scene.web.WebHistory a builder does not make sense.

public fun WebView(
    f: javafx.scene.web.WebView.() -> Unit = {}): javafx.scene.web.WebView
{
    val x = javafx.scene.web.WebView()
    x.f()
    return x
}
