package demos.sevenguis.flightbookerk

import kotlinfx.builders.*
import kotlinfx.properties.*
import kotlinfx.properties1.*
import kotlinfx.properties2.*
import kotlinfx.properties3.*
import kotlinfx.properties4.*
import kotlinfx.kalium.*
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
    Application.launch(javaClass<FlightBookerKalium>())
}

class FlightBookerKalium : Application() {
    override fun start(stage: Stage?) {
        val flightType = ComboBox<String>(FXCollections.observableArrayList("one-way flight", "return flight"))
        flightType.setValue("one-way flight")
        val startDate = TextField(LocalDate.now().asString())
        val returnDate = TextField(LocalDate.now().asString())
        val book = Button("Book")

        returnDate.disable { flightType.value() == "one-way flight" }
        startDate.style  { if (startDate.text().isDate)  "" else "-fx-background-color: lightcoral" }
        returnDate.style { if (returnDate.text().isDate) "" else "-fx-background-color: lightcoral" }
        book.disable {
            when (flightType.value()) {
                "one-way flight" -> !startDate.text().isDate
                else             -> !startDate.text().isDate || !returnDate.text().isDate
                                    || startDate.text().asDate.compareTo(returnDate.text().asDate) > 0
            }
        }

        Stage(stage, title = "Flight Booker") {
            scene = Scene {
                root = VBox(spacing=10.0, padding=Insets(10.0)) {
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

