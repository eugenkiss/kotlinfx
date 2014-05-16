// Overloaded operators like in ScalaFX
// https://code.google.com/p/scalafx/#Natural_Language_Bind_Expressions
// http://docs.oracle.com/javase/8/javafx/api/javafx/beans/binding/package-summary.html
package kotlinfx.bindings

// http://docs.oracle.com/javase/8/javafx/api/javafx/beans/binding/When.html
// -------------------------------------------------------------------------

// Usage: fillProperty() bind (if_(hoverProperty()) { Color.GREEN } else_{ Color.RED })

// TODO: http://youtrack.jetbrains.com/issue/KT-1686

//fun if_(condition: javafx.beans.value.ObservableBooleanValue, f: () -> Boolean): javafx.beans.binding.When.BooleanConditionBuilder =
//    javafx.beans.binding.When(condition).then(f())!!
//
//fun if_(condition: javafx.beans.value.ObservableBooleanValue, f: () -> Double): javafx.beans.binding.When.NumberConditionBuilder =
//    javafx.beans.binding.When(condition).then(f())!!
//
//fun if_(condition: javafx.beans.value.ObservableBooleanValue, f: () -> Float): javafx.beans.binding.When.NumberConditionBuilder =
//    javafx.beans.binding.When(condition).then(f())!!
//
//fun if_(condition: javafx.beans.value.ObservableBooleanValue, f: () -> Int): javafx.beans.binding.When.NumberConditionBuilder =
//    javafx.beans.binding.When(condition).then(f())!!
//
//fun if_(condition: javafx.beans.value.ObservableBooleanValue, f: () -> Long): javafx.beans.binding.When.NumberConditionBuilder =
//    javafx.beans.binding.When(condition).then(f())!!
//
//fun if_(condition: javafx.beans.value.ObservableBooleanValue, f: () -> javafx.beans.value.ObservableBooleanValue): javafx.beans.binding.When.BooleanConditionBuilder =
//    javafx.beans.binding.When(condition).then(f())!!
//
//fun if_(condition: javafx.beans.value.ObservableBooleanValue, f: () -> javafx.beans.value.ObservableNumberValue): javafx.beans.binding.When.NumberConditionBuilder =
//    javafx.beans.binding.When(condition).then(f())!!
//
//fun if_(condition: javafx.beans.value.ObservableBooleanValue, f: () -> javafx.beans.value.ObservableStringValue): javafx.beans.binding.When.StringConditionBuilder =
//    javafx.beans.binding.When(condition).then(f())!!
//
//fun if_(condition: javafx.beans.value.ObservableBooleanValue, f: () -> String): javafx.beans.binding.When.StringConditionBuilder =
//    javafx.beans.binding.When(condition).then(f())!!

//fun if_<T>(condition: javafx.beans.value.ObservableBooleanValue, f: () -> javafx.beans.value.ObservableObjectValue<T>): javafx.beans.binding.When.ObjectConditionBuilder<T> =
//    javafx.beans.binding.When(condition).then(f())!!

fun if_<T>(condition: javafx.beans.value.ObservableBooleanValue, f: () -> T): javafx.beans.binding.When.ObjectConditionBuilder<T> =
    javafx.beans.binding.When(condition).then(f())!!

// TODO: http://youtrack.jetbrains.com/issue/KT-1686

//fun javafx.beans.binding.When.BooleanConditionBuilder.else_(f: () -> Boolean): javafx.beans.binding.BooleanBinding =
//    this.otherwise(f())!!
//
//fun javafx.beans.binding.When.BooleanConditionBuilder.else_(f: () -> javafx.beans.value.ObservableBooleanValue): javafx.beans.binding.BooleanBinding =
//    this.otherwise(f())!!
//
//fun javafx.beans.binding.When.NumberConditionBuilder.else_(f: () -> Double): javafx.beans.binding.DoubleBinding =
//    this.otherwise(f())!!
//
//fun javafx.beans.binding.When.NumberConditionBuilder.else_(f: () -> Float): javafx.beans.binding.NumberBinding =
//    this.otherwise(f())!!
//
//fun javafx.beans.binding.When.NumberConditionBuilder.else_(f: () -> Int): javafx.beans.binding.NumberBinding =
//    this.otherwise(f())!!
//
//fun javafx.beans.binding.When.NumberConditionBuilder.else_(f: () -> Long): javafx.beans.binding.NumberBinding =
//    this.otherwise(f())!!
//
//fun javafx.beans.binding.When.NumberConditionBuilder.else_(f: () -> javafx.beans.value.ObservableNumberValue): javafx.beans.binding.NumberBinding =
//    this.otherwise(f())!!
//
//fun javafx.beans.binding.When.StringConditionBuilder.else_(f: () -> String): javafx.beans.binding.StringBinding =
//    this.otherwise(f())!!
//
//fun javafx.beans.binding.When.StringConditionBuilder.else_(f: () -> javafx.beans.value.ObservableStringValue): javafx.beans.binding.StringBinding =
//    this.otherwise(f())!!

