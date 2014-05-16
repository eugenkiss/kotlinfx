package demos.bindingstest

import kotlinfx.builders.*
import kotlinfx.properties.*
import kotlinfx.bindings.*
import kotlinfx.abbreviations.*
import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.paint.Color

fun main(args: Array<String>) {
    Application.launch(javaClass<BindingsTest>())
}

class BindingsTest : Application() {
    override fun start(stage: Stage?) {
        Stage(stage, title="Hello World") {
            scene = Scene(width=600.0, height=450.0) {
                fill = Color.LIGHTGREEN
                root = Pane {
                    + Rectangle {
                        x = 25.0
                        y = 40.0
                        width = 100.0
                        height = 100.0
                        fillp bind (if_(hoverp) { Color.GREEN } else_{ Color.RED })
                    }
                }
            }
        }.show()
    }
}


