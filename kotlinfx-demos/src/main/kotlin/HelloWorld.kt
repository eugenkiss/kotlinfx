//http://docs.oracle.com/javafx/2/get_started/hello_world.htm
package demos.helloworld

import kotlinfx.builders.*
import kotlinfx.properties.*
import javafx.application.Application
import javafx.stage.Stage

fun main(args: Array<String>) {
    Application.launch(javaClass<HelloWorld>())
}

class HelloWorld : Application() {
    override fun start(stage: Stage?) {
        Stage(stage, title = "Hello World!") {
            scene = Scene(width = 300.0, height = 250.0) {
                root = StackPane {
                    + Button("Say 'Hello World'") {
                        setOnAction { println("Hello World!") }
                    }
                }
            }
        }.show()
    }
}


