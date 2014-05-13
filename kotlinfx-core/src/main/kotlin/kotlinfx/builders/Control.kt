// http://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/package-summary.html
package kotlinfx.builders

import javafx.geometry.Insets as JInsets
import javafx.scene.shape.Rectangle as JRectangle

public fun Accordion(
    f: javafx.scene.control.Accordion.() -> Unit = {}): javafx.scene.control.Accordion
{
    val x = javafx.scene.control.Accordion()
    x.f()
    return x
}

public fun Button(
    text: String = "",
    f: javafx.scene.control.Button.() -> Unit = {}): javafx.scene.control.Button
{
    val x = javafx.scene.control.Button(text)
    x.f()
    return x
}

public fun Cell<T>(
    f: javafx.scene.control.Cell<T>.() -> Unit = {}): javafx.scene.control.Cell<T>
{
    val x = javafx.scene.control.Cell<T>()
    x.f()
    return x
}

public fun CheckBox(
    text: String = "",
    f: javafx.scene.control.CheckBox.() -> Unit = {}): javafx.scene.control.CheckBox
{
    val x = javafx.scene.control.CheckBox(text)
    x.f()
    return x
}

public fun CheckBoxTreeItem<T>(
    value: T? = null,
    graphic: javafx.scene.Node? = null,
    selected: Boolean = false,
    independent: Boolean = false,
    f: javafx.scene.control.CheckBoxTreeItem<T>.() -> Unit = {}): javafx.scene.control.CheckBoxTreeItem<T>
{
    val x = javafx.scene.control.CheckBoxTreeItem<T>(value, graphic, selected, independent)
    x.f()
    return x
}

public fun CheckMenuItem(
    text: String = "",
    graphic: javafx.scene.Node? = null,
    f: javafx.scene.control.CheckMenuItem.() -> Unit = {}): javafx.scene.control.CheckMenuItem
{
    val x = javafx.scene.control.CheckMenuItem(text, graphic)
    x.f()
    return x
}

public fun ChoiceBox<T>(
    items: javafx.collections.ObservableList<T> = javafx.collections.FXCollections.emptyObservableList()!!,
    f: javafx.scene.control.ChoiceBox<T>.() -> Unit = {}): javafx.scene.control.ChoiceBox<T>
{
    val x = javafx.scene.control.ChoiceBox(items)
    x.f()
    return x
}

public fun ColorPicker(
    color: javafx.scene.paint.Color = javafx.scene.paint.Color.WHITE,
    f: javafx.scene.control.ColorPicker.() -> Unit = {}): javafx.scene.control.ColorPicker
{
    val x = javafx.scene.control.ColorPicker(color)
    x.f()
    return x
}

public fun ComboBox<T>(
    items: javafx.collections.ObservableList<T> = javafx.collections.FXCollections.emptyObservableList()!!,
    f: javafx.scene.control.ComboBox<T>.() -> Unit = {}): javafx.scene.control.ComboBox<T>
{
    val x = javafx.scene.control.ComboBox(items)
    x.f()
    return x
}

public fun ContextMenu(
    f: javafx.scene.control.ContextMenu.() -> Unit = {}): javafx.scene.control.ContextMenu
{
    val x = javafx.scene.control.ContextMenu()
    x.f()
    return x
}

public fun CustomMenuItem(
    node: javafx.scene.Node? = null,
    hideOnClick: Boolean = true,
    f: javafx.scene.control.CustomMenuItem.() -> Unit = {}): javafx.scene.control.CustomMenuItem
{
    val x = javafx.scene.control.CustomMenuItem(node, hideOnClick)
    x.f()
    return x
}

public fun DateCell(
    f: javafx.scene.control.DateCell.() -> Unit = {}): javafx.scene.control.DateCell
{
    val x = javafx.scene.control.DateCell()
    x.f()
    return x
}

public fun DatePicker(
    localDate: java.time.LocalDate? = null,
    f: javafx.scene.control.DatePicker.() -> Unit = {}): javafx.scene.control.DatePicker
{
    val x = javafx.scene.control.DatePicker(localDate)
    x.f()
    return x
}

public fun Hyperlink(
    text: String = "",
    graphic: javafx.scene.Node? = null,
    f: javafx.scene.control.Hyperlink.() -> Unit = {}): javafx.scene.control.Hyperlink
{
    val x = javafx.scene.control.Hyperlink(text, graphic)
    x.f()
    return x
}

public fun IndexedCell<T>(
    f: javafx.scene.control.IndexedCell<T>.() -> Unit = {}): javafx.scene.control.IndexedCell<T>
{
    val x = javafx.scene.control.IndexedCell<T>()
    x.f()
    return x
}

