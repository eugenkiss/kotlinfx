package kotlinfx.builders

import kotlinfx.properties.*
import javafx.geometry.Insets as JInsets
import javafx.scene.shape.Rectangle as JRectangle
import javafx.scene.layout.HBox
import javafx.scene.Node
import javafx.scene.layout.Pane
import javafx.scene.layout.VBox
import javafx.scene.layout.StackPane
import javafx.scene.layout.BorderPane
import javafx.scene.layout.GridPane



trait K : Pane {
    fun Node.plus(): Node {
        getChildren()!!.add(this)
        return this
    }
    fun Node.plus(node: Node): Node {
        getChildren()!!.add(node)
        return node
    }
}

public fun Pane(f: PaneK.() -> Unit): Pane {
    val pane = PaneK()
    pane.f()
    return pane
}
class PaneK : Pane(), K

public fun StackPane(
padding: JInsets = Insets(0.0),
f: StackPaneK.() -> Unit): StackPane {
    val stackpane = StackPaneK()
    stackpane.padding = padding
    stackpane.f()
    return stackpane
}
class StackPaneK : StackPane(), K

public fun HBox(
spacing: Double = 0.0,
padding: JInsets = Insets(0.0),
f: HBoxK.() -> Unit): HBox {
    val hbox = HBoxK()
    hbox.spacing = spacing
    hbox.padding = padding
    hbox.f()
    return hbox
}
class HBoxK : HBox(), K

public fun VBox(
spacing: Double = 0.0,
padding: JInsets = Insets(0.0),
f: VBoxK.() -> Unit): VBox {
    val vbox = VBoxK()
    vbox.spacing = spacing
    vbox.padding = padding
    vbox.f()
    return vbox
}
class VBoxK : VBox(), K

public fun BorderPane(
padding: JInsets = Insets(0.0),
f: BorderPaneK.() -> Unit): BorderPane {
    val borderpane = BorderPaneK()
    borderpane.padding = padding
    borderpane.f()
    return borderpane
}
class BorderPaneK : BorderPane(), K

public fun GridPane(
padding: JInsets = Insets(0.0),
f: GridPaneK.() -> Unit): GridPane {
    val gridpane = GridPaneK()
    gridpane.padding = padding
    gridpane.f()
    return gridpane
}
class GridPaneK : GridPane(), K
