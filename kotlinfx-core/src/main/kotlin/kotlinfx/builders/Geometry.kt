package kotlinfx.builders

import javafx.geometry.Insets as JInsets


public fun Insets(
        all: Double = 0.0,
        top: Double = 0.0,
        right: Double = 0.0,
        bottom: Double = 0.0,
        left: Double = 0.0): JInsets =
    if (all != 0.0) JInsets(all) else JInsets(top, right, bottom, left)

