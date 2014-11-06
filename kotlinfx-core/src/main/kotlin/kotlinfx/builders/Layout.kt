// http://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/package-summary.html
package kotlinfx.builders

import javafx.geometry.Orientation
import javafx.scene.Node
import javafx.collections.ObservableList

trait K : javafx.scene.layout.Pane {
    public fun javafx.scene.Node.plus(): javafx.scene.Node {
        getChildren()!!.add(this)
        return this
    }
    public fun javafx.scene.Node.plus(node: javafx.scene.Node): javafx.scene.Node {
        getChildren()!!.add(node)
        return node
    }
}

public fun AnchorPane(
    padding: javafx.geometry.Insets = Insets(0.0),
    f: AnchorPaneK.() -> Unit = {}): javafx.scene.layout.AnchorPane
{
    val x = AnchorPaneK()
    x.setPadding(padding)
    x.f()
    return x
}
public fun AnchorPane(
    padding: javafx.geometry.Insets = Insets(0.0),
    vararg children: javafx.scene.Node?): javafx.scene.layout.AnchorPane
{
    val x = AnchorPaneK(*children)
    x.setPadding(padding)
    return x
}
public class AnchorPaneK(vararg children: javafx.scene.Node?) : javafx.scene.layout.AnchorPane(*children), K

// For immutable javafx.scene.layout.Background a builder does not make sense.
// For immutable javafx.scene.layout.BackgroundFill a builder does not make sense.
// For immutable javafx.scene.layout.BackgroundImage a builder does not make sense.
// For immutable javafx.scene.layout.BackgroundPosition a builder does not make sense.
// For immutable javafx.scene.layout.BackgroundSize a builder does not make sense.
// For immutable javafx.scene.layout.Border a builder does not make sense.
// For immutable javafx.scene.layout.BorderImage a builder does not make sense.

public fun BorderPane(
    center: javafx.scene.Node? = null,
    padding: javafx.geometry.Insets = Insets(0.0),
    f: BorderPaneK.() -> Unit = {}): javafx.scene.layout.BorderPane
{
    val x = BorderPaneK()
    if (center != null) x.setCenter(center)
    x.setPadding(padding)
    x.f()
    return x
}
public class BorderPaneK : javafx.scene.layout.BorderPane(), K

// For immutable javafx.scene.layout.BorderStroke a builder does not make sense.
// For immutable javafx.scene.layout.BorderStrokeStyle a builder does not make sense.
// For immutable javafx.scene.layout.BorderWidths a builder does not make sense.
// For javafx.scene.layout.ColumnConstraints a builder is not really beneficial.
// For abstract javafx.scene.layout.ConstraintsBase a builder does not make sense.
// For immutable javafx.scene.layout.CornerRadii a builder does not make sense.
// For javafx.scene.layout.CornerRadiiConverter a builder does not make sense I think.

public fun FlowPane(
    f: FlowPaneK1.() -> Unit = {}): javafx.scene.layout.FlowPane
{
    val x = FlowPaneK1()
    x.f()
    return x
}
public class FlowPaneK1 : javafx.scene.layout.FlowPane(), K

public fun FlowPane(
    hgap: Double,
    vgap: Double,
    f: FlowPaneK2.() -> Unit = {}): javafx.scene.layout.FlowPane
{
    val x = FlowPaneK2(hgap, vgap)
    x.f()
    return x
}
public class FlowPaneK2(hgap: Double, vgap: Double) : javafx.scene.layout.FlowPane(hgap, vgap), K

public fun FlowPane(
    hgap: Double,
    vgap: Double,
    vararg children: javafx.scene.Node?): javafx.scene.layout.FlowPane
{
    val x = FlowPaneK3(hgap, vgap, *children)
    return x
}
public class FlowPaneK3(hgap: Double, vgap: Double, vararg children: javafx.scene.Node?) : javafx.scene.layout.FlowPane(hgap, vgap, *children), K

public fun FlowPane(
    vararg children: javafx.scene.Node?): javafx.scene.layout.FlowPane
{
    val x = FlowPaneK4(*children)
    return x
}
public class FlowPaneK4(vararg children: javafx.scene.Node?) : javafx.scene.layout.FlowPane(*children), K

public fun FlowPane(
    orientation: javafx.geometry.Orientation,
    f: FlowPaneK5.() -> Unit = {}): javafx.scene.layout.FlowPane
{
    val x = FlowPaneK5(orientation)
    x.f()
    return x
}
public class FlowPaneK5(orientation: javafx.geometry.Orientation) : javafx.scene.layout.FlowPane(orientation), K

public fun FlowPane(
    orientation: javafx.geometry.Orientation,
    hgap: Double,
    vgap: Double,
    f: FlowPaneK6.() -> Unit = {}): javafx.scene.layout.FlowPane
{
    val x = FlowPaneK6(orientation, hgap, vgap)
    x.f()
    return x
}
public class FlowPaneK6(orientation: javafx.geometry.Orientation, hgap: Double, vgap: Double) : javafx.scene.layout.FlowPane(orientation, hgap, vgap), K

public fun FlowPane(
    orientation: javafx.geometry.Orientation,
    hgap: Double,
    vgap: Double,
    vararg children: javafx.scene.Node?): javafx.scene.layout.FlowPane
{
    val x = FlowPaneK7(orientation, hgap, vgap, *children)
    return x
}
public class FlowPaneK7(orientation: javafx.geometry.Orientation, hgap: Double, vgap: Double, vararg children: javafx.scene.Node?) : javafx.scene.layout.FlowPane(orientation, hgap, vgap, *children), K

