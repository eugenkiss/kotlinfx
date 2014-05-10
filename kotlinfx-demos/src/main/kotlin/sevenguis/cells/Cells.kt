package demos.sevenguis.cells

import kotlinfx.builders.*
import kotlinfx.properties.*
import kotlinfx.properties1.*
import kotlinfx.properties2.*
import kotlinfx.properties3.*
import kotlinfx.properties4.*
import javafx.application.Application
import javafx.stage.Stage

// TODO
fun main(args: Array<String>) {
    Application.launch(javaClass<Cells>())
}

class Cells : Application() {
    override fun start(stage: Stage?) {
        Stage(stage, title = "Cells") {
            scene = Scene {
                root = HBox(spacing=10.0, padding=Insets(10.0)) {
                }
            }
        }.show()
    }
}


