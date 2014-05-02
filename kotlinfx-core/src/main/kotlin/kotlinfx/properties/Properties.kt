package kotlinfx.properties

import javafx.scene.control.TextField
import javafx.beans.property.StringProperty
import javafx.beans.property.BooleanProperty
import javafx.scene.control.ComboBox
import javafx.beans.property.ObjectProperty
import javafx.scene.Node
import javafx.beans.property.ReadOnlyBooleanProperty
import javafx.scene.shape.Shape
import javafx.scene.paint.Paint
import javafx.scene.control.ProgressBar
import javafx.beans.property.DoubleProperty
import javafx.scene.control.Slider
import javafx.beans.value.ObservableValue
import javafx.beans.value.ObservableIntegerValue
import javafx.scene.control.Button
import javafx.geometry.Pos

public val Node.hoverP: ReadOnlyBooleanProperty
    get() = hoverProperty()!!

public val Shape.fillP: ObjectProperty<Paint>
    get() = fillProperty()!!

public val ProgressBar.progressP: DoubleProperty
    get() = progressProperty()!!

public val Slider.valueP: DoubleProperty
    get() = valueProperty()!!

public val TextField.textP: StringProperty
    get() = textProperty()!!

public val TextField.disableP: BooleanProperty
    get() = disableProperty()!!

public val Button.alignmentP: ObjectProperty<Pos>
    get() = this.alignmentProperty()!!

public val Button.disableP: BooleanProperty
    get() = disableProperty()!!

public val <T> ComboBox<T>.valueP: ObjectProperty<T>
    get() = valueProperty()!!

//-------------------

public val <T> ObservableValue<T>.v: T
    get() = getValue()!!

public val ObservableIntegerValue.v: Int
    get() = get()

public var DoubleProperty.v: Double
    get() = getValue()!!
    set(v) = setValue(v)