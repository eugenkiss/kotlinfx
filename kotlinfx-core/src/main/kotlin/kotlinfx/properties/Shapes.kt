package kotlinfx.properties

import javafx.scene.shape.Rectangle

public var Rectangle.x: Double
    get() = getX()
    set(v) = setX(v)

public var Rectangle.y: Double
    get() = getY()
    set(v) = setY(v)

public var Rectangle.width: Double
    get() = getWidth()
    set(v) = setWidth(v)

public var Rectangle.height: Double
    get() = getHeight()
    set(v) = setHeight(v)
