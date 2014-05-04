// http://docs.oracle.com/javafx/2/binding/jfxpub-binding.htm
package demos.tutorials.propertiesbindings1

import kotlinfx.bindings.*
import javafx.beans.property.SimpleIntegerProperty

fun main(args: Array<String>) {
    val num1 = SimpleIntegerProperty(1)
    val num2 = SimpleIntegerProperty(2)
    val sum = num1 + num2
    // TODO sum.v
    println(sum.getValue())
    // TODO num1 u 2
    num1 set 2
    println(sum.getValue())
}