public fun IndexRange(
    range: javafx.scene.control.IndexRange,
    f: javafx.scene.control.IndexRange.() -> Unit = {}): javafx.scene.control.IndexRange
{
    val x = javafx.scene.control.IndexRange(range)
    x.f()
    return x
}

public fun IndexRange(
    start: Int,
    end: Int,
    f: javafx.scene.control.IndexRange.() -> Unit = {}): javafx.scene.control.IndexRange
{
    val x = javafx.scene.control.IndexRange(start, end)
    x.f()
    return x
}

public fun Label(
    text: String = "",
    graphic: javafx.scene.Node? = null,
    f: javafx.scene.control.Label.() -> Unit = {}): javafx.scene.control.Label
{
    val x = javafx.scene.control.Label(text, graphic)
    x.f()
    return x
}

public fun ListCell<T>(
    f: javafx.scene.control.ListCell<T>.() -> Unit = {}): javafx.scene.control.ListCell<T>
{
    val x = javafx.scene.control.ListCell<T>()
    x.f()
    return x
}

public fun ListView<T>(
    items: javafx.collections.ObservableList<T> = javafx.collections.FXCollections.emptyObservableList()!!,
    f: javafx.scene.control.ListView<T>.() -> Unit = {}): javafx.scene.control.ListView<T>
{
    val x = javafx.scene.control.ListView(items)
    x.f()
    return x
}

public fun Menu(
    text: String = "",
    graphic: javafx.scene.Node? = null,
    f: javafx.scene.control.Menu.() -> Unit = {}): javafx.scene.control.Menu
{
    val x = javafx.scene.control.Menu(text, graphic)
    x.f()
    return x
}

public fun MenuBar(
    f: javafx.scene.control.MenuBar.() -> Unit = {}): javafx.scene.control.MenuBar
{
    val x = javafx.scene.control.MenuBar()
    x.f()
    return x
}

public fun MenuButton(
    text: String = "",
    graphic: javafx.scene.Node? = null,
    f: javafx.scene.control.MenuButton.() -> Unit = {}): javafx.scene.control.MenuButton
{
    val x = javafx.scene.control.MenuButton(text, graphic)
    x.f()
    return x
}

public fun MenuItem(
    text: String = "",
    graphic: javafx.scene.Node? = null,
    f: javafx.scene.control.MenuItem.() -> Unit = {}): javafx.scene.control.MenuItem
{
    val x = javafx.scene.control.MenuItem(text, graphic)
    x.f()
    return x
}

public fun Pagination(
    pageCount: Int = javafx.scene.control.Pagination.INDETERMINATE,
    pageIndex: Int = 0,
    f: javafx.scene.control.Pagination.() -> Unit = {}): javafx.scene.control.Pagination
{
    val x = javafx.scene.control.Pagination(pageCount, pageIndex)
    x.f()
    return x
}

public fun PasswordField(
    f: javafx.scene.control.PasswordField.() -> Unit = {}): javafx.scene.control.PasswordField
{
    val x = javafx.scene.control.PasswordField()
    x.f()
    return x
}

public fun PopupControl(
    f: javafx.scene.control.PopupControl.() -> Unit = {}): javafx.scene.control.PopupControl
{
    val x = javafx.scene.control.PopupControl()
    x.f()
    return x
}

public fun ProgressBar(
    progress: Double = 0.0,
    f: javafx.scene.control.ProgressBar.() -> Unit = {}): javafx.scene.control.ProgressBar
{
    val x = javafx.scene.control.ProgressBar(progress)
    x.f()
    return x
}

public fun ProgressIndicator(
    progress: Double = 0.0,
    f: javafx.scene.control.ProgressIndicator.() -> Unit = {}): javafx.scene.control.ProgressIndicator
{
    val x = javafx.scene.control.ProgressIndicator(progress)
    x.f()
    return x
}

public fun RadioButton(
    text: String = "",
    f: javafx.scene.control.RadioButton.() -> Unit = {}): javafx.scene.control.RadioButton
{
    val x = javafx.scene.control.RadioButton(text)
    x.f()
    return x
}

public fun RadioMenuItem(
    text: String = "",
    graphic: javafx.scene.Node? = null,
    f: javafx.scene.control.RadioMenuItem.() -> Unit = {}): javafx.scene.control.RadioMenuItem
{
    val x = javafx.scene.control.RadioMenuItem(text, graphic)
    x.f()
    return x
}

// For ResizeFeaturesBase a builder does not make sense.

public fun ScrollBar(
    orientation: javafx.geometry.Orientation = javafx.geometry.Orientation.HORIZONTAL,
    f: javafx.scene.control.ScrollBar.() -> Unit = {}): javafx.scene.control.ScrollBar
{
    val x = javafx.scene.control.ScrollBar()
    x.setOrientation(orientation)
    x.f()
    return x
}

