package demos.sevenguis.flightbooker

import kotlinfx.builders.*
import kotlinfx.properties.*
import kotlinfx.properties1.*
import kotlinfx.properties2.*
import kotlinfx.properties3.*
import kotlinfx.properties4.*
import kotlinfx.bindings.*
import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.control.ComboBox
import javafx.collections.FXCollections
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import javafx.beans.binding.When
import javafx.beans.value.ChangeListener
import javafx.beans.value.ObservableValue

fun main(args: Array<String>) {
    Application.launch(javaClass<FlightBooker>())
}

class FlightBooker : Application() {
    override fun start(stage: Stage?) {
        val flightType = ComboBox<String>(FXCollections.observableArrayList("one-way flight", "return flight"))
        val startDate = TextField(LocalDate.now().asString())
        val returnDate = TextField(LocalDate.now().asString())
        val book = Button("Book")
        book.setDisable(true)

        returnDate.disableP bind (flightType.valueP eq "one-way flight")
        startDate.textP.addListener{(v, o, n) ->
                startDate.setStyle(if (n.isDate) "" else "-fx-background-color: lightcoral")}
        returnDate.textP.addListener{(v, o, n) ->
            returnDate.setStyle(if (n.isDate) "" else "-fx-background-color: lightcoral")}
        val bookEnabledAction = {(v: Any?, o: Any?, n: Any?) ->
            when (flightType.value) {
                "one-way flight" -> book.disable = !startDate.text.isDate
                "return flight" -> book.disable =
                    !startDate.text.isDate || !returnDate.text.isDate ||
                    startDate.text.asDate.compareTo(returnDate.text.asDate) > 0
            }
        }
        flightType.valueP.addListener(bookEnabledAction)
        startDate.textP.addListener(bookEnabledAction)
        returnDate.textP.addListener(bookEnabledAction)
        flightType.setValue("one-way flight")

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

