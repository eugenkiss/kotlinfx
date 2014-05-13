package kotlinfx.builders

// Allows a more flexible way to express insets. Both ways of the Java version are possible, but also
// the specification of a selection of sides like `Insets(top=10.0,left=20.0)`.
public fun Insets(
    all: Double = 0.0,
    top: Double = 0.0,
    right: Double = 0.0,
    bottom: Double = 0.0,
    left: Double = 0.0
): javafx.geometry.Insets = if (all != 0.0) javafx.geometry.Insets(all)
                            else            javafx.geometry.Insets(top, right, bottom, left)

