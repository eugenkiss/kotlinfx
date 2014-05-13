// http://docs.oracle.com/javase/8/javafx/api/javafx/scene/chart/package-summary.html
package kotlinfx.builders

public fun AreaChart<X,Y>(
    xAxis: javafx.scene.chart.Axis<X>,
    yAxis: javafx.scene.chart.Axis<Y>,
    data: javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X,Y>> = javafx.collections.FXCollections.emptyObservableList()!!,
    f: javafx.scene.chart.AreaChart<X,Y>.() -> Unit = {}): javafx.scene.chart.AreaChart<X,Y>
{
    val x = javafx.scene.chart.AreaChart<X,Y>(xAxis, yAxis, data)
    x.f()
    return x
}

// For abstract javafx.scene.chart.Axis<T> a builder does not make sense.

public fun TickMark<T>(
    f: javafx.scene.chart.Axis.TickMark<T>.() -> Unit = {}): javafx.scene.chart.Axis.TickMark<T>
{
    val x = javafx.scene.chart.Axis.TickMark<T>()
    x.f()
    return x
}

public fun BarChart<X,Y>(
    xAxis: javafx.scene.chart.Axis<X>,
    yAxis: javafx.scene.chart.Axis<Y>,
    data: javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X,Y>> = javafx.collections.FXCollections.emptyObservableList()!!,
    categoryGap: Double = 10.0,
    f: javafx.scene.chart.BarChart<X,Y>.() -> Unit = {}): javafx.scene.chart.BarChart<X,Y>
{
    val x = javafx.scene.chart.BarChart<X,Y>(xAxis, yAxis, data, categoryGap)
    x.f()
    return x
}

public fun BubbleChart<X,Y>(
    xAxis: javafx.scene.chart.Axis<X>,
    yAxis: javafx.scene.chart.Axis<Y>,
    data: javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X,Y>> = javafx.collections.FXCollections.emptyObservableList()!!,
    f: javafx.scene.chart.BubbleChart<X,Y>.() -> Unit = {}): javafx.scene.chart.BubbleChart<X,Y>
{
    val x = javafx.scene.chart.BubbleChart<X,Y>(xAxis, yAxis, data)
    x.f()
    return x
}

public fun CategoryAxis(
    categories: javafx.collections.ObservableList<String> = javafx.collections.FXCollections.emptyObservableList()!!,
    f: javafx.scene.chart.CategoryAxis.() -> Unit = {}): javafx.scene.chart.CategoryAxis
{
    val x = javafx.scene.chart.CategoryAxis(categories)
    x.f()
    return x
}

// For abstract javafx.scene.chart.Chart a builder does not make sense.

public fun LineChart<X,Y>(
    xAxis: javafx.scene.chart.Axis<X>,
    yAxis: javafx.scene.chart.Axis<Y>,
    data: javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X,Y>> = javafx.collections.FXCollections.emptyObservableList()!!,
    f: javafx.scene.chart.LineChart<X,Y>.() -> Unit = {}): javafx.scene.chart.LineChart<X,Y>
{
    val x = javafx.scene.chart.LineChart<X,Y>(xAxis, yAxis, data)
    x.f()
    return x
}

public fun NumberAxis(
    lowerBound: Double,
    upperBound: Double,
    tickUnit: Double,
    axisLabel: String,
    f: javafx.scene.chart.NumberAxis.() -> Unit = {}): javafx.scene.chart.NumberAxis
{
    val x = javafx.scene.chart.NumberAxis(axisLabel, lowerBound, upperBound, tickUnit)
    x.f()
    return x
}

public fun NumberAxis(
    lowerBound: Double,
    upperBound: Double,
    tickUnit: Double,
    f: javafx.scene.chart.NumberAxis.() -> Unit = {}): javafx.scene.chart.NumberAxis
{
    val x = javafx.scene.chart.NumberAxis(lowerBound, upperBound, tickUnit)
    x.f()
    return x
}

public fun NumberAxis(
    f: javafx.scene.chart.NumberAxis.() -> Unit = {}): javafx.scene.chart.NumberAxis
{
    val x = javafx.scene.chart.NumberAxis()
    x.f()
    return x
}

// For immutable javafx.scene.chart.NumberAxis.DefaultFormatter a builder does not make sense.

public fun PieChart(
    data: javafx.collections.ObservableList<javafx.scene.chart.PieChart.Data> = javafx.collections.FXCollections.emptyObservableList()!!,
    f: javafx.scene.chart.PieChart.() -> Unit = {}): javafx.scene.chart.PieChart
{
    val x = javafx.scene.chart.PieChart(data)
    x.f()
    return x
}

// For javafx.scene.chart.Piechart.Data a builder does not make sense.

public fun ScatterChart<X,Y>(
    xAxis: javafx.scene.chart.Axis<X>,
    yAxis: javafx.scene.chart.Axis<Y>,
    data: javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X,Y>> = javafx.collections.FXCollections.emptyObservableList()!!,
    f: javafx.scene.chart.ScatterChart<X,Y>.() -> Unit = {}): javafx.scene.chart.ScatterChart<X,Y>
{
    val x = javafx.scene.chart.ScatterChart<X,Y>(xAxis, yAxis, data)
    x.f()
    return x
}

public fun StackedAreaChart<X,Y>(
    xAxis: javafx.scene.chart.Axis<X>,
    yAxis: javafx.scene.chart.Axis<Y>,
    data: javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X,Y>> = javafx.collections.FXCollections.emptyObservableList()!!,
    f: javafx.scene.chart.StackedAreaChart<X,Y>.() -> Unit = {}): javafx.scene.chart.StackedAreaChart<X,Y>
{
    val x = javafx.scene.chart.StackedAreaChart<X,Y>(xAxis, yAxis, data)
    x.f()
    return x
}

public fun StackedBarChart<X,Y>(
    xAxis: javafx.scene.chart.Axis<X>,
    yAxis: javafx.scene.chart.Axis<Y>,
    data: javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X,Y>> = javafx.collections.FXCollections.emptyObservableList()!!,
    categoryGap: Double = 10.0,
    f: javafx.scene.chart.StackedBarChart<X,Y>.() -> Unit = {}): javafx.scene.chart.StackedBarChart<X,Y>
{
    val x = javafx.scene.chart.StackedBarChart<X,Y>(xAxis, yAxis, data, categoryGap)
    x.f()
    return x
}

// For abstract javafx.scene.chart.XYChart<X,Y> a builder does not make sense.
// For javafx.scene.chart.XYChart<X,Y>.Data a builder does not make sense.
// For javafx.scene.chart.XYChart<X,Y>.Series a builder does not offer much.
