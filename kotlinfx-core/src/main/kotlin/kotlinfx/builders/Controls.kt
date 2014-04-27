package kotlinfx.builders

import javafx.geometry.Insets as JInsets
import javafx.scene.shape.Rectangle as JRectangle


public fun TextField(text: String = "", f: javafx.scene.control.TextField.() -> Unit = {}): javafx.scene.control.TextField {
    val textField = javafx.scene.control.TextField(text)
    textField.f()
    return textField
}

public fun Button(text: String = "", f: javafx.scene.control.Button.() -> Unit = {}): javafx.scene.control.Button {
    val button = javafx.scene.control.Button(text)
    button.f()
    return button
}

public fun Slider(
min: Double = 0.0,
max: Double = 100.0,
value: Double = 0.0,
f: javafx.scene.control.Slider.() -> Unit = {}): javafx.scene.control.Slider {
    val slider = javafx.scene.control.Slider(min, max, value)
    slider.f()
    return slider
}