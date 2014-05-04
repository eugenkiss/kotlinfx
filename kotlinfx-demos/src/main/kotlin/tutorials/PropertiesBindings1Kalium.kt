// http://docs.oracle.com/javafx/2/binding/jfxpub-binding.htm
// http://docs.oracle.com/javase/8/javafx/properties-binding-tutorial/binding.htm#JFXBD107
package demos.tutorials.propertiesbindings1kalium

import kotlinfx.kalium.*

fun main(args: Array<String>) {
    val num1 = V(1)
    val num2 = V(2)
    val sum = K{ num1() + num2() }
    println(sum())
    num1 u 2
    println(sum())
}