public fun ScrollPane(
    content: javafx.scene.Node? = null,
    f: javafx.scene.control.ScrollPane.() -> Unit = {}): javafx.scene.control.ScrollPane
{
    val x = javafx.scene.control.ScrollPane(content)
    x.f()
    return x
}

// For ScrollToEvent<T> a builder does not make sense.
// For SelectionModel<T> a builder does not make sense.

public fun Separator(
    orientation: javafx.geometry.Orientation = javafx.geometry.Orientation.HORIZONTAL,
    f: javafx.scene.control.Separator.() -> Unit = {}): javafx.scene.control.Separator
{
    val x = javafx.scene.control.Separator(orientation)
    x.f()
    return x
}

public fun SeparatorMenuItem(
    f: javafx.scene.control.SeparatorMenuItem.() -> Unit = {}): javafx.scene.control.SeparatorMenuItem
{
    val x = javafx.scene.control.SeparatorMenuItem()
    x.f()
    return x
}

// For SingleSelectionModel<T> a builder does not make sense.
// For abstract SkinBase<C extends Control> a builder does not make sense.

public fun Slider(
    min: Double = 0.0,
    max: Double = 100.0,
    value: Double = 0.0,
    f: javafx.scene.control.Slider.() -> Unit = {}): javafx.scene.control.Slider
{
    val x = javafx.scene.control.Slider(min, max, value)
    x.f()
    return x
}

// For SortEvent<C> a builder does not make sense.

public fun SplitMenuButton(
    f: javafx.scene.control.SplitMenuButton.() -> Unit = {}): javafx.scene.control.SplitMenuButton
{
    val x = javafx.scene.control.SplitMenuButton()
    x.f()
    return x
}

public fun SplitPane(
    f: javafx.scene.control.SplitPane.() -> Unit = {}): javafx.scene.control.SplitPane
{
    val x = javafx.scene.control.SplitPane()
    x.f()
    return x
}

public fun SplitPaneDivider(
    position: Double = 0.5,
    f: javafx.scene.control.SplitPane.Divider.() -> Unit = {}): javafx.scene.control.SplitPane.Divider
{
    val x = javafx.scene.control.SplitPane.Divider()
    x.setPosition(position)
    x.f()
    return x
}

public fun Tab(
    text: String = "",
    f: javafx.scene.control.Tab.() -> Unit = {}): javafx.scene.control.Tab
{
    val x = javafx.scene.control.Tab(text)
    x.f()
    return x
}

public fun TableCell<S,T>(
    f: javafx.scene.control.TableCell<S,T>.() -> Unit = {}): javafx.scene.control.TableCell<S,T>
{
    val x = javafx.scene.control.TableCell<S,T>()
    x.f()
    return x
}

public fun TableColumn<S,T>(
    text: String = "",
    f: javafx.scene.control.TableColumn<S,T>.() -> Unit = {}): javafx.scene.control.TableColumn<S,T>
{
    val x = javafx.scene.control.TableColumn<S,T>(text)
    x.f()
    return x
}

// For TableColumn.CellDataFeatures<S,T> a builder does not make sense.
// For TableColumn.CellEditEvent<S,T> a builder does not make sense.
// For abstract TableColumnBase<S,T> a builder does not make sense.
// For abstract TableFocusModel<T,TC extends TableColumnBase<T,?>> a builder does not make sense.
// For immutable TablePosition<S,T> a builder does not make sense.
// For abstract TablePositionBase<TC extends TableColumnBase> a builder does not make sense.

public fun TableRow<T>(
    f: javafx.scene.control.TableRow<T>.() -> Unit = {}): javafx.scene.control.TableRow<T>
{
    val x = javafx.scene.control.TableRow<T>()
    x.f()
    return x
}

// For abstract TableSelectionModel<T> a builder does not make sense.

public fun TableView<S>(
    items: javafx.collections.ObservableList<S> = javafx.collections.FXCollections.emptyObservableList()!!,
    f: javafx.scene.control.TableView<S>.() -> Unit = {}): javafx.scene.control.TableView<S>
{
    val x = javafx.scene.control.TableView<S>(items)
    x.f()
    return x
}

// For immutable TableView.ResizeFeatures<S> a builder does not make sense.
// For TableView.TableViewFocusModel<S> a builder does not make sense.
// For TableView.TableViewSelectionModel<S> a builder does not make sense.

public fun TabPane(
    f: javafx.scene.control.TabPane.() -> Unit = {}): javafx.scene.control.TabPane
{
    val x = javafx.scene.control.TabPane()
    x.f()
    return x
}