//fun <T> javafx.beans.binding.When.ObjectConditionBuilder<T>.else_(f: () -> javafx.beans.value.ObservableObjectValue<T>): javafx.beans.binding.ObjectBinding<T> =
//    this.otherwise(f())!!

fun <T> javafx.beans.binding.When.ObjectConditionBuilder<T>.else_(f: () -> T): javafx.beans.binding.ObjectBinding<T> =
    this.otherwise(f())!!


// http://docs.oracle.com/javase/8/javafx/api/javafx/beans/binding/NumberExpression.html
// -------------------------------------------------------------------------------------

// We cannot use comparison operators for greaterThan etc. because of the way Kotlin handles the translation of these operators
// The same is true for (in)equality operators.

fun javafx.beans.binding.NumberExpression.plus(other: Double): javafx.beans.binding.NumberBinding =
    this.add(other)!!

fun javafx.beans.binding.NumberExpression.plus(other: Float): javafx.beans.binding.NumberBinding =
    this.add(other)!!

fun javafx.beans.binding.NumberExpression.plus(other: Int): javafx.beans.binding.NumberBinding =
    this.add(other)!!

fun javafx.beans.binding.NumberExpression.plus(other: Long): javafx.beans.binding.NumberBinding =
    this.add(other)!!

fun javafx.beans.binding.NumberExpression.plus(other: javafx.beans.value.ObservableNumberValue): javafx.beans.binding.NumberBinding =
    this.add(other)!!

fun javafx.beans.binding.NumberExpression.div(other: Double): javafx.beans.binding.NumberBinding =
    this.divide(other)!!

fun javafx.beans.binding.NumberExpression.div(other: Float): javafx.beans.binding.NumberBinding =
    this.divide(other)!!

fun javafx.beans.binding.NumberExpression.div(other: Int): javafx.beans.binding.NumberBinding =
    this.divide(other)!!

fun javafx.beans.binding.NumberExpression.div(other: Long): javafx.beans.binding.NumberBinding =
    this.divide(other)!!

fun javafx.beans.binding.NumberExpression.div(other: javafx.beans.value.ObservableNumberValue): javafx.beans.binding.NumberBinding =
    this.divide(other)!!

fun javafx.beans.binding.NumberExpression.times(other: Double): javafx.beans.binding.NumberBinding =
    this.multiply(other)!!

fun javafx.beans.binding.NumberExpression.times(other: Float): javafx.beans.binding.NumberBinding =
    this.multiply(other)!!

fun javafx.beans.binding.NumberExpression.times(other: Int): javafx.beans.binding.NumberBinding =
    this.multiply(other)!!

fun javafx.beans.binding.NumberExpression.times(other: Long): javafx.beans.binding.NumberBinding =
    this.multiply(other)!!

fun javafx.beans.binding.NumberExpression.times(other: javafx.beans.value.ObservableNumberValue): javafx.beans.binding.NumberBinding =
    this.multiply(other)!!

fun javafx.beans.binding.NumberExpression.minus(other: Double): javafx.beans.binding.NumberBinding =
    this.subtract(other)!!

fun javafx.beans.binding.NumberExpression.minus(other: Float): javafx.beans.binding.NumberBinding =
    this.subtract(other)!!

fun javafx.beans.binding.NumberExpression.minus(other: Int): javafx.beans.binding.NumberBinding =
    this.subtract(other)!!

fun javafx.beans.binding.NumberExpression.minus(other: Long): javafx.beans.binding.NumberBinding =
    this.subtract(other)!!

fun javafx.beans.binding.NumberExpression.minus(other: javafx.beans.value.ObservableNumberValue): javafx.beans.binding.NumberBinding =
    this.subtract(other)!!


// http://docs.oracle.com/javase/8/javafx/api/javafx/beans/binding/BooleanExpression.html
// --------------------------------------------------------------------------------------

// There is no way to override boolean operators in Kotlin.


// http://docs.oracle.com/javase/8/javafx/api/javafx/beans/binding/StringExpression.html
// -------------------------------------------------------------------------------------

fun javafx.beans.binding.StringExpression.plus(other: Any?): javafx.beans.binding.StringExpression =
    this.concat(other)!!


// http://docs.oracle.com/javase/8/javafx/api/javafx/beans/binding/ObjectExpression.html
// -------------------------------------------------------------------------------------

// No opportunity to provide overriden operators.


// http://docs.oracle.com/javase/8/javafx/api/javafx/beans/binding/ListExpression.html
// -----------------------------------------------------------------------------------

// No opportunity to provide overriden operators.


// http://docs.oracle.com/javase/8/javafx/api/javafx/beans/binding/MapExpression.html
// ----------------------------------------------------------------------------------

// No opportunity to provide overriden operators.


// http://docs.oracle.com/javase/8/javafx/api/javafx/beans/binding/SetExpression.html
// ----------------------------------------------------------------------------------

// No opportunity to provide overriden operators.



