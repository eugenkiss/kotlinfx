package kotlinfx.properties

import javafx.scene.layout.Region
import javafx.scene.control.TextField
import javafx.scene.control.Button
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.control.ComboBox
import javafx.scene.control.Label
import javafx.scene.control.Slider

public var Region.prefWidth: Double
    get() = getPrefWidth()
    set(v) = setPrefWidth(v)

public var Label.text: String
    get() = getText()!!
    set(v) = setText(v)

public var TextField.editable: Boolean
    get() = isEditable()
    set(v) = setEditable(v)

public var TextField.text: String
    get() = getText()!!
    set(v) = setText(v)

public var Button.disable: Boolean
    get() = isDisable()
    set(v) = setDisable(v)

public var Button.onAction: EventHandler<ActionEvent>
    get() = getOnAction()!!
    set(v) = setOnAction(v)

public var Slider.value: Double
    get() = getValue()
    set(v) = setValue(v)

public var <T> ComboBox<T>.value: T
    get() = getValue()!!
    set(v) = setValue(v)