public fun TextArea(
    text: String = "",
    f: javafx.scene.control.TextArea.() -> Unit = {}): javafx.scene.control.TextArea
{
    val x = javafx.scene.control.TextArea(text)
    x.f()
    return x
}

public fun TextField(
    text: String = "",
    f: javafx.scene.control.TextField.() -> Unit = {}): javafx.scene.control.TextField
{
    val x = javafx.scene.control.TextField(text)
    x.f()
    return x
}

// For abstract TextInputControl a builder does not make sense.

public fun TitledPane(
    title: String = "",
    content: javafx.scene.Node? = null,
    f: javafx.scene.control.TitledPane.() -> Unit = {}): javafx.scene.control.TitledPane
{
    val x = javafx.scene.control.TitledPane(title, content)
    x.f()
    return x
}

public fun ToggleButton(
    text: String = "",
    graphic: javafx.scene.Node? = null,
    f: javafx.scene.control.ToggleButton.() -> Unit = {}): javafx.scene.control.ToggleButton
{
    val x = javafx.scene.control.ToggleButton(text, graphic)
    x.f()
    return x
}

public fun ToggleGroup(
    f: javafx.scene.control.ToggleGroup.() -> Unit = {}): javafx.scene.control.ToggleGroup
{
    val x = javafx.scene.control.ToggleGroup()
    x.f()
    return x
}

public fun ToolBar(
    f: javafx.scene.control.ToolBar.() -> Unit = {}): javafx.scene.control.ToolBar
{
    val x = javafx.scene.control.ToolBar()
    x.f()
    return x
}

public fun ToolBar(
    vararg items: javafx.scene.Node?): javafx.scene.control.ToolBar
{
    val x = javafx.scene.control.ToolBar(*items)
    return x
}

public fun Tooltip(
    text: String = "",
    f: javafx.scene.control.Tooltip.() -> Unit = {}): javafx.scene.control.Tooltip
{
    val x = javafx.scene.control.Tooltip(text)
    x.f()
    return x
}

public fun TreeCell<T>(
    f: javafx.scene.control.TreeCell<T>.() -> Unit = {}): javafx.scene.control.TreeCell<T>
{
    val x = javafx.scene.control.TreeCell<T>()
    x.f()
    return x
}

public fun TreeItem<T>(
    value: T? = null,
    graphic: javafx.scene.Node? = null,
    f: javafx.scene.control.TreeItem<T>.() -> Unit = {}): javafx.scene.control.TreeItem<T>
{
    val x = javafx.scene.control.TreeItem<T>(value, graphic)
    x.f()
    return x
}

// For TreeItem.TreeModificationEvent<T> a builder does not make sense.

public fun TreeTableCell<S,T>(
    f: javafx.scene.control.TreeTableCell<S,T>.() -> Unit = {}): javafx.scene.control.TreeTableCell<S,T>
{
    val x = javafx.scene.control.TreeTableCell<S,T>()
    x.f()
    return x
}

public fun TreeTableColumn<S,T>(
    text: String = "",
    f: javafx.scene.control.TreeTableColumn<S,T>.() -> Unit = {}): javafx.scene.control.TreeTableColumn<S,T>
{
    val x = javafx.scene.control.TreeTableColumn<S,T>(text)
    x.f()
    return x
}

// For TreeTableColumn.CellDataFeatures<S,T> a builder does not make sense.
// For TreeTableColumn.CellEditEvent<S,T> a builder does not make sense.
// For immutable TreeTablePosition a builder does not make sense.

public fun TreeTableRow<T>(
    f: javafx.scene.control.TreeTableRow<T>.() -> Unit = {}): javafx.scene.control.TreeTableRow<T>
{
    val x = javafx.scene.control.TreeTableRow<T>()
    x.f()
    return x
}

public fun TreeTableView<S>(
    root: javafx.scene.control.TreeItem<S>? = null,
    f: javafx.scene.control.TreeTableView<S>.() -> Unit = {}): javafx.scene.control.TreeTableView<S>
{
    val x = javafx.scene.control.TreeTableView<S>(root)
    x.f()
    return x
}

// For immutable TreeTableView.ResizeFeatures<S> a builder does not make sense.
// For TreeTableView.TableViewFocusModel<S> a builder does not make sense.
// For TreeTableView.TableViewSelectionModel<S> a builder does not make sense.

public fun TreeView<T>(
    root: javafx.scene.control.TreeItem<T>? = null,
    f: javafx.scene.control.TreeView<T>.() -> Unit = {}): javafx.scene.control.TreeView<T>
{
    val x = javafx.scene.control.TreeView<T>(root)
    x.f()
    return x
}

// For TreeView.EditEvent a builder does not make sense.
