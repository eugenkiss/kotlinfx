package kotlinfx.properties

import javafx.stage.Stage
import javafx.scene.Scene
import javafx.scene.Parent
import javafx.scene.paint.Paint

public var Stage.scene: Scene
    get() = getScene()!!
    set(v) = setScene(v)

public var Stage.title: String
    get() = getTitle()!!
    set(v) = setTitle(v)

public var Stage.width: Double
    get() = getWidth()
    set(v) = setWidth(v)

public var Stage.height: Double
    get() = getHeight()
    set(v) = setHeight(v)

public var Scene.root: Parent
    get() = getRoot()!!
    set(v) = setRoot(v)

public var Scene.fill: Paint
    get() = getFill()!!
    set(v) = setFill(v)

