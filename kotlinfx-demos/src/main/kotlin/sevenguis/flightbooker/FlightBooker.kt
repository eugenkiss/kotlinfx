package demos.sevenguis.flightbooker

import kotlinfx.builders.*
import kotlinfx.properties.*
import kotlinfx.bindings.*
import kotlinfx.abbreviations.*
import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.control.ComboBox
import javafx.collections.FXCollections
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import javafx.beans.binding.When
import javafx.beans.value.ChangeListener
import javafx.beans.value.ObservableValue
import javafx.beans.binding.Bindings
import java.util.concurrent.Callable

fun main(args: Array<String>) {
    Application.launch(javaClass<FlightBooker>())
}

class FlightBooker : Application() {
    override fun start(stage: Stage?) {
        val flightType = ComboBox<String>(FXCollections.observableArrayList("one-way flight", "return flight"))
        flightType.value = "one-way flight"
        val startDate = TextField(LocalDate.now().asString())
        val returnDate = TextField(LocalDate.now().asString())
        val book = Button("Book")
        book.setDisable(true)

        returnDate.disablep bind (flightType.valuep isEqualTo "one-way flight")
        // TODO: How to use closure instead of Callable?
        startDate.stylep bind Bindings.createStringBinding(object : Callable<String>{ override fun call(): String? =
            if (startDate.text.isDate) "" else "-fx-background-color: lightcoral"
        }, startDate.textp)
        // For comparison, callback alternative
        returnDate.textp.addListener{(v, o, n) ->
            returnDate.setStyle(if (n.isDate) "" else "-fx-background-color: lightcoral")}
        // TODO: How to use closure instead of Callable?
        book.disablep bind Bindings.createBooleanBinding(object : Callable<Boolean> { override fun call(): Boolean? =
            if (flightType.value == "one-way flight") {
                !startDate.text.isDate
            } else {
                !startDate.text.isDate || !returnDate.text.isDate ||
                startDate.text.asDate.compareTo(returnDate.text.asDate) > 0
            }
        }, flightType.valuep, startDate.textp, returnDate.textp)

        Stage(stage, title = "Flight Booker") {
            scene = Scene {
                root = VBox(spacing = 10.0, padding = Insets(10.0)) {
                    + flightType
                    + startDate
                    + returnDate
                    + book
                }
            }
        }.show()
    }
}

val formatter = DateTimeFormatter.ISO_LOCAL_DATE
fun LocalDate?.asString() = this!!.format(formatter)!!
val String?.asDate: LocalDate get() = LocalDate.from(formatter.parse(this!!))!!
val String?.isDate: Boolean get() =
    try {
        formatter.parse(this)
        true
    } catch (e: Exception) {
        false
    }

