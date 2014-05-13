// http://docs.oracle.com/javase/8/javafx/api/javafx/scene/package-summary.html
package kotlinfx.builders

public fun AmbientLight(
    color: javafx.scene.paint.Color? = null,
    f: javafx.scene.AmbientLight.() -> Unit = {}): javafx.scene.AmbientLight
{
    val x = if (color != null) javafx.scene.AmbientLight(color) else javafx.scene.AmbientLight()
    x.f()
    return x
}

// For abstract javafx.scene.Camera a builder does not make sense.
// For abstract javafx.scene.Cursor a builder does not make sense.

public fun Group(
    children: MutableCollection<javafx.scene.Node>? = null,
    f: javafx.scene.Group.() -> Unit = {}): javafx.scene.Group
{
    val x = if (children != null) javafx.scene.Group(children) else javafx.scene.Group()
    x.f()
    return x
}

public fun Group(
    vararg children: javafx.scene.Node?): javafx.scene.Group
{
    val x = javafx.scene.Group(*children)
    return x
}

public fun Group(
    f: javafx.scene.Group.() -> Unit = {}): javafx.scene.Group
{
    val x = javafx.scene.Group()
    x.f()
    return x
}

// For immutable javafx.scene.ImageCursor a builder does not make sense.
// For abstract javafx.scene.LightBase a builder does not make sense.
// For abstract javafx.scene.Node a builder does not make sense.

public fun ParallelCamera(
    f: javafx.scene.ParallelCamera.() -> Unit = {}): javafx.scene.ParallelCamera
{
    val x = javafx.scene.ParallelCamera()
    x.f()
    return x
}

// For abstract javafx.scene.Parent a builder does not make sense.

public fun PerspectiveCamera(
    fixedEyeAtCameraZero: Boolean = false,
    f: javafx.scene.PerspectiveCamera.() -> Unit = {}): javafx.scene.PerspectiveCamera
{
    val x = javafx.scene.PerspectiveCamera(fixedEyeAtCameraZero)
    x.f()
    return x
}

public fun PointLight(
    color: javafx.scene.paint.Color? = null,
    f: javafx.scene.PointLight.() -> Unit = {}): javafx.scene.PointLight
{
    val x = if (color != null) javafx.scene.PointLight(color) else javafx.scene.PointLight()
    x.f()
    return x
}

public fun Scene(
    width: Double? = null,
    height: Double? = null,
    f: javafx.scene.Scene.() -> Unit = {}): javafx.scene.Scene
{
    val x =
        if (width != null && height != null) {
            javafx.scene.Scene(javafx.scene.layout.Pane(), width, height)
        } else {
            javafx.scene.Scene(javafx.scene.layout.Pane())
        }
    x.f()
    return x
}

// For abstract javafx.scene.SceneAntialiasing a builder does not make sense.

public fun SnapshotParameters(
    f: javafx.scene.SnapshotParameters.() -> Unit = {}): javafx.scene.SnapshotParameters
{
    val x = javafx.scene.SnapshotParameters()
    x.f()
    return x
}

// For immutable javafx.scene.SnapshotResult a builder does not make sense.

public fun SubScene(
    root: javafx.scene.Parent,
    width: Double,
    height: Double,
    f: javafx.scene.SubScene.() -> Unit = {}): javafx.scene.SubScene
{
    val x = javafx.scene.SubScene(root, width, height)
    x.f()
    return x
}
