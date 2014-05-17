package demos.sevenguis.circledrawer

import kotlinfx.builders.*
import kotlinfx.properties.*
import kotlinfx.abbreviations.*
import javafx.application.Application
import javafx.stage.Stage

// TODO
fun main(args: Array<String>) {
    Application.launch(javaClass<CircleDrawer>())
}

class CircleDrawer : Application() {
    override fun start(stage: Stage?) {
        val undo = Button("Undo")
        val redo = Button("Redo")
        val canvas = CircleDrawerCanvas()

        Stage(stage, title="Circle Drawer") {
            scene = Scene {
                root = BorderPane(padding=Insets(10.0)) {
                    top = HBox(spacing=10.0, padding=Insets(10.0)) {
                        + undo + redo
                    }
                    center = canvas
                }
            }
        }.show()
    }
}

class CircleDrawerCanvas : javafx.scene.canvas.Canvas(400.0, 400.0) {

}

class Circle(val x: Double, val y: Double, var d: Double)