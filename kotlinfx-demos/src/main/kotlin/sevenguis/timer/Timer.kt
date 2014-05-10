package demos.sevenguis.timer

import kotlinfx.builders.*
import kotlinfx.properties.*
import kotlinfx.bindings.*
import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.control.ProgressBar
import javafx.scene.control.Label
import javafx.beans.property.SimpleDoubleProperty
import javafx.animation.Timeline
import javafx.animation.KeyFrame
import javafx.util.Duration
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.animation.Animation

fun main(args: Array<String>) {
    Application.launch(javaClass<Timer>())
}

class Timer : Application() {
    override fun start(stage: Stage?) {
        val progress = ProgressBar()
        val numericProgress = Label()
        val slider = Slider(min=1.0, max=400.0, value=200.0)
        val reset = Button("Reset")

        val elapsed = SimpleDoubleProperty(0.0)
        progress.progressP bind (elapsed / slider.valueP)
        elapsed.addListener { (v,o,n) ->
            numericProgress.text = formatElapsed(n!!.toInt()) }
        reset.setOnAction { elapsed.v = 0.0 }

        // TODO: Why can't I use closure syntax here?
        val timeline = Timeline(KeyFrame(Duration.millis(100.0), object : EventHandler<ActionEvent> {
            override fun handle(event: ActionEvent?) {
                if (elapsed.v < slider.getValue()) elapsed.set(elapsed.v + 1)
            }
        }))
        timeline.setCycleCount(Animation.INDEFINITE) // TODO: Why not Timeline.INDEFINITE?
        timeline.play()

        Stage(stage, title = "Timer") {
            scene = Scene {
                root = VBox(spacing=10.0, padding=Insets(10.0)) {
                    + HBox(10.0) { + Label("Elapsed Time: ") + progress }
                    + numericProgress
                    + HBox(10.0) { + Label("Duration: ") + slider }
                    + reset
                }
            }
        }.show()
    }
}

fun formatElapsed(elapsed: Int): String {
    val seconds = Math.floor(elapsed / 10.0)
    val dezipart = elapsed % 10
    return "${seconds.toInt()}.${dezipart.toInt()}s"
}