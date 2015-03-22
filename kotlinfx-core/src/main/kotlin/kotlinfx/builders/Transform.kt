// http://docs.oracle.com/javase/8/javafx/api/javafx/scene/transform/package-summary.html
package kotlinfx.builders

// TODO: Affine-Scale

public fun Shear(
    f: javafx.scene.transform.Shear.() -> Unit = {}): javafx.scene.transform.Shear
{
    val x = javafx.scene.transform.Shear()
    x.f()
    return x
}

public fun Shear(
    x: Double,
    y: Double,
    f: javafx.scene.transform.Shear.() -> Unit = {}): javafx.scene.transform.Shear
{
    val z = javafx.scene.transform.Shear(x, y)
    z.f()
    return z
}

public fun Shear(
    x: Double,
    y: Double,
    pivotX: Double,
    pivotY: Double,
    f: javafx.scene.transform.Shear.() -> Unit = {}): javafx.scene.transform.Shear
{
    val z = javafx.scene.transform.Shear(x, y, pivotX, pivotY)
    z.f()
    return z
}

// For abstract javafx.scene.transform.Transform a builder does not make sense.
// For javafx.scene.transform.TransformChangedEvent a builder does not make sense.

public fun Translate(
    f: javafx.scene.transform.Translate.() -> Unit = {}): javafx.scene.transform.Translate
{
    val x = javafx.scene.transform.Translate()
    x.f()
    return x
}

public fun Translate(
    x: Double,
    y: Double,
    f: javafx.scene.transform.Translate.() -> Unit = {}): javafx.scene.transform.Translate
{
    val z = javafx.scene.transform.Translate(x, y)
    z.f()
    return z
}

public fun Translate(
    x: Double,
    y: Double,
    z: Double,
    f: javafx.scene.transform.Translate.() -> Unit = {}): javafx.scene.transform.Translate
{
    val w = javafx.scene.transform.Translate(x, y, z)
    w.f()
    return w
}
