// http://docs.oracle.com/javafx/2/binding/jfxpub-binding.htm
package demos.tutorials.propertiesbindings1

import kotlinfx.bindings.*
import kotlinfx.abbreviations.*
import javafx.beans.property.SimpleIntegerProperty

fun main(args: Array<String>) {
    val num1 = SimpleIntegerProperty(1)
    val num2 = SimpleIntegerProperty(2)
    val sum = num1 + num2
    println(sum.v)
    num1 set 2
    println(sum.v)
}