public fun FlowPane(
    orientation: javafx.geometry.Orientation,
    vararg children: javafx.scene.Node?): javafx.scene.layout.FlowPane
{
    val x = FlowPaneK8(orientation, *children)
    return x
}
public class FlowPaneK8(orientation: javafx.geometry.Orientation, vararg children: javafx.scene.Node?) : javafx.scene.layout.FlowPane(orientation, *children), K

public fun GridPane(
    padding: javafx.geometry.Insets = Insets(0.0),
    f: GridPaneK.() -> Unit = {}): javafx.scene.layout.GridPane
{
    val x = GridPaneK()
    x.setPadding(padding)
    x.f()
    return x
}
public class GridPaneK : javafx.scene.layout.GridPane(), K

public fun HBox(
    spacing: Double = 0.0,
    padding: javafx.geometry.Insets = Insets(0.0),
    vararg children: javafx.scene.Node?,
    f: HBoxK.() -> Unit = {}): javafx.scene.layout.HBox
{
    val x = HBoxK(*children)
    x.setSpacing(spacing)
    x.setPadding(padding)
    x.f()
    return x
}
public class HBoxK(vararg children: javafx.scene.Node?) : javafx.scene.layout.HBox(*children), K

public fun Pane(
    f: PaneK.() -> Unit = {}): javafx.scene.layout.Pane
{
    val x = PaneK()
    x.f()
    return x
}
public class PaneK : javafx.scene.layout.Pane(), K

public fun Region(
    f: javafx.scene.layout.Region.() -> Unit = {}): javafx.scene.layout.Region
{
    val x = Region()
    x.f()
    return x
}

// For javafx.scene.layout.RowConstraints a builder is not really beneficial.

public fun StackPane(
    padding: javafx.geometry.Insets = Insets(0.0),
    f: StackPaneK.() -> Unit = {}): javafx.scene.layout.StackPane
{
    val x = StackPaneK()
    x.setPadding(padding)
    x.f()
    return x
}
public fun StackPane(vararg children: javafx.scene.Node?): javafx.scene.layout.StackPane
{
    val x = StackPaneK(*children)
    return x
}
public class StackPaneK(vararg children: javafx.scene.Node?) : javafx.scene.layout.StackPane(*children), K

public fun VBox(
    spacing: Double = 0.0,
    padding: javafx.geometry.Insets = Insets(0.0),
    vararg children: javafx.scene.Node?,
    f: VBoxK.() -> Unit = {}): javafx.scene.layout.VBox
{
    val x = VBoxK(*children)
    x.setSpacing(spacing)
    x.setPadding(padding)
    x.f()
    return x
}
public class VBoxK(vararg children: javafx.scene.Node?) : javafx.scene.layout.VBox(*children), K

public fun TilePane(
    f: TilePaneK1.() -> Unit = {}): javafx.scene.layout.TilePane
{
    val x = TilePaneK1()
    x.f()
    return x
}
public class TilePaneK1 : javafx.scene.layout.TilePane(), K

public fun TilePane(
    hgap: Double,
    vgap: Double,
    f: TilePaneK2.() -> Unit = {}): javafx.scene.layout.TilePane
{
    val x = TilePaneK2(hgap, vgap)
    x.f()
    return x
}
public class TilePaneK2(hgap: Double, vgap: Double) : javafx.scene.layout.TilePane(hgap, vgap), K

public fun TilePane(
    hgap: Double,
    vgap: Double,
    vararg children: javafx.scene.Node?): javafx.scene.layout.TilePane
{
    val x = TilePaneK3(hgap, vgap, *children)
    return x
}
public class TilePaneK3(hgap: Double, vgap: Double, vararg children: javafx.scene.Node?) : javafx.scene.layout.TilePane(hgap, vgap, *children), K

public fun TilePane(
    vararg children: javafx.scene.Node?): javafx.scene.layout.TilePane
{
    val x = TilePaneK4(*children)
    return x
}
public class TilePaneK4(vararg children: javafx.scene.Node?) : javafx.scene.layout.TilePane(*children), K

public fun TilePane(
    orientation: javafx.geometry.Orientation,
    f: TilePaneK5.() -> Unit = {}): javafx.scene.layout.TilePane
{
    val x = TilePaneK5(orientation)
    x.f()
    return x
}
public class TilePaneK5(orientation: javafx.geometry.Orientation) : javafx.scene.layout.TilePane(orientation), K

public fun TilePane(
    orientation: javafx.geometry.Orientation,
    hgap: Double,
    vgap: Double,
    f: TilePaneK6.() -> Unit = {}): javafx.scene.layout.TilePane
{
    val x = TilePaneK6(orientation, hgap, vgap)
    x.f()
    return x
}
public class TilePaneK6(orientation: javafx.geometry.Orientation, hgap: Double, vgap: Double) : javafx.scene.layout.TilePane(orientation, hgap, vgap), K

public fun TilePane(
    orientation: javafx.geometry.Orientation,
    hgap: Double,
    vgap: Double,
    vararg children: javafx.scene.Node?): javafx.scene.layout.TilePane
{
    val x = TilePaneK7(orientation, hgap, vgap, *children)
    return x
}
public class TilePaneK7(orientation: javafx.geometry.Orientation, hgap: Double, vgap: Double, vararg children: javafx.scene.Node?) : javafx.scene.layout.TilePane(orientation, hgap, vgap, *children), K

public fun TilePane(
    orientation: javafx.geometry.Orientation,
    vararg children: javafx.scene.Node?): javafx.scene.layout.TilePane
{
    val x = TilePaneK8(orientation, *children)
    return x
}
public class TilePaneK8(orientation: javafx.geometry.Orientation, vararg children: javafx.scene.Node?) : javafx.scene.layout.TilePane(orientation, *children), K
