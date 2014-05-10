package demos.sevenguis.counter

import kotlinfx.builders.*
import kotlinfx.properties.*
import javafx.application.Application
import javafx.stage.Stage

fun main(args: Array<String>) {
    Application.launch(javaClass<Counter>())
}

class Counter : Application() {
    override fun start(stage: Stage?) {
        val count = TextField("0") {
            editable = false; prefWidth = 50.0 }
        val countUp = Button("Count") {
            setOnAction { count.setText("${1+Integer.parseInt(count.getText().toString())}") }}
            //TODO Why does the following not work?
            //onAction = { count.setText("${1+Integer.parseInt(count.getText().toString())}") }}

        Stage(stage, title = "Counter") {
            scene = Scene {
                root = HBox(spacing = 10.0, padding = Insets(10.0)) {
                    + count
                    + countUp
                }
            }
        }.show()
    }
}

