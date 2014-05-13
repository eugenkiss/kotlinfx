// http://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/cell/CheckBoxListCell.html
package kotlinfx.builders

import javafx.scene.control.TreeItem

public fun CheckBoxListCell<T>(
    f: javafx.scene.control.cell.CheckBoxListCell<T>.() -> Unit = {}): javafx.scene.control.cell.CheckBoxListCell<T>
{
    val x = javafx.scene.control.cell.CheckBoxListCell<T>()
    x.f()
    return x
}

public fun CheckBoxListCell<T>(
    // TODO: Can I use a Kotlin function? Or do I get the SAM conversion anyway?
    getSelectedProperty: javafx.util.Callback<T,javafx.beans.value.ObservableValue<Boolean>>,
    f: javafx.scene.control.cell.CheckBoxListCell<T>.() -> Unit = {}): javafx.scene.control.cell.CheckBoxListCell<T>
{
    val x = javafx.scene.control.cell.CheckBoxListCell<T>(getSelectedProperty)
    x.f()
    return x
}

public fun CheckBoxListCell<T>(
    getSelectedProperty: javafx.util.Callback<T,javafx.beans.value.ObservableValue<Boolean>>,
    converter: javafx.util.StringConverter<T>,
    f: javafx.scene.control.cell.CheckBoxListCell<T>.() -> Unit = {}): javafx.scene.control.cell.CheckBoxListCell<T>
{
    val x = javafx.scene.control.cell.CheckBoxListCell<T>(getSelectedProperty, converter)
    x.f()
    return x
}

public fun CheckBoxTableCell<S,T>(
    f: javafx.scene.control.cell.CheckBoxTableCell<S,T>.() -> Unit = {}): javafx.scene.control.cell.CheckBoxTableCell<S,T>
{
    val x = javafx.scene.control.cell.CheckBoxTableCell<S,T>()
    x.f()
    return x
}

public fun CheckBoxTableCell<S,T>(
    getSelectedProperty: javafx.util.Callback<Int,javafx.beans.value.ObservableValue<Boolean>>,
    f: javafx.scene.control.cell.CheckBoxTableCell<S,T>.() -> Unit = {}): javafx.scene.control.cell.CheckBoxTableCell<S,T>
{
    val x = javafx.scene.control.cell.CheckBoxTableCell<S,T>(getSelectedProperty)
    x.f()
    return x
}

public fun CheckBoxListCell<S,T>(
    getSelectedProperty: javafx.util.Callback<Int,javafx.beans.value.ObservableValue<Boolean>>,
    converter: javafx.util.StringConverter<T>,
    f: javafx.scene.control.cell.CheckBoxTableCell<S,T>.() -> Unit = {}): javafx.scene.control.cell.CheckBoxTableCell<S,T>
{
    val x = javafx.scene.control.cell.CheckBoxTableCell<S,T>(getSelectedProperty, converter)
    x.f()
    return x
}

public fun CheckBoxTreeCell<T>(
    f: javafx.scene.control.cell.CheckBoxTreeCell<T>.() -> Unit = {}): javafx.scene.control.cell.CheckBoxTreeCell<T>
{
    val x = javafx.scene.control.cell.CheckBoxTreeCell<T>()
    x.f()
    return x
}

public fun CheckBoxTreeCell<T>(
    getSelectedProperty: javafx.util.Callback<javafx.scene.control.TreeItem<T>,javafx.beans.value.ObservableValue<Boolean>>,
    f: javafx.scene.control.cell.CheckBoxTreeCell<T>.() -> Unit = {}): javafx.scene.control.cell.CheckBoxTreeCell<T>
{
    val x = javafx.scene.control.cell.CheckBoxTreeCell<T>(getSelectedProperty)
    x.f()
    return x
}

public fun CheckBoxTreeCell<T>(
    getSelectedProperty: javafx.util.Callback<javafx.scene.control.TreeItem<T>,javafx.beans.value.ObservableValue<Boolean>>,
    converter: javafx.util.StringConverter<javafx.scene.control.TreeItem<T>>,
    f: javafx.scene.control.cell.CheckBoxTreeCell<T>.() -> Unit = {}): javafx.scene.control.cell.CheckBoxTreeCell<T>
{
    val x = javafx.scene.control.cell.CheckBoxTreeCell<T>(getSelectedProperty, converter)
    x.f()
    return x
}

public fun CheckBoxTreeTableCell<S,T>(
    f: javafx.scene.control.cell.CheckBoxTreeTableCell<S,T>.() -> Unit = {}): javafx.scene.control.cell.CheckBoxTreeTableCell<S,T>
{
    val x = javafx.scene.control.cell.CheckBoxTreeTableCell<S,T>()
    x.f()
    return x
}

public fun CheckBoxTreeTableCell<S,T>(
    getSelectedProperty: javafx.util.Callback<Int,javafx.beans.value.ObservableValue<Boolean>>,
    f: javafx.scene.control.cell.CheckBoxTreeTableCell<S,T>.() -> Unit = {}): javafx.scene.control.cell.CheckBoxTreeTableCell<S,T>
{
    val x = javafx.scene.control.cell.CheckBoxTreeTableCell<S,T>(getSelectedProperty)
    x.f()
    return x
}

public fun CheckBoxListCell<S,T>(
    getSelectedProperty: javafx.util.Callback<Int,javafx.beans.value.ObservableValue<Boolean>>,
    converter: javafx.util.StringConverter<T>,
    f: javafx.scene.control.cell.CheckBoxTreeTableCell<S,T>.() -> Unit = {}): javafx.scene.control.cell.CheckBoxTreeTableCell<S,T>
{
    val x = javafx.scene.control.cell.CheckBoxTreeTableCell<S,T>(getSelectedProperty, converter)
    x.f()
    return x
}

// TODO: It is soulcrushingly tedious to create these builders by hand. This file should be finished, nonetheless.