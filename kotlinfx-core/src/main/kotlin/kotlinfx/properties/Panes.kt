package kotlinfx.properties

import javafx.scene.layout.Pane
import javafx.geometry.Insets
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import javafx.scene.layout.BorderPane
import javafx.scene.Node
import javafx.geometry.Pos
import javafx.scene.layout.GridPane

public var Pane.padding: Insets
    get() = getPadding()!!
    set(v) = setPadding(v)

public var HBox.spacing: Double
    get() = getSpacing()
    set(v) = setSpacing(v)

public var HBox.alignment: Pos
    get() = getAlignment()!!
    set(v) = setAlignment(v)

public var VBox.spacing: Double
    get() = getSpacing()
    set(v) = setSpacing(v)

public var BorderPane.prefWidth: Double
    get() = getPrefWidth()
    set(v) = setPrefWidth(v)

public var BorderPane.prefHeight: Double
    get() = getPrefHeight()
    set(v) = setPrefHeight(v)

public var BorderPane.center: Node
    get() = getCenter()!!
    set(v) = setCenter(v)

public var BorderPane.top: Node
    get() = getTop()!!
    set(v) = setTop(v)

public var BorderPane.right: Node
    get() = getRight()!!
    set(v) = setRight(v)

public var BorderPane.bottom: Node
    get() = getBottom()!!
    set(v) = setBottom(v)

public var BorderPane.left: Node
    get() = getLeft()!!
    set(v) = setLeft(v)

public var GridPane.hgap: Double
    get() = getHgap()
    set(v) = setHgap(v)

public var GridPane.vgap: Double
    get() = getVgap()
    set(v) = setVgap(v)
