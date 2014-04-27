// Overloaded operators like in ScalaFX
// https://code.google.com/p/scalafx/#Natural_Language_Bind_Expressions
package kotlinfx.bindings

import javafx.beans.binding.ObjectExpression
import javafx.beans.value.ObservableObjectValue
import javafx.beans.binding.BooleanBinding
import javafx.beans.value.ObservableBooleanValue
import javafx.beans.value.ObservableNumberValue
import javafx.beans.binding.NumberBinding
import javafx.beans.binding.When
import javafx.beans.binding.ObjectBinding
import javafx.beans.binding.DoubleBinding
import javafx.beans.binding.DoubleExpression
import javafx.beans.binding.StringExpression
import javafx.beans.binding.NumberExpression


fun <T> ObjectExpression<T>.eq(other: Any?): BooleanBinding =
    this.isEqualTo(other)!!

fun NumberExpression.eq(other: Int): BooleanBinding =
    this.isEqualTo(other)!!

fun DoubleExpression.div(other: ObservableNumberValue): DoubleBinding =
    this.divide(other)!!

fun StringExpression.plus(other: Any?): StringExpression =
    this.concat(other)!!

//fun <T> jf(condition: ObservableBooleanValue, f: () -> ObservableObjectValue<T>): When.ObjectConditionBuilder<T> =
//    When(condition).then(f())!!

fun <T> jf(condition: ObservableBooleanValue, f: () -> T): When.ObjectConditionBuilder<T> =
    When(condition).then(f())!!

//fun <T> When.ObjectConditionBuilder<T>.elze(f: () -> ObservableObjectValue<T>): ObjectBinding<T> =
//    this.otherwise(f())!!

fun <T> When.ObjectConditionBuilder<T>.elze(f: () -> T): ObjectBinding<T> =
    this.otherwise(f())!!
