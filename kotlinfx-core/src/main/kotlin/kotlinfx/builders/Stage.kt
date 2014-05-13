// http://docs.oracle.com/javase/8/javafx/api/javafx/stage/package-summary.html
package kotlinfx.builders

public fun DirectoryChooser(
    dir: java.io.File? = null,
    title: String = "title",
    f: javafx.stage.DirectoryChooser.() -> Unit = {}): javafx.stage.DirectoryChooser
{
    val x = javafx.stage.DirectoryChooser()
    x.setTitle(title)
    if (dir != null) x.setInitialDirectory(dir)
    x.f()
    return x
}

public fun FileChooser(
    dir: java.io.File? = null,
    fileName: String? = null,
    title: String = "title",
    f: javafx.stage.FileChooser.() -> Unit = {}): javafx.stage.FileChooser
{
    val x = javafx.stage.FileChooser()
    x.setTitle(title)
    if (dir != null) x.setInitialDirectory(dir)
    if (fileName != null) x.setInitialFileName(fileName)
    x.f()
    return x
}

public fun Popup(
    f: javafx.stage.Popup.() -> Unit = {}): javafx.stage.Popup
{
    val x = javafx.stage.Popup()
    x.f()
    return x
}

// For abstract javafx.stage.PopupWindow a builder does not make sense.
// For immutable javafx.stage.Screen a builder does not make sense.

public fun Stage(
stage: javafx.stage.Stage?,
title: String = "",
f: javafx.stage.Stage.() -> Unit = {}): javafx.stage.Stage
{
    stage!!
    stage.setTitle(title)
    stage.f()
    return stage
}

// For protected javafx.stage.Window a builder does not make sense.
// For javafx.stage.WindowEvent a builder does not make sense.
