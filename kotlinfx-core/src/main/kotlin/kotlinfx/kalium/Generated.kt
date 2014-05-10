package kotlinfx.kalium

import kotlinfx.kalium.template

import javafx.beans.value.ObservableValue


// javafx.scene.control.cell.ComboBoxTableCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.cell.ComboBoxTableCell<S, T>.comboBoxEditable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("comboBoxEditable", f, this, comboBoxEditableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.cell.ComboBoxTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.animation.RotateTransition

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.RotateTransition.axis(f: (() -> javafx.geometry.Point3D)? = null): javafx.geometry.Point3D =
    template<javafx.geometry.Point3D>("axis", f, this, axisProperty()!! as ObservableValue<javafx.geometry.Point3D>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.RotateTransition.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.RotateTransition.fromAngle(f: (() -> Double)? = null): Double =
    template<Double>("fromAngle", f, this, fromAngleProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.RotateTransition.toAngle(f: (() -> Double)? = null): Double =
    template<Double>("toAngle", f, this, toAngleProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.RotateTransition.byAngle(f: (() -> Double)? = null): Double =
    template<Double>("byAngle", f, this, byAngleProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.RotateTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

// javafx.scene.control.cell.CheckBoxTreeCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.cell.CheckBoxTreeCell<T>.selectedStateCallback(f: (() -> javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.beans.value.ObservableValue<Boolean>>)? = null): javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.beans.value.ObservableValue<Boolean>> =
    template<javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.beans.value.ObservableValue<Boolean>>>("selectedStateCallback", f, this, selectedStateCallbackProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.beans.value.ObservableValue<Boolean>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.cell.CheckBoxTreeCell<T>.converter(f: (() -> javafx.util.StringConverter<javafx.scene.control.TreeItem<T>>)? = null): javafx.util.StringConverter<javafx.scene.control.TreeItem<T>> =
    template<javafx.util.StringConverter<javafx.scene.control.TreeItem<T>>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<javafx.scene.control.TreeItem<T>>>)

// javafx.scene.control.TreeTableCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TreeTableCell<S, T>.tableColumn(f: (() -> javafx.scene.control.TreeTableColumn<S, T>)? = null): javafx.scene.control.TreeTableColumn<S, T> =
    template<javafx.scene.control.TreeTableColumn<S, T>>("tableColumn", f, this, tableColumnProperty()!! as ObservableValue<javafx.scene.control.TreeTableColumn<S, T>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TreeTableCell<S, T>.treeTableView(f: (() -> javafx.scene.control.TreeTableView<S>)? = null): javafx.scene.control.TreeTableView<S> =
    template<javafx.scene.control.TreeTableView<S>>("treeTableView", f, this, treeTableViewProperty()!! as ObservableValue<javafx.scene.control.TreeTableView<S>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TreeTableCell<S, T>.tableRow(f: (() -> javafx.scene.control.TreeTableRow<S>)? = null): javafx.scene.control.TreeTableRow<S> =
    template<javafx.scene.control.TreeTableRow<S>>("tableRow", f, this, tableRowProperty()!! as ObservableValue<javafx.scene.control.TreeTableRow<S>>)

// javafx.scene.control.ChoiceBox

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ChoiceBox<T>.items(f: (() -> javafx.collections.ObservableList<T>)? = null): javafx.collections.ObservableList<T> =
    template<javafx.collections.ObservableList<T>>("items", f, this, itemsProperty()!! as ObservableValue<javafx.collections.ObservableList<T>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ChoiceBox<T>.value(f: (() -> T)? = null): T =
    template<T>("value", f, this, valueProperty()!! as ObservableValue<T>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ChoiceBox<T>.selectionModel(f: (() -> javafx.scene.control.SingleSelectionModel<T>)? = null): javafx.scene.control.SingleSelectionModel<T> =
    template<javafx.scene.control.SingleSelectionModel<T>>("selectionModel", f, this, selectionModelProperty()!! as ObservableValue<javafx.scene.control.SingleSelectionModel<T>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ChoiceBox<T>.showing(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("showing", f, this, showingProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ChoiceBox<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.layout.RowConstraints

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.RowConstraints.minHeight(f: (() -> Double)? = null): Double =
    template<Double>("minHeight", f, this, minHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.RowConstraints.prefHeight(f: (() -> Double)? = null): Double =
    template<Double>("prefHeight", f, this, prefHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.RowConstraints.maxHeight(f: (() -> Double)? = null): Double =
    template<Double>("maxHeight", f, this, maxHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.RowConstraints.percentHeight(f: (() -> Double)? = null): Double =
    template<Double>("percentHeight", f, this, percentHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.RowConstraints.vgrow(f: (() -> javafx.scene.layout.Priority)? = null): javafx.scene.layout.Priority =
    template<javafx.scene.layout.Priority>("vgrow", f, this, vgrowProperty()!! as ObservableValue<javafx.scene.layout.Priority>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.RowConstraints.valignment(f: (() -> javafx.geometry.VPos)? = null): javafx.geometry.VPos =
    template<javafx.geometry.VPos>("valignment", f, this, valignmentProperty()!! as ObservableValue<javafx.geometry.VPos>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.RowConstraints.fillHeight(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("fillHeight", f, this, fillHeightProperty()!! as ObservableValue<Boolean>)

// javafx.scene.LightBase

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.LightBase.color(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
    template<javafx.scene.paint.Color>("color", f, this, colorProperty()!! as ObservableValue<javafx.scene.paint.Color>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.LightBase.lightOn(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("lightOn", f, this, lightOnProperty()!! as ObservableValue<Boolean>)

// javafx.print.JobSettings

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.print.JobSettings.jobName(f: (() -> String)? = null): String =
    template<String>("jobName", f, this, jobNameProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.print.JobSettings.copies(f: (() -> Int)? = null): Int =
    template<Int>("copies", f, this, copiesProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.print.JobSettings.printSides(f: (() -> javafx.print.PrintSides)? = null): javafx.print.PrintSides =
    template<javafx.print.PrintSides>("printSides", f, this, printSidesProperty()!! as ObservableValue<javafx.print.PrintSides>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.print.JobSettings.collation(f: (() -> javafx.print.Collation)? = null): javafx.print.Collation =
    template<javafx.print.Collation>("collation", f, this, collationProperty()!! as ObservableValue<javafx.print.Collation>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.print.JobSettings.printColor(f: (() -> javafx.print.PrintColor)? = null): javafx.print.PrintColor =
    template<javafx.print.PrintColor>("printColor", f, this, printColorProperty()!! as ObservableValue<javafx.print.PrintColor>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.print.JobSettings.printQuality(f: (() -> javafx.print.PrintQuality)? = null): javafx.print.PrintQuality =
    template<javafx.print.PrintQuality>("printQuality", f, this, printQualityProperty()!! as ObservableValue<javafx.print.PrintQuality>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.print.JobSettings.printResolution(f: (() -> javafx.print.PrintResolution)? = null): javafx.print.PrintResolution =
    template<javafx.print.PrintResolution>("printResolution", f, this, printResolutionProperty()!! as ObservableValue<javafx.print.PrintResolution>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.print.JobSettings.paperSource(f: (() -> javafx.print.PaperSource)? = null): javafx.print.PaperSource =
    template<javafx.print.PaperSource>("paperSource", f, this, paperSourceProperty()!! as ObservableValue<javafx.print.PaperSource>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.print.JobSettings.pageLayout(f: (() -> javafx.print.PageLayout)? = null): javafx.print.PageLayout =
    template<javafx.print.PageLayout>("pageLayout", f, this, pageLayoutProperty()!! as ObservableValue<javafx.print.PageLayout>)

// javafx.scene.control.TreeView

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeView<T>.editable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeView<T>.fixedCellSize(f: (() -> Double)? = null): Double =
    template<Double>("fixedCellSize", f, this, fixedCellSizeProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeView<T>.onScrollTo(f: (() -> javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>)? = null): javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>> =
    template<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>("onScrollTo", f, this, onScrollToProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeView<T>.selectionModel(f: (() -> javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>>)? = null): javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>> =
    template<javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>>>("selectionModel", f, this, selectionModelProperty()!! as ObservableValue<javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeView<T>.focusModel(f: (() -> javafx.scene.control.FocusModel<javafx.scene.control.TreeItem<T>>)? = null): javafx.scene.control.FocusModel<javafx.scene.control.TreeItem<T>> =
    template<javafx.scene.control.FocusModel<javafx.scene.control.TreeItem<T>>>("focusModel", f, this, focusModelProperty()!! as ObservableValue<javafx.scene.control.FocusModel<javafx.scene.control.TreeItem<T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeView<T>.cellFactory(f: (() -> javafx.util.Callback<javafx.scene.control.TreeView<T>, javafx.scene.control.TreeCell<T>>)? = null): javafx.util.Callback<javafx.scene.control.TreeView<T>, javafx.scene.control.TreeCell<T>> =
    template<javafx.util.Callback<javafx.scene.control.TreeView<T>, javafx.scene.control.TreeCell<T>>>("cellFactory", f, this, cellFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TreeView<T>, javafx.scene.control.TreeCell<T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeView<T>.onEditStart(f: (() -> javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>> =
    template<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>>("onEditStart", f, this, onEditStartProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeView<T>.onEditCommit(f: (() -> javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>> =
    template<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>>("onEditCommit", f, this, onEditCommitProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeView<T>.onEditCancel(f: (() -> javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>> =
    template<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>>("onEditCancel", f, this, onEditCancelProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeView<T>.root(f: (() -> javafx.scene.control.TreeItem<T>)? = null): javafx.scene.control.TreeItem<T> =
    template<javafx.scene.control.TreeItem<T>>("root", f, this, rootProperty()!! as ObservableValue<javafx.scene.control.TreeItem<T>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeView<T>.expandedItemCount(f: (() -> Int)? = null): Int =
    template<Int>("expandedItemCount", f, this, expandedItemCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeView<T>.showRoot(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("showRoot", f, this, showRootProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeView<T>.editingItem(f: (() -> javafx.scene.control.TreeItem<T>)? = null): javafx.scene.control.TreeItem<T> =
    template<javafx.scene.control.TreeItem<T>>("editingItem", f, this, editingItemProperty()!! as ObservableValue<javafx.scene.control.TreeItem<T>>)

// javafx.scene.control.TableView.TableViewFocusModel

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView.TableViewFocusModel<S>.focusedCell(f: (() -> javafx.scene.control.TablePosition<*,*>)? = null): javafx.scene.control.TablePosition<*,*> =
    template<javafx.scene.control.TablePosition<*,*>>("focusedCell", f, this, focusedCellProperty()!! as ObservableValue<javafx.scene.control.TablePosition<*,*>>)

// javafx.scene.effect.FloatMap

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.FloatMap.width(f: (() -> Int)? = null): Int =
    template<Int>("width", f, this, widthProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.FloatMap.height(f: (() -> Int)? = null): Int =
    template<Int>("height", f, this, heightProperty()!! as ObservableValue<Int>)

// javafx.scene.control.Tooltip

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tooltip.text(f: (() -> String)? = null): String =
    template<String>("text", f, this, textProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tooltip.textAlignment(f: (() -> javafx.scene.text.TextAlignment)? = null): javafx.scene.text.TextAlignment =
    template<javafx.scene.text.TextAlignment>("textAlignment", f, this, textAlignmentProperty()!! as ObservableValue<javafx.scene.text.TextAlignment>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tooltip.textOverrun(f: (() -> javafx.scene.control.OverrunStyle)? = null): javafx.scene.control.OverrunStyle =
    template<javafx.scene.control.OverrunStyle>("textOverrun", f, this, textOverrunProperty()!! as ObservableValue<javafx.scene.control.OverrunStyle>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tooltip.wrapText(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("wrapText", f, this, wrapTextProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tooltip.font(f: (() -> javafx.scene.text.Font)? = null): javafx.scene.text.Font =
    template<javafx.scene.text.Font>("font", f, this, fontProperty()!! as ObservableValue<javafx.scene.text.Font>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tooltip.graphic(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("graphic", f, this, graphicProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tooltip.contentDisplay(f: (() -> javafx.scene.control.ContentDisplay)? = null): javafx.scene.control.ContentDisplay =
    template<javafx.scene.control.ContentDisplay>("contentDisplay", f, this, contentDisplayProperty()!! as ObservableValue<javafx.scene.control.ContentDisplay>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tooltip.graphicTextGap(f: (() -> Double)? = null): Double =
    template<Double>("graphicTextGap", f, this, graphicTextGapProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tooltip.activated(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("activated", f, this, activatedProperty()!! as ObservableValue<Boolean>)

// javafx.beans.property.MapPropertyBase

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <K, V> javafx.beans.property.MapPropertyBase<K, V>.empty(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <K, V> javafx.beans.property.MapPropertyBase<K, V>.size(f: (() -> Int)? = null): Int =
    template<Int>("size", f, this, sizeProperty()!! as ObservableValue<Int>)

// javafx.scene.shape.QuadCurveTo

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.QuadCurveTo.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.QuadCurveTo.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.QuadCurveTo.controlX(f: (() -> Double)? = null): Double =
    template<Double>("controlX", f, this, controlXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.QuadCurveTo.controlY(f: (() -> Double)? = null): Double =
    template<Double>("controlY", f, this, controlYProperty()!! as ObservableValue<Double>)

// javafx.scene.effect.Light.Spot

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Light.Spot.specularExponent(f: (() -> Double)? = null): Double =
    template<Double>("specularExponent", f, this, specularExponentProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Light.Spot.pointsAtZ(f: (() -> Double)? = null): Double =
    template<Double>("pointsAtZ", f, this, pointsAtZProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Light.Spot.pointsAtX(f: (() -> Double)? = null): Double =
    template<Double>("pointsAtX", f, this, pointsAtXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Light.Spot.pointsAtY(f: (() -> Double)? = null): Double =
    template<Double>("pointsAtY", f, this, pointsAtYProperty()!! as ObservableValue<Double>)

// javafx.scene.control.TableColumnBase

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.id(f: (() -> String)? = null): String =
    template<String>("id", f, this, idProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.style(f: (() -> String)? = null): String =
    template<String>("style", f, this, styleProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.visible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("visible", f, this, visibleProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.editable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.text(f: (() -> String)? = null): String =
    template<String>("text", f, this, textProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.graphic(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("graphic", f, this, graphicProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.contextMenu(f: (() -> javafx.scene.control.ContextMenu)? = null): javafx.scene.control.ContextMenu =
    template<javafx.scene.control.ContextMenu>("contextMenu", f, this, contextMenuProperty()!! as ObservableValue<javafx.scene.control.ContextMenu>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.width(f: (() -> Double)? = null): Double =
    template<Double>("width", f, this, widthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.minWidth(f: (() -> Double)? = null): Double =
    template<Double>("minWidth", f, this, minWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.prefWidth(f: (() -> Double)? = null): Double =
    template<Double>("prefWidth", f, this, prefWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.maxWidth(f: (() -> Double)? = null): Double =
    template<Double>("maxWidth", f, this, maxWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.parentColumn(f: (() -> javafx.scene.control.TableColumnBase<S, *>)? = null): javafx.scene.control.TableColumnBase<S, *> =
    template<javafx.scene.control.TableColumnBase<S, *>>("parentColumn", f, this, parentColumnProperty()!! as ObservableValue<javafx.scene.control.TableColumnBase<S, *>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.sortNode(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("sortNode", f, this, sortNodeProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.resizable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("resizable", f, this, resizableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.sortable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("sortable", f, this, sortableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.comparator(f: (() -> java.util.Comparator<T>)? = null): java.util.Comparator<T> =
    template<java.util.Comparator<T>>("comparator", f, this, comparatorProperty()!! as ObservableValue<java.util.Comparator<T>>)

// javafx.scene.control.ComboBox

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBox<T>.items(f: (() -> javafx.collections.ObservableList<T>)? = null): javafx.collections.ObservableList<T> =
    template<javafx.collections.ObservableList<T>>("items", f, this, itemsProperty()!! as ObservableValue<javafx.collections.ObservableList<T>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBox<T>.selectionModel(f: (() -> javafx.scene.control.SingleSelectionModel<T>)? = null): javafx.scene.control.SingleSelectionModel<T> =
    template<javafx.scene.control.SingleSelectionModel<T>>("selectionModel", f, this, selectionModelProperty()!! as ObservableValue<javafx.scene.control.SingleSelectionModel<T>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBox<T>.placeholder(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("placeholder", f, this, placeholderProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBox<T>.cellFactory(f: (() -> javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>)? = null): javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>> =
    template<javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>>("cellFactory", f, this, cellFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBox<T>.buttonCell(f: (() -> javafx.scene.control.ListCell<T>)? = null): javafx.scene.control.ListCell<T> =
    template<javafx.scene.control.ListCell<T>>("buttonCell", f, this, buttonCellProperty()!! as ObservableValue<javafx.scene.control.ListCell<T>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBox<T>.visibleRowCount(f: (() -> Int)? = null): Int =
    template<Int>("visibleRowCount", f, this, visibleRowCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBox<T>.editor(f: (() -> javafx.scene.control.TextField)? = null): javafx.scene.control.TextField =
    template<javafx.scene.control.TextField>("editor", f, this, editorProperty()!! as ObservableValue<javafx.scene.control.TextField>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBox<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.control.cell.CheckBoxTableCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.cell.CheckBoxTableCell<S, T>.selectedStateCallback(f: (() -> javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>>)? = null): javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>> =
    template<javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>>>("selectedStateCallback", f, this, selectedStateCallbackProperty()!! as ObservableValue<javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.cell.CheckBoxTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.transform.Transform

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Transform.type2D(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("type2D", f, this, type2DProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Transform.identity(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("identity", f, this, identityProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Transform.onTransformChanged(f: (() -> javafx.event.EventHandler<in javafx.scene.transform.TransformChangedEvent>)? = null): javafx.event.EventHandler<in javafx.scene.transform.TransformChangedEvent> =
    template<javafx.event.EventHandler<in javafx.scene.transform.TransformChangedEvent>>("onTransformChanged", f, this, onTransformChangedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.transform.TransformChangedEvent>>)

// javafx.scene.control.Accordion

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Accordion.expandedPane(f: (() -> javafx.scene.control.TitledPane)? = null): javafx.scene.control.TitledPane =
    template<javafx.scene.control.TitledPane>("expandedPane", f, this, expandedPaneProperty()!! as ObservableValue<javafx.scene.control.TitledPane>)

// javafx.scene.shape.Shape3D

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Shape3D.material(f: (() -> javafx.scene.paint.Material)? = null): javafx.scene.paint.Material =
    template<javafx.scene.paint.Material>("material", f, this, materialProperty()!! as ObservableValue<javafx.scene.paint.Material>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Shape3D.drawMode(f: (() -> javafx.scene.shape.DrawMode)? = null): javafx.scene.shape.DrawMode =
    template<javafx.scene.shape.DrawMode>("drawMode", f, this, drawModeProperty()!! as ObservableValue<javafx.scene.shape.DrawMode>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Shape3D.cullFace(f: (() -> javafx.scene.shape.CullFace)? = null): javafx.scene.shape.CullFace =
    template<javafx.scene.shape.CullFace>("cullFace", f, this, cullFaceProperty()!! as ObservableValue<javafx.scene.shape.CullFace>)

// javafx.scene.control.cell.TextFieldListCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.cell.TextFieldListCell<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.control.DatePicker

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.DatePicker.editor(f: (() -> javafx.scene.control.TextField)? = null): javafx.scene.control.TextField =
    template<javafx.scene.control.TextField>("editor", f, this, editorProperty()!! as ObservableValue<javafx.scene.control.TextField>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.DatePicker.dayCellFactory(f: (() -> javafx.util.Callback<javafx.scene.control.DatePicker, javafx.scene.control.DateCell>)? = null): javafx.util.Callback<javafx.scene.control.DatePicker, javafx.scene.control.DateCell> =
    template<javafx.util.Callback<javafx.scene.control.DatePicker, javafx.scene.control.DateCell>>("dayCellFactory", f, this, dayCellFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.DatePicker, javafx.scene.control.DateCell>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.DatePicker.chronology(f: (() -> java.time.chrono.Chronology)? = null): java.time.chrono.Chronology =
    template<java.time.chrono.Chronology>("chronology", f, this, chronologyProperty()!! as ObservableValue<java.time.chrono.Chronology>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.DatePicker.showWeekNumbers(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("showWeekNumbers", f, this, showWeekNumbersProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.DatePicker.converter(f: (() -> javafx.util.StringConverter<java.time.LocalDate>)? = null): javafx.util.StringConverter<java.time.LocalDate> =
    template<javafx.util.StringConverter<java.time.LocalDate>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<java.time.LocalDate>>)

// javafx.scene.effect.Reflection

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Reflection.topOffset(f: (() -> Double)? = null): Double =
    template<Double>("topOffset", f, this, topOffsetProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Reflection.topOpacity(f: (() -> Double)? = null): Double =
    template<Double>("topOpacity", f, this, topOpacityProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Reflection.bottomOpacity(f: (() -> Double)? = null): Double =
    template<Double>("bottomOpacity", f, this, bottomOpacityProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Reflection.fraction(f: (() -> Double)? = null): Double =
    template<Double>("fraction", f, this, fractionProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Reflection.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

// javafx.scene.effect.Light

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Light.color(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
    template<javafx.scene.paint.Color>("color", f, this, colorProperty()!! as ObservableValue<javafx.scene.paint.Color>)

// javafx.animation.TranslateTransition

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.TranslateTransition.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.TranslateTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.TranslateTransition.fromX(f: (() -> Double)? = null): Double =
    template<Double>("fromX", f, this, fromXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.TranslateTransition.fromY(f: (() -> Double)? = null): Double =
    template<Double>("fromY", f, this, fromYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.TranslateTransition.fromZ(f: (() -> Double)? = null): Double =
    template<Double>("fromZ", f, this, fromZProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.TranslateTransition.toX(f: (() -> Double)? = null): Double =
    template<Double>("toX", f, this, toXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.TranslateTransition.toY(f: (() -> Double)? = null): Double =
    template<Double>("toY", f, this, toYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.TranslateTransition.toZ(f: (() -> Double)? = null): Double =
    template<Double>("toZ", f, this, toZProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.TranslateTransition.byX(f: (() -> Double)? = null): Double =
    template<Double>("byX", f, this, byXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.TranslateTransition.byY(f: (() -> Double)? = null): Double =
    template<Double>("byY", f, this, byYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.TranslateTransition.byZ(f: (() -> Double)? = null): Double =
    template<Double>("byZ", f, this, byZProperty()!! as ObservableValue<Double>)

// javafx.scene.control.MenuItem

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.MenuItem.id(f: (() -> String)? = null): String =
    template<String>("id", f, this, idProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.MenuItem.style(f: (() -> String)? = null): String =
    template<String>("style", f, this, styleProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.MenuItem.visible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("visible", f, this, visibleProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.MenuItem.disable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("disable", f, this, disableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.MenuItem.text(f: (() -> String)? = null): String =
    template<String>("text", f, this, textProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.MenuItem.graphic(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("graphic", f, this, graphicProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.MenuItem.mnemonicParsing(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("mnemonicParsing", f, this, mnemonicParsingProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.MenuItem.onAction(f: (() -> javafx.event.EventHandler<javafx.event.ActionEvent>)? = null): javafx.event.EventHandler<javafx.event.ActionEvent> =
    template<javafx.event.EventHandler<javafx.event.ActionEvent>>("onAction", f, this, onActionProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.ActionEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.MenuItem.parentMenu(f: (() -> javafx.scene.control.Menu)? = null): javafx.scene.control.Menu =
    template<javafx.scene.control.Menu>("parentMenu", f, this, parentMenuProperty()!! as ObservableValue<javafx.scene.control.Menu>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.MenuItem.parentPopup(f: (() -> javafx.scene.control.ContextMenu)? = null): javafx.scene.control.ContextMenu =
    template<javafx.scene.control.ContextMenu>("parentPopup", f, this, parentPopupProperty()!! as ObservableValue<javafx.scene.control.ContextMenu>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.MenuItem.onMenuValidation(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
    template<javafx.event.EventHandler<javafx.event.Event>>("onMenuValidation", f, this, onMenuValidationProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.MenuItem.accelerator(f: (() -> javafx.scene.input.KeyCombination)? = null): javafx.scene.input.KeyCombination =
    template<javafx.scene.input.KeyCombination>("accelerator", f, this, acceleratorProperty()!! as ObservableValue<javafx.scene.input.KeyCombination>)

// javafx.scene.control.MenuBar

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.MenuBar.useSystemMenuBar(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("useSystemMenuBar", f, this, useSystemMenuBarProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.ListCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ListCell<T>.listView(f: (() -> javafx.scene.control.ListView<T>)? = null): javafx.scene.control.ListView<T> =
    template<javafx.scene.control.ListView<T>>("listView", f, this, listViewProperty()!! as ObservableValue<javafx.scene.control.ListView<T>>)

// javafx.scene.effect.BoxBlur

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.BoxBlur.width(f: (() -> Double)? = null): Double =
    template<Double>("width", f, this, widthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.BoxBlur.height(f: (() -> Double)? = null): Double =
    template<Double>("height", f, this, heightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.BoxBlur.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.BoxBlur.iterations(f: (() -> Int)? = null): Int =
    template<Int>("iterations", f, this, iterationsProperty()!! as ObservableValue<Int>)

// javafx.beans.property.ReadOnlyListWrapper

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.beans.property.ReadOnlyListWrapper<E>.getReadOnly(f: (() -> E)? = null): E =
    template<E>("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<E>)

// javafx.beans.property.ReadOnlyBooleanWrapper

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.beans.property.ReadOnlyBooleanWrapper.getReadOnly(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<Boolean>)

// javafx.concurrent.Service

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.value(f: (() -> V)? = null): V =
    template<V>("value", f, this, valueProperty()!! as ObservableValue<V>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.onScheduled(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
    template<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>("onScheduled", f, this, onScheduledProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.onRunning(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
    template<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>("onRunning", f, this, onRunningProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.onSucceeded(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
    template<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>("onSucceeded", f, this, onSucceededProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.onCancelled(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
    template<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>("onCancelled", f, this, onCancelledProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.onFailed(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
    template<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>("onFailed", f, this, onFailedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.state(f: (() -> javafx.concurrent.Worker.State)? = null): javafx.concurrent.Worker.State =
    template<javafx.concurrent.Worker.State>("state", f, this, stateProperty()!! as ObservableValue<javafx.concurrent.Worker.State>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.exception(f: (() -> Throwable)? = null): Throwable =
    template<Throwable>("exception", f, this, exceptionProperty()!! as ObservableValue<Throwable>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.workDone(f: (() -> Double)? = null): Double =
    template<Double>("workDone", f, this, workDoneProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.totalWork(f: (() -> Double)? = null): Double =
    template<Double>("totalWork", f, this, totalWorkProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.progress(f: (() -> Double)? = null): Double =
    template<Double>("progress", f, this, progressProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.running(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("running", f, this, runningProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.message(f: (() -> String)? = null): String =
    template<String>("message", f, this, messageProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.title(f: (() -> String)? = null): String =
    template<String>("title", f, this, titleProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.onReady(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
    template<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>("onReady", f, this, onReadyProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Service<V>.executor(f: (() -> java.util.concurrent.Executor)? = null): java.util.concurrent.Executor =
    template<java.util.concurrent.Executor>("executor", f, this, executorProperty()!! as ObservableValue<java.util.concurrent.Executor>)

// javafx.scene.effect.DisplacementMap

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DisplacementMap.scaleX(f: (() -> Double)? = null): Double =
    template<Double>("scaleX", f, this, scaleXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DisplacementMap.scaleY(f: (() -> Double)? = null): Double =
    template<Double>("scaleY", f, this, scaleYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DisplacementMap.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DisplacementMap.offsetX(f: (() -> Double)? = null): Double =
    template<Double>("offsetX", f, this, offsetXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DisplacementMap.offsetY(f: (() -> Double)? = null): Double =
    template<Double>("offsetY", f, this, offsetYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DisplacementMap.wrap(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("wrap", f, this, wrapProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DisplacementMap.mapData(f: (() -> javafx.scene.effect.FloatMap)? = null): javafx.scene.effect.FloatMap =
    template<javafx.scene.effect.FloatMap>("mapData", f, this, mapDataProperty()!! as ObservableValue<javafx.scene.effect.FloatMap>)

// javafx.scene.control.TreeTableRow

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeTableRow<T>.treeItem(f: (() -> javafx.scene.control.TreeItem<T>)? = null): javafx.scene.control.TreeItem<T> =
    template<javafx.scene.control.TreeItem<T>>("treeItem", f, this, treeItemProperty()!! as ObservableValue<javafx.scene.control.TreeItem<T>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeTableRow<T>.disclosureNode(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("disclosureNode", f, this, disclosureNodeProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeTableRow<T>.treeTableView(f: (() -> javafx.scene.control.TreeTableView<T>)? = null): javafx.scene.control.TreeTableView<T> =
    template<javafx.scene.control.TreeTableView<T>>("treeTableView", f, this, treeTableViewProperty()!! as ObservableValue<javafx.scene.control.TreeTableView<T>>)

// javafx.print.PageRange

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.print.PageRange.startPage(f: (() -> Int)? = null): Int =
    template<Int>("startPage", f, this, startPageProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.print.PageRange.endPage(f: (() -> Int)? = null): Int =
    template<Int>("endPage", f, this, endPageProperty()!! as ObservableValue<Int>)

// javafx.scene.web.WebEngine

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebEngine.onError(f: (() -> javafx.event.EventHandler<javafx.scene.web.WebErrorEvent>)? = null): javafx.event.EventHandler<javafx.scene.web.WebErrorEvent> =
    template<javafx.event.EventHandler<javafx.scene.web.WebErrorEvent>>("onError", f, this, onErrorProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.web.WebErrorEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebEngine.title(f: (() -> String)? = null): String =
    template<String>("title", f, this, titleProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebEngine.userStyleSheetLocation(f: (() -> String)? = null): String =
    template<String>("userStyleSheetLocation", f, this, userStyleSheetLocationProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebEngine.javaScriptEnabled(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("javaScriptEnabled", f, this, javaScriptEnabledProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebEngine.document(f: (() -> org.w3c.dom.Document)? = null): org.w3c.dom.Document =
    template<org.w3c.dom.Document>("document", f, this, documentProperty()!! as ObservableValue<org.w3c.dom.Document>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebEngine.location(f: (() -> String)? = null): String =
    template<String>("location", f, this, locationProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebEngine.userDataDirectory(f: (() -> java.io.File)? = null): java.io.File =
    template<java.io.File>("userDataDirectory", f, this, userDataDirectoryProperty()!! as ObservableValue<java.io.File>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebEngine.onAlert(f: (() -> javafx.event.EventHandler<javafx.scene.web.WebEvent<String>>)? = null): javafx.event.EventHandler<javafx.scene.web.WebEvent<String>> =
    template<javafx.event.EventHandler<javafx.scene.web.WebEvent<String>>>("onAlert", f, this, onAlertProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.web.WebEvent<String>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebEngine.onStatusChanged(f: (() -> javafx.event.EventHandler<javafx.scene.web.WebEvent<String>>)? = null): javafx.event.EventHandler<javafx.scene.web.WebEvent<String>> =
    template<javafx.event.EventHandler<javafx.scene.web.WebEvent<String>>>("onStatusChanged", f, this, onStatusChangedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.web.WebEvent<String>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebEngine.onResized(f: (() -> javafx.event.EventHandler<javafx.scene.web.WebEvent<javafx.geometry.Rectangle2D>>)? = null): javafx.event.EventHandler<javafx.scene.web.WebEvent<javafx.geometry.Rectangle2D>> =
    template<javafx.event.EventHandler<javafx.scene.web.WebEvent<javafx.geometry.Rectangle2D>>>("onResized", f, this, onResizedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.web.WebEvent<javafx.geometry.Rectangle2D>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebEngine.onVisibilityChanged(f: (() -> javafx.event.EventHandler<javafx.scene.web.WebEvent<Boolean>>)? = null): javafx.event.EventHandler<javafx.scene.web.WebEvent<Boolean>> =
    template<javafx.event.EventHandler<javafx.scene.web.WebEvent<Boolean>>>("onVisibilityChanged", f, this, onVisibilityChangedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.web.WebEvent<Boolean>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebEngine.createPopupHandler(f: (() -> javafx.util.Callback<javafx.scene.web.PopupFeatures, javafx.scene.web.WebEngine>)? = null): javafx.util.Callback<javafx.scene.web.PopupFeatures, javafx.scene.web.WebEngine> =
    template<javafx.util.Callback<javafx.scene.web.PopupFeatures, javafx.scene.web.WebEngine>>("createPopupHandler", f, this, createPopupHandlerProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.web.PopupFeatures, javafx.scene.web.WebEngine>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebEngine.confirmHandler(f: (() -> javafx.util.Callback<String, Boolean>)? = null): javafx.util.Callback<String, Boolean> =
    template<javafx.util.Callback<String, Boolean>>("confirmHandler", f, this, confirmHandlerProperty()!! as ObservableValue<javafx.util.Callback<String, Boolean>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebEngine.promptHandler(f: (() -> javafx.util.Callback<javafx.scene.web.PromptData, String>)? = null): javafx.util.Callback<javafx.scene.web.PromptData, String> =
    template<javafx.util.Callback<javafx.scene.web.PromptData, String>>("promptHandler", f, this, promptHandlerProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.web.PromptData, String>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebEngine.userAgent(f: (() -> String)? = null): String =
    template<String>("userAgent", f, this, userAgentProperty()!! as ObservableValue<String>)

// javafx.scene.control.cell.ChoiceBoxTreeCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.cell.ChoiceBoxTreeCell<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.animation.StrokeTransition

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.StrokeTransition.shape(f: (() -> javafx.scene.shape.Shape)? = null): javafx.scene.shape.Shape =
    template<javafx.scene.shape.Shape>("shape", f, this, shapeProperty()!! as ObservableValue<javafx.scene.shape.Shape>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.StrokeTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.StrokeTransition.fromValue(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
    template<javafx.scene.paint.Color>("fromValue", f, this, fromValueProperty()!! as ObservableValue<javafx.scene.paint.Color>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.StrokeTransition.toValue(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
    template<javafx.scene.paint.Color>("toValue", f, this, toValueProperty()!! as ObservableValue<javafx.scene.paint.Color>)

// javafx.stage.FileChooser

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.FileChooser.title(f: (() -> String)? = null): String =
    template<String>("title", f, this, titleProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.FileChooser.initialDirectory(f: (() -> java.io.File)? = null): java.io.File =
    template<java.io.File>("initialDirectory", f, this, initialDirectoryProperty()!! as ObservableValue<java.io.File>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.FileChooser.initialFileName(f: (() -> String)? = null): String =
    template<String>("initialFileName", f, this, initialFileNameProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.FileChooser.selectedExtensionFilter(f: (() -> javafx.stage.FileChooser.ExtensionFilter)? = null): javafx.stage.FileChooser.ExtensionFilter =
    template<javafx.stage.FileChooser.ExtensionFilter>("selectedExtensionFilter", f, this, selectedExtensionFilterProperty()!! as ObservableValue<javafx.stage.FileChooser.ExtensionFilter>)

// javafx.animation.PauseTransition

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.PauseTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

// javafx.scene.effect.GaussianBlur

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.GaussianBlur.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.GaussianBlur.radius(f: (() -> Double)? = null): Double =
    template<Double>("radius", f, this, radiusProperty()!! as ObservableValue<Double>)

// javafx.scene.control.ScrollPane

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollPane.fitToHeight(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("fitToHeight", f, this, fitToHeightProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollPane.pannable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("pannable", f, this, pannableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollPane.fitToWidth(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("fitToWidth", f, this, fitToWidthProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollPane.vbarPolicy(f: (() -> javafx.scene.control.ScrollPane.ScrollBarPolicy)? = null): javafx.scene.control.ScrollPane.ScrollBarPolicy =
    template<javafx.scene.control.ScrollPane.ScrollBarPolicy>("vbarPolicy", f, this, vbarPolicyProperty()!! as ObservableValue<javafx.scene.control.ScrollPane.ScrollBarPolicy>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollPane.hbarPolicy(f: (() -> javafx.scene.control.ScrollPane.ScrollBarPolicy)? = null): javafx.scene.control.ScrollPane.ScrollBarPolicy =
    template<javafx.scene.control.ScrollPane.ScrollBarPolicy>("hbarPolicy", f, this, hbarPolicyProperty()!! as ObservableValue<javafx.scene.control.ScrollPane.ScrollBarPolicy>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollPane.hvalue(f: (() -> Double)? = null): Double =
    template<Double>("hvalue", f, this, hvalueProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollPane.vvalue(f: (() -> Double)? = null): Double =
    template<Double>("vvalue", f, this, vvalueProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollPane.hmin(f: (() -> Double)? = null): Double =
    template<Double>("hmin", f, this, hminProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollPane.vmin(f: (() -> Double)? = null): Double =
    template<Double>("vmin", f, this, vminProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollPane.hmax(f: (() -> Double)? = null): Double =
    template<Double>("hmax", f, this, hmaxProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollPane.vmax(f: (() -> Double)? = null): Double =
    template<Double>("vmax", f, this, vmaxProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollPane.prefViewportWidth(f: (() -> Double)? = null): Double =
    template<Double>("prefViewportWidth", f, this, prefViewportWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollPane.prefViewportHeight(f: (() -> Double)? = null): Double =
    template<Double>("prefViewportHeight", f, this, prefViewportHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollPane.viewportBounds(f: (() -> javafx.geometry.Bounds)? = null): javafx.geometry.Bounds =
    template<javafx.geometry.Bounds>("viewportBounds", f, this, viewportBoundsProperty()!! as ObservableValue<javafx.geometry.Bounds>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollPane.content(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("content", f, this, contentProperty()!! as ObservableValue<javafx.scene.Node>)

// javafx.scene.PerspectiveCamera

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.PerspectiveCamera.fieldOfView(f: (() -> Double)? = null): Double =
    template<Double>("fieldOfView", f, this, fieldOfViewProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.PerspectiveCamera.verticalFieldOfView(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("verticalFieldOfView", f, this, verticalFieldOfViewProperty()!! as ObservableValue<Boolean>)

// javafx.animation.SequentialTransition

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.SequentialTransition.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

// javafx.scene.control.TreeTableView

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.editable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.fixedCellSize(f: (() -> Double)? = null): Double =
    template<Double>("fixedCellSize", f, this, fixedCellSizeProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.onScrollToColumn(f: (() -> javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TreeTableColumn<S, *>>>)? = null): javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TreeTableColumn<S, *>>> =
    template<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TreeTableColumn<S, *>>>>("onScrollToColumn", f, this, onScrollToColumnProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TreeTableColumn<S, *>>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.onScrollTo(f: (() -> javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>)? = null): javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>> =
    template<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>("onScrollTo", f, this, onScrollToProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.selectionModel(f: (() -> javafx.scene.control.TreeTableView.TreeTableViewSelectionModel<S>)? = null): javafx.scene.control.TreeTableView.TreeTableViewSelectionModel<S> =
    template<javafx.scene.control.TreeTableView.TreeTableViewSelectionModel<S>>("selectionModel", f, this, selectionModelProperty()!! as ObservableValue<javafx.scene.control.TreeTableView.TreeTableViewSelectionModel<S>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.sortPolicy(f: (() -> javafx.util.Callback<javafx.scene.control.TreeTableView<S>, Boolean>)? = null): javafx.util.Callback<javafx.scene.control.TreeTableView<S>, Boolean> =
    template<javafx.util.Callback<javafx.scene.control.TreeTableView<S>, Boolean>>("sortPolicy", f, this, sortPolicyProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TreeTableView<S>, Boolean>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.columnResizePolicy(f: (() -> javafx.util.Callback<javafx.scene.control.TreeTableView.ResizeFeatures<S>, Boolean>)? = null): javafx.util.Callback<javafx.scene.control.TreeTableView.ResizeFeatures<S>, Boolean> =
    template<javafx.util.Callback<javafx.scene.control.TreeTableView.ResizeFeatures<S>, Boolean>>("columnResizePolicy", f, this, columnResizePolicyProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TreeTableView.ResizeFeatures<S>, Boolean>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.onSort(f: (() -> javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TreeTableView<S>>>)? = null): javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TreeTableView<S>>> =
    template<javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TreeTableView<S>>>>("onSort", f, this, onSortProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TreeTableView<S>>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.placeholder(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("placeholder", f, this, placeholderProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.focusModel(f: (() -> javafx.scene.control.TreeTableView.TreeTableViewFocusModel<S>)? = null): javafx.scene.control.TreeTableView.TreeTableViewFocusModel<S> =
    template<javafx.scene.control.TreeTableView.TreeTableViewFocusModel<S>>("focusModel", f, this, focusModelProperty()!! as ObservableValue<javafx.scene.control.TreeTableView.TreeTableViewFocusModel<S>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.comparator(f: (() -> java.util.Comparator<javafx.scene.control.TreeItem<S>>)? = null): java.util.Comparator<javafx.scene.control.TreeItem<S>> =
    template<java.util.Comparator<javafx.scene.control.TreeItem<S>>>("comparator", f, this, comparatorProperty()!! as ObservableValue<java.util.Comparator<javafx.scene.control.TreeItem<S>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.root(f: (() -> javafx.scene.control.TreeItem<S>)? = null): javafx.scene.control.TreeItem<S> =
    template<javafx.scene.control.TreeItem<S>>("root", f, this, rootProperty()!! as ObservableValue<javafx.scene.control.TreeItem<S>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.treeColumn(f: (() -> javafx.scene.control.TreeTableColumn<S, *>)? = null): javafx.scene.control.TreeTableColumn<S, *> =
    template<javafx.scene.control.TreeTableColumn<S, *>>("treeColumn", f, this, treeColumnProperty()!! as ObservableValue<javafx.scene.control.TreeTableColumn<S, *>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.expandedItemCount(f: (() -> Int)? = null): Int =
    template<Int>("expandedItemCount", f, this, expandedItemCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.editingCell(f: (() -> javafx.scene.control.TreeTablePosition<S, *>)? = null): javafx.scene.control.TreeTablePosition<S, *> =
    template<javafx.scene.control.TreeTablePosition<S, *>>("editingCell", f, this, editingCellProperty()!! as ObservableValue<javafx.scene.control.TreeTablePosition<S, *>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.tableMenuButtonVisible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("tableMenuButtonVisible", f, this, tableMenuButtonVisibleProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.rowFactory(f: (() -> javafx.util.Callback<javafx.scene.control.TreeTableView<S>, javafx.scene.control.TreeTableRow<S>>)? = null): javafx.util.Callback<javafx.scene.control.TreeTableView<S>, javafx.scene.control.TreeTableRow<S>> =
    template<javafx.util.Callback<javafx.scene.control.TreeTableView<S>, javafx.scene.control.TreeTableRow<S>>>("rowFactory", f, this, rowFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TreeTableView<S>, javafx.scene.control.TreeTableRow<S>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.sortMode(f: (() -> javafx.scene.control.TreeSortMode)? = null): javafx.scene.control.TreeSortMode =
    template<javafx.scene.control.TreeSortMode>("sortMode", f, this, sortModeProperty()!! as ObservableValue<javafx.scene.control.TreeSortMode>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView<S>.showRoot(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("showRoot", f, this, showRootProperty()!! as ObservableValue<Boolean>)

// javafx.beans.binding.ListBinding

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.beans.binding.ListBinding<E>.empty(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.beans.binding.ListBinding<E>.size(f: (() -> Int)? = null): Int =
    template<Int>("size", f, this, sizeProperty()!! as ObservableValue<Int>)

// javafx.scene.control.TableView

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView<S>.items(f: (() -> javafx.collections.ObservableList<S>)? = null): javafx.collections.ObservableList<S> =
    template<javafx.collections.ObservableList<S>>("items", f, this, itemsProperty()!! as ObservableValue<javafx.collections.ObservableList<S>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView<S>.editable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView<S>.fixedCellSize(f: (() -> Double)? = null): Double =
    template<Double>("fixedCellSize", f, this, fixedCellSizeProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView<S>.onScrollToColumn(f: (() -> javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TableColumn<S, *>>>)? = null): javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TableColumn<S, *>>> =
    template<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TableColumn<S, *>>>>("onScrollToColumn", f, this, onScrollToColumnProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TableColumn<S, *>>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView<S>.onScrollTo(f: (() -> javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>)? = null): javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>> =
    template<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>("onScrollTo", f, this, onScrollToProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView<S>.selectionModel(f: (() -> javafx.scene.control.TableView.TableViewSelectionModel<S>)? = null): javafx.scene.control.TableView.TableViewSelectionModel<S> =
    template<javafx.scene.control.TableView.TableViewSelectionModel<S>>("selectionModel", f, this, selectionModelProperty()!! as ObservableValue<javafx.scene.control.TableView.TableViewSelectionModel<S>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView<S>.sortPolicy(f: (() -> javafx.util.Callback<javafx.scene.control.TableView<S>, Boolean>)? = null): javafx.util.Callback<javafx.scene.control.TableView<S>, Boolean> =
    template<javafx.util.Callback<javafx.scene.control.TableView<S>, Boolean>>("sortPolicy", f, this, sortPolicyProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TableView<S>, Boolean>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView<S>.columnResizePolicy(f: (() -> javafx.util.Callback<javafx.scene.control.TableView.ResizeFeatures<S>, Boolean>)? = null): javafx.util.Callback<javafx.scene.control.TableView.ResizeFeatures<S>, Boolean> =
    template<javafx.util.Callback<javafx.scene.control.TableView.ResizeFeatures<S>, Boolean>>("columnResizePolicy", f, this, columnResizePolicyProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TableView.ResizeFeatures<S>, Boolean>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView<S>.onSort(f: (() -> javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TableView<S>>>)? = null): javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TableView<S>>> =
    template<javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TableView<S>>>>("onSort", f, this, onSortProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TableView<S>>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView<S>.placeholder(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("placeholder", f, this, placeholderProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView<S>.focusModel(f: (() -> javafx.scene.control.TableView.TableViewFocusModel<S>)? = null): javafx.scene.control.TableView.TableViewFocusModel<S> =
    template<javafx.scene.control.TableView.TableViewFocusModel<S>>("focusModel", f, this, focusModelProperty()!! as ObservableValue<javafx.scene.control.TableView.TableViewFocusModel<S>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView<S>.comparator(f: (() -> java.util.Comparator<S>)? = null): java.util.Comparator<S> =
    template<java.util.Comparator<S>>("comparator", f, this, comparatorProperty()!! as ObservableValue<java.util.Comparator<S>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView<S>.editingCell(f: (() -> javafx.scene.control.TablePosition<S, *>)? = null): javafx.scene.control.TablePosition<S, *> =
    template<javafx.scene.control.TablePosition<S, *>>("editingCell", f, this, editingCellProperty()!! as ObservableValue<javafx.scene.control.TablePosition<S, *>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView<S>.tableMenuButtonVisible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("tableMenuButtonVisible", f, this, tableMenuButtonVisibleProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TableView<S>.rowFactory(f: (() -> javafx.util.Callback<javafx.scene.control.TableView<S>, javafx.scene.control.TableRow<S>>)? = null): javafx.util.Callback<javafx.scene.control.TableView<S>, javafx.scene.control.TableRow<S>> =
    template<javafx.util.Callback<javafx.scene.control.TableView<S>, javafx.scene.control.TableRow<S>>>("rowFactory", f, this, rowFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TableView<S>, javafx.scene.control.TableRow<S>>>)

// javafx.scene.shape.Shape

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Shape.strokeType(f: (() -> javafx.scene.shape.StrokeType)? = null): javafx.scene.shape.StrokeType =
    template<javafx.scene.shape.StrokeType>("strokeType", f, this, strokeTypeProperty()!! as ObservableValue<javafx.scene.shape.StrokeType>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Shape.strokeWidth(f: (() -> Double)? = null): Double =
    template<Double>("strokeWidth", f, this, strokeWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Shape.strokeLineJoin(f: (() -> javafx.scene.shape.StrokeLineJoin)? = null): javafx.scene.shape.StrokeLineJoin =
    template<javafx.scene.shape.StrokeLineJoin>("strokeLineJoin", f, this, strokeLineJoinProperty()!! as ObservableValue<javafx.scene.shape.StrokeLineJoin>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Shape.strokeLineCap(f: (() -> javafx.scene.shape.StrokeLineCap)? = null): javafx.scene.shape.StrokeLineCap =
    template<javafx.scene.shape.StrokeLineCap>("strokeLineCap", f, this, strokeLineCapProperty()!! as ObservableValue<javafx.scene.shape.StrokeLineCap>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Shape.strokeMiterLimit(f: (() -> Double)? = null): Double =
    template<Double>("strokeMiterLimit", f, this, strokeMiterLimitProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Shape.strokeDashOffset(f: (() -> Double)? = null): Double =
    template<Double>("strokeDashOffset", f, this, strokeDashOffsetProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Shape.smooth(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("smooth", f, this, smoothProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Shape.fill(f: (() -> javafx.scene.paint.Paint)? = null): javafx.scene.paint.Paint =
    template<javafx.scene.paint.Paint>("fill", f, this, fillProperty()!! as ObservableValue<javafx.scene.paint.Paint>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Shape.stroke(f: (() -> javafx.scene.paint.Paint)? = null): javafx.scene.paint.Paint =
    template<javafx.scene.paint.Paint>("stroke", f, this, strokeProperty()!! as ObservableValue<javafx.scene.paint.Paint>)

// javafx.scene.Parent

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Parent.needsLayout(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("needsLayout", f, this, needsLayoutProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.ToggleButton

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ToggleButton.selected(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ToggleButton.toggleGroup(f: (() -> javafx.scene.control.ToggleGroup)? = null): javafx.scene.control.ToggleGroup =
    template<javafx.scene.control.ToggleGroup>("toggleGroup", f, this, toggleGroupProperty()!! as ObservableValue<javafx.scene.control.ToggleGroup>)

// javafx.scene.control.Label

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Label.labelFor(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("labelFor", f, this, labelForProperty()!! as ObservableValue<javafx.scene.Node>)

// javafx.scene.transform.Rotate

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Rotate.angle(f: (() -> Double)? = null): Double =
    template<Double>("angle", f, this, angleProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Rotate.pivotX(f: (() -> Double)? = null): Double =
    template<Double>("pivotX", f, this, pivotXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Rotate.pivotY(f: (() -> Double)? = null): Double =
    template<Double>("pivotY", f, this, pivotYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Rotate.pivotZ(f: (() -> Double)? = null): Double =
    template<Double>("pivotZ", f, this, pivotZProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Rotate.axis(f: (() -> javafx.geometry.Point3D)? = null): javafx.geometry.Point3D =
    template<javafx.geometry.Point3D>("axis", f, this, axisProperty()!! as ObservableValue<javafx.geometry.Point3D>)

// javafx.scene.effect.DropShadow

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DropShadow.width(f: (() -> Double)? = null): Double =
    template<Double>("width", f, this, widthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DropShadow.height(f: (() -> Double)? = null): Double =
    template<Double>("height", f, this, heightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DropShadow.color(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
    template<javafx.scene.paint.Color>("color", f, this, colorProperty()!! as ObservableValue<javafx.scene.paint.Color>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DropShadow.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DropShadow.radius(f: (() -> Double)? = null): Double =
    template<Double>("radius", f, this, radiusProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DropShadow.blurType(f: (() -> javafx.scene.effect.BlurType)? = null): javafx.scene.effect.BlurType =
    template<javafx.scene.effect.BlurType>("blurType", f, this, blurTypeProperty()!! as ObservableValue<javafx.scene.effect.BlurType>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DropShadow.spread(f: (() -> Double)? = null): Double =
    template<Double>("spread", f, this, spreadProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DropShadow.offsetX(f: (() -> Double)? = null): Double =
    template<Double>("offsetX", f, this, offsetXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.DropShadow.offsetY(f: (() -> Double)? = null): Double =
    template<Double>("offsetY", f, this, offsetYProperty()!! as ObservableValue<Double>)

// javafx.animation.FadeTransition

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.FadeTransition.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.FadeTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.FadeTransition.fromValue(f: (() -> Double)? = null): Double =
    template<Double>("fromValue", f, this, fromValueProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.FadeTransition.toValue(f: (() -> Double)? = null): Double =
    template<Double>("toValue", f, this, toValueProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.FadeTransition.byValue(f: (() -> Double)? = null): Double =
    template<Double>("byValue", f, this, byValueProperty()!! as ObservableValue<Double>)

// javafx.scene.shape.Rectangle

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Rectangle.width(f: (() -> Double)? = null): Double =
    template<Double>("width", f, this, widthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Rectangle.height(f: (() -> Double)? = null): Double =
    template<Double>("height", f, this, heightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Rectangle.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Rectangle.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Rectangle.arcWidth(f: (() -> Double)? = null): Double =
    template<Double>("arcWidth", f, this, arcWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Rectangle.arcHeight(f: (() -> Double)? = null): Double =
    template<Double>("arcHeight", f, this, arcHeightProperty()!! as ObservableValue<Double>)

// javafx.concurrent.Worker

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Worker<V>.value(f: (() -> V)? = null): V =
    template<V>("value", f, this, valueProperty()!! as ObservableValue<V>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Worker<V>.state(f: (() -> javafx.concurrent.Worker.State)? = null): javafx.concurrent.Worker.State =
    template<javafx.concurrent.Worker.State>("state", f, this, stateProperty()!! as ObservableValue<javafx.concurrent.Worker.State>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Worker<V>.exception(f: (() -> Throwable)? = null): Throwable =
    template<Throwable>("exception", f, this, exceptionProperty()!! as ObservableValue<Throwable>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Worker<V>.workDone(f: (() -> Double)? = null): Double =
    template<Double>("workDone", f, this, workDoneProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Worker<V>.totalWork(f: (() -> Double)? = null): Double =
    template<Double>("totalWork", f, this, totalWorkProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Worker<V>.progress(f: (() -> Double)? = null): Double =
    template<Double>("progress", f, this, progressProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Worker<V>.running(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("running", f, this, runningProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Worker<V>.message(f: (() -> String)? = null): String =
    template<String>("message", f, this, messageProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Worker<V>.title(f: (() -> String)? = null): String =
    template<String>("title", f, this, titleProperty()!! as ObservableValue<String>)

// javafx.animation.Animation

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.Animation.rate(f: (() -> Double)? = null): Double =
    template<Double>("rate", f, this, rateProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.Animation.currentRate(f: (() -> Double)? = null): Double =
    template<Double>("currentRate", f, this, currentRateProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.Animation.cycleDuration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("cycleDuration", f, this, cycleDurationProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.Animation.totalDuration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("totalDuration", f, this, totalDurationProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.Animation.currentTime(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("currentTime", f, this, currentTimeProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.Animation.delay(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("delay", f, this, delayProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.Animation.cycleCount(f: (() -> Int)? = null): Int =
    template<Int>("cycleCount", f, this, cycleCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.Animation.autoReverse(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("autoReverse", f, this, autoReverseProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.Animation.status(f: (() -> javafx.animation.Animation.Status)? = null): javafx.animation.Animation.Status =
    template<javafx.animation.Animation.Status>("status", f, this, statusProperty()!! as ObservableValue<javafx.animation.Animation.Status>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.Animation.onFinished(f: (() -> javafx.event.EventHandler<javafx.event.ActionEvent>)? = null): javafx.event.EventHandler<javafx.event.ActionEvent> =
    template<javafx.event.EventHandler<javafx.event.ActionEvent>>("onFinished", f, this, onFinishedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.ActionEvent>>)

// javafx.scene.effect.ColorInput

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.ColorInput.width(f: (() -> Double)? = null): Double =
    template<Double>("width", f, this, widthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.ColorInput.height(f: (() -> Double)? = null): Double =
    template<Double>("height", f, this, heightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.ColorInput.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.ColorInput.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.ColorInput.paint(f: (() -> javafx.scene.paint.Paint)? = null): javafx.scene.paint.Paint =
    template<javafx.scene.paint.Paint>("paint", f, this, paintProperty()!! as ObservableValue<javafx.scene.paint.Paint>)

// javafx.concurrent.ScheduledService

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.ScheduledService<V>.delay(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("delay", f, this, delayProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.ScheduledService<V>.period(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("period", f, this, periodProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.ScheduledService<V>.backoffStrategy(f: (() -> javafx.util.Callback<javafx.concurrent.ScheduledService<*>, javafx.util.Duration>)? = null): javafx.util.Callback<javafx.concurrent.ScheduledService<*>, javafx.util.Duration> =
    template<javafx.util.Callback<javafx.concurrent.ScheduledService<*>, javafx.util.Duration>>("backoffStrategy", f, this, backoffStrategyProperty()!! as ObservableValue<javafx.util.Callback<javafx.concurrent.ScheduledService<*>, javafx.util.Duration>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.ScheduledService<V>.restartOnFailure(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("restartOnFailure", f, this, restartOnFailureProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.ScheduledService<V>.maximumFailureCount(f: (() -> Int)? = null): Int =
    template<Int>("maximumFailureCount", f, this, maximumFailureCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.ScheduledService<V>.currentFailureCount(f: (() -> Int)? = null): Int =
    template<Int>("currentFailureCount", f, this, currentFailureCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.ScheduledService<V>.cumulativePeriod(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("cumulativePeriod", f, this, cumulativePeriodProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.ScheduledService<V>.maximumCumulativePeriod(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("maximumCumulativePeriod", f, this, maximumCumulativePeriodProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.ScheduledService<V>.lastValue(f: (() -> V)? = null): V =
    template<V>("lastValue", f, this, lastValueProperty()!! as ObservableValue<V>)

// javafx.scene.control.cell.ComboBoxTreeCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.cell.ComboBoxTreeCell<T>.comboBoxEditable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("comboBoxEditable", f, this, comboBoxEditableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.cell.ComboBoxTreeCell<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.transform.Affine

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Affine.mzz(f: (() -> Double)? = null): Double =
    template<Double>("mzz", f, this, mzzProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Affine.tz(f: (() -> Double)? = null): Double =
    template<Double>("tz", f, this, tzProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Affine.mxx(f: (() -> Double)? = null): Double =
    template<Double>("mxx", f, this, mxxProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Affine.mxy(f: (() -> Double)? = null): Double =
    template<Double>("mxy", f, this, mxyProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Affine.tx(f: (() -> Double)? = null): Double =
    template<Double>("tx", f, this, txProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Affine.mxz(f: (() -> Double)? = null): Double =
    template<Double>("mxz", f, this, mxzProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Affine.myx(f: (() -> Double)? = null): Double =
    template<Double>("myx", f, this, myxProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Affine.myy(f: (() -> Double)? = null): Double =
    template<Double>("myy", f, this, myyProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Affine.ty(f: (() -> Double)? = null): Double =
    template<Double>("ty", f, this, tyProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Affine.myz(f: (() -> Double)? = null): Double =
    template<Double>("myz", f, this, myzProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Affine.mzx(f: (() -> Double)? = null): Double =
    template<Double>("mzx", f, this, mzxProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Affine.mzy(f: (() -> Double)? = null): Double =
    template<Double>("mzy", f, this, mzyProperty()!! as ObservableValue<Double>)

// javafx.scene.shape.Cylinder

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Cylinder.height(f: (() -> Double)? = null): Double =
    template<Double>("height", f, this, heightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Cylinder.radius(f: (() -> Double)? = null): Double =
    template<Double>("radius", f, this, radiusProperty()!! as ObservableValue<Double>)

// javafx.scene.shape.LineTo

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.LineTo.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.LineTo.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

// javafx.scene.effect.Light.Distant

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Light.Distant.azimuth(f: (() -> Double)? = null): Double =
    template<Double>("azimuth", f, this, azimuthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Light.Distant.elevation(f: (() -> Double)? = null): Double =
    template<Double>("elevation", f, this, elevationProperty()!! as ObservableValue<Double>)

// javafx.scene.control.cell.ComboBoxListCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.cell.ComboBoxListCell<T>.comboBoxEditable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("comboBoxEditable", f, this, comboBoxEditableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.cell.ComboBoxListCell<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.transform.Translate

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Translate.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Translate.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Translate.z(f: (() -> Double)? = null): Double =
    template<Double>("z", f, this, zProperty()!! as ObservableValue<Double>)

// javafx.beans.binding.MapExpression

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <K, V> javafx.beans.binding.MapExpression<K, V>.empty(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <K, V> javafx.beans.binding.MapExpression<K, V>.size(f: (() -> Int)? = null): Int =
    template<Int>("size", f, this, sizeProperty()!! as ObservableValue<Int>)

// javafx.scene.image.Image

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.image.Image.width(f: (() -> Double)? = null): Double =
    template<Double>("width", f, this, widthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.image.Image.height(f: (() -> Double)? = null): Double =
    template<Double>("height", f, this, heightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.image.Image.exception(f: (() -> Exception)? = null): Exception =
    template<Exception>("exception", f, this, exceptionProperty()!! as ObservableValue<Exception>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.image.Image.progress(f: (() -> Double)? = null): Double =
    template<Double>("progress", f, this, progressProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.image.Image.error(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("error", f, this, errorProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.ContextMenu

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ContextMenu.onAction(f: (() -> javafx.event.EventHandler<javafx.event.ActionEvent>)? = null): javafx.event.EventHandler<javafx.event.ActionEvent> =
    template<javafx.event.EventHandler<javafx.event.ActionEvent>>("onAction", f, this, onActionProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.ActionEvent>>)

// javafx.scene.ImageCursor

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.ImageCursor.image(f: (() -> javafx.scene.image.Image)? = null): javafx.scene.image.Image =
    template<javafx.scene.image.Image>("image", f, this, imageProperty()!! as ObservableValue<javafx.scene.image.Image>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.ImageCursor.hotspotX(f: (() -> Double)? = null): Double =
    template<Double>("hotspotX", f, this, hotspotXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.ImageCursor.hotspotY(f: (() -> Double)? = null): Double =
    template<Double>("hotspotY", f, this, hotspotYProperty()!! as ObservableValue<Double>)

// javafx.beans.binding.MapBinding

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <K, V> javafx.beans.binding.MapBinding<K, V>.empty(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <K, V> javafx.beans.binding.MapBinding<K, V>.size(f: (() -> Int)? = null): Int =
    template<Int>("size", f, this, sizeProperty()!! as ObservableValue<Int>)

// javafx.scene.web.WebHistory.Entry

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebHistory.Entry.title(f: (() -> String)? = null): String =
    template<String>("title", f, this, titleProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebHistory.Entry.lastVisitedDate(f: (() -> java.util.Date)? = null): java.util.Date =
    template<java.util.Date>("lastVisitedDate", f, this, lastVisitedDateProperty()!! as ObservableValue<java.util.Date>)

// javafx.scene.control.Menu

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Menu.showing(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("showing", f, this, showingProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Menu.onShowing(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
    template<javafx.event.EventHandler<javafx.event.Event>>("onShowing", f, this, onShowingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Menu.onShown(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
    template<javafx.event.EventHandler<javafx.event.Event>>("onShown", f, this, onShownProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Menu.onHiding(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
    template<javafx.event.EventHandler<javafx.event.Event>>("onHiding", f, this, onHidingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Menu.onHidden(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
    template<javafx.event.EventHandler<javafx.event.Event>>("onHidden", f, this, onHiddenProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

// javafx.scene.control.TabPane

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TabPane.tabMinHeight(f: (() -> Double)? = null): Double =
    template<Double>("tabMinHeight", f, this, tabMinHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TabPane.tabMinWidth(f: (() -> Double)? = null): Double =
    template<Double>("tabMinWidth", f, this, tabMinWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TabPane.tabMaxWidth(f: (() -> Double)? = null): Double =
    template<Double>("tabMaxWidth", f, this, tabMaxWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TabPane.tabMaxHeight(f: (() -> Double)? = null): Double =
    template<Double>("tabMaxHeight", f, this, tabMaxHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TabPane.selectionModel(f: (() -> javafx.scene.control.SingleSelectionModel<javafx.scene.control.Tab>)? = null): javafx.scene.control.SingleSelectionModel<javafx.scene.control.Tab> =
    template<javafx.scene.control.SingleSelectionModel<javafx.scene.control.Tab>>("selectionModel", f, this, selectionModelProperty()!! as ObservableValue<javafx.scene.control.SingleSelectionModel<javafx.scene.control.Tab>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TabPane.side(f: (() -> javafx.geometry.Side)? = null): javafx.geometry.Side =
    template<javafx.geometry.Side>("side", f, this, sideProperty()!! as ObservableValue<javafx.geometry.Side>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TabPane.tabClosingPolicy(f: (() -> javafx.scene.control.TabPane.TabClosingPolicy)? = null): javafx.scene.control.TabPane.TabClosingPolicy =
    template<javafx.scene.control.TabPane.TabClosingPolicy>("tabClosingPolicy", f, this, tabClosingPolicyProperty()!! as ObservableValue<javafx.scene.control.TabPane.TabClosingPolicy>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TabPane.rotateGraphic(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("rotateGraphic", f, this, rotateGraphicProperty()!! as ObservableValue<Boolean>)

// javafx.scene.Camera

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Camera.nearClip(f: (() -> Double)? = null): Double =
    template<Double>("nearClip", f, this, nearClipProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Camera.farClip(f: (() -> Double)? = null): Double =
    template<Double>("farClip", f, this, farClipProperty()!! as ObservableValue<Double>)

// javafx.scene.chart.BarChart

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.BarChart<X, Y>.categoryGap(f: (() -> Double)? = null): Double =
    template<Double>("categoryGap", f, this, categoryGapProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.BarChart<X, Y>.barGap(f: (() -> Double)? = null): Double =
    template<Double>("barGap", f, this, barGapProperty()!! as ObservableValue<Double>)

// javafx.scene.chart.Axis

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.chart.Axis<T>.tickLength(f: (() -> Double)? = null): Double =
    template<Double>("tickLength", f, this, tickLengthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.chart.Axis<T>.tickLabelFont(f: (() -> javafx.scene.text.Font)? = null): javafx.scene.text.Font =
    template<javafx.scene.text.Font>("tickLabelFont", f, this, tickLabelFontProperty()!! as ObservableValue<javafx.scene.text.Font>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.chart.Axis<T>.tickLabelFill(f: (() -> javafx.scene.paint.Paint)? = null): javafx.scene.paint.Paint =
    template<javafx.scene.paint.Paint>("tickLabelFill", f, this, tickLabelFillProperty()!! as ObservableValue<javafx.scene.paint.Paint>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.chart.Axis<T>.tickLabelGap(f: (() -> Double)? = null): Double =
    template<Double>("tickLabelGap", f, this, tickLabelGapProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.chart.Axis<T>.tickMarkVisible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("tickMarkVisible", f, this, tickMarkVisibleProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.chart.Axis<T>.tickLabelsVisible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("tickLabelsVisible", f, this, tickLabelsVisibleProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.chart.Axis<T>.side(f: (() -> javafx.geometry.Side)? = null): javafx.geometry.Side =
    template<javafx.geometry.Side>("side", f, this, sideProperty()!! as ObservableValue<javafx.geometry.Side>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.chart.Axis<T>.animated(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("animated", f, this, animatedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.chart.Axis<T>.autoRanging(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("autoRanging", f, this, autoRangingProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.chart.Axis<T>.label(f: (() -> String)? = null): String =
    template<String>("label", f, this, labelProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.chart.Axis<T>.tickLabelRotation(f: (() -> Double)? = null): Double =
    template<Double>("tickLabelRotation", f, this, tickLabelRotationProperty()!! as ObservableValue<Double>)

// javafx.scene.text.TextFlow

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.text.TextFlow.textAlignment(f: (() -> javafx.scene.text.TextAlignment)? = null): javafx.scene.text.TextAlignment =
    template<javafx.scene.text.TextAlignment>("textAlignment", f, this, textAlignmentProperty()!! as ObservableValue<javafx.scene.text.TextAlignment>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.text.TextFlow.lineSpacing(f: (() -> Double)? = null): Double =
    template<Double>("lineSpacing", f, this, lineSpacingProperty()!! as ObservableValue<Double>)

// javafx.beans.property.ReadOnlySetWrapper

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.beans.property.ReadOnlySetWrapper<E>.getReadOnly(f: (() -> E)? = null): E =
    template<E>("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<E>)

// javafx.scene.control.ListView

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ListView<T>.items(f: (() -> javafx.collections.ObservableList<T>)? = null): javafx.collections.ObservableList<T> =
    template<javafx.collections.ObservableList<T>>("items", f, this, itemsProperty()!! as ObservableValue<javafx.collections.ObservableList<T>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ListView<T>.editable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ListView<T>.fixedCellSize(f: (() -> Double)? = null): Double =
    template<Double>("fixedCellSize", f, this, fixedCellSizeProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ListView<T>.onScrollTo(f: (() -> javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>)? = null): javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>> =
    template<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>("onScrollTo", f, this, onScrollToProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ListView<T>.selectionModel(f: (() -> javafx.scene.control.MultipleSelectionModel<T>)? = null): javafx.scene.control.MultipleSelectionModel<T> =
    template<javafx.scene.control.MultipleSelectionModel<T>>("selectionModel", f, this, selectionModelProperty()!! as ObservableValue<javafx.scene.control.MultipleSelectionModel<T>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ListView<T>.placeholder(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("placeholder", f, this, placeholderProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ListView<T>.focusModel(f: (() -> javafx.scene.control.FocusModel<T>)? = null): javafx.scene.control.FocusModel<T> =
    template<javafx.scene.control.FocusModel<T>>("focusModel", f, this, focusModelProperty()!! as ObservableValue<javafx.scene.control.FocusModel<T>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ListView<T>.cellFactory(f: (() -> javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>)? = null): javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>> =
    template<javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>>("cellFactory", f, this, cellFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ListView<T>.editingIndex(f: (() -> Int)? = null): Int =
    template<Int>("editingIndex", f, this, editingIndexProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ListView<T>.onEditStart(f: (() -> javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>)? = null): javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> =
    template<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>>("onEditStart", f, this, onEditStartProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ListView<T>.onEditCommit(f: (() -> javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>)? = null): javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> =
    template<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>>("onEditCommit", f, this, onEditCommitProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ListView<T>.onEditCancel(f: (() -> javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>)? = null): javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> =
    template<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>>("onEditCancel", f, this, onEditCancelProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ListView<T>.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
    template<javafx.geometry.Orientation>("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

// javafx.scene.media.Media

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.Media.onError(f: (() -> Runnable)? = null): Runnable =
    template<Runnable>("onError", f, this, onErrorProperty()!! as ObservableValue<Runnable>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.Media.width(f: (() -> Int)? = null): Int =
    template<Int>("width", f, this, widthProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.Media.height(f: (() -> Int)? = null): Int =
    template<Int>("height", f, this, heightProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.Media.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.Media.error(f: (() -> javafx.scene.media.MediaException)? = null): javafx.scene.media.MediaException =
    template<javafx.scene.media.MediaException>("error", f, this, errorProperty()!! as ObservableValue<javafx.scene.media.MediaException>)

// javafx.animation.ParallelTransition

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.ParallelTransition.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

// javafx.scene.effect.Bloom

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Bloom.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Bloom.threshold(f: (() -> Double)? = null): Double =
    template<Double>("threshold", f, this, thresholdProperty()!! as ObservableValue<Double>)

// javafx.scene.effect.Shadow

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Shadow.width(f: (() -> Double)? = null): Double =
    template<Double>("width", f, this, widthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Shadow.height(f: (() -> Double)? = null): Double =
    template<Double>("height", f, this, heightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Shadow.color(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
    template<javafx.scene.paint.Color>("color", f, this, colorProperty()!! as ObservableValue<javafx.scene.paint.Color>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Shadow.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Shadow.radius(f: (() -> Double)? = null): Double =
    template<Double>("radius", f, this, radiusProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Shadow.blurType(f: (() -> javafx.scene.effect.BlurType)? = null): javafx.scene.effect.BlurType =
    template<javafx.scene.effect.BlurType>("blurType", f, this, blurTypeProperty()!! as ObservableValue<javafx.scene.effect.BlurType>)

// javafx.scene.shape.MeshView

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.MeshView.mesh(f: (() -> javafx.scene.shape.Mesh)? = null): javafx.scene.shape.Mesh =
    template<javafx.scene.shape.Mesh>("mesh", f, this, meshProperty()!! as ObservableValue<javafx.scene.shape.Mesh>)

// javafx.scene.shape.Line

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Line.startY(f: (() -> Double)? = null): Double =
    template<Double>("startY", f, this, startYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Line.startX(f: (() -> Double)? = null): Double =
    template<Double>("startX", f, this, startXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Line.endY(f: (() -> Double)? = null): Double =
    template<Double>("endY", f, this, endYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Line.endX(f: (() -> Double)? = null): Double =
    template<Double>("endX", f, this, endXProperty()!! as ObservableValue<Double>)

// javafx.animation.Transition

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.Transition.interpolator(f: (() -> javafx.animation.Interpolator)? = null): javafx.animation.Interpolator =
    template<javafx.animation.Interpolator>("interpolator", f, this, interpolatorProperty()!! as ObservableValue<javafx.animation.Interpolator>)

// javafx.collections.transformation.FilteredList

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.collections.transformation.FilteredList<E>.predicate(f: (() -> java.util.function.Predicate<in E>)? = null): java.util.function.Predicate<in E> =
    template<java.util.function.Predicate<in E>>("predicate", f, this, predicateProperty()!! as ObservableValue<java.util.function.Predicate<in E>>)

// javafx.scene.Node

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.localToSceneTransform(f: (() -> javafx.scene.transform.Transform)? = null): javafx.scene.transform.Transform =
    template<javafx.scene.transform.Transform>("localToSceneTransform", f, this, localToSceneTransformProperty()!! as ObservableValue<javafx.scene.transform.Transform>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.scene(f: (() -> javafx.scene.Scene)? = null): javafx.scene.Scene =
    template<javafx.scene.Scene>("scene", f, this, sceneProperty()!! as ObservableValue<javafx.scene.Scene>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.effectiveNodeOrientation(f: (() -> javafx.geometry.NodeOrientation)? = null): javafx.geometry.NodeOrientation =
    template<javafx.geometry.NodeOrientation>("effectiveNodeOrientation", f, this, effectiveNodeOrientationProperty()!! as ObservableValue<javafx.geometry.NodeOrientation>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.parent(f: (() -> javafx.scene.Parent)? = null): javafx.scene.Parent =
    template<javafx.scene.Parent>("parent", f, this, parentProperty()!! as ObservableValue<javafx.scene.Parent>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.id(f: (() -> String)? = null): String =
    template<String>("id", f, this, idProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.style(f: (() -> String)? = null): String =
    template<String>("style", f, this, styleProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.visible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("visible", f, this, visibleProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.cursor(f: (() -> javafx.scene.Cursor)? = null): javafx.scene.Cursor =
    template<javafx.scene.Cursor>("cursor", f, this, cursorProperty()!! as ObservableValue<javafx.scene.Cursor>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.opacity(f: (() -> Double)? = null): Double =
    template<Double>("opacity", f, this, opacityProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.blendMode(f: (() -> javafx.scene.effect.BlendMode)? = null): javafx.scene.effect.BlendMode =
    template<javafx.scene.effect.BlendMode>("blendMode", f, this, blendModeProperty()!! as ObservableValue<javafx.scene.effect.BlendMode>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.clip(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("clip", f, this, clipProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.cache(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("cache", f, this, cacheProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.cacheHint(f: (() -> javafx.scene.CacheHint)? = null): javafx.scene.CacheHint =
    template<javafx.scene.CacheHint>("cacheHint", f, this, cacheHintProperty()!! as ObservableValue<javafx.scene.CacheHint>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.effect(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("effect", f, this, effectProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.depthTest(f: (() -> javafx.scene.DepthTest)? = null): javafx.scene.DepthTest =
    template<javafx.scene.DepthTest>("depthTest", f, this, depthTestProperty()!! as ObservableValue<javafx.scene.DepthTest>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.disable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("disable", f, this, disableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.pickOnBounds(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("pickOnBounds", f, this, pickOnBoundsProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.disabled(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("disabled", f, this, disabledProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onDragEntered(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>("onDragEntered", f, this, onDragEnteredProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onDragExited(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>("onDragExited", f, this, onDragExitedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onDragOver(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>("onDragOver", f, this, onDragOverProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onDragDropped(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>("onDragDropped", f, this, onDragDroppedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onDragDone(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>("onDragDone", f, this, onDragDoneProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.managed(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("managed", f, this, managedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.layoutX(f: (() -> Double)? = null): Double =
    template<Double>("layoutX", f, this, layoutXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.layoutY(f: (() -> Double)? = null): Double =
    template<Double>("layoutY", f, this, layoutYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.boundsInParent(f: (() -> javafx.geometry.Bounds)? = null): javafx.geometry.Bounds =
    template<javafx.geometry.Bounds>("boundsInParent", f, this, boundsInParentProperty()!! as ObservableValue<javafx.geometry.Bounds>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.boundsInLocal(f: (() -> javafx.geometry.Bounds)? = null): javafx.geometry.Bounds =
    template<javafx.geometry.Bounds>("boundsInLocal", f, this, boundsInLocalProperty()!! as ObservableValue<javafx.geometry.Bounds>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.layoutBounds(f: (() -> javafx.geometry.Bounds)? = null): javafx.geometry.Bounds =
    template<javafx.geometry.Bounds>("layoutBounds", f, this, layoutBoundsProperty()!! as ObservableValue<javafx.geometry.Bounds>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.translateX(f: (() -> Double)? = null): Double =
    template<Double>("translateX", f, this, translateXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.translateY(f: (() -> Double)? = null): Double =
    template<Double>("translateY", f, this, translateYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.translateZ(f: (() -> Double)? = null): Double =
    template<Double>("translateZ", f, this, translateZProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.scaleX(f: (() -> Double)? = null): Double =
    template<Double>("scaleX", f, this, scaleXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.scaleY(f: (() -> Double)? = null): Double =
    template<Double>("scaleY", f, this, scaleYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.scaleZ(f: (() -> Double)? = null): Double =
    template<Double>("scaleZ", f, this, scaleZProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.rotate(f: (() -> Double)? = null): Double =
    template<Double>("rotate", f, this, rotateProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.rotationAxis(f: (() -> javafx.geometry.Point3D)? = null): javafx.geometry.Point3D =
    template<javafx.geometry.Point3D>("rotationAxis", f, this, rotationAxisProperty()!! as ObservableValue<javafx.geometry.Point3D>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.localToParentTransform(f: (() -> javafx.scene.transform.Transform)? = null): javafx.scene.transform.Transform =
    template<javafx.scene.transform.Transform>("localToParentTransform", f, this, localToParentTransformProperty()!! as ObservableValue<javafx.scene.transform.Transform>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.nodeOrientation(f: (() -> javafx.geometry.NodeOrientation)? = null): javafx.geometry.NodeOrientation =
    template<javafx.geometry.NodeOrientation>("nodeOrientation", f, this, nodeOrientationProperty()!! as ObservableValue<javafx.geometry.NodeOrientation>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.mouseTransparent(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("mouseTransparent", f, this, mouseTransparentProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.hover(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("hover", f, this, hoverProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.pressed(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("pressed", f, this, pressedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onContextMenuRequested(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent>>("onContextMenuRequested", f, this, onContextMenuRequestedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onMouseClicked(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onMouseClicked", f, this, onMouseClickedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onMouseDragged(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onMouseDragged", f, this, onMouseDraggedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onMouseEntered(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onMouseEntered", f, this, onMouseEnteredProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onMouseExited(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onMouseExited", f, this, onMouseExitedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onMouseMoved(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onMouseMoved", f, this, onMouseMovedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onMousePressed(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onMousePressed", f, this, onMousePressedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onMouseReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onMouseReleased", f, this, onMouseReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onDragDetected(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onDragDetected", f, this, onDragDetectedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onMouseDragOver(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>("onMouseDragOver", f, this, onMouseDragOverProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onMouseDragReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>("onMouseDragReleased", f, this, onMouseDragReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onMouseDragEntered(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>("onMouseDragEntered", f, this, onMouseDragEnteredProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onMouseDragExited(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>("onMouseDragExited", f, this, onMouseDragExitedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onScrollStarted(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ScrollEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>("onScrollStarted", f, this, onScrollStartedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onScroll(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ScrollEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>("onScroll", f, this, onScrollProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onScrollFinished(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ScrollEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>("onScrollFinished", f, this, onScrollFinishedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onRotationStarted(f: (() -> javafx.event.EventHandler<in javafx.scene.input.RotateEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.RotateEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>("onRotationStarted", f, this, onRotationStartedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onRotate(f: (() -> javafx.event.EventHandler<in javafx.scene.input.RotateEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.RotateEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>("onRotate", f, this, onRotateProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onRotationFinished(f: (() -> javafx.event.EventHandler<in javafx.scene.input.RotateEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.RotateEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>("onRotationFinished", f, this, onRotationFinishedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onZoomStarted(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ZoomEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>("onZoomStarted", f, this, onZoomStartedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onZoom(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ZoomEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>("onZoom", f, this, onZoomProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onZoomFinished(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ZoomEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>("onZoomFinished", f, this, onZoomFinishedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onSwipeUp(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>("onSwipeUp", f, this, onSwipeUpProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onSwipeDown(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>("onSwipeDown", f, this, onSwipeDownProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onSwipeLeft(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>("onSwipeLeft", f, this, onSwipeLeftProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onSwipeRight(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>("onSwipeRight", f, this, onSwipeRightProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onTouchPressed(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>("onTouchPressed", f, this, onTouchPressedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onTouchMoved(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>("onTouchMoved", f, this, onTouchMovedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onTouchReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>("onTouchReleased", f, this, onTouchReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onTouchStationary(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>("onTouchStationary", f, this, onTouchStationaryProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onKeyPressed(f: (() -> javafx.event.EventHandler<in javafx.scene.input.KeyEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.KeyEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>("onKeyPressed", f, this, onKeyPressedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onKeyReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.KeyEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.KeyEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>("onKeyReleased", f, this, onKeyReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onKeyTyped(f: (() -> javafx.event.EventHandler<in javafx.scene.input.KeyEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.KeyEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>("onKeyTyped", f, this, onKeyTypedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.onInputMethodTextChanged(f: (() -> javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent>>("onInputMethodTextChanged", f, this, onInputMethodTextChangedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.inputMethodRequests(f: (() -> javafx.scene.input.InputMethodRequests)? = null): javafx.scene.input.InputMethodRequests =
    template<javafx.scene.input.InputMethodRequests>("inputMethodRequests", f, this, inputMethodRequestsProperty()!! as ObservableValue<javafx.scene.input.InputMethodRequests>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.focused(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("focused", f, this, focusedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.focusTraversable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("focusTraversable", f, this, focusTraversableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Node.eventDispatcher(f: (() -> javafx.event.EventDispatcher)? = null): javafx.event.EventDispatcher =
    template<javafx.event.EventDispatcher>("eventDispatcher", f, this, eventDispatcherProperty()!! as ObservableValue<javafx.event.EventDispatcher>)

// javafx.scene.media.AudioEqualizer

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.AudioEqualizer.enabled(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("enabled", f, this, enabledProperty()!! as ObservableValue<Boolean>)

// javafx.stage.Window

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Window.scene(f: (() -> javafx.scene.Scene)? = null): javafx.scene.Scene =
    template<javafx.scene.Scene>("scene", f, this, sceneProperty()!! as ObservableValue<javafx.scene.Scene>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Window.opacity(f: (() -> Double)? = null): Double =
    template<Double>("opacity", f, this, opacityProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Window.focused(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("focused", f, this, focusedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Window.eventDispatcher(f: (() -> javafx.event.EventDispatcher)? = null): javafx.event.EventDispatcher =
    template<javafx.event.EventDispatcher>("eventDispatcher", f, this, eventDispatcherProperty()!! as ObservableValue<javafx.event.EventDispatcher>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Window.width(f: (() -> Double)? = null): Double =
    template<Double>("width", f, this, widthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Window.height(f: (() -> Double)? = null): Double =
    template<Double>("height", f, this, heightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Window.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Window.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Window.showing(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("showing", f, this, showingProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Window.onCloseRequest(f: (() -> javafx.event.EventHandler<javafx.stage.WindowEvent>)? = null): javafx.event.EventHandler<javafx.stage.WindowEvent> =
    template<javafx.event.EventHandler<javafx.stage.WindowEvent>>("onCloseRequest", f, this, onCloseRequestProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.stage.WindowEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Window.onShowing(f: (() -> javafx.event.EventHandler<javafx.stage.WindowEvent>)? = null): javafx.event.EventHandler<javafx.stage.WindowEvent> =
    template<javafx.event.EventHandler<javafx.stage.WindowEvent>>("onShowing", f, this, onShowingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.stage.WindowEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Window.onShown(f: (() -> javafx.event.EventHandler<javafx.stage.WindowEvent>)? = null): javafx.event.EventHandler<javafx.stage.WindowEvent> =
    template<javafx.event.EventHandler<javafx.stage.WindowEvent>>("onShown", f, this, onShownProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.stage.WindowEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Window.onHiding(f: (() -> javafx.event.EventHandler<javafx.stage.WindowEvent>)? = null): javafx.event.EventHandler<javafx.stage.WindowEvent> =
    template<javafx.event.EventHandler<javafx.stage.WindowEvent>>("onHiding", f, this, onHidingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.stage.WindowEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Window.onHidden(f: (() -> javafx.event.EventHandler<javafx.stage.WindowEvent>)? = null): javafx.event.EventHandler<javafx.stage.WindowEvent> =
    template<javafx.event.EventHandler<javafx.stage.WindowEvent>>("onHidden", f, this, onHiddenProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.stage.WindowEvent>>)

// javafx.scene.control.IndexedCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.IndexedCell<T>.index(f: (() -> Int)? = null): Int =
    template<Int>("index", f, this, indexProperty()!! as ObservableValue<Int>)

// javafx.animation.PathTransition

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.PathTransition.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.PathTransition.orientation(f: (() -> javafx.animation.PathTransition.OrientationType)? = null): javafx.animation.PathTransition.OrientationType =
    template<javafx.animation.PathTransition.OrientationType>("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.animation.PathTransition.OrientationType>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.PathTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.PathTransition.path(f: (() -> javafx.scene.shape.Shape)? = null): javafx.scene.shape.Shape =
    template<javafx.scene.shape.Shape>("path", f, this, pathProperty()!! as ObservableValue<javafx.scene.shape.Shape>)

// javafx.scene.canvas.Canvas

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.canvas.Canvas.width(f: (() -> Double)? = null): Double =
    template<Double>("width", f, this, widthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.canvas.Canvas.height(f: (() -> Double)? = null): Double =
    template<Double>("height", f, this, heightProperty()!! as ObservableValue<Double>)

// javafx.scene.Scene

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.effectiveNodeOrientation(f: (() -> javafx.geometry.NodeOrientation)? = null): javafx.geometry.NodeOrientation =
    template<javafx.geometry.NodeOrientation>("effectiveNodeOrientation", f, this, effectiveNodeOrientationProperty()!! as ObservableValue<javafx.geometry.NodeOrientation>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.cursor(f: (() -> javafx.scene.Cursor)? = null): javafx.scene.Cursor =
    template<javafx.scene.Cursor>("cursor", f, this, cursorProperty()!! as ObservableValue<javafx.scene.Cursor>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onDragEntered(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>("onDragEntered", f, this, onDragEnteredProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onDragExited(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>("onDragExited", f, this, onDragExitedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onDragOver(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>("onDragOver", f, this, onDragOverProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onDragDropped(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>("onDragDropped", f, this, onDragDroppedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onDragDone(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>("onDragDone", f, this, onDragDoneProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.nodeOrientation(f: (() -> javafx.geometry.NodeOrientation)? = null): javafx.geometry.NodeOrientation =
    template<javafx.geometry.NodeOrientation>("nodeOrientation", f, this, nodeOrientationProperty()!! as ObservableValue<javafx.geometry.NodeOrientation>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onContextMenuRequested(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent>>("onContextMenuRequested", f, this, onContextMenuRequestedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onMouseClicked(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onMouseClicked", f, this, onMouseClickedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onMouseDragged(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onMouseDragged", f, this, onMouseDraggedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onMouseEntered(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onMouseEntered", f, this, onMouseEnteredProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onMouseExited(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onMouseExited", f, this, onMouseExitedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onMouseMoved(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onMouseMoved", f, this, onMouseMovedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onMousePressed(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onMousePressed", f, this, onMousePressedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onMouseReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onMouseReleased", f, this, onMouseReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onDragDetected(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>("onDragDetected", f, this, onDragDetectedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onMouseDragOver(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>("onMouseDragOver", f, this, onMouseDragOverProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onMouseDragReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>("onMouseDragReleased", f, this, onMouseDragReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onMouseDragEntered(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>("onMouseDragEntered", f, this, onMouseDragEnteredProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onMouseDragExited(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>("onMouseDragExited", f, this, onMouseDragExitedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onScrollStarted(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ScrollEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>("onScrollStarted", f, this, onScrollStartedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onScroll(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ScrollEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>("onScroll", f, this, onScrollProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onScrollFinished(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ScrollEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>("onScrollFinished", f, this, onScrollFinishedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onRotationStarted(f: (() -> javafx.event.EventHandler<in javafx.scene.input.RotateEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.RotateEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>("onRotationStarted", f, this, onRotationStartedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onRotate(f: (() -> javafx.event.EventHandler<in javafx.scene.input.RotateEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.RotateEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>("onRotate", f, this, onRotateProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onRotationFinished(f: (() -> javafx.event.EventHandler<in javafx.scene.input.RotateEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.RotateEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>("onRotationFinished", f, this, onRotationFinishedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onZoomStarted(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ZoomEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>("onZoomStarted", f, this, onZoomStartedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onZoom(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ZoomEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>("onZoom", f, this, onZoomProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onZoomFinished(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ZoomEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>("onZoomFinished", f, this, onZoomFinishedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onSwipeUp(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>("onSwipeUp", f, this, onSwipeUpProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onSwipeDown(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>("onSwipeDown", f, this, onSwipeDownProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onSwipeLeft(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>("onSwipeLeft", f, this, onSwipeLeftProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onSwipeRight(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>("onSwipeRight", f, this, onSwipeRightProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onTouchPressed(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>("onTouchPressed", f, this, onTouchPressedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onTouchMoved(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>("onTouchMoved", f, this, onTouchMovedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onTouchReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>("onTouchReleased", f, this, onTouchReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onTouchStationary(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>("onTouchStationary", f, this, onTouchStationaryProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onKeyPressed(f: (() -> javafx.event.EventHandler<in javafx.scene.input.KeyEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.KeyEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>("onKeyPressed", f, this, onKeyPressedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onKeyReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.KeyEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.KeyEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>("onKeyReleased", f, this, onKeyReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onKeyTyped(f: (() -> javafx.event.EventHandler<in javafx.scene.input.KeyEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.KeyEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>("onKeyTyped", f, this, onKeyTypedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.onInputMethodTextChanged(f: (() -> javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent> =
    template<javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent>>("onInputMethodTextChanged", f, this, onInputMethodTextChangedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.eventDispatcher(f: (() -> javafx.event.EventDispatcher)? = null): javafx.event.EventDispatcher =
    template<javafx.event.EventDispatcher>("eventDispatcher", f, this, eventDispatcherProperty()!! as ObservableValue<javafx.event.EventDispatcher>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.width(f: (() -> Double)? = null): Double =
    template<Double>("width", f, this, widthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.height(f: (() -> Double)? = null): Double =
    template<Double>("height", f, this, heightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.fill(f: (() -> javafx.scene.paint.Paint)? = null): javafx.scene.paint.Paint =
    template<javafx.scene.paint.Paint>("fill", f, this, fillProperty()!! as ObservableValue<javafx.scene.paint.Paint>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.root(f: (() -> javafx.scene.Parent)? = null): javafx.scene.Parent =
    template<javafx.scene.Parent>("root", f, this, rootProperty()!! as ObservableValue<javafx.scene.Parent>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.camera(f: (() -> javafx.scene.Camera)? = null): javafx.scene.Camera =
    template<javafx.scene.Camera>("camera", f, this, cameraProperty()!! as ObservableValue<javafx.scene.Camera>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.window(f: (() -> javafx.stage.Window)? = null): javafx.stage.Window =
    template<javafx.stage.Window>("window", f, this, windowProperty()!! as ObservableValue<javafx.stage.Window>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Scene.focusOwner(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("focusOwner", f, this, focusOwnerProperty()!! as ObservableValue<javafx.scene.Node>)

// javafx.scene.Group

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.Group.autoSizeChildren(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("autoSizeChildren", f, this, autoSizeChildrenProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.MultipleSelectionModel

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.MultipleSelectionModel<T>.selectionMode(f: (() -> javafx.scene.control.SelectionMode)? = null): javafx.scene.control.SelectionMode =
    template<javafx.scene.control.SelectionMode>("selectionMode", f, this, selectionModeProperty()!! as ObservableValue<javafx.scene.control.SelectionMode>)

// javafx.scene.shape.Path

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Path.fillRule(f: (() -> javafx.scene.shape.FillRule)? = null): javafx.scene.shape.FillRule =
    template<javafx.scene.shape.FillRule>("fillRule", f, this, fillRuleProperty()!! as ObservableValue<javafx.scene.shape.FillRule>)

// javafx.scene.web.WebView

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebView.width(f: (() -> Double)? = null): Double =
    template<Double>("width", f, this, widthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebView.height(f: (() -> Double)? = null): Double =
    template<Double>("height", f, this, heightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebView.minWidth(f: (() -> Double)? = null): Double =
    template<Double>("minWidth", f, this, minWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebView.minHeight(f: (() -> Double)? = null): Double =
    template<Double>("minHeight", f, this, minHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebView.prefWidth(f: (() -> Double)? = null): Double =
    template<Double>("prefWidth", f, this, prefWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebView.prefHeight(f: (() -> Double)? = null): Double =
    template<Double>("prefHeight", f, this, prefHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebView.maxWidth(f: (() -> Double)? = null): Double =
    template<Double>("maxWidth", f, this, maxWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebView.maxHeight(f: (() -> Double)? = null): Double =
    template<Double>("maxHeight", f, this, maxHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebView.fontScale(f: (() -> Double)? = null): Double =
    template<Double>("fontScale", f, this, fontScaleProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebView.zoom(f: (() -> Double)? = null): Double =
    template<Double>("zoom", f, this, zoomProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebView.contextMenuEnabled(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("contextMenuEnabled", f, this, contextMenuEnabledProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebView.fontSmoothingType(f: (() -> javafx.scene.text.FontSmoothingType)? = null): javafx.scene.text.FontSmoothingType =
    template<javafx.scene.text.FontSmoothingType>("fontSmoothingType", f, this, fontSmoothingTypeProperty()!! as ObservableValue<javafx.scene.text.FontSmoothingType>)

// javafx.scene.control.cell.ChoiceBoxTreeTableCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.cell.ChoiceBoxTreeTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.chart.XYChart.Data

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.XValue(f: (() -> X)? = null): X =
    template<X>("XValue", f, this, XValueProperty()!! as ObservableValue<X>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.YValue(f: (() -> Y)? = null): Y =
    template<Y>("YValue", f, this, YValueProperty()!! as ObservableValue<Y>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.extraValue(f: (() -> Any)? = null): Any =
    template<Any>("extraValue", f, this, extraValueProperty()!! as ObservableValue<Any>)

// javafx.scene.control.Hyperlink

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Hyperlink.visited(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("visited", f, this, visitedProperty()!! as ObservableValue<Boolean>)

// javafx.scene.layout.Region

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.snapToPixel(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("snapToPixel", f, this, snapToPixelProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.padding(f: (() -> javafx.geometry.Insets)? = null): javafx.geometry.Insets =
    template<javafx.geometry.Insets>("padding", f, this, paddingProperty()!! as ObservableValue<javafx.geometry.Insets>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.background(f: (() -> javafx.scene.layout.Background)? = null): javafx.scene.layout.Background =
    template<javafx.scene.layout.Background>("background", f, this, backgroundProperty()!! as ObservableValue<javafx.scene.layout.Background>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.border(f: (() -> javafx.scene.layout.Border)? = null): javafx.scene.layout.Border =
    template<javafx.scene.layout.Border>("border", f, this, borderProperty()!! as ObservableValue<javafx.scene.layout.Border>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.opaqueInsets(f: (() -> javafx.geometry.Insets)? = null): javafx.geometry.Insets =
    template<javafx.geometry.Insets>("opaqueInsets", f, this, opaqueInsetsProperty()!! as ObservableValue<javafx.geometry.Insets>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.insets(f: (() -> javafx.geometry.Insets)? = null): javafx.geometry.Insets =
    template<javafx.geometry.Insets>("insets", f, this, insetsProperty()!! as ObservableValue<javafx.geometry.Insets>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.width(f: (() -> Double)? = null): Double =
    template<Double>("width", f, this, widthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.height(f: (() -> Double)? = null): Double =
    template<Double>("height", f, this, heightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.minWidth(f: (() -> Double)? = null): Double =
    template<Double>("minWidth", f, this, minWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.minHeight(f: (() -> Double)? = null): Double =
    template<Double>("minHeight", f, this, minHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.prefWidth(f: (() -> Double)? = null): Double =
    template<Double>("prefWidth", f, this, prefWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.prefHeight(f: (() -> Double)? = null): Double =
    template<Double>("prefHeight", f, this, prefHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.maxWidth(f: (() -> Double)? = null): Double =
    template<Double>("maxWidth", f, this, maxWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.maxHeight(f: (() -> Double)? = null): Double =
    template<Double>("maxHeight", f, this, maxHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.shape(f: (() -> javafx.scene.shape.Shape)? = null): javafx.scene.shape.Shape =
    template<javafx.scene.shape.Shape>("shape", f, this, shapeProperty()!! as ObservableValue<javafx.scene.shape.Shape>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.scaleShape(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("scaleShape", f, this, scaleShapeProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.centerShape(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("centerShape", f, this, centerShapeProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.Region.cacheShape(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("cacheShape", f, this, cacheShapeProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.ToggleGroup

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ToggleGroup.selectedToggle(f: (() -> javafx.scene.control.Toggle)? = null): javafx.scene.control.Toggle =
    template<javafx.scene.control.Toggle>("selectedToggle", f, this, selectedToggleProperty()!! as ObservableValue<javafx.scene.control.Toggle>)

// javafx.beans.binding.SetExpression

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.beans.binding.SetExpression<E>.empty(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.beans.binding.SetExpression<E>.size(f: (() -> Int)? = null): Int =
    template<Int>("size", f, this, sizeProperty()!! as ObservableValue<Int>)

// javafx.scene.media.MediaPlayer

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.onError(f: (() -> Runnable)? = null): Runnable =
    template<Runnable>("onError", f, this, onErrorProperty()!! as ObservableValue<Runnable>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.autoPlay(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("autoPlay", f, this, autoPlayProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.volume(f: (() -> Double)? = null): Double =
    template<Double>("volume", f, this, volumeProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.balance(f: (() -> Double)? = null): Double =
    template<Double>("balance", f, this, balanceProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.startTime(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("startTime", f, this, startTimeProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.bufferProgressTime(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("bufferProgressTime", f, this, bufferProgressTimeProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.currentCount(f: (() -> Int)? = null): Int =
    template<Int>("currentCount", f, this, currentCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.onMarker(f: (() -> javafx.event.EventHandler<javafx.scene.media.MediaMarkerEvent>)? = null): javafx.event.EventHandler<javafx.scene.media.MediaMarkerEvent> =
    template<javafx.event.EventHandler<javafx.scene.media.MediaMarkerEvent>>("onMarker", f, this, onMarkerProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.media.MediaMarkerEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.onEndOfMedia(f: (() -> Runnable)? = null): Runnable =
    template<Runnable>("onEndOfMedia", f, this, onEndOfMediaProperty()!! as ObservableValue<Runnable>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.onReady(f: (() -> Runnable)? = null): Runnable =
    template<Runnable>("onReady", f, this, onReadyProperty()!! as ObservableValue<Runnable>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.onPlaying(f: (() -> Runnable)? = null): Runnable =
    template<Runnable>("onPlaying", f, this, onPlayingProperty()!! as ObservableValue<Runnable>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.onPaused(f: (() -> Runnable)? = null): Runnable =
    template<Runnable>("onPaused", f, this, onPausedProperty()!! as ObservableValue<Runnable>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.onStopped(f: (() -> Runnable)? = null): Runnable =
    template<Runnable>("onStopped", f, this, onStoppedProperty()!! as ObservableValue<Runnable>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.onHalted(f: (() -> Runnable)? = null): Runnable =
    template<Runnable>("onHalted", f, this, onHaltedProperty()!! as ObservableValue<Runnable>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.onRepeat(f: (() -> Runnable)? = null): Runnable =
    template<Runnable>("onRepeat", f, this, onRepeatProperty()!! as ObservableValue<Runnable>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.onStalled(f: (() -> Runnable)? = null): Runnable =
    template<Runnable>("onStalled", f, this, onStalledProperty()!! as ObservableValue<Runnable>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.rate(f: (() -> Double)? = null): Double =
    template<Double>("rate", f, this, rateProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.currentRate(f: (() -> Double)? = null): Double =
    template<Double>("currentRate", f, this, currentRateProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.cycleDuration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("cycleDuration", f, this, cycleDurationProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.totalDuration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("totalDuration", f, this, totalDurationProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.currentTime(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("currentTime", f, this, currentTimeProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.cycleCount(f: (() -> Int)? = null): Int =
    template<Int>("cycleCount", f, this, cycleCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.status(f: (() -> javafx.scene.media.MediaPlayer.Status)? = null): javafx.scene.media.MediaPlayer.Status =
    template<javafx.scene.media.MediaPlayer.Status>("status", f, this, statusProperty()!! as ObservableValue<javafx.scene.media.MediaPlayer.Status>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.error(f: (() -> javafx.scene.media.MediaException)? = null): javafx.scene.media.MediaException =
    template<javafx.scene.media.MediaException>("error", f, this, errorProperty()!! as ObservableValue<javafx.scene.media.MediaException>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.mute(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("mute", f, this, muteProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.stopTime(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("stopTime", f, this, stopTimeProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.audioSpectrumListener(f: (() -> javafx.scene.media.AudioSpectrumListener)? = null): javafx.scene.media.AudioSpectrumListener =
    template<javafx.scene.media.AudioSpectrumListener>("audioSpectrumListener", f, this, audioSpectrumListenerProperty()!! as ObservableValue<javafx.scene.media.AudioSpectrumListener>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.audioSpectrumNumBands(f: (() -> Int)? = null): Int =
    template<Int>("audioSpectrumNumBands", f, this, audioSpectrumNumBandsProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.audioSpectrumThreshold(f: (() -> Int)? = null): Int =
    template<Int>("audioSpectrumThreshold", f, this, audioSpectrumThresholdProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaPlayer.audioSpectrumInterval(f: (() -> Double)? = null): Double =
    template<Double>("audioSpectrumInterval", f, this, audioSpectrumIntervalProperty()!! as ObservableValue<Double>)

// javafx.scene.shape.QuadCurve

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.QuadCurve.startY(f: (() -> Double)? = null): Double =
    template<Double>("startY", f, this, startYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.QuadCurve.startX(f: (() -> Double)? = null): Double =
    template<Double>("startX", f, this, startXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.QuadCurve.endY(f: (() -> Double)? = null): Double =
    template<Double>("endY", f, this, endYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.QuadCurve.endX(f: (() -> Double)? = null): Double =
    template<Double>("endX", f, this, endXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.QuadCurve.controlX(f: (() -> Double)? = null): Double =
    template<Double>("controlX", f, this, controlXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.QuadCurve.controlY(f: (() -> Double)? = null): Double =
    template<Double>("controlY", f, this, controlYProperty()!! as ObservableValue<Double>)

// javafx.scene.text.Text

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.text.Text.text(f: (() -> String)? = null): String =
    template<String>("text", f, this, textProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.text.Text.textAlignment(f: (() -> javafx.scene.text.TextAlignment)? = null): javafx.scene.text.TextAlignment =
    template<javafx.scene.text.TextAlignment>("textAlignment", f, this, textAlignmentProperty()!! as ObservableValue<javafx.scene.text.TextAlignment>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.text.Text.font(f: (() -> javafx.scene.text.Font)? = null): javafx.scene.text.Font =
    template<javafx.scene.text.Font>("font", f, this, fontProperty()!! as ObservableValue<javafx.scene.text.Font>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.text.Text.underline(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("underline", f, this, underlineProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.text.Text.lineSpacing(f: (() -> Double)? = null): Double =
    template<Double>("lineSpacing", f, this, lineSpacingProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.text.Text.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.text.Text.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.text.Text.strikethrough(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("strikethrough", f, this, strikethroughProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.text.Text.textOrigin(f: (() -> javafx.geometry.VPos)? = null): javafx.geometry.VPos =
    template<javafx.geometry.VPos>("textOrigin", f, this, textOriginProperty()!! as ObservableValue<javafx.geometry.VPos>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.text.Text.baselineOffset(f: (() -> Double)? = null): Double =
    template<Double>("baselineOffset", f, this, baselineOffsetProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.text.Text.fontSmoothingType(f: (() -> javafx.scene.text.FontSmoothingType)? = null): javafx.scene.text.FontSmoothingType =
    template<javafx.scene.text.FontSmoothingType>("fontSmoothingType", f, this, fontSmoothingTypeProperty()!! as ObservableValue<javafx.scene.text.FontSmoothingType>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.text.Text.wrappingWidth(f: (() -> Double)? = null): Double =
    template<Double>("wrappingWidth", f, this, wrappingWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.text.Text.boundsType(f: (() -> javafx.scene.text.TextBoundsType)? = null): javafx.scene.text.TextBoundsType =
    template<javafx.scene.text.TextBoundsType>("boundsType", f, this, boundsTypeProperty()!! as ObservableValue<javafx.scene.text.TextBoundsType>)

// javafx.beans.binding.ListExpression

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.beans.binding.ListExpression<E>.empty(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.beans.binding.ListExpression<E>.size(f: (() -> Int)? = null): Int =
    template<Int>("size", f, this, sizeProperty()!! as ObservableValue<Int>)

// javafx.scene.control.PopupControl

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.PopupControl.id(f: (() -> String)? = null): String =
    template<String>("id", f, this, idProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.PopupControl.style(f: (() -> String)? = null): String =
    template<String>("style", f, this, styleProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.PopupControl.skin(f: (() -> javafx.scene.control.Skin<*>)? = null): javafx.scene.control.Skin<*> =
    template<javafx.scene.control.Skin<*>>("skin", f, this, skinProperty()!! as ObservableValue<javafx.scene.control.Skin<*>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.PopupControl.minWidth(f: (() -> Double)? = null): Double =
    template<Double>("minWidth", f, this, minWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.PopupControl.minHeight(f: (() -> Double)? = null): Double =
    template<Double>("minHeight", f, this, minHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.PopupControl.prefWidth(f: (() -> Double)? = null): Double =
    template<Double>("prefWidth", f, this, prefWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.PopupControl.prefHeight(f: (() -> Double)? = null): Double =
    template<Double>("prefHeight", f, this, prefHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.PopupControl.maxWidth(f: (() -> Double)? = null): Double =
    template<Double>("maxWidth", f, this, maxWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.PopupControl.maxHeight(f: (() -> Double)? = null): Double =
    template<Double>("maxHeight", f, this, maxHeightProperty()!! as ObservableValue<Double>)

// javafx.beans.property.ReadOnlyDoubleWrapper

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.beans.property.ReadOnlyDoubleWrapper.getReadOnly(f: (() -> Double)? = null): Double =
    template<Double>("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<Double>)

// javafx.scene.control.cell.ChoiceBoxTableCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.cell.ChoiceBoxTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.control.cell.ChoiceBoxListCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.cell.ChoiceBoxListCell<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.control.TitledPane

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TitledPane.expanded(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("expanded", f, this, expandedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TitledPane.content(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("content", f, this, contentProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TitledPane.animated(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("animated", f, this, animatedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TitledPane.collapsible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("collapsible", f, this, collapsibleProperty()!! as ObservableValue<Boolean>)

// javafx.scene.chart.StackedBarChart

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.StackedBarChart<X, Y>.categoryGap(f: (() -> Double)? = null): Double =
    template<Double>("categoryGap", f, this, categoryGapProperty()!! as ObservableValue<Double>)

// javafx.scene.control.Labeled

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Labeled.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
    template<javafx.geometry.Pos>("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Labeled.text(f: (() -> String)? = null): String =
    template<String>("text", f, this, textProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Labeled.textAlignment(f: (() -> javafx.scene.text.TextAlignment)? = null): javafx.scene.text.TextAlignment =
    template<javafx.scene.text.TextAlignment>("textAlignment", f, this, textAlignmentProperty()!! as ObservableValue<javafx.scene.text.TextAlignment>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Labeled.textOverrun(f: (() -> javafx.scene.control.OverrunStyle)? = null): javafx.scene.control.OverrunStyle =
    template<javafx.scene.control.OverrunStyle>("textOverrun", f, this, textOverrunProperty()!! as ObservableValue<javafx.scene.control.OverrunStyle>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Labeled.ellipsisString(f: (() -> String)? = null): String =
    template<String>("ellipsisString", f, this, ellipsisStringProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Labeled.wrapText(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("wrapText", f, this, wrapTextProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Labeled.font(f: (() -> javafx.scene.text.Font)? = null): javafx.scene.text.Font =
    template<javafx.scene.text.Font>("font", f, this, fontProperty()!! as ObservableValue<javafx.scene.text.Font>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Labeled.graphic(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("graphic", f, this, graphicProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Labeled.underline(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("underline", f, this, underlineProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Labeled.lineSpacing(f: (() -> Double)? = null): Double =
    template<Double>("lineSpacing", f, this, lineSpacingProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Labeled.contentDisplay(f: (() -> javafx.scene.control.ContentDisplay)? = null): javafx.scene.control.ContentDisplay =
    template<javafx.scene.control.ContentDisplay>("contentDisplay", f, this, contentDisplayProperty()!! as ObservableValue<javafx.scene.control.ContentDisplay>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Labeled.labelPadding(f: (() -> javafx.geometry.Insets)? = null): javafx.geometry.Insets =
    template<javafx.geometry.Insets>("labelPadding", f, this, labelPaddingProperty()!! as ObservableValue<javafx.geometry.Insets>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Labeled.graphicTextGap(f: (() -> Double)? = null): Double =
    template<Double>("graphicTextGap", f, this, graphicTextGapProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Labeled.textFill(f: (() -> javafx.scene.paint.Paint)? = null): javafx.scene.paint.Paint =
    template<javafx.scene.paint.Paint>("textFill", f, this, textFillProperty()!! as ObservableValue<javafx.scene.paint.Paint>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Labeled.mnemonicParsing(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("mnemonicParsing", f, this, mnemonicParsingProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.TreeTableColumn

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TreeTableColumn<S, T>.cellFactory(f: (() -> javafx.util.Callback<javafx.scene.control.TreeTableColumn<S, T>, javafx.scene.control.TreeTableCell<S, T>>)? = null): javafx.util.Callback<javafx.scene.control.TreeTableColumn<S, T>, javafx.scene.control.TreeTableCell<S, T>> =
    template<javafx.util.Callback<javafx.scene.control.TreeTableColumn<S, T>, javafx.scene.control.TreeTableCell<S, T>>>("cellFactory", f, this, cellFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TreeTableColumn<S, T>, javafx.scene.control.TreeTableCell<S, T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TreeTableColumn<S, T>.onEditStart(f: (() -> javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>> =
    template<javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>>("onEditStart", f, this, onEditStartProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TreeTableColumn<S, T>.onEditCommit(f: (() -> javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>> =
    template<javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>>("onEditCommit", f, this, onEditCommitProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TreeTableColumn<S, T>.onEditCancel(f: (() -> javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>> =
    template<javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>>("onEditCancel", f, this, onEditCancelProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TreeTableColumn<S, T>.cellValueFactory(f: (() -> javafx.util.Callback<javafx.scene.control.TreeTableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>>)? = null): javafx.util.Callback<javafx.scene.control.TreeTableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>> =
    template<javafx.util.Callback<javafx.scene.control.TreeTableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>>>("cellValueFactory", f, this, cellValueFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TreeTableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TreeTableColumn<S, T>.sortType(f: (() -> javafx.scene.control.TreeTableColumn.SortType)? = null): javafx.scene.control.TreeTableColumn.SortType =
    template<javafx.scene.control.TreeTableColumn.SortType>("sortType", f, this, sortTypeProperty()!! as ObservableValue<javafx.scene.control.TreeTableColumn.SortType>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TreeTableColumn<S, T>.treeTableView(f: (() -> javafx.scene.control.TreeTableView<S>)? = null): javafx.scene.control.TreeTableView<S> =
    template<javafx.scene.control.TreeTableView<S>>("treeTableView", f, this, treeTableViewProperty()!! as ObservableValue<javafx.scene.control.TreeTableView<S>>)

// javafx.scene.control.Pagination

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Pagination.maxPageIndicatorCount(f: (() -> Int)? = null): Int =
    template<Int>("maxPageIndicatorCount", f, this, maxPageIndicatorCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Pagination.pageCount(f: (() -> Int)? = null): Int =
    template<Int>("pageCount", f, this, pageCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Pagination.currentPageIndex(f: (() -> Int)? = null): Int =
    template<Int>("currentPageIndex", f, this, currentPageIndexProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Pagination.pageFactory(f: (() -> javafx.util.Callback<Int, javafx.scene.Node>)? = null): javafx.util.Callback<Int, javafx.scene.Node> =
    template<javafx.util.Callback<Int, javafx.scene.Node>>("pageFactory", f, this, pageFactoryProperty()!! as ObservableValue<javafx.util.Callback<Int, javafx.scene.Node>>)

// javafx.beans.property.SetPropertyBase

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.beans.property.SetPropertyBase<E>.empty(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.beans.property.SetPropertyBase<E>.size(f: (() -> Int)? = null): Int =
    template<Int>("size", f, this, sizeProperty()!! as ObservableValue<Int>)

// javafx.scene.shape.CubicCurve

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.CubicCurve.controlY2(f: (() -> Double)? = null): Double =
    template<Double>("controlY2", f, this, controlY2Property()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.CubicCurve.controlX2(f: (() -> Double)? = null): Double =
    template<Double>("controlX2", f, this, controlX2Property()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.CubicCurve.controlY1(f: (() -> Double)? = null): Double =
    template<Double>("controlY1", f, this, controlY1Property()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.CubicCurve.controlX1(f: (() -> Double)? = null): Double =
    template<Double>("controlX1", f, this, controlX1Property()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.CubicCurve.startY(f: (() -> Double)? = null): Double =
    template<Double>("startY", f, this, startYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.CubicCurve.startX(f: (() -> Double)? = null): Double =
    template<Double>("startX", f, this, startXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.CubicCurve.endY(f: (() -> Double)? = null): Double =
    template<Double>("endY", f, this, endYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.CubicCurve.endX(f: (() -> Double)? = null): Double =
    template<Double>("endX", f, this, endXProperty()!! as ObservableValue<Double>)

// javafx.scene.image.ImageView

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.image.ImageView.smooth(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("smooth", f, this, smoothProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.image.ImageView.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.image.ImageView.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.image.ImageView.preserveRatio(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("preserveRatio", f, this, preserveRatioProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.image.ImageView.fitHeight(f: (() -> Double)? = null): Double =
    template<Double>("fitHeight", f, this, fitHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.image.ImageView.viewport(f: (() -> javafx.geometry.Rectangle2D)? = null): javafx.geometry.Rectangle2D =
    template<javafx.geometry.Rectangle2D>("viewport", f, this, viewportProperty()!! as ObservableValue<javafx.geometry.Rectangle2D>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.image.ImageView.fitWidth(f: (() -> Double)? = null): Double =
    template<Double>("fitWidth", f, this, fitWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.image.ImageView.image(f: (() -> javafx.scene.image.Image)? = null): javafx.scene.image.Image =
    template<javafx.scene.image.Image>("image", f, this, imageProperty()!! as ObservableValue<javafx.scene.image.Image>)

// javafx.scene.shape.ArcTo

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.ArcTo.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.ArcTo.radiusX(f: (() -> Double)? = null): Double =
    template<Double>("radiusX", f, this, radiusXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.ArcTo.radiusY(f: (() -> Double)? = null): Double =
    template<Double>("radiusY", f, this, radiusYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.ArcTo.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.ArcTo.largeArcFlag(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("largeArcFlag", f, this, largeArcFlagProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.ArcTo.sweepFlag(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("sweepFlag", f, this, sweepFlagProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.ArcTo.XAxisRotation(f: (() -> Double)? = null): Double =
    template<Double>("XAxisRotation", f, this, XAxisRotationProperty()!! as ObservableValue<Double>)

// javafx.scene.shape.Ellipse

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Ellipse.centerX(f: (() -> Double)? = null): Double =
    template<Double>("centerX", f, this, centerXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Ellipse.centerY(f: (() -> Double)? = null): Double =
    template<Double>("centerY", f, this, centerYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Ellipse.radiusX(f: (() -> Double)? = null): Double =
    template<Double>("radiusX", f, this, radiusXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Ellipse.radiusY(f: (() -> Double)? = null): Double =
    template<Double>("radiusY", f, this, radiusYProperty()!! as ObservableValue<Double>)

// javafx.concurrent.Task

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Task<V>.value(f: (() -> V)? = null): V =
    template<V>("value", f, this, valueProperty()!! as ObservableValue<V>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Task<V>.onScheduled(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
    template<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>("onScheduled", f, this, onScheduledProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Task<V>.onRunning(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
    template<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>("onRunning", f, this, onRunningProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Task<V>.onSucceeded(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
    template<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>("onSucceeded", f, this, onSucceededProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Task<V>.onCancelled(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
    template<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>("onCancelled", f, this, onCancelledProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Task<V>.onFailed(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
    template<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>("onFailed", f, this, onFailedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Task<V>.state(f: (() -> javafx.concurrent.Worker.State)? = null): javafx.concurrent.Worker.State =
    template<javafx.concurrent.Worker.State>("state", f, this, stateProperty()!! as ObservableValue<javafx.concurrent.Worker.State>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Task<V>.exception(f: (() -> Throwable)? = null): Throwable =
    template<Throwable>("exception", f, this, exceptionProperty()!! as ObservableValue<Throwable>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Task<V>.workDone(f: (() -> Double)? = null): Double =
    template<Double>("workDone", f, this, workDoneProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Task<V>.totalWork(f: (() -> Double)? = null): Double =
    template<Double>("totalWork", f, this, totalWorkProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Task<V>.progress(f: (() -> Double)? = null): Double =
    template<Double>("progress", f, this, progressProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Task<V>.running(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("running", f, this, runningProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Task<V>.message(f: (() -> String)? = null): String =
    template<String>("message", f, this, messageProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <V> javafx.concurrent.Task<V>.title(f: (() -> String)? = null): String =
    template<String>("title", f, this, titleProperty()!! as ObservableValue<String>)

// javafx.scene.shape.VLineTo

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.VLineTo.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

// javafx.beans.property.ReadOnlyLongWrapper

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.beans.property.ReadOnlyLongWrapper.getReadOnly(f: (() -> Long)? = null): Long =
    template<Long>("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<Long>)

// javafx.scene.shape.Sphere

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Sphere.radius(f: (() -> Double)? = null): Double =
    template<Double>("radius", f, this, radiusProperty()!! as ObservableValue<Double>)

// javafx.scene.layout.HBox

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.HBox.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
    template<javafx.geometry.Pos>("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.HBox.fillHeight(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("fillHeight", f, this, fillHeightProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.HBox.spacing(f: (() -> Double)? = null): Double =
    template<Double>("spacing", f, this, spacingProperty()!! as ObservableValue<Double>)

// javafx.collections.transformation.SortedList

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.collections.transformation.SortedList<E>.comparator(f: (() -> java.util.Comparator<in E>)? = null): java.util.Comparator<in E> =
    template<java.util.Comparator<in E>>("comparator", f, this, comparatorProperty()!! as ObservableValue<java.util.Comparator<in E>>)

// javafx.stage.Stage

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Stage.minWidth(f: (() -> Double)? = null): Double =
    template<Double>("minWidth", f, this, minWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Stage.minHeight(f: (() -> Double)? = null): Double =
    template<Double>("minHeight", f, this, minHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Stage.maxWidth(f: (() -> Double)? = null): Double =
    template<Double>("maxWidth", f, this, maxWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Stage.maxHeight(f: (() -> Double)? = null): Double =
    template<Double>("maxHeight", f, this, maxHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Stage.title(f: (() -> String)? = null): String =
    template<String>("title", f, this, titleProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Stage.resizable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("resizable", f, this, resizableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Stage.fullScreen(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("fullScreen", f, this, fullScreenProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Stage.iconified(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("iconified", f, this, iconifiedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Stage.maximized(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("maximized", f, this, maximizedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Stage.fullScreenExitKey(f: (() -> javafx.scene.input.KeyCombination)? = null): javafx.scene.input.KeyCombination =
    template<javafx.scene.input.KeyCombination>("fullScreenExitKey", f, this, fullScreenExitKeyProperty()!! as ObservableValue<javafx.scene.input.KeyCombination>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.Stage.fullScreenExitHint(f: (() -> String)? = null): String =
    template<String>("fullScreenExitHint", f, this, fullScreenExitHintProperty()!! as ObservableValue<String>)

// javafx.scene.chart.CategoryAxis

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.CategoryAxis.startMargin(f: (() -> Double)? = null): Double =
    template<Double>("startMargin", f, this, startMarginProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.CategoryAxis.endMargin(f: (() -> Double)? = null): Double =
    template<Double>("endMargin", f, this, endMarginProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.CategoryAxis.gapStartAndEnd(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("gapStartAndEnd", f, this, gapStartAndEndProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.CategoryAxis.categorySpacing(f: (() -> Double)? = null): Double =
    template<Double>("categorySpacing", f, this, categorySpacingProperty()!! as ObservableValue<Double>)

// javafx.scene.control.cell.TextFieldTableCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.cell.TextFieldTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.animation.FillTransition

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.FillTransition.shape(f: (() -> javafx.scene.shape.Shape)? = null): javafx.scene.shape.Shape =
    template<javafx.scene.shape.Shape>("shape", f, this, shapeProperty()!! as ObservableValue<javafx.scene.shape.Shape>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.FillTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.FillTransition.fromValue(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
    template<javafx.scene.paint.Color>("fromValue", f, this, fromValueProperty()!! as ObservableValue<javafx.scene.paint.Color>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.FillTransition.toValue(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
    template<javafx.scene.paint.Color>("toValue", f, this, toValueProperty()!! as ObservableValue<javafx.scene.paint.Color>)

// javafx.scene.layout.VBox

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.VBox.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
    template<javafx.geometry.Pos>("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.VBox.fillWidth(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("fillWidth", f, this, fillWidthProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.VBox.spacing(f: (() -> Double)? = null): Double =
    template<Double>("spacing", f, this, spacingProperty()!! as ObservableValue<Double>)

// javafx.scene.effect.Glow

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Glow.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Glow.level(f: (() -> Double)? = null): Double =
    template<Double>("level", f, this, levelProperty()!! as ObservableValue<Double>)

// javafx.scene.control.Button

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Button.defaultButton(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("defaultButton", f, this, defaultButtonProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Button.cancelButton(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("cancelButton", f, this, cancelButtonProperty()!! as ObservableValue<Boolean>)

// javafx.scene.SubScene

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.SubScene.width(f: (() -> Double)? = null): Double =
    template<Double>("width", f, this, widthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.SubScene.height(f: (() -> Double)? = null): Double =
    template<Double>("height", f, this, heightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.SubScene.fill(f: (() -> javafx.scene.paint.Paint)? = null): javafx.scene.paint.Paint =
    template<javafx.scene.paint.Paint>("fill", f, this, fillProperty()!! as ObservableValue<javafx.scene.paint.Paint>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.SubScene.root(f: (() -> javafx.scene.Parent)? = null): javafx.scene.Parent =
    template<javafx.scene.Parent>("root", f, this, rootProperty()!! as ObservableValue<javafx.scene.Parent>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.SubScene.camera(f: (() -> javafx.scene.Camera)? = null): javafx.scene.Camera =
    template<javafx.scene.Camera>("camera", f, this, cameraProperty()!! as ObservableValue<javafx.scene.Camera>)

// javafx.scene.chart.StackedAreaChart

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.StackedAreaChart<X, Y>.createSymbols(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("createSymbols", f, this, createSymbolsProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.CustomMenuItem

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.CustomMenuItem.content(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("content", f, this, contentProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.CustomMenuItem.hideOnClick(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("hideOnClick", f, this, hideOnClickProperty()!! as ObservableValue<Boolean>)

// javafx.scene.chart.LineChart

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.LineChart<X, Y>.createSymbols(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("createSymbols", f, this, createSymbolsProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.TreeCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeCell<T>.treeItem(f: (() -> javafx.scene.control.TreeItem<T>)? = null): javafx.scene.control.TreeItem<T> =
    template<javafx.scene.control.TreeItem<T>>("treeItem", f, this, treeItemProperty()!! as ObservableValue<javafx.scene.control.TreeItem<T>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeCell<T>.disclosureNode(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("disclosureNode", f, this, disclosureNodeProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeCell<T>.treeView(f: (() -> javafx.scene.control.TreeView<T>)? = null): javafx.scene.control.TreeView<T> =
    template<javafx.scene.control.TreeView<T>>("treeView", f, this, treeViewProperty()!! as ObservableValue<javafx.scene.control.TreeView<T>>)

// javafx.scene.shape.MoveTo

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.MoveTo.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.MoveTo.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

// javafx.scene.control.cell.ComboBoxTreeTableCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.cell.ComboBoxTreeTableCell<S, T>.comboBoxEditable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("comboBoxEditable", f, this, comboBoxEditableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.cell.ComboBoxTreeTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.control.ScrollBar

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollBar.unitIncrement(f: (() -> Double)? = null): Double =
    template<Double>("unitIncrement", f, this, unitIncrementProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollBar.blockIncrement(f: (() -> Double)? = null): Double =
    template<Double>("blockIncrement", f, this, blockIncrementProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollBar.value(f: (() -> Double)? = null): Double =
    template<Double>("value", f, this, valueProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollBar.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
    template<javafx.geometry.Orientation>("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollBar.min(f: (() -> Double)? = null): Double =
    template<Double>("min", f, this, minProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollBar.max(f: (() -> Double)? = null): Double =
    template<Double>("max", f, this, maxProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ScrollBar.visibleAmount(f: (() -> Double)? = null): Double =
    template<Double>("visibleAmount", f, this, visibleAmountProperty()!! as ObservableValue<Double>)

// javafx.scene.paint.PhongMaterial

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.paint.PhongMaterial.bumpMap(f: (() -> javafx.scene.image.Image)? = null): javafx.scene.image.Image =
    template<javafx.scene.image.Image>("bumpMap", f, this, bumpMapProperty()!! as ObservableValue<javafx.scene.image.Image>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.paint.PhongMaterial.selfIlluminationMap(f: (() -> javafx.scene.image.Image)? = null): javafx.scene.image.Image =
    template<javafx.scene.image.Image>("selfIlluminationMap", f, this, selfIlluminationMapProperty()!! as ObservableValue<javafx.scene.image.Image>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.paint.PhongMaterial.specularMap(f: (() -> javafx.scene.image.Image)? = null): javafx.scene.image.Image =
    template<javafx.scene.image.Image>("specularMap", f, this, specularMapProperty()!! as ObservableValue<javafx.scene.image.Image>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.paint.PhongMaterial.specularColor(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
    template<javafx.scene.paint.Color>("specularColor", f, this, specularColorProperty()!! as ObservableValue<javafx.scene.paint.Color>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.paint.PhongMaterial.diffuseMap(f: (() -> javafx.scene.image.Image)? = null): javafx.scene.image.Image =
    template<javafx.scene.image.Image>("diffuseMap", f, this, diffuseMapProperty()!! as ObservableValue<javafx.scene.image.Image>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.paint.PhongMaterial.specularPower(f: (() -> Double)? = null): Double =
    template<Double>("specularPower", f, this, specularPowerProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.paint.PhongMaterial.diffuseColor(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
    template<javafx.scene.paint.Color>("diffuseColor", f, this, diffuseColorProperty()!! as ObservableValue<javafx.scene.paint.Color>)

// javafx.scene.chart.ValueAxis

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T:Number> javafx.scene.chart.ValueAxis<T>.minorTickCount(f: (() -> Int)? = null): Int =
    template<Int>("minorTickCount", f, this, minorTickCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T:Number> javafx.scene.chart.ValueAxis<T>.scale(f: (() -> Double)? = null): Double =
    template<Double>("scale", f, this, scaleProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T:Number> javafx.scene.chart.ValueAxis<T>.upperBound(f: (() -> Double)? = null): Double =
    template<Double>("upperBound", f, this, upperBoundProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T:Number> javafx.scene.chart.ValueAxis<T>.lowerBound(f: (() -> Double)? = null): Double =
    template<Double>("lowerBound", f, this, lowerBoundProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T:Number> javafx.scene.chart.ValueAxis<T>.tickLabelFormatter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("tickLabelFormatter", f, this, tickLabelFormatterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T:Number> javafx.scene.chart.ValueAxis<T>.minorTickLength(f: (() -> Double)? = null): Double =
    template<Double>("minorTickLength", f, this, minorTickLengthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T:Number> javafx.scene.chart.ValueAxis<T>.minorTickVisible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("minorTickVisible", f, this, minorTickVisibleProperty()!! as ObservableValue<Boolean>)

// javafx.animation.ScaleTransition

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.ScaleTransition.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.ScaleTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
    template<javafx.util.Duration>("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.ScaleTransition.fromX(f: (() -> Double)? = null): Double =
    template<Double>("fromX", f, this, fromXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.ScaleTransition.fromY(f: (() -> Double)? = null): Double =
    template<Double>("fromY", f, this, fromYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.ScaleTransition.fromZ(f: (() -> Double)? = null): Double =
    template<Double>("fromZ", f, this, fromZProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.ScaleTransition.toX(f: (() -> Double)? = null): Double =
    template<Double>("toX", f, this, toXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.ScaleTransition.toY(f: (() -> Double)? = null): Double =
    template<Double>("toY", f, this, toYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.ScaleTransition.toZ(f: (() -> Double)? = null): Double =
    template<Double>("toZ", f, this, toZProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.ScaleTransition.byX(f: (() -> Double)? = null): Double =
    template<Double>("byX", f, this, byXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.ScaleTransition.byY(f: (() -> Double)? = null): Double =
    template<Double>("byY", f, this, byYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.animation.ScaleTransition.byZ(f: (() -> Double)? = null): Double =
    template<Double>("byZ", f, this, byZProperty()!! as ObservableValue<Double>)

// javafx.scene.control.ToolBar

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ToolBar.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
    template<javafx.geometry.Orientation>("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

// javafx.scene.control.SplitPane

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.SplitPane.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
    template<javafx.geometry.Orientation>("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

// javafx.scene.control.Tab

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tab.id(f: (() -> String)? = null): String =
    template<String>("id", f, this, idProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tab.style(f: (() -> String)? = null): String =
    template<String>("style", f, this, styleProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tab.disable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("disable", f, this, disableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tab.disabled(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("disabled", f, this, disabledProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tab.selected(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tab.text(f: (() -> String)? = null): String =
    template<String>("text", f, this, textProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tab.graphic(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("graphic", f, this, graphicProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tab.tooltip(f: (() -> javafx.scene.control.Tooltip)? = null): javafx.scene.control.Tooltip =
    template<javafx.scene.control.Tooltip>("tooltip", f, this, tooltipProperty()!! as ObservableValue<javafx.scene.control.Tooltip>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tab.contextMenu(f: (() -> javafx.scene.control.ContextMenu)? = null): javafx.scene.control.ContextMenu =
    template<javafx.scene.control.ContextMenu>("contextMenu", f, this, contextMenuProperty()!! as ObservableValue<javafx.scene.control.ContextMenu>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tab.tabPane(f: (() -> javafx.scene.control.TabPane)? = null): javafx.scene.control.TabPane =
    template<javafx.scene.control.TabPane>("tabPane", f, this, tabPaneProperty()!! as ObservableValue<javafx.scene.control.TabPane>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tab.closable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("closable", f, this, closableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tab.content(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("content", f, this, contentProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tab.onCloseRequest(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
    template<javafx.event.EventHandler<javafx.event.Event>>("onCloseRequest", f, this, onCloseRequestProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tab.onClosed(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
    template<javafx.event.EventHandler<javafx.event.Event>>("onClosed", f, this, onClosedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Tab.onSelectionChanged(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
    template<javafx.event.EventHandler<javafx.event.Event>>("onSelectionChanged", f, this, onSelectionChangedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

// javafx.scene.control.CheckMenuItem

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.CheckMenuItem.selected(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.SplitPane.Divider

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.SplitPane.Divider.position(f: (() -> Double)? = null): Double =
    template<Double>("position", f, this, positionProperty()!! as ObservableValue<Double>)

// javafx.scene.control.TextField

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextField.prefColumnCount(f: (() -> Int)? = null): Int =
    template<Int>("prefColumnCount", f, this, prefColumnCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextField.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
    template<javafx.geometry.Pos>("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextField.onAction(f: (() -> javafx.event.EventHandler<javafx.event.ActionEvent>)? = null): javafx.event.EventHandler<javafx.event.ActionEvent> =
    template<javafx.event.EventHandler<javafx.event.ActionEvent>>("onAction", f, this, onActionProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.ActionEvent>>)

// javafx.scene.effect.Light.Point

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Light.Point.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Light.Point.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Light.Point.z(f: (() -> Double)? = null): Double =
    template<Double>("z", f, this, zProperty()!! as ObservableValue<Double>)

// javafx.scene.media.MediaView

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaView.onError(f: (() -> javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent>)? = null): javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent> =
    template<javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent>>("onError", f, this, onErrorProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaView.smooth(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("smooth", f, this, smoothProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaView.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaView.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaView.mediaPlayer(f: (() -> javafx.scene.media.MediaPlayer)? = null): javafx.scene.media.MediaPlayer =
    template<javafx.scene.media.MediaPlayer>("mediaPlayer", f, this, mediaPlayerProperty()!! as ObservableValue<javafx.scene.media.MediaPlayer>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaView.preserveRatio(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("preserveRatio", f, this, preserveRatioProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaView.fitHeight(f: (() -> Double)? = null): Double =
    template<Double>("fitHeight", f, this, fitHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaView.viewport(f: (() -> javafx.geometry.Rectangle2D)? = null): javafx.geometry.Rectangle2D =
    template<javafx.geometry.Rectangle2D>("viewport", f, this, viewportProperty()!! as ObservableValue<javafx.geometry.Rectangle2D>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.MediaView.fitWidth(f: (() -> Double)? = null): Double =
    template<Double>("fitWidth", f, this, fitWidthProperty()!! as ObservableValue<Double>)

// javafx.scene.control.TableCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableCell<S, T>.tableView(f: (() -> javafx.scene.control.TableView<S>)? = null): javafx.scene.control.TableView<S> =
    template<javafx.scene.control.TableView<S>>("tableView", f, this, tableViewProperty()!! as ObservableValue<javafx.scene.control.TableView<S>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableCell<S, T>.tableColumn(f: (() -> javafx.scene.control.TableColumn<S, T>)? = null): javafx.scene.control.TableColumn<S, T> =
    template<javafx.scene.control.TableColumn<S, T>>("tableColumn", f, this, tableColumnProperty()!! as ObservableValue<javafx.scene.control.TableColumn<S, T>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableCell<S, T>.tableRow(f: (() -> javafx.scene.control.TableRow<*>)? = null): javafx.scene.control.TableRow<*> =
    template<javafx.scene.control.TableRow<*>>("tableRow", f, this, tableRowProperty()!! as ObservableValue<javafx.scene.control.TableRow<*>>)

// javafx.beans.binding.SetBinding

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.beans.binding.SetBinding<E>.empty(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.beans.binding.SetBinding<E>.size(f: (() -> Int)? = null): Int =
    template<Int>("size", f, this, sizeProperty()!! as ObservableValue<Int>)

// javafx.scene.shape.Circle

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Circle.centerX(f: (() -> Double)? = null): Double =
    template<Double>("centerX", f, this, centerXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Circle.centerY(f: (() -> Double)? = null): Double =
    template<Double>("centerY", f, this, centerYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Circle.radius(f: (() -> Double)? = null): Double =
    template<Double>("radius", f, this, radiusProperty()!! as ObservableValue<Double>)

// javafx.scene.control.CheckBox

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.CheckBox.selected(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.CheckBox.indeterminate(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("indeterminate", f, this, indeterminateProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.CheckBox.allowIndeterminate(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("allowIndeterminate", f, this, allowIndeterminateProperty()!! as ObservableValue<Boolean>)

// javafx.scene.layout.FlowPane

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.FlowPane.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
    template<javafx.geometry.Pos>("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.FlowPane.columnHalignment(f: (() -> javafx.geometry.HPos)? = null): javafx.geometry.HPos =
    template<javafx.geometry.HPos>("columnHalignment", f, this, columnHalignmentProperty()!! as ObservableValue<javafx.geometry.HPos>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.FlowPane.hgap(f: (() -> Double)? = null): Double =
    template<Double>("hgap", f, this, hgapProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.FlowPane.prefWrapLength(f: (() -> Double)? = null): Double =
    template<Double>("prefWrapLength", f, this, prefWrapLengthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.FlowPane.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
    template<javafx.geometry.Orientation>("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.FlowPane.vgap(f: (() -> Double)? = null): Double =
    template<Double>("vgap", f, this, vgapProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.FlowPane.rowValignment(f: (() -> javafx.geometry.VPos)? = null): javafx.geometry.VPos =
    template<javafx.geometry.VPos>("rowValignment", f, this, rowValignmentProperty()!! as ObservableValue<javafx.geometry.VPos>)

// javafx.scene.control.ButtonBase

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ButtonBase.armed(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("armed", f, this, armedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ButtonBase.onAction(f: (() -> javafx.event.EventHandler<javafx.event.ActionEvent>)? = null): javafx.event.EventHandler<javafx.event.ActionEvent> =
    template<javafx.event.EventHandler<javafx.event.ActionEvent>>("onAction", f, this, onActionProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.ActionEvent>>)

// javafx.scene.effect.ColorAdjust

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.ColorAdjust.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.ColorAdjust.hue(f: (() -> Double)? = null): Double =
    template<Double>("hue", f, this, hueProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.ColorAdjust.saturation(f: (() -> Double)? = null): Double =
    template<Double>("saturation", f, this, saturationProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.ColorAdjust.brightness(f: (() -> Double)? = null): Double =
    template<Double>("brightness", f, this, brightnessProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.ColorAdjust.contrast(f: (() -> Double)? = null): Double =
    template<Double>("contrast", f, this, contrastProperty()!! as ObservableValue<Double>)

// javafx.scene.layout.BorderPane

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.BorderPane.center(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("center", f, this, centerProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.BorderPane.top(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("top", f, this, topProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.BorderPane.bottom(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("bottom", f, this, bottomProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.BorderPane.left(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("left", f, this, leftProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.BorderPane.right(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("right", f, this, rightProperty()!! as ObservableValue<javafx.scene.Node>)

// javafx.scene.transform.Shear

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Shear.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Shear.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Shear.pivotX(f: (() -> Double)? = null): Double =
    template<Double>("pivotX", f, this, pivotXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Shear.pivotY(f: (() -> Double)? = null): Double =
    template<Double>("pivotY", f, this, pivotYProperty()!! as ObservableValue<Double>)

// javafx.beans.property.ListPropertyBase

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.beans.property.ListPropertyBase<E>.empty(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <E> javafx.beans.property.ListPropertyBase<E>.size(f: (() -> Int)? = null): Int =
    template<Int>("size", f, this, sizeProperty()!! as ObservableValue<Int>)

// javafx.scene.effect.SepiaTone

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.SepiaTone.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.SepiaTone.level(f: (() -> Double)? = null): Double =
    template<Double>("level", f, this, levelProperty()!! as ObservableValue<Double>)

// javafx.scene.shape.SVGPath

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.SVGPath.fillRule(f: (() -> javafx.scene.shape.FillRule)? = null): javafx.scene.shape.FillRule =
    template<javafx.scene.shape.FillRule>("fillRule", f, this, fillRuleProperty()!! as ObservableValue<javafx.scene.shape.FillRule>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.SVGPath.content(f: (() -> String)? = null): String =
    template<String>("content", f, this, contentProperty()!! as ObservableValue<String>)

// javafx.scene.control.Skinnable

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Skinnable.skin(f: (() -> javafx.scene.control.Skin<*>)? = null): javafx.scene.control.Skin<*> =
    template<javafx.scene.control.Skin<*>>("skin", f, this, skinProperty()!! as ObservableValue<javafx.scene.control.Skin<*>>)

// javafx.scene.control.TableSelectionModel

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TableSelectionModel<T>.cellSelectionEnabled(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("cellSelectionEnabled", f, this, cellSelectionEnabledProperty()!! as ObservableValue<Boolean>)

// javafx.scene.layout.GridPane

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.GridPane.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
    template<javafx.geometry.Pos>("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.GridPane.hgap(f: (() -> Double)? = null): Double =
    template<Double>("hgap", f, this, hgapProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.GridPane.vgap(f: (() -> Double)? = null): Double =
    template<Double>("vgap", f, this, vgapProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.GridPane.gridLinesVisible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("gridLinesVisible", f, this, gridLinesVisibleProperty()!! as ObservableValue<Boolean>)

// javafx.scene.chart.XYChart

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.XYChart<X, Y>.data(f: (() -> javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X, Y>>)? = null): javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X, Y>> =
    template<javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X, Y>>>("data", f, this, dataProperty()!! as ObservableValue<javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X, Y>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.XYChart<X, Y>.verticalGridLinesVisible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("verticalGridLinesVisible", f, this, verticalGridLinesVisibleProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.XYChart<X, Y>.horizontalGridLinesVisible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("horizontalGridLinesVisible", f, this, horizontalGridLinesVisibleProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.XYChart<X, Y>.alternativeColumnFillVisible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("alternativeColumnFillVisible", f, this, alternativeColumnFillVisibleProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.XYChart<X, Y>.alternativeRowFillVisible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("alternativeRowFillVisible", f, this, alternativeRowFillVisibleProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.XYChart<X, Y>.verticalZeroLineVisible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("verticalZeroLineVisible", f, this, verticalZeroLineVisibleProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.XYChart<X, Y>.horizontalZeroLineVisible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("horizontalZeroLineVisible", f, this, horizontalZeroLineVisibleProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.Control

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Control.skin(f: (() -> javafx.scene.control.Skin<*>)? = null): javafx.scene.control.Skin<*> =
    template<javafx.scene.control.Skin<*>>("skin", f, this, skinProperty()!! as ObservableValue<javafx.scene.control.Skin<*>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Control.tooltip(f: (() -> javafx.scene.control.Tooltip)? = null): javafx.scene.control.Tooltip =
    template<javafx.scene.control.Tooltip>("tooltip", f, this, tooltipProperty()!! as ObservableValue<javafx.scene.control.Tooltip>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Control.contextMenu(f: (() -> javafx.scene.control.ContextMenu)? = null): javafx.scene.control.ContextMenu =
    template<javafx.scene.control.ContextMenu>("contextMenu", f, this, contextMenuProperty()!! as ObservableValue<javafx.scene.control.ContextMenu>)

// javafx.scene.effect.ImageInput

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.ImageInput.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.ImageInput.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.ImageInput.source(f: (() -> javafx.scene.image.Image)? = null): javafx.scene.image.Image =
    template<javafx.scene.image.Image>("source", f, this, sourceProperty()!! as ObservableValue<javafx.scene.image.Image>)

// javafx.scene.control.cell.CheckBoxTreeTableCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.cell.CheckBoxTreeTableCell<S, T>.selectedStateCallback(f: (() -> javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>>)? = null): javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>> =
    template<javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>>>("selectedStateCallback", f, this, selectedStateCallbackProperty()!! as ObservableValue<javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.cell.CheckBoxTreeTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.effect.PerspectiveTransform

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.PerspectiveTransform.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.PerspectiveTransform.uly(f: (() -> Double)? = null): Double =
    template<Double>("uly", f, this, ulyProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.PerspectiveTransform.ulx(f: (() -> Double)? = null): Double =
    template<Double>("ulx", f, this, ulxProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.PerspectiveTransform.lly(f: (() -> Double)? = null): Double =
    template<Double>("lly", f, this, llyProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.PerspectiveTransform.llx(f: (() -> Double)? = null): Double =
    template<Double>("llx", f, this, llxProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.PerspectiveTransform.lry(f: (() -> Double)? = null): Double =
    template<Double>("lry", f, this, lryProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.PerspectiveTransform.lrx(f: (() -> Double)? = null): Double =
    template<Double>("lrx", f, this, lrxProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.PerspectiveTransform.ury(f: (() -> Double)? = null): Double =
    template<Double>("ury", f, this, uryProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.PerspectiveTransform.urx(f: (() -> Double)? = null): Double =
    template<Double>("urx", f, this, urxProperty()!! as ObservableValue<Double>)

// javafx.scene.shape.HLineTo

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.HLineTo.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

// javafx.scene.layout.StackPane

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.StackPane.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
    template<javafx.geometry.Pos>("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

// javafx.beans.property.ReadOnlyFloatWrapper

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.beans.property.ReadOnlyFloatWrapper.getReadOnly(f: (() -> Float)? = null): Float =
    template<Float>("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<Float>)

// javafx.scene.media.AudioClip

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.AudioClip.volume(f: (() -> Double)? = null): Double =
    template<Double>("volume", f, this, volumeProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.AudioClip.balance(f: (() -> Double)? = null): Double =
    template<Double>("balance", f, this, balanceProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.AudioClip.rate(f: (() -> Double)? = null): Double =
    template<Double>("rate", f, this, rateProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.AudioClip.cycleCount(f: (() -> Int)? = null): Int =
    template<Int>("cycleCount", f, this, cycleCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.AudioClip.priority(f: (() -> Int)? = null): Int =
    template<Int>("priority", f, this, priorityProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.AudioClip.pan(f: (() -> Double)? = null): Double =
    template<Double>("pan", f, this, panProperty()!! as ObservableValue<Double>)

// javafx.scene.effect.Lighting

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Lighting.specularExponent(f: (() -> Double)? = null): Double =
    template<Double>("specularExponent", f, this, specularExponentProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Lighting.diffuseConstant(f: (() -> Double)? = null): Double =
    template<Double>("diffuseConstant", f, this, diffuseConstantProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Lighting.light(f: (() -> javafx.scene.effect.Light)? = null): javafx.scene.effect.Light =
    template<javafx.scene.effect.Light>("light", f, this, lightProperty()!! as ObservableValue<javafx.scene.effect.Light>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Lighting.bumpInput(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("bumpInput", f, this, bumpInputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Lighting.contentInput(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("contentInput", f, this, contentInputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Lighting.surfaceScale(f: (() -> Double)? = null): Double =
    template<Double>("surfaceScale", f, this, surfaceScaleProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Lighting.specularConstant(f: (() -> Double)? = null): Double =
    template<Double>("specularConstant", f, this, specularConstantProperty()!! as ObservableValue<Double>)

// javafx.scene.chart.PieChart

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.PieChart.data(f: (() -> javafx.collections.ObservableList<javafx.scene.chart.PieChart.Data>)? = null): javafx.collections.ObservableList<javafx.scene.chart.PieChart.Data> =
    template<javafx.collections.ObservableList<javafx.scene.chart.PieChart.Data>>("data", f, this, dataProperty()!! as ObservableValue<javafx.collections.ObservableList<javafx.scene.chart.PieChart.Data>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.PieChart.startAngle(f: (() -> Double)? = null): Double =
    template<Double>("startAngle", f, this, startAngleProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.PieChart.clockwise(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("clockwise", f, this, clockwiseProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.PieChart.labelLineLength(f: (() -> Double)? = null): Double =
    template<Double>("labelLineLength", f, this, labelLineLengthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.PieChart.labelsVisible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("labelsVisible", f, this, labelsVisibleProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.ComboBoxBase

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBoxBase<T>.editable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBoxBase<T>.value(f: (() -> T)? = null): T =
    template<T>("value", f, this, valueProperty()!! as ObservableValue<T>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBoxBase<T>.armed(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("armed", f, this, armedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBoxBase<T>.onAction(f: (() -> javafx.event.EventHandler<javafx.event.ActionEvent>)? = null): javafx.event.EventHandler<javafx.event.ActionEvent> =
    template<javafx.event.EventHandler<javafx.event.ActionEvent>>("onAction", f, this, onActionProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.ActionEvent>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBoxBase<T>.promptText(f: (() -> String)? = null): String =
    template<String>("promptText", f, this, promptTextProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBoxBase<T>.showing(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("showing", f, this, showingProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBoxBase<T>.onShowing(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
    template<javafx.event.EventHandler<javafx.event.Event>>("onShowing", f, this, onShowingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBoxBase<T>.onShown(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
    template<javafx.event.EventHandler<javafx.event.Event>>("onShown", f, this, onShownProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBoxBase<T>.onHiding(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
    template<javafx.event.EventHandler<javafx.event.Event>>("onHiding", f, this, onHidingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.ComboBoxBase<T>.onHidden(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
    template<javafx.event.EventHandler<javafx.event.Event>>("onHidden", f, this, onHiddenProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

// javafx.scene.control.cell.CheckBoxListCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.cell.CheckBoxListCell<T>.selectedStateCallback(f: (() -> javafx.util.Callback<T, javafx.beans.value.ObservableValue<Boolean>>)? = null): javafx.util.Callback<T, javafx.beans.value.ObservableValue<Boolean>> =
    template<javafx.util.Callback<T, javafx.beans.value.ObservableValue<Boolean>>>("selectedStateCallback", f, this, selectedStateCallbackProperty()!! as ObservableValue<javafx.util.Callback<T, javafx.beans.value.ObservableValue<Boolean>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.cell.CheckBoxListCell<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.control.TableRow

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TableRow<T>.tableView(f: (() -> javafx.scene.control.TableView<T>)? = null): javafx.scene.control.TableView<T> =
    template<javafx.scene.control.TableView<T>>("tableView", f, this, tableViewProperty()!! as ObservableValue<javafx.scene.control.TableView<T>>)

// javafx.scene.control.CheckBoxTreeItem

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.CheckBoxTreeItem<T>.selected(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.CheckBoxTreeItem<T>.indeterminate(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("indeterminate", f, this, indeterminateProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.CheckBoxTreeItem<T>.independent(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("independent", f, this, independentProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.FocusModel

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.FocusModel<T>.focusedIndex(f: (() -> Int)? = null): Int =
    template<Int>("focusedIndex", f, this, focusedIndexProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.FocusModel<T>.focusedItem(f: (() -> T)? = null): T =
    template<T>("focusedItem", f, this, focusedItemProperty()!! as ObservableValue<T>)

// javafx.scene.chart.NumberAxis

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.NumberAxis.forceZeroInRange(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("forceZeroInRange", f, this, forceZeroInRangeProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.NumberAxis.tickUnit(f: (() -> Double)? = null): Double =
    template<Double>("tickUnit", f, this, tickUnitProperty()!! as ObservableValue<Double>)

// javafx.scene.chart.AreaChart

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.AreaChart<X, Y>.createSymbols(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("createSymbols", f, this, createSymbolsProperty()!! as ObservableValue<Boolean>)

// javafx.stage.DirectoryChooser

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.DirectoryChooser.title(f: (() -> String)? = null): String =
    template<String>("title", f, this, titleProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.DirectoryChooser.initialDirectory(f: (() -> java.io.File)? = null): java.io.File =
    template<java.io.File>("initialDirectory", f, this, initialDirectoryProperty()!! as ObservableValue<java.io.File>)

// javafx.stage.PopupWindow

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.PopupWindow.ownerWindow(f: (() -> javafx.stage.Window)? = null): javafx.stage.Window =
    template<javafx.stage.Window>("ownerWindow", f, this, ownerWindowProperty()!! as ObservableValue<javafx.stage.Window>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.PopupWindow.ownerNode(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("ownerNode", f, this, ownerNodeProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.PopupWindow.autoFix(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("autoFix", f, this, autoFixProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.PopupWindow.autoHide(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("autoHide", f, this, autoHideProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.PopupWindow.onAutoHide(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
    template<javafx.event.EventHandler<javafx.event.Event>>("onAutoHide", f, this, onAutoHideProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.PopupWindow.hideOnEscape(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("hideOnEscape", f, this, hideOnEscapeProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.PopupWindow.consumeAutoHidingEvents(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("consumeAutoHidingEvents", f, this, consumeAutoHidingEventsProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.PopupWindow.anchorX(f: (() -> Double)? = null): Double =
    template<Double>("anchorX", f, this, anchorXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.PopupWindow.anchorY(f: (() -> Double)? = null): Double =
    template<Double>("anchorY", f, this, anchorYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.stage.PopupWindow.anchorLocation(f: (() -> javafx.stage.PopupWindow.AnchorLocation)? = null): javafx.stage.PopupWindow.AnchorLocation =
    template<javafx.stage.PopupWindow.AnchorLocation>("anchorLocation", f, this, anchorLocationProperty()!! as ObservableValue<javafx.stage.PopupWindow.AnchorLocation>)

// javafx.scene.control.RadioMenuItem

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.RadioMenuItem.selected(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.RadioMenuItem.toggleGroup(f: (() -> javafx.scene.control.ToggleGroup)? = null): javafx.scene.control.ToggleGroup =
    template<javafx.scene.control.ToggleGroup>("toggleGroup", f, this, toggleGroupProperty()!! as ObservableValue<javafx.scene.control.ToggleGroup>)

// javafx.print.PrinterJob

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.print.PrinterJob.printer(f: (() -> javafx.print.Printer)? = null): javafx.print.Printer =
    template<javafx.print.Printer>("printer", f, this, printerProperty()!! as ObservableValue<javafx.print.Printer>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.print.PrinterJob.jobStatus(f: (() -> javafx.print.PrinterJob.JobStatus)? = null): javafx.print.PrinterJob.JobStatus =
    template<javafx.print.PrinterJob.JobStatus>("jobStatus", f, this, jobStatusProperty()!! as ObservableValue<javafx.print.PrinterJob.JobStatus>)

// javafx.scene.control.Slider

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Slider.blockIncrement(f: (() -> Double)? = null): Double =
    template<Double>("blockIncrement", f, this, blockIncrementProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Slider.value(f: (() -> Double)? = null): Double =
    template<Double>("value", f, this, valueProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Slider.showTickMarks(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("showTickMarks", f, this, showTickMarksProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Slider.showTickLabels(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("showTickLabels", f, this, showTickLabelsProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Slider.minorTickCount(f: (() -> Int)? = null): Int =
    template<Int>("minorTickCount", f, this, minorTickCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Slider.snapToTicks(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("snapToTicks", f, this, snapToTicksProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Slider.majorTickUnit(f: (() -> Double)? = null): Double =
    template<Double>("majorTickUnit", f, this, majorTickUnitProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Slider.valueChanging(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("valueChanging", f, this, valueChangingProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Slider.labelFormatter(f: (() -> javafx.util.StringConverter<Double>)? = null): javafx.util.StringConverter<Double> =
    template<javafx.util.StringConverter<Double>>("labelFormatter", f, this, labelFormatterProperty()!! as ObservableValue<javafx.util.StringConverter<Double>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Slider.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
    template<javafx.geometry.Orientation>("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Slider.min(f: (() -> Double)? = null): Double =
    template<Double>("min", f, this, minProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Slider.max(f: (() -> Double)? = null): Double =
    template<Double>("max", f, this, maxProperty()!! as ObservableValue<Double>)

// javafx.scene.control.MenuButton

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.MenuButton.popupSide(f: (() -> javafx.geometry.Side)? = null): javafx.geometry.Side =
    template<javafx.geometry.Side>("popupSide", f, this, popupSideProperty()!! as ObservableValue<javafx.geometry.Side>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.MenuButton.showing(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("showing", f, this, showingProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.Separator

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Separator.halignment(f: (() -> javafx.geometry.HPos)? = null): javafx.geometry.HPos =
    template<javafx.geometry.HPos>("halignment", f, this, halignmentProperty()!! as ObservableValue<javafx.geometry.HPos>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Separator.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
    template<javafx.geometry.Orientation>("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Separator.valignment(f: (() -> javafx.geometry.VPos)? = null): javafx.geometry.VPos =
    template<javafx.geometry.VPos>("valignment", f, this, valignmentProperty()!! as ObservableValue<javafx.geometry.VPos>)

// javafx.scene.chart.PieChart.Data

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.PieChart.Data.chart(f: (() -> javafx.scene.chart.PieChart)? = null): javafx.scene.chart.PieChart =
    template<javafx.scene.chart.PieChart>("chart", f, this, chartProperty()!! as ObservableValue<javafx.scene.chart.PieChart>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.PieChart.Data.name(f: (() -> String)? = null): String =
    template<String>("name", f, this, nameProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.PieChart.Data.pieValue(f: (() -> Double)? = null): Double =
    template<Double>("pieValue", f, this, pieValueProperty()!! as ObservableValue<Double>)

// javafx.beans.property.ReadOnlyStringWrapper

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.beans.property.ReadOnlyStringWrapper.getReadOnly(f: (() -> String)? = null): String =
    template<String>("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<String>)

// javafx.scene.control.TextInputControl

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextInputControl.editable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextInputControl.text(f: (() -> String)? = null): String =
    template<String>("text", f, this, textProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextInputControl.font(f: (() -> javafx.scene.text.Font)? = null): javafx.scene.text.Font =
    template<javafx.scene.text.Font>("font", f, this, fontProperty()!! as ObservableValue<javafx.scene.text.Font>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextInputControl.promptText(f: (() -> String)? = null): String =
    template<String>("promptText", f, this, promptTextProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextInputControl.length(f: (() -> Int)? = null): Int =
    template<Int>("length", f, this, lengthProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextInputControl.selection(f: (() -> javafx.scene.control.IndexRange)? = null): javafx.scene.control.IndexRange =
    template<javafx.scene.control.IndexRange>("selection", f, this, selectionProperty()!! as ObservableValue<javafx.scene.control.IndexRange>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextInputControl.selectedText(f: (() -> String)? = null): String =
    template<String>("selectedText", f, this, selectedTextProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextInputControl.anchor(f: (() -> Int)? = null): Int =
    template<Int>("anchor", f, this, anchorProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextInputControl.caretPosition(f: (() -> Int)? = null): Int =
    template<Int>("caretPosition", f, this, caretPositionProperty()!! as ObservableValue<Int>)

// javafx.scene.control.Cell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.Cell<T>.item(f: (() -> T)? = null): T =
    template<T>("item", f, this, itemProperty()!! as ObservableValue<T>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.Cell<T>.selected(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.Cell<T>.editing(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("editing", f, this, editingProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.Cell<T>.editable(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.Cell<T>.empty(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.TableColumn

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumn<S, T>.cellFactory(f: (() -> javafx.util.Callback<javafx.scene.control.TableColumn<S, T>, javafx.scene.control.TableCell<S, T>>)? = null): javafx.util.Callback<javafx.scene.control.TableColumn<S, T>, javafx.scene.control.TableCell<S, T>> =
    template<javafx.util.Callback<javafx.scene.control.TableColumn<S, T>, javafx.scene.control.TableCell<S, T>>>("cellFactory", f, this, cellFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TableColumn<S, T>, javafx.scene.control.TableCell<S, T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumn<S, T>.onEditStart(f: (() -> javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>> =
    template<javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>>("onEditStart", f, this, onEditStartProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumn<S, T>.onEditCommit(f: (() -> javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>> =
    template<javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>>("onEditCommit", f, this, onEditCommitProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumn<S, T>.onEditCancel(f: (() -> javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>> =
    template<javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>>("onEditCancel", f, this, onEditCancelProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumn<S, T>.cellValueFactory(f: (() -> javafx.util.Callback<javafx.scene.control.TableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>>)? = null): javafx.util.Callback<javafx.scene.control.TableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>> =
    template<javafx.util.Callback<javafx.scene.control.TableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>>>("cellValueFactory", f, this, cellValueFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumn<S, T>.sortType(f: (() -> javafx.scene.control.TableColumn.SortType)? = null): javafx.scene.control.TableColumn.SortType =
    template<javafx.scene.control.TableColumn.SortType>("sortType", f, this, sortTypeProperty()!! as ObservableValue<javafx.scene.control.TableColumn.SortType>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.TableColumn<S, T>.tableView(f: (() -> javafx.scene.control.TableView<S>)? = null): javafx.scene.control.TableView<S> =
    template<javafx.scene.control.TableView<S>>("tableView", f, this, tableViewProperty()!! as ObservableValue<javafx.scene.control.TableView<S>>)

// javafx.scene.control.TreeItem

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeItem<T>.parent(f: (() -> javafx.scene.control.TreeItem<T>)? = null): javafx.scene.control.TreeItem<T> =
    template<javafx.scene.control.TreeItem<T>>("parent", f, this, parentProperty()!! as ObservableValue<javafx.scene.control.TreeItem<T>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeItem<T>.graphic(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("graphic", f, this, graphicProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeItem<T>.value(f: (() -> T)? = null): T =
    template<T>("value", f, this, valueProperty()!! as ObservableValue<T>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeItem<T>.expanded(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("expanded", f, this, expandedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.TreeItem<T>.leaf(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("leaf", f, this, leafProperty()!! as ObservableValue<Boolean>)

// javafx.scene.shape.Arc

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Arc.typ(f: (() -> javafx.scene.shape.ArcType)? = null): javafx.scene.shape.ArcType =
    template<javafx.scene.shape.ArcType>("typ", f, this, typeProperty()!! as ObservableValue<javafx.scene.shape.ArcType>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Arc.centerX(f: (() -> Double)? = null): Double =
    template<Double>("centerX", f, this, centerXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Arc.centerY(f: (() -> Double)? = null): Double =
    template<Double>("centerY", f, this, centerYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Arc.radiusX(f: (() -> Double)? = null): Double =
    template<Double>("radiusX", f, this, radiusXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Arc.radiusY(f: (() -> Double)? = null): Double =
    template<Double>("radiusY", f, this, radiusYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Arc.startAngle(f: (() -> Double)? = null): Double =
    template<Double>("startAngle", f, this, startAngleProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Arc.length(f: (() -> Double)? = null): Double =
    template<Double>("length", f, this, lengthProperty()!! as ObservableValue<Double>)

// javafx.scene.control.TreeTableView.TreeTableViewFocusModel

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S> javafx.scene.control.TreeTableView.TreeTableViewFocusModel<S>.focusedCell(f: (() -> javafx.scene.control.TreeTablePosition<S, *>)? = null): javafx.scene.control.TreeTablePosition<S, *> =
    template<javafx.scene.control.TreeTablePosition<S, *>>("focusedCell", f, this, focusedCellProperty()!! as ObservableValue<javafx.scene.control.TreeTablePosition<S, *>>)

// javafx.scene.shape.PathElement

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.PathElement.absolute(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("absolute", f, this, absoluteProperty()!! as ObservableValue<Boolean>)

// javafx.scene.transform.Scale

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Scale.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Scale.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Scale.pivotX(f: (() -> Double)? = null): Double =
    template<Double>("pivotX", f, this, pivotXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Scale.pivotY(f: (() -> Double)? = null): Double =
    template<Double>("pivotY", f, this, pivotYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Scale.pivotZ(f: (() -> Double)? = null): Double =
    template<Double>("pivotZ", f, this, pivotZProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.transform.Scale.z(f: (() -> Double)? = null): Double =
    template<Double>("z", f, this, zProperty()!! as ObservableValue<Double>)

// javafx.scene.chart.XYChart.Series

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
    template<javafx.scene.Node>("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.chart(f: (() -> javafx.scene.chart.XYChart<X, Y>)? = null): javafx.scene.chart.XYChart<X, Y> =
    template<javafx.scene.chart.XYChart<X, Y>>("chart", f, this, chartProperty()!! as ObservableValue<javafx.scene.chart.XYChart<X, Y>>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.name(f: (() -> String)? = null): String =
    template<String>("name", f, this, nameProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.data(f: (() -> javafx.collections.ObservableList<javafx.scene.chart.XYChart.Data<X, Y>>)? = null): javafx.collections.ObservableList<javafx.scene.chart.XYChart.Data<X, Y>> =
    template<javafx.collections.ObservableList<javafx.scene.chart.XYChart.Data<X, Y>>>("data", f, this, dataProperty()!! as ObservableValue<javafx.collections.ObservableList<javafx.scene.chart.XYChart.Data<X, Y>>>)

// javafx.beans.property.ReadOnlyIntegerWrapper

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.beans.property.ReadOnlyIntegerWrapper.getReadOnly(f: (() -> Int)? = null): Int =
    template<Int>("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<Int>)

// javafx.scene.layout.TilePane

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.TilePane.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
    template<javafx.geometry.Pos>("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.TilePane.hgap(f: (() -> Double)? = null): Double =
    template<Double>("hgap", f, this, hgapProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.TilePane.prefColumns(f: (() -> Int)? = null): Int =
    template<Int>("prefColumns", f, this, prefColumnsProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.TilePane.tileAlignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
    template<javafx.geometry.Pos>("tileAlignment", f, this, tileAlignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.TilePane.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
    template<javafx.geometry.Orientation>("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.TilePane.vgap(f: (() -> Double)? = null): Double =
    template<Double>("vgap", f, this, vgapProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.TilePane.tileWidth(f: (() -> Double)? = null): Double =
    template<Double>("tileWidth", f, this, tileWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.TilePane.prefTileHeight(f: (() -> Double)? = null): Double =
    template<Double>("prefTileHeight", f, this, prefTileHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.TilePane.prefRows(f: (() -> Int)? = null): Int =
    template<Int>("prefRows", f, this, prefRowsProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.TilePane.tileHeight(f: (() -> Double)? = null): Double =
    template<Double>("tileHeight", f, this, tileHeightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.TilePane.prefTileWidth(f: (() -> Double)? = null): Double =
    template<Double>("prefTileWidth", f, this, prefTileWidthProperty()!! as ObservableValue<Double>)

// javafx.scene.control.TextArea

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextArea.prefColumnCount(f: (() -> Int)? = null): Int =
    template<Int>("prefColumnCount", f, this, prefColumnCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextArea.wrapText(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("wrapText", f, this, wrapTextProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextArea.prefRowCount(f: (() -> Int)? = null): Int =
    template<Int>("prefRowCount", f, this, prefRowCountProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextArea.scrollTop(f: (() -> Double)? = null): Double =
    template<Double>("scrollTop", f, this, scrollTopProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.TextArea.scrollLeft(f: (() -> Double)? = null): Double =
    template<Double>("scrollLeft", f, this, scrollLeftProperty()!! as ObservableValue<Double>)

// javafx.scene.shape.CubicCurveTo

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.CubicCurveTo.controlY2(f: (() -> Double)? = null): Double =
    template<Double>("controlY2", f, this, controlY2Property()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.CubicCurveTo.controlX2(f: (() -> Double)? = null): Double =
    template<Double>("controlX2", f, this, controlX2Property()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.CubicCurveTo.y(f: (() -> Double)? = null): Double =
    template<Double>("y", f, this, yProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.CubicCurveTo.x(f: (() -> Double)? = null): Double =
    template<Double>("x", f, this, xProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.CubicCurveTo.controlY1(f: (() -> Double)? = null): Double =
    template<Double>("controlY1", f, this, controlY1Property()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.CubicCurveTo.controlX1(f: (() -> Double)? = null): Double =
    template<Double>("controlX1", f, this, controlX1Property()!! as ObservableValue<Double>)

// javafx.scene.control.cell.TextFieldTreeCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.cell.TextFieldTreeCell<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.effect.InnerShadow

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.InnerShadow.width(f: (() -> Double)? = null): Double =
    template<Double>("width", f, this, widthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.InnerShadow.height(f: (() -> Double)? = null): Double =
    template<Double>("height", f, this, heightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.InnerShadow.color(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
    template<javafx.scene.paint.Color>("color", f, this, colorProperty()!! as ObservableValue<javafx.scene.paint.Color>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.InnerShadow.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.InnerShadow.radius(f: (() -> Double)? = null): Double =
    template<Double>("radius", f, this, radiusProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.InnerShadow.blurType(f: (() -> javafx.scene.effect.BlurType)? = null): javafx.scene.effect.BlurType =
    template<javafx.scene.effect.BlurType>("blurType", f, this, blurTypeProperty()!! as ObservableValue<javafx.scene.effect.BlurType>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.InnerShadow.offsetX(f: (() -> Double)? = null): Double =
    template<Double>("offsetX", f, this, offsetXProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.InnerShadow.offsetY(f: (() -> Double)? = null): Double =
    template<Double>("offsetY", f, this, offsetYProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.InnerShadow.choke(f: (() -> Double)? = null): Double =
    template<Double>("choke", f, this, chokeProperty()!! as ObservableValue<Double>)

// javafx.scene.control.SelectionModel

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.SelectionModel<T>.selectedIndex(f: (() -> Int)? = null): Int =
    template<Int>("selectedIndex", f, this, selectedIndexProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.scene.control.SelectionModel<T>.selectedItem(f: (() -> T)? = null): T =
    template<T>("selectedItem", f, this, selectedItemProperty()!! as ObservableValue<T>)

// javafx.scene.control.Toggle

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Toggle.selected(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.Toggle.toggleGroup(f: (() -> javafx.scene.control.ToggleGroup)? = null): javafx.scene.control.ToggleGroup =
    template<javafx.scene.control.ToggleGroup>("toggleGroup", f, this, toggleGroupProperty()!! as ObservableValue<javafx.scene.control.ToggleGroup>)

// javafx.scene.chart.Chart

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.Chart.title(f: (() -> String)? = null): String =
    template<String>("title", f, this, titleProperty()!! as ObservableValue<String>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.Chart.titleSide(f: (() -> javafx.geometry.Side)? = null): javafx.geometry.Side =
    template<javafx.geometry.Side>("titleSide", f, this, titleSideProperty()!! as ObservableValue<javafx.geometry.Side>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.Chart.legendVisible(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("legendVisible", f, this, legendVisibleProperty()!! as ObservableValue<Boolean>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.Chart.legendSide(f: (() -> javafx.geometry.Side)? = null): javafx.geometry.Side =
    template<javafx.geometry.Side>("legendSide", f, this, legendSideProperty()!! as ObservableValue<javafx.geometry.Side>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.chart.Chart.animated(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("animated", f, this, animatedProperty()!! as ObservableValue<Boolean>)

// javafx.scene.web.WebHistory

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebHistory.currentIndex(f: (() -> Int)? = null): Int =
    template<Int>("currentIndex", f, this, currentIndexProperty()!! as ObservableValue<Int>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.web.WebHistory.maxSize(f: (() -> Int)? = null): Int =
    template<Int>("maxSize", f, this, maxSizeProperty()!! as ObservableValue<Int>)

// javafx.beans.property.ReadOnlyObjectWrapper

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <T> javafx.beans.property.ReadOnlyObjectWrapper<T>.getReadOnly(f: (() -> T)? = null): T =
    template<T>("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<T>)

// javafx.scene.layout.ColumnConstraints

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.ColumnConstraints.minWidth(f: (() -> Double)? = null): Double =
    template<Double>("minWidth", f, this, minWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.ColumnConstraints.prefWidth(f: (() -> Double)? = null): Double =
    template<Double>("prefWidth", f, this, prefWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.ColumnConstraints.maxWidth(f: (() -> Double)? = null): Double =
    template<Double>("maxWidth", f, this, maxWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.ColumnConstraints.percentWidth(f: (() -> Double)? = null): Double =
    template<Double>("percentWidth", f, this, percentWidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.ColumnConstraints.hgrow(f: (() -> javafx.scene.layout.Priority)? = null): javafx.scene.layout.Priority =
    template<javafx.scene.layout.Priority>("hgrow", f, this, hgrowProperty()!! as ObservableValue<javafx.scene.layout.Priority>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.ColumnConstraints.halignment(f: (() -> javafx.geometry.HPos)? = null): javafx.geometry.HPos =
    template<javafx.geometry.HPos>("halignment", f, this, halignmentProperty()!! as ObservableValue<javafx.geometry.HPos>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.layout.ColumnConstraints.fillWidth(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("fillWidth", f, this, fillWidthProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.ProgressIndicator

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ProgressIndicator.progress(f: (() -> Double)? = null): Double =
    template<Double>("progress", f, this, progressProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.control.ProgressIndicator.indeterminate(f: (() -> Boolean)? = null): Boolean =
    template<Boolean>("indeterminate", f, this, indeterminateProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.cell.TextFieldTreeTableCell

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun <S, T> javafx.scene.control.cell.TextFieldTreeTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
    template<javafx.util.StringConverter<T>>("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.shape.Box

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Box.width(f: (() -> Double)? = null): Double =
    template<Double>("width", f, this, widthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Box.height(f: (() -> Double)? = null): Double =
    template<Double>("height", f, this, heightProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.shape.Box.depth(f: (() -> Double)? = null): Double =
    template<Double>("depth", f, this, depthProperty()!! as ObservableValue<Double>)

// javafx.scene.media.EqualizerBand

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.EqualizerBand.gain(f: (() -> Double)? = null): Double =
    template<Double>("gain", f, this, gainProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.EqualizerBand.bandwidth(f: (() -> Double)? = null): Double =
    template<Double>("bandwidth", f, this, bandwidthProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.media.EqualizerBand.centerFrequency(f: (() -> Double)? = null): Double =
    template<Double>("centerFrequency", f, this, centerFrequencyProperty()!! as ObservableValue<Double>)

// javafx.scene.effect.Blend

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Blend.opacity(f: (() -> Double)? = null): Double =
    template<Double>("opacity", f, this, opacityProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Blend.mode(f: (() -> javafx.scene.effect.BlendMode)? = null): javafx.scene.effect.BlendMode =
    template<javafx.scene.effect.BlendMode>("mode", f, this, modeProperty()!! as ObservableValue<javafx.scene.effect.BlendMode>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Blend.bottomInput(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("bottomInput", f, this, bottomInputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.Blend.topInput(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("topInput", f, this, topInputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

// javafx.scene.effect.MotionBlur

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.MotionBlur.angle(f: (() -> Double)? = null): Double =
    template<Double>("angle", f, this, angleProperty()!! as ObservableValue<Double>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.MotionBlur.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
    template<javafx.scene.effect.Effect>("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

[suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE")] [suppress("UNCHECKED_CAST")]
public fun  javafx.scene.effect.MotionBlur.radius(f: (() -> Double)? = null): Double =
    template<Double>("radius", f, this, radiusProperty()!! as ObservableValue<Double>)
