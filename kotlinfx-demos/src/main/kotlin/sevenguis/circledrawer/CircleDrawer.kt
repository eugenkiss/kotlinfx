package demos.sevenguis.circledrawer

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
    Application.launch(javaClass<CircleDrawer>())
}

class CircleDrawer : Application() {
    override fun start(stage: Stage?) {
        Stage(stage, title = "Circle Drawer") {
            scene = Scene {
                root = HBox(spacing=10.0, padding=Insets(10.0)) {
                }
            }
        }.show()
    }
}


