// https://code.google.com/p/scalafx/wiki/GettingStarted
package demos.scalafx

import kotlinfx.builders.*
import kotlinfx.properties.*
import kotlinfx.properties1.*
import kotlinfx.properties2.*
import kotlinfx.properties3.*
import kotlinfx.properties4.*
import kotlinfx.bindings.*
import kotlinfx.kalium.*
import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.paint.Color;
import javafx.beans.value.ChangeListener
import javafx.beans.value.ObservableValue
import javafx.beans.binding.When

fun main(args: Array<String>) {
    Application.launch(javaClass<World>())
}

class World : Application() {
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
                        fill { if (hover()) Color.GREEN else Color.RED }
                    }
                }
            }
        }.show()
    }
}

