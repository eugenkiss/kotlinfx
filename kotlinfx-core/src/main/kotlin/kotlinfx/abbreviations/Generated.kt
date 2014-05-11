package kotlinfx.abbreviations


// javafx.scene.control.cell.ComboBoxTableCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.cell.ComboBoxTableCell<S, T>.comboBoxEditablep: javafx.beans.property.BooleanProperty
    get() = comboBoxEditableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.cell.ComboBoxTableCell<S, T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

// javafx.animation.RotateTransition

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.RotateTransition.nodep: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = nodeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.RotateTransition.durationp: javafx.beans.property.ObjectProperty<javafx.util.Duration>
    get() = durationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.RotateTransition.axisp: javafx.beans.property.ObjectProperty<javafx.geometry.Point3D>
    get() = axisProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.RotateTransition.fromAnglep: javafx.beans.property.DoubleProperty
    get() = fromAngleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.RotateTransition.toAnglep: javafx.beans.property.DoubleProperty
    get() = toAngleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.RotateTransition.byAnglep: javafx.beans.property.DoubleProperty
    get() = byAngleProperty()!!

// javafx.scene.control.cell.CheckBoxTreeCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.cell.CheckBoxTreeCell<T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<javafx.scene.control.TreeItem<T>>>
    get() = converterProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.cell.CheckBoxTreeCell<T>.selectedStateCallbackp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.beans.value.ObservableValue<Boolean>>>
    get() = selectedStateCallbackProperty()!!

// javafx.scene.control.TreeTableCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TreeTableCell<S, T>.tableColumnp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TreeTableColumn<S, T>>
    get() = tableColumnProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TreeTableCell<S, T>.treeTableViewp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TreeTableView<S>>
    get() = treeTableViewProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TreeTableCell<S, T>.tableRowp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TreeTableRow<S>>
    get() = tableRowProperty()!!

// javafx.scene.control.ChoiceBox

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ChoiceBox<T>.selectionModelp: javafx.beans.property.ObjectProperty<javafx.scene.control.SingleSelectionModel<T>>
    get() = selectionModelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ChoiceBox<T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ChoiceBox<T>.valuep: javafx.beans.property.ObjectProperty<T>
    get() = valueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ChoiceBox<T>.itemsp: javafx.beans.property.ObjectProperty<javafx.collections.ObservableList<T>>
    get() = itemsProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ChoiceBox<T>.showingp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = showingProperty()!!

// javafx.scene.layout.RowConstraints

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.RowConstraints.minHeightp: javafx.beans.property.DoubleProperty
    get() = minHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.RowConstraints.prefHeightp: javafx.beans.property.DoubleProperty
    get() = prefHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.RowConstraints.maxHeightp: javafx.beans.property.DoubleProperty
    get() = maxHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.RowConstraints.percentHeightp: javafx.beans.property.DoubleProperty
    get() = percentHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.RowConstraints.vgrowp: javafx.beans.property.ObjectProperty<javafx.scene.layout.Priority>
    get() = vgrowProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.RowConstraints.valignmentp: javafx.beans.property.ObjectProperty<javafx.geometry.VPos>
    get() = valignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.RowConstraints.fillHeightp: javafx.beans.property.BooleanProperty
    get() = fillHeightProperty()!!

// javafx.scene.LightBase

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.LightBase.colorp: javafx.beans.property.ObjectProperty<javafx.scene.paint.Color>
    get() = colorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.LightBase.lightOnp: javafx.beans.property.BooleanProperty
    get() = lightOnProperty()!!

// javafx.print.JobSettings

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.print.JobSettings.jobNamep: javafx.beans.property.StringProperty
    get() = jobNameProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.print.JobSettings.copiesp: javafx.beans.property.IntegerProperty
    get() = copiesProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.print.JobSettings.printSidesp: javafx.beans.property.ObjectProperty<javafx.print.PrintSides>
    get() = printSidesProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.print.JobSettings.collationp: javafx.beans.property.ObjectProperty<javafx.print.Collation>
    get() = collationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.print.JobSettings.printColorp: javafx.beans.property.ObjectProperty<javafx.print.PrintColor>
    get() = printColorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.print.JobSettings.printQualityp: javafx.beans.property.ObjectProperty<javafx.print.PrintQuality>
    get() = printQualityProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.print.JobSettings.printResolutionp: javafx.beans.property.ObjectProperty<javafx.print.PrintResolution>
    get() = printResolutionProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.print.JobSettings.paperSourcep: javafx.beans.property.ObjectProperty<javafx.print.PaperSource>
    get() = paperSourceProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.print.JobSettings.pageLayoutp: javafx.beans.property.ObjectProperty<javafx.print.PageLayout>
    get() = pageLayoutProperty()!!

// javafx.scene.control.TreeView

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeView<T>.onScrollTop: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>
    get() = onScrollToProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeView<T>.selectionModelp: javafx.beans.property.ObjectProperty<javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>>>
    get() = selectionModelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeView<T>.focusModelp: javafx.beans.property.ObjectProperty<javafx.scene.control.FocusModel<javafx.scene.control.TreeItem<T>>>
    get() = focusModelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeView<T>.cellFactoryp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.scene.control.TreeView<T>, javafx.scene.control.TreeCell<T>>>
    get() = cellFactoryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeView<T>.onEditStartp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>>
    get() = onEditStartProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeView<T>.onEditCommitp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>>
    get() = onEditCommitProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeView<T>.onEditCancelp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>>
    get() = onEditCancelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeView<T>.showRootp: javafx.beans.property.BooleanProperty
    get() = showRootProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeView<T>.expandedItemCountp: javafx.beans.property.ReadOnlyIntegerProperty
    get() = expandedItemCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeView<T>.editingItemp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TreeItem<T>>
    get() = editingItemProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeView<T>.editablep: javafx.beans.property.BooleanProperty
    get() = editableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeView<T>.fixedCellSizep: javafx.beans.property.DoubleProperty
    get() = fixedCellSizeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeView<T>.rootp: javafx.beans.property.ObjectProperty<javafx.scene.control.TreeItem<T>>
    get() = rootProperty()!!

// javafx.scene.effect.FloatMap

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.FloatMap.widthp: javafx.beans.property.IntegerProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.FloatMap.heightp: javafx.beans.property.IntegerProperty
    get() = heightProperty()!!

// javafx.scene.control.Tooltip

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tooltip.activatedp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = activatedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tooltip.textp: javafx.beans.property.StringProperty
    get() = textProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tooltip.textAlignmentp: javafx.beans.property.ObjectProperty<javafx.scene.text.TextAlignment>
    get() = textAlignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tooltip.textOverrunp: javafx.beans.property.ObjectProperty<javafx.scene.control.OverrunStyle>
    get() = textOverrunProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tooltip.wrapTextp: javafx.beans.property.BooleanProperty
    get() = wrapTextProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tooltip.fontp: javafx.beans.property.ObjectProperty<javafx.scene.text.Font>
    get() = fontProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tooltip.graphicp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = graphicProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tooltip.contentDisplayp: javafx.beans.property.ObjectProperty<javafx.scene.control.ContentDisplay>
    get() = contentDisplayProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tooltip.graphicTextGapp: javafx.beans.property.DoubleProperty
    get() = graphicTextGapProperty()!!

// javafx.beans.property.MapPropertyBase

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <K, V> javafx.beans.property.MapPropertyBase<K, V>.emptyp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = emptyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <K, V> javafx.beans.property.MapPropertyBase<K, V>.sizep: javafx.beans.property.ReadOnlyIntegerProperty
    get() = sizeProperty()!!

// javafx.scene.shape.QuadCurveTo

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.QuadCurveTo.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.QuadCurveTo.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.QuadCurveTo.controlXp: javafx.beans.property.DoubleProperty
    get() = controlXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.QuadCurveTo.controlYp: javafx.beans.property.DoubleProperty
    get() = controlYProperty()!!

// javafx.scene.effect.Light.Spot

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Light.Spot.specularExponentp: javafx.beans.property.DoubleProperty
    get() = specularExponentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Light.Spot.pointsAtZp: javafx.beans.property.DoubleProperty
    get() = pointsAtZProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Light.Spot.pointsAtXp: javafx.beans.property.DoubleProperty
    get() = pointsAtXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Light.Spot.pointsAtYp: javafx.beans.property.DoubleProperty
    get() = pointsAtYProperty()!!

// javafx.scene.control.TableColumnBase

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.idp: javafx.beans.property.StringProperty
    get() = idProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.stylep: javafx.beans.property.StringProperty
    get() = styleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.visiblep: javafx.beans.property.BooleanProperty
    get() = visibleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.parentColumnp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TableColumnBase<S, *>>
    get() = parentColumnProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.sortNodep: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = sortNodeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.resizablep: javafx.beans.property.BooleanProperty
    get() = resizableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.sortablep: javafx.beans.property.BooleanProperty
    get() = sortableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.editablep: javafx.beans.property.BooleanProperty
    get() = editableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.textp: javafx.beans.property.StringProperty
    get() = textProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.graphicp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = graphicProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.contextMenup: javafx.beans.property.ObjectProperty<javafx.scene.control.ContextMenu>
    get() = contextMenuProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.widthp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.minWidthp: javafx.beans.property.DoubleProperty
    get() = minWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.prefWidthp: javafx.beans.property.DoubleProperty
    get() = prefWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.maxWidthp: javafx.beans.property.DoubleProperty
    get() = maxWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.comparatorp: javafx.beans.property.ObjectProperty<java.util.Comparator<T>>
    get() = comparatorProperty()!!

// javafx.scene.control.ComboBox

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBox<T>.selectionModelp: javafx.beans.property.ObjectProperty<javafx.scene.control.SingleSelectionModel<T>>
    get() = selectionModelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBox<T>.placeholderp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = placeholderProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBox<T>.cellFactoryp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>>
    get() = cellFactoryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBox<T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBox<T>.buttonCellp: javafx.beans.property.ObjectProperty<javafx.scene.control.ListCell<T>>
    get() = buttonCellProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBox<T>.visibleRowCountp: javafx.beans.property.IntegerProperty
    get() = visibleRowCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBox<T>.editorp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TextField>
    get() = editorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBox<T>.itemsp: javafx.beans.property.ObjectProperty<javafx.collections.ObservableList<T>>
    get() = itemsProperty()!!

// javafx.scene.control.cell.CheckBoxTableCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.cell.CheckBoxTableCell<S, T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.cell.CheckBoxTableCell<S, T>.selectedStateCallbackp: javafx.beans.property.ObjectProperty<javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>>>
    get() = selectedStateCallbackProperty()!!

// javafx.scene.transform.Transform

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Transform.type2Dp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = type2DProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Transform.identityp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = identityProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Transform.onTransformChangedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.transform.TransformChangedEvent?>>
    get() = onTransformChangedProperty()!!

// javafx.scene.control.Accordion

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Accordion.expandedPanep: javafx.beans.property.ObjectProperty<javafx.scene.control.TitledPane>
    get() = expandedPaneProperty()!!

// javafx.scene.shape.Shape3D

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Shape3D.materialp: javafx.beans.property.ObjectProperty<javafx.scene.paint.Material>
    get() = materialProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Shape3D.drawModep: javafx.beans.property.ObjectProperty<javafx.scene.shape.DrawMode>
    get() = drawModeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Shape3D.cullFacep: javafx.beans.property.ObjectProperty<javafx.scene.shape.CullFace>
    get() = cullFaceProperty()!!

// javafx.scene.control.cell.TextFieldListCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.cell.TextFieldListCell<T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

// javafx.scene.control.DatePicker

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.DatePicker.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<java.time.LocalDate>>
    get() = converterProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.DatePicker.showWeekNumbersp: javafx.beans.property.BooleanProperty
    get() = showWeekNumbersProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.DatePicker.editorp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TextField>
    get() = editorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.DatePicker.dayCellFactoryp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.scene.control.DatePicker, javafx.scene.control.DateCell>>
    get() = dayCellFactoryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.DatePicker.chronologyp: javafx.beans.property.ObjectProperty<java.time.chrono.Chronology>
    get() = chronologyProperty()!!

// javafx.scene.effect.Reflection

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Reflection.topOffsetp: javafx.beans.property.DoubleProperty
    get() = topOffsetProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Reflection.topOpacityp: javafx.beans.property.DoubleProperty
    get() = topOpacityProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Reflection.bottomOpacityp: javafx.beans.property.DoubleProperty
    get() = bottomOpacityProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Reflection.fractionp: javafx.beans.property.DoubleProperty
    get() = fractionProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Reflection.inputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = inputProperty()!!

// javafx.scene.effect.Light

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Light.colorp: javafx.beans.property.ObjectProperty<javafx.scene.paint.Color>
    get() = colorProperty()!!

// javafx.animation.TranslateTransition

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.TranslateTransition.nodep: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = nodeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.TranslateTransition.durationp: javafx.beans.property.ObjectProperty<javafx.util.Duration>
    get() = durationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.TranslateTransition.fromXp: javafx.beans.property.DoubleProperty
    get() = fromXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.TranslateTransition.fromYp: javafx.beans.property.DoubleProperty
    get() = fromYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.TranslateTransition.fromZp: javafx.beans.property.DoubleProperty
    get() = fromZProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.TranslateTransition.toXp: javafx.beans.property.DoubleProperty
    get() = toXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.TranslateTransition.toYp: javafx.beans.property.DoubleProperty
    get() = toYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.TranslateTransition.toZp: javafx.beans.property.DoubleProperty
    get() = toZProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.TranslateTransition.byXp: javafx.beans.property.DoubleProperty
    get() = byXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.TranslateTransition.byYp: javafx.beans.property.DoubleProperty
    get() = byYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.TranslateTransition.byZp: javafx.beans.property.DoubleProperty
    get() = byZProperty()!!

// javafx.scene.control.MenuItem

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.MenuItem.idp: javafx.beans.property.StringProperty
    get() = idProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.MenuItem.stylep: javafx.beans.property.StringProperty
    get() = styleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.MenuItem.visiblep: javafx.beans.property.BooleanProperty
    get() = visibleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.MenuItem.disablep: javafx.beans.property.BooleanProperty
    get() = disableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.MenuItem.textp: javafx.beans.property.StringProperty
    get() = textProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.MenuItem.graphicp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = graphicProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.MenuItem.mnemonicParsingp: javafx.beans.property.BooleanProperty
    get() = mnemonicParsingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.MenuItem.onActionp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.ActionEvent>>
    get() = onActionProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.MenuItem.parentMenup: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.Menu>
    get() = parentMenuProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.MenuItem.parentPopupp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.ContextMenu>
    get() = parentPopupProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.MenuItem.onMenuValidationp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.Event>>
    get() = onMenuValidationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.MenuItem.acceleratorp: javafx.beans.property.ObjectProperty<javafx.scene.input.KeyCombination>
    get() = acceleratorProperty()!!

// javafx.scene.control.MenuBar

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.MenuBar.useSystemMenuBarp: javafx.beans.property.BooleanProperty
    get() = useSystemMenuBarProperty()!!

// javafx.scene.control.ListCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ListCell<T>.listViewp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.ListView<T>>
    get() = listViewProperty()!!

// javafx.scene.effect.BoxBlur

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.BoxBlur.iterationsp: javafx.beans.property.IntegerProperty
    get() = iterationsProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.BoxBlur.widthp: javafx.beans.property.DoubleProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.BoxBlur.heightp: javafx.beans.property.DoubleProperty
    get() = heightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.BoxBlur.inputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = inputProperty()!!

// javafx.beans.property.ReadOnlyListWrapper

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.beans.property.ReadOnlyListWrapper<E>.getReadOnlyp: javafx.beans.property.ReadOnlyListProperty<E>
    get() = getReadOnlyProperty()!!

// javafx.beans.property.ReadOnlyBooleanWrapper

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.beans.property.ReadOnlyBooleanWrapper.getReadOnlyp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = getReadOnlyProperty()!!

// javafx.css.CssMetaData

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S:javafx.css.Styleable?, V> javafx.css.CssMetaData<S, V>.getp: String
    get() = getProperty()!!

// javafx.concurrent.Service

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.onScheduledp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>
    get() = onScheduledProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.onRunningp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>
    get() = onRunningProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.onSucceededp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>
    get() = onSucceededProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.onCancelledp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>
    get() = onCancelledProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.onFailedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>
    get() = onFailedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.exceptionp: javafx.beans.property.ReadOnlyObjectProperty<Throwable>
    get() = exceptionProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.workDonep: javafx.beans.property.ReadOnlyDoubleProperty
    get() = workDoneProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.totalWorkp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = totalWorkProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.progressp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = progressProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.runningp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = runningProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.messagep: javafx.beans.property.ReadOnlyStringProperty
    get() = messageProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.titlep: javafx.beans.property.ReadOnlyStringProperty
    get() = titleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.statep: javafx.beans.property.ReadOnlyObjectProperty<javafx.concurrent.Worker.State>
    get() = stateProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.valuep: javafx.beans.property.ReadOnlyObjectProperty<V>
    get() = valueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.onReadyp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>
    get() = onReadyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Service<V>.executorp: javafx.beans.property.ObjectProperty<java.util.concurrent.Executor>
    get() = executorProperty()!!

// javafx.scene.effect.DisplacementMap

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DisplacementMap.scaleXp: javafx.beans.property.DoubleProperty
    get() = scaleXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DisplacementMap.scaleYp: javafx.beans.property.DoubleProperty
    get() = scaleYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DisplacementMap.inputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = inputProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DisplacementMap.offsetXp: javafx.beans.property.DoubleProperty
    get() = offsetXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DisplacementMap.offsetYp: javafx.beans.property.DoubleProperty
    get() = offsetYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DisplacementMap.wrapp: javafx.beans.property.BooleanProperty
    get() = wrapProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DisplacementMap.mapDatap: javafx.beans.property.ObjectProperty<javafx.scene.effect.FloatMap>
    get() = mapDataProperty()!!

// javafx.scene.control.TreeTableRow

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeTableRow<T>.treeTableViewp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TreeTableView<T>>
    get() = treeTableViewProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeTableRow<T>.treeItemp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TreeItem<T>>
    get() = treeItemProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeTableRow<T>.disclosureNodep: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = disclosureNodeProperty()!!

// javafx.print.PageRange

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.print.PageRange.startPagep: javafx.beans.property.ReadOnlyIntegerProperty
    get() = startPageProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.print.PageRange.endPagep: javafx.beans.property.ReadOnlyIntegerProperty
    get() = endPageProperty()!!

// javafx.scene.web.WebEngine

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebEngine.onErrorp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.web.WebErrorEvent>>
    get() = onErrorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebEngine.titlep: javafx.beans.property.ReadOnlyStringProperty
    get() = titleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebEngine.documentp: javafx.beans.property.ReadOnlyObjectProperty<org.w3c.dom.Document>
    get() = documentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebEngine.locationp: javafx.beans.property.ReadOnlyStringProperty
    get() = locationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebEngine.userDataDirectoryp: javafx.beans.property.ObjectProperty<java.io.File>
    get() = userDataDirectoryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebEngine.onAlertp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.web.WebEvent<String>>>
    get() = onAlertProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebEngine.onStatusChangedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.web.WebEvent<String>>>
    get() = onStatusChangedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebEngine.onResizedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.web.WebEvent<javafx.geometry.Rectangle2D>>>
    get() = onResizedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebEngine.onVisibilityChangedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.web.WebEvent<Boolean>>>
    get() = onVisibilityChangedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebEngine.createPopupHandlerp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.scene.web.PopupFeatures, javafx.scene.web.WebEngine>>
    get() = createPopupHandlerProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebEngine.confirmHandlerp: javafx.beans.property.ObjectProperty<javafx.util.Callback<String, Boolean>>
    get() = confirmHandlerProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebEngine.promptHandlerp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.scene.web.PromptData, String>>
    get() = promptHandlerProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebEngine.userStyleSheetLocationp: javafx.beans.property.StringProperty
    get() = userStyleSheetLocationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebEngine.javaScriptEnabledp: javafx.beans.property.BooleanProperty
    get() = javaScriptEnabledProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebEngine.userAgentp: javafx.beans.property.StringProperty
    get() = userAgentProperty()!!

// javafx.scene.control.cell.ChoiceBoxTreeCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.cell.ChoiceBoxTreeCell<T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

// javafx.animation.StrokeTransition

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.StrokeTransition.durationp: javafx.beans.property.ObjectProperty<javafx.util.Duration>
    get() = durationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.StrokeTransition.fromValuep: javafx.beans.property.ObjectProperty<javafx.scene.paint.Color>
    get() = fromValueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.StrokeTransition.toValuep: javafx.beans.property.ObjectProperty<javafx.scene.paint.Color>
    get() = toValueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.StrokeTransition.shapep: javafx.beans.property.ObjectProperty<javafx.scene.shape.Shape>
    get() = shapeProperty()!!

// javafx.stage.FileChooser

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.FileChooser.titlep: javafx.beans.property.StringProperty
    get() = titleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.FileChooser.initialDirectoryp: javafx.beans.property.ObjectProperty<java.io.File>
    get() = initialDirectoryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.FileChooser.initialFileNamep: javafx.beans.property.ObjectProperty<String>
    get() = initialFileNameProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.FileChooser.selectedExtensionFilterp: javafx.beans.property.ObjectProperty<javafx.stage.FileChooser.ExtensionFilter>
    get() = selectedExtensionFilterProperty()!!

// javafx.animation.PauseTransition

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.PauseTransition.durationp: javafx.beans.property.ObjectProperty<javafx.util.Duration>
    get() = durationProperty()!!

// javafx.scene.effect.GaussianBlur

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.GaussianBlur.inputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = inputProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.GaussianBlur.radiusp: javafx.beans.property.DoubleProperty
    get() = radiusProperty()!!

// javafx.scene.control.ScrollPane

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollPane.contentp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = contentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollPane.fitToHeightp: javafx.beans.property.BooleanProperty
    get() = fitToHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollPane.pannablep: javafx.beans.property.BooleanProperty
    get() = pannableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollPane.fitToWidthp: javafx.beans.property.BooleanProperty
    get() = fitToWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollPane.vbarPolicyp: javafx.beans.property.ObjectProperty<javafx.scene.control.ScrollPane.ScrollBarPolicy>
    get() = vbarPolicyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollPane.hbarPolicyp: javafx.beans.property.ObjectProperty<javafx.scene.control.ScrollPane.ScrollBarPolicy>
    get() = hbarPolicyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollPane.hvaluep: javafx.beans.property.DoubleProperty
    get() = hvalueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollPane.vvaluep: javafx.beans.property.DoubleProperty
    get() = vvalueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollPane.hminp: javafx.beans.property.DoubleProperty
    get() = hminProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollPane.vminp: javafx.beans.property.DoubleProperty
    get() = vminProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollPane.hmaxp: javafx.beans.property.DoubleProperty
    get() = hmaxProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollPane.vmaxp: javafx.beans.property.DoubleProperty
    get() = vmaxProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollPane.prefViewportWidthp: javafx.beans.property.DoubleProperty
    get() = prefViewportWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollPane.prefViewportHeightp: javafx.beans.property.DoubleProperty
    get() = prefViewportHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollPane.viewportBoundsp: javafx.beans.property.ObjectProperty<javafx.geometry.Bounds>
    get() = viewportBoundsProperty()!!

// javafx.scene.PerspectiveCamera

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.PerspectiveCamera.fieldOfViewp: javafx.beans.property.DoubleProperty
    get() = fieldOfViewProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.PerspectiveCamera.verticalFieldOfViewp: javafx.beans.property.BooleanProperty
    get() = verticalFieldOfViewProperty()!!

// javafx.animation.SequentialTransition

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.SequentialTransition.nodep: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = nodeProperty()!!

// javafx.scene.control.TreeTableView

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.onScrollToColumnp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TreeTableColumn<S, *>>>>
    get() = onScrollToColumnProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.onScrollTop: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>
    get() = onScrollToProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.selectionModelp: javafx.beans.property.ObjectProperty<javafx.scene.control.TreeTableView.TreeTableViewSelectionModel<S>>
    get() = selectionModelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.sortPolicyp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.scene.control.TreeTableView<S>, Boolean>>
    get() = sortPolicyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.onSortp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TreeTableView<S>>>>
    get() = onSortProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.placeholderp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = placeholderProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.focusModelp: javafx.beans.property.ObjectProperty<javafx.scene.control.TreeTableView.TreeTableViewFocusModel<S>>
    get() = focusModelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.showRootp: javafx.beans.property.BooleanProperty
    get() = showRootProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.treeColumnp: javafx.beans.property.ObjectProperty<javafx.scene.control.TreeTableColumn<S, *>>
    get() = treeColumnProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.expandedItemCountp: javafx.beans.property.ReadOnlyIntegerProperty
    get() = expandedItemCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.editingCellp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TreeTablePosition<S, *>>
    get() = editingCellProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.tableMenuButtonVisiblep: javafx.beans.property.BooleanProperty
    get() = tableMenuButtonVisibleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.rowFactoryp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.scene.control.TreeTableView<S>, javafx.scene.control.TreeTableRow<S>>>
    get() = rowFactoryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.sortModep: javafx.beans.property.ObjectProperty<javafx.scene.control.TreeSortMode>
    get() = sortModeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.editablep: javafx.beans.property.BooleanProperty
    get() = editableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.comparatorp: javafx.beans.property.ReadOnlyObjectProperty<java.util.Comparator<javafx.scene.control.TreeItem<S>>>
    get() = comparatorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.fixedCellSizep: javafx.beans.property.DoubleProperty
    get() = fixedCellSizeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView<S>.rootp: javafx.beans.property.ObjectProperty<javafx.scene.control.TreeItem<S>>
    get() = rootProperty()!!

// javafx.beans.binding.ListBinding

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.beans.binding.ListBinding<E>.emptyp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = emptyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.beans.binding.ListBinding<E>.sizep: javafx.beans.property.ReadOnlyIntegerProperty
    get() = sizeProperty()!!

// javafx.scene.control.TableView

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TableView<S>.onScrollToColumnp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TableColumn<S, *>>>>
    get() = onScrollToColumnProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TableView<S>.onScrollTop: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>
    get() = onScrollToProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TableView<S>.selectionModelp: javafx.beans.property.ObjectProperty<javafx.scene.control.TableView.TableViewSelectionModel<S>>
    get() = selectionModelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TableView<S>.sortPolicyp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.scene.control.TableView<S>, Boolean>>
    get() = sortPolicyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TableView<S>.onSortp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TableView<S>>>>
    get() = onSortProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TableView<S>.placeholderp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = placeholderProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TableView<S>.focusModelp: javafx.beans.property.ObjectProperty<javafx.scene.control.TableView.TableViewFocusModel<S>>
    get() = focusModelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TableView<S>.editingCellp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TablePosition<S, *>>
    get() = editingCellProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TableView<S>.tableMenuButtonVisiblep: javafx.beans.property.BooleanProperty
    get() = tableMenuButtonVisibleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TableView<S>.rowFactoryp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.scene.control.TableView<S>, javafx.scene.control.TableRow<S>>>
    get() = rowFactoryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TableView<S>.itemsp: javafx.beans.property.ObjectProperty<javafx.collections.ObservableList<S>>
    get() = itemsProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TableView<S>.editablep: javafx.beans.property.BooleanProperty
    get() = editableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TableView<S>.comparatorp: javafx.beans.property.ReadOnlyObjectProperty<java.util.Comparator<S>>
    get() = comparatorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TableView<S>.fixedCellSizep: javafx.beans.property.DoubleProperty
    get() = fixedCellSizeProperty()!!

// javafx.scene.shape.Shape

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Shape.fillp: javafx.beans.property.ObjectProperty<javafx.scene.paint.Paint>
    get() = fillProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Shape.strokep: javafx.beans.property.ObjectProperty<javafx.scene.paint.Paint>
    get() = strokeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Shape.strokeTypep: javafx.beans.property.ObjectProperty<javafx.scene.shape.StrokeType>
    get() = strokeTypeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Shape.strokeWidthp: javafx.beans.property.DoubleProperty
    get() = strokeWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Shape.strokeLineJoinp: javafx.beans.property.ObjectProperty<javafx.scene.shape.StrokeLineJoin>
    get() = strokeLineJoinProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Shape.strokeLineCapp: javafx.beans.property.ObjectProperty<javafx.scene.shape.StrokeLineCap>
    get() = strokeLineCapProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Shape.strokeMiterLimitp: javafx.beans.property.DoubleProperty
    get() = strokeMiterLimitProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Shape.strokeDashOffsetp: javafx.beans.property.DoubleProperty
    get() = strokeDashOffsetProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Shape.smoothp: javafx.beans.property.BooleanProperty
    get() = smoothProperty()!!

// javafx.scene.Parent

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Parent.needsLayoutp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = needsLayoutProperty()!!

// javafx.scene.control.cell.TreeItemPropertyValueFactory

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.cell.TreeItemPropertyValueFactory<S, T>.getp: String
    get() = getProperty()!!

// javafx.scene.control.ToggleButton

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ToggleButton.toggleGroupp: javafx.beans.property.ObjectProperty<javafx.scene.control.ToggleGroup>
    get() = toggleGroupProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ToggleButton.selectedp: javafx.beans.property.BooleanProperty
    get() = selectedProperty()!!

// javafx.scene.control.Label

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Label.labelForp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = labelForProperty()!!

// javafx.scene.transform.Rotate

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Rotate.anglep: javafx.beans.property.DoubleProperty
    get() = angleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Rotate.pivotXp: javafx.beans.property.DoubleProperty
    get() = pivotXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Rotate.pivotYp: javafx.beans.property.DoubleProperty
    get() = pivotYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Rotate.pivotZp: javafx.beans.property.DoubleProperty
    get() = pivotZProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Rotate.axisp: javafx.beans.property.ObjectProperty<javafx.geometry.Point3D>
    get() = axisProperty()!!

// javafx.scene.effect.DropShadow

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DropShadow.widthp: javafx.beans.property.DoubleProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DropShadow.heightp: javafx.beans.property.DoubleProperty
    get() = heightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DropShadow.colorp: javafx.beans.property.ObjectProperty<javafx.scene.paint.Color>
    get() = colorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DropShadow.inputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = inputProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DropShadow.radiusp: javafx.beans.property.DoubleProperty
    get() = radiusProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DropShadow.blurTypep: javafx.beans.property.ObjectProperty<javafx.scene.effect.BlurType>
    get() = blurTypeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DropShadow.spreadp: javafx.beans.property.DoubleProperty
    get() = spreadProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DropShadow.offsetXp: javafx.beans.property.DoubleProperty
    get() = offsetXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.DropShadow.offsetYp: javafx.beans.property.DoubleProperty
    get() = offsetYProperty()!!

// javafx.animation.FadeTransition

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.FadeTransition.nodep: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = nodeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.FadeTransition.durationp: javafx.beans.property.ObjectProperty<javafx.util.Duration>
    get() = durationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.FadeTransition.fromValuep: javafx.beans.property.DoubleProperty
    get() = fromValueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.FadeTransition.toValuep: javafx.beans.property.DoubleProperty
    get() = toValueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.FadeTransition.byValuep: javafx.beans.property.DoubleProperty
    get() = byValueProperty()!!

// javafx.scene.shape.Rectangle

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Rectangle.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Rectangle.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Rectangle.arcWidthp: javafx.beans.property.DoubleProperty
    get() = arcWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Rectangle.arcHeightp: javafx.beans.property.DoubleProperty
    get() = arcHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Rectangle.widthp: javafx.beans.property.DoubleProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Rectangle.heightp: javafx.beans.property.DoubleProperty
    get() = heightProperty()!!

// javafx.concurrent.Worker

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Worker<V>.exceptionp: javafx.beans.property.ReadOnlyObjectProperty<Throwable>
    get() = exceptionProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Worker<V>.workDonep: javafx.beans.property.ReadOnlyDoubleProperty
    get() = workDoneProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Worker<V>.totalWorkp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = totalWorkProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Worker<V>.progressp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = progressProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Worker<V>.runningp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = runningProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Worker<V>.messagep: javafx.beans.property.ReadOnlyStringProperty
    get() = messageProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Worker<V>.titlep: javafx.beans.property.ReadOnlyStringProperty
    get() = titleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Worker<V>.statep: javafx.beans.property.ReadOnlyObjectProperty<javafx.concurrent.Worker.State>
    get() = stateProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Worker<V>.valuep: javafx.beans.property.ReadOnlyObjectProperty<V>
    get() = valueProperty()!!

// javafx.animation.Animation

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.Animation.ratep: javafx.beans.property.DoubleProperty
    get() = rateProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.Animation.currentRatep: javafx.beans.property.ReadOnlyDoubleProperty
    get() = currentRateProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.Animation.cycleDurationp: javafx.beans.property.ReadOnlyObjectProperty<javafx.util.Duration>
    get() = cycleDurationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.Animation.totalDurationp: javafx.beans.property.ReadOnlyObjectProperty<javafx.util.Duration>
    get() = totalDurationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.Animation.currentTimep: javafx.beans.property.ReadOnlyObjectProperty<javafx.util.Duration>
    get() = currentTimeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.Animation.delayp: javafx.beans.property.ObjectProperty<javafx.util.Duration>
    get() = delayProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.Animation.cycleCountp: javafx.beans.property.IntegerProperty
    get() = cycleCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.Animation.autoReversep: javafx.beans.property.BooleanProperty
    get() = autoReverseProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.Animation.statusp: javafx.beans.property.ReadOnlyObjectProperty<javafx.animation.Animation.Status>
    get() = statusProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.Animation.onFinishedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.ActionEvent>>
    get() = onFinishedProperty()!!

// javafx.scene.effect.ColorInput

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.ColorInput.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.ColorInput.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.ColorInput.paintp: javafx.beans.property.ObjectProperty<javafx.scene.paint.Paint>
    get() = paintProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.ColorInput.widthp: javafx.beans.property.DoubleProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.ColorInput.heightp: javafx.beans.property.DoubleProperty
    get() = heightProperty()!!

// javafx.concurrent.ScheduledService

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.ScheduledService<V>.delayp: javafx.beans.property.ObjectProperty<javafx.util.Duration>
    get() = delayProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.ScheduledService<V>.periodp: javafx.beans.property.ObjectProperty<javafx.util.Duration>
    get() = periodProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.ScheduledService<V>.backoffStrategyp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.concurrent.ScheduledService<*>, javafx.util.Duration>>
    get() = backoffStrategyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.ScheduledService<V>.restartOnFailurep: javafx.beans.property.BooleanProperty
    get() = restartOnFailureProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.ScheduledService<V>.maximumFailureCountp: javafx.beans.property.IntegerProperty
    get() = maximumFailureCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.ScheduledService<V>.currentFailureCountp: javafx.beans.property.ReadOnlyIntegerProperty
    get() = currentFailureCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.ScheduledService<V>.cumulativePeriodp: javafx.beans.property.ReadOnlyObjectProperty<javafx.util.Duration>
    get() = cumulativePeriodProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.ScheduledService<V>.maximumCumulativePeriodp: javafx.beans.property.ObjectProperty<javafx.util.Duration>
    get() = maximumCumulativePeriodProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.ScheduledService<V>.lastValuep: javafx.beans.property.ReadOnlyObjectProperty<V>
    get() = lastValueProperty()!!

// javafx.scene.control.cell.ComboBoxTreeCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.cell.ComboBoxTreeCell<T>.comboBoxEditablep: javafx.beans.property.BooleanProperty
    get() = comboBoxEditableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.cell.ComboBoxTreeCell<T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

// javafx.scene.transform.Affine

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Affine.mzyp: javafx.beans.property.DoubleProperty
    get() = mzyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Affine.mzzp: javafx.beans.property.DoubleProperty
    get() = mzzProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Affine.tzp: javafx.beans.property.DoubleProperty
    get() = tzProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Affine.mxxp: javafx.beans.property.DoubleProperty
    get() = mxxProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Affine.mxyp: javafx.beans.property.DoubleProperty
    get() = mxyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Affine.txp: javafx.beans.property.DoubleProperty
    get() = txProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Affine.mxzp: javafx.beans.property.DoubleProperty
    get() = mxzProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Affine.myxp: javafx.beans.property.DoubleProperty
    get() = myxProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Affine.myyp: javafx.beans.property.DoubleProperty
    get() = myyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Affine.typ: javafx.beans.property.DoubleProperty
    get() = tyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Affine.myzp: javafx.beans.property.DoubleProperty
    get() = myzProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Affine.mzxp: javafx.beans.property.DoubleProperty
    get() = mzxProperty()!!

// javafx.scene.shape.Cylinder

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Cylinder.heightp: javafx.beans.property.DoubleProperty
    get() = heightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Cylinder.radiusp: javafx.beans.property.DoubleProperty
    get() = radiusProperty()!!

// javafx.scene.shape.LineTo

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.LineTo.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.LineTo.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

// javafx.scene.effect.Light.Distant

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Light.Distant.azimuthp: javafx.beans.property.DoubleProperty
    get() = azimuthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Light.Distant.elevationp: javafx.beans.property.DoubleProperty
    get() = elevationProperty()!!

// javafx.scene.control.cell.ComboBoxListCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.cell.ComboBoxListCell<T>.comboBoxEditablep: javafx.beans.property.BooleanProperty
    get() = comboBoxEditableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.cell.ComboBoxListCell<T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

// javafx.scene.transform.Translate

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Translate.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Translate.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Translate.zp: javafx.beans.property.DoubleProperty
    get() = zProperty()!!

// javafx.beans.binding.MapExpression

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <K, V> javafx.beans.binding.MapExpression<K, V>.emptyp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = emptyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <K, V> javafx.beans.binding.MapExpression<K, V>.sizep: javafx.beans.property.ReadOnlyIntegerProperty
    get() = sizeProperty()!!

// javafx.scene.image.Image

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.image.Image.exceptionp: javafx.beans.property.ReadOnlyObjectProperty<Exception>
    get() = exceptionProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.image.Image.progressp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = progressProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.image.Image.widthp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.image.Image.heightp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = heightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.image.Image.errorp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = errorProperty()!!

// javafx.scene.control.ContextMenu

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ContextMenu.onActionp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.ActionEvent>>
    get() = onActionProperty()!!

// javafx.scene.ImageCursor

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.ImageCursor.imagep: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.image.Image>
    get() = imageProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.ImageCursor.hotspotXp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = hotspotXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.ImageCursor.hotspotYp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = hotspotYProperty()!!

// javafx.beans.binding.MapBinding

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <K, V> javafx.beans.binding.MapBinding<K, V>.emptyp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = emptyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <K, V> javafx.beans.binding.MapBinding<K, V>.sizep: javafx.beans.property.ReadOnlyIntegerProperty
    get() = sizeProperty()!!

// javafx.scene.web.WebHistory.Entry

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebHistory.Entry.titlep: javafx.beans.property.ReadOnlyObjectProperty<String>
    get() = titleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebHistory.Entry.lastVisitedDatep: javafx.beans.property.ReadOnlyObjectProperty<java.util.Date>
    get() = lastVisitedDateProperty()!!

// javafx.scene.control.Menu

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Menu.showingp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = showingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Menu.onShowingp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.Event>>
    get() = onShowingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Menu.onShownp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.Event>>
    get() = onShownProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Menu.onHidingp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.Event>>
    get() = onHidingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Menu.onHiddenp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.Event>>
    get() = onHiddenProperty()!!

// javafx.scene.control.TabPane

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TabPane.selectionModelp: javafx.beans.property.ObjectProperty<javafx.scene.control.SingleSelectionModel<javafx.scene.control.Tab>>
    get() = selectionModelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TabPane.tabClosingPolicyp: javafx.beans.property.ObjectProperty<javafx.scene.control.TabPane.TabClosingPolicy>
    get() = tabClosingPolicyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TabPane.rotateGraphicp: javafx.beans.property.BooleanProperty
    get() = rotateGraphicProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TabPane.sidep: javafx.beans.property.ObjectProperty<javafx.geometry.Side>
    get() = sideProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TabPane.tabMinWidthp: javafx.beans.property.DoubleProperty
    get() = tabMinWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TabPane.tabMaxWidthp: javafx.beans.property.DoubleProperty
    get() = tabMaxWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TabPane.tabMinHeightp: javafx.beans.property.DoubleProperty
    get() = tabMinHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TabPane.tabMaxHeightp: javafx.beans.property.DoubleProperty
    get() = tabMaxHeightProperty()!!

// javafx.scene.Camera

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Camera.nearClipp: javafx.beans.property.DoubleProperty
    get() = nearClipProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Camera.farClipp: javafx.beans.property.DoubleProperty
    get() = farClipProperty()!!

// javafx.scene.chart.BarChart

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.BarChart<X, Y>.categoryGapp: javafx.beans.property.DoubleProperty
    get() = categoryGapProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.BarChart<X, Y>.barGapp: javafx.beans.property.DoubleProperty
    get() = barGapProperty()!!

// javafx.scene.chart.Axis

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.chart.Axis<T>.labelp: javafx.beans.property.ObjectProperty<String>
    get() = labelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.chart.Axis<T>.tickLabelRotationp: javafx.beans.property.DoubleProperty
    get() = tickLabelRotationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.chart.Axis<T>.tickMarkVisiblep: javafx.beans.property.BooleanProperty
    get() = tickMarkVisibleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.chart.Axis<T>.tickLabelsVisiblep: javafx.beans.property.BooleanProperty
    get() = tickLabelsVisibleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.chart.Axis<T>.sidep: javafx.beans.property.ObjectProperty<javafx.geometry.Side>
    get() = sideProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.chart.Axis<T>.tickLengthp: javafx.beans.property.DoubleProperty
    get() = tickLengthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.chart.Axis<T>.tickLabelFontp: javafx.beans.property.ObjectProperty<javafx.scene.text.Font>
    get() = tickLabelFontProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.chart.Axis<T>.tickLabelFillp: javafx.beans.property.ObjectProperty<javafx.scene.paint.Paint>
    get() = tickLabelFillProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.chart.Axis<T>.tickLabelGapp: javafx.beans.property.DoubleProperty
    get() = tickLabelGapProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.chart.Axis<T>.animatedp: javafx.beans.property.BooleanProperty
    get() = animatedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.chart.Axis<T>.autoRangingp: javafx.beans.property.BooleanProperty
    get() = autoRangingProperty()!!

// javafx.scene.text.TextFlow

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.text.TextFlow.textAlignmentp: javafx.beans.property.ObjectProperty<javafx.scene.text.TextAlignment>
    get() = textAlignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.text.TextFlow.lineSpacingp: javafx.beans.property.DoubleProperty
    get() = lineSpacingProperty()!!

// javafx.beans.property.ReadOnlySetWrapper

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.beans.property.ReadOnlySetWrapper<E>.getReadOnlyp: javafx.beans.property.ReadOnlySetProperty<E>
    get() = getReadOnlyProperty()!!

// javafx.scene.control.ListView

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ListView<T>.orientationp: javafx.beans.property.ObjectProperty<javafx.geometry.Orientation>
    get() = orientationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ListView<T>.onScrollTop: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>
    get() = onScrollToProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ListView<T>.selectionModelp: javafx.beans.property.ObjectProperty<javafx.scene.control.MultipleSelectionModel<T>>
    get() = selectionModelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ListView<T>.placeholderp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = placeholderProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ListView<T>.focusModelp: javafx.beans.property.ObjectProperty<javafx.scene.control.FocusModel<T>>
    get() = focusModelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ListView<T>.cellFactoryp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>>
    get() = cellFactoryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ListView<T>.editingIndexp: javafx.beans.property.ReadOnlyIntegerProperty
    get() = editingIndexProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ListView<T>.onEditStartp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>>
    get() = onEditStartProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ListView<T>.onEditCommitp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>>
    get() = onEditCommitProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ListView<T>.onEditCancelp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>>
    get() = onEditCancelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ListView<T>.itemsp: javafx.beans.property.ObjectProperty<javafx.collections.ObservableList<T>>
    get() = itemsProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ListView<T>.editablep: javafx.beans.property.BooleanProperty
    get() = editableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ListView<T>.fixedCellSizep: javafx.beans.property.DoubleProperty
    get() = fixedCellSizeProperty()!!

// javafx.scene.media.Media

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.Media.onErrorp: javafx.beans.property.ObjectProperty<Runnable>
    get() = onErrorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.Media.durationp: javafx.beans.property.ReadOnlyObjectProperty<javafx.util.Duration>
    get() = durationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.Media.widthp: javafx.beans.property.ReadOnlyIntegerProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.Media.heightp: javafx.beans.property.ReadOnlyIntegerProperty
    get() = heightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.Media.errorp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.media.MediaException>
    get() = errorProperty()!!

// javafx.animation.ParallelTransition

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.ParallelTransition.nodep: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = nodeProperty()!!

// javafx.scene.effect.Bloom

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Bloom.thresholdp: javafx.beans.property.DoubleProperty
    get() = thresholdProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Bloom.inputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = inputProperty()!!

// javafx.scene.effect.Shadow

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Shadow.widthp: javafx.beans.property.DoubleProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Shadow.heightp: javafx.beans.property.DoubleProperty
    get() = heightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Shadow.colorp: javafx.beans.property.ObjectProperty<javafx.scene.paint.Color>
    get() = colorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Shadow.inputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = inputProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Shadow.radiusp: javafx.beans.property.DoubleProperty
    get() = radiusProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Shadow.blurTypep: javafx.beans.property.ObjectProperty<javafx.scene.effect.BlurType>
    get() = blurTypeProperty()!!

// javafx.beans.property.ReadOnlyMapWrapper

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <K, V> javafx.beans.property.ReadOnlyMapWrapper<K, V>.getReadOnlyp: javafx.beans.property.ReadOnlyMapProperty<K, V>
    get() = getReadOnlyProperty()!!

// javafx.scene.shape.MeshView

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.MeshView.meshp: javafx.beans.property.ObjectProperty<javafx.scene.shape.Mesh>
    get() = meshProperty()!!

// javafx.scene.shape.Line

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Line.startYp: javafx.beans.property.DoubleProperty
    get() = startYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Line.startXp: javafx.beans.property.DoubleProperty
    get() = startXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Line.endYp: javafx.beans.property.DoubleProperty
    get() = endYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Line.endXp: javafx.beans.property.DoubleProperty
    get() = endXProperty()!!

// javafx.animation.Transition

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.Transition.interpolatorp: javafx.beans.property.ObjectProperty<javafx.animation.Interpolator>
    get() = interpolatorProperty()!!

// javafx.collections.transformation.FilteredList

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.collections.transformation.FilteredList<E>.predicatep: javafx.beans.property.ObjectProperty<java.util.function.Predicate<in E>>
    get() = predicateProperty()!!

// javafx.scene.Node

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.localToSceneTransformp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.transform.Transform>
    get() = localToSceneTransformProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.scenep: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.Scene>
    get() = sceneProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.effectiveNodeOrientationp: javafx.beans.property.ReadOnlyObjectProperty<javafx.geometry.NodeOrientation>
    get() = effectiveNodeOrientationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.parentp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.Parent>
    get() = parentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.idp: javafx.beans.property.StringProperty
    get() = idProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.stylep: javafx.beans.property.StringProperty
    get() = styleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.visiblep: javafx.beans.property.BooleanProperty
    get() = visibleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.cursorp: javafx.beans.property.ObjectProperty<javafx.scene.Cursor>
    get() = cursorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.opacityp: javafx.beans.property.DoubleProperty
    get() = opacityProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.blendModep: javafx.beans.property.ObjectProperty<javafx.scene.effect.BlendMode>
    get() = blendModeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.clipp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = clipProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.cachep: javafx.beans.property.BooleanProperty
    get() = cacheProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.cacheHintp: javafx.beans.property.ObjectProperty<javafx.scene.CacheHint>
    get() = cacheHintProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.effectp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = effectProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.depthTestp: javafx.beans.property.ObjectProperty<javafx.scene.DepthTest>
    get() = depthTestProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.disablep: javafx.beans.property.BooleanProperty
    get() = disableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.pickOnBoundsp: javafx.beans.property.BooleanProperty
    get() = pickOnBoundsProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.disabledp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = disabledProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onDragEnteredp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.DragEvent?>>
    get() = onDragEnteredProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onDragExitedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.DragEvent?>>
    get() = onDragExitedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onDragOverp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.DragEvent?>>
    get() = onDragOverProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onDragDroppedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.DragEvent?>>
    get() = onDragDroppedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onDragDonep: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.DragEvent?>>
    get() = onDragDoneProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.managedp: javafx.beans.property.BooleanProperty
    get() = managedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.layoutXp: javafx.beans.property.DoubleProperty
    get() = layoutXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.layoutYp: javafx.beans.property.DoubleProperty
    get() = layoutYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.boundsInParentp: javafx.beans.property.ReadOnlyObjectProperty<javafx.geometry.Bounds>
    get() = boundsInParentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.boundsInLocalp: javafx.beans.property.ReadOnlyObjectProperty<javafx.geometry.Bounds>
    get() = boundsInLocalProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.layoutBoundsp: javafx.beans.property.ReadOnlyObjectProperty<javafx.geometry.Bounds>
    get() = layoutBoundsProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.translateXp: javafx.beans.property.DoubleProperty
    get() = translateXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.translateYp: javafx.beans.property.DoubleProperty
    get() = translateYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.translateZp: javafx.beans.property.DoubleProperty
    get() = translateZProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.scaleXp: javafx.beans.property.DoubleProperty
    get() = scaleXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.scaleYp: javafx.beans.property.DoubleProperty
    get() = scaleYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.scaleZp: javafx.beans.property.DoubleProperty
    get() = scaleZProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.rotatep: javafx.beans.property.DoubleProperty
    get() = rotateProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.rotationAxisp: javafx.beans.property.ObjectProperty<javafx.geometry.Point3D>
    get() = rotationAxisProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.localToParentTransformp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.transform.Transform>
    get() = localToParentTransformProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.nodeOrientationp: javafx.beans.property.ObjectProperty<javafx.geometry.NodeOrientation>
    get() = nodeOrientationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.mouseTransparentp: javafx.beans.property.BooleanProperty
    get() = mouseTransparentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.hoverp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = hoverProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.pressedp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = pressedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onContextMenuRequestedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent?>>
    get() = onContextMenuRequestedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onMouseClickedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onMouseClickedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onMouseDraggedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onMouseDraggedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onMouseEnteredp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onMouseEnteredProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onMouseExitedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onMouseExitedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onMouseMovedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onMouseMovedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onMousePressedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onMousePressedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onMouseReleasedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onMouseReleasedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onDragDetectedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onDragDetectedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onMouseDragOverp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent?>>
    get() = onMouseDragOverProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onMouseDragReleasedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent?>>
    get() = onMouseDragReleasedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onMouseDragEnteredp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent?>>
    get() = onMouseDragEnteredProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onMouseDragExitedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent?>>
    get() = onMouseDragExitedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onScrollStartedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent?>>
    get() = onScrollStartedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onScrollp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent?>>
    get() = onScrollProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onScrollFinishedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent?>>
    get() = onScrollFinishedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onRotationStartedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.RotateEvent?>>
    get() = onRotationStartedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onRotatep: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.RotateEvent?>>
    get() = onRotateProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onRotationFinishedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.RotateEvent?>>
    get() = onRotationFinishedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onZoomStartedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent?>>
    get() = onZoomStartedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onZoomp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent?>>
    get() = onZoomProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onZoomFinishedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent?>>
    get() = onZoomFinishedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onSwipeUpp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent?>>
    get() = onSwipeUpProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onSwipeDownp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent?>>
    get() = onSwipeDownProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onSwipeLeftp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent?>>
    get() = onSwipeLeftProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onSwipeRightp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent?>>
    get() = onSwipeRightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onTouchPressedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.TouchEvent?>>
    get() = onTouchPressedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onTouchMovedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.TouchEvent?>>
    get() = onTouchMovedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onTouchReleasedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.TouchEvent?>>
    get() = onTouchReleasedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onTouchStationaryp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.TouchEvent?>>
    get() = onTouchStationaryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onKeyPressedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.KeyEvent?>>
    get() = onKeyPressedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onKeyReleasedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.KeyEvent?>>
    get() = onKeyReleasedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onKeyTypedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.KeyEvent?>>
    get() = onKeyTypedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.onInputMethodTextChangedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent?>>
    get() = onInputMethodTextChangedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.inputMethodRequestsp: javafx.beans.property.ObjectProperty<javafx.scene.input.InputMethodRequests>
    get() = inputMethodRequestsProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.focusedp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = focusedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.focusTraversablep: javafx.beans.property.BooleanProperty
    get() = focusTraversableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Node.eventDispatcherp: javafx.beans.property.ObjectProperty<javafx.event.EventDispatcher>
    get() = eventDispatcherProperty()!!

// javafx.scene.media.AudioEqualizer

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.AudioEqualizer.enabledp: javafx.beans.property.BooleanProperty
    get() = enabledProperty()!!

// javafx.stage.Window

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Window.scenep: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.Scene>
    get() = sceneProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Window.opacityp: javafx.beans.property.DoubleProperty
    get() = opacityProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Window.focusedp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = focusedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Window.eventDispatcherp: javafx.beans.property.ObjectProperty<javafx.event.EventDispatcher>
    get() = eventDispatcherProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Window.yp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Window.xp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = xProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Window.widthp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Window.heightp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = heightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Window.showingp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = showingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Window.onCloseRequestp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.stage.WindowEvent>>
    get() = onCloseRequestProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Window.onShowingp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.stage.WindowEvent>>
    get() = onShowingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Window.onShownp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.stage.WindowEvent>>
    get() = onShownProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Window.onHidingp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.stage.WindowEvent>>
    get() = onHidingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Window.onHiddenp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.stage.WindowEvent>>
    get() = onHiddenProperty()!!

// javafx.scene.control.IndexedCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.IndexedCell<T>.indexp: javafx.beans.property.ReadOnlyIntegerProperty
    get() = indexProperty()!!

// javafx.scene.control.cell.PropertyValueFactory

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.cell.PropertyValueFactory<S, T>.getp: String
    get() = getProperty()!!

// javafx.animation.PathTransition

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.PathTransition.orientationp: javafx.beans.property.ObjectProperty<javafx.animation.PathTransition.OrientationType>
    get() = orientationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.PathTransition.nodep: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = nodeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.PathTransition.durationp: javafx.beans.property.ObjectProperty<javafx.util.Duration>
    get() = durationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.PathTransition.pathp: javafx.beans.property.ObjectProperty<javafx.scene.shape.Shape>
    get() = pathProperty()!!

// javafx.scene.canvas.Canvas

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.canvas.Canvas.widthp: javafx.beans.property.DoubleProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.canvas.Canvas.heightp: javafx.beans.property.DoubleProperty
    get() = heightProperty()!!

// javafx.scene.Scene

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.effectiveNodeOrientationp: javafx.beans.property.ReadOnlyObjectProperty<javafx.geometry.NodeOrientation>
    get() = effectiveNodeOrientationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.cursorp: javafx.beans.property.ObjectProperty<javafx.scene.Cursor>
    get() = cursorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onDragEnteredp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.DragEvent?>>
    get() = onDragEnteredProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onDragExitedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.DragEvent?>>
    get() = onDragExitedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onDragOverp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.DragEvent?>>
    get() = onDragOverProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onDragDroppedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.DragEvent?>>
    get() = onDragDroppedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onDragDonep: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.DragEvent?>>
    get() = onDragDoneProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.nodeOrientationp: javafx.beans.property.ObjectProperty<javafx.geometry.NodeOrientation>
    get() = nodeOrientationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onContextMenuRequestedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent?>>
    get() = onContextMenuRequestedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onMouseClickedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onMouseClickedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onMouseDraggedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onMouseDraggedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onMouseEnteredp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onMouseEnteredProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onMouseExitedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onMouseExitedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onMouseMovedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onMouseMovedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onMousePressedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onMousePressedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onMouseReleasedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onMouseReleasedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onDragDetectedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseEvent?>>
    get() = onDragDetectedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onMouseDragOverp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent?>>
    get() = onMouseDragOverProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onMouseDragReleasedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent?>>
    get() = onMouseDragReleasedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onMouseDragEnteredp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent?>>
    get() = onMouseDragEnteredProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onMouseDragExitedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent?>>
    get() = onMouseDragExitedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onScrollStartedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent?>>
    get() = onScrollStartedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onScrollp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent?>>
    get() = onScrollProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onScrollFinishedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent?>>
    get() = onScrollFinishedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onRotationStartedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.RotateEvent?>>
    get() = onRotationStartedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onRotatep: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.RotateEvent?>>
    get() = onRotateProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onRotationFinishedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.RotateEvent?>>
    get() = onRotationFinishedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onZoomStartedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent?>>
    get() = onZoomStartedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onZoomp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent?>>
    get() = onZoomProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onZoomFinishedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent?>>
    get() = onZoomFinishedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onSwipeUpp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent?>>
    get() = onSwipeUpProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onSwipeDownp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent?>>
    get() = onSwipeDownProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onSwipeLeftp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent?>>
    get() = onSwipeLeftProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onSwipeRightp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent?>>
    get() = onSwipeRightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onTouchPressedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.TouchEvent?>>
    get() = onTouchPressedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onTouchMovedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.TouchEvent?>>
    get() = onTouchMovedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onTouchReleasedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.TouchEvent?>>
    get() = onTouchReleasedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onTouchStationaryp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.TouchEvent?>>
    get() = onTouchStationaryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onKeyPressedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.KeyEvent?>>
    get() = onKeyPressedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onKeyReleasedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.KeyEvent?>>
    get() = onKeyReleasedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onKeyTypedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.KeyEvent?>>
    get() = onKeyTypedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.onInputMethodTextChangedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent?>>
    get() = onInputMethodTextChangedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.eventDispatcherp: javafx.beans.property.ObjectProperty<javafx.event.EventDispatcher>
    get() = eventDispatcherProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.yp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.xp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = xProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.widthp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.heightp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = heightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.fillp: javafx.beans.property.ObjectProperty<javafx.scene.paint.Paint>
    get() = fillProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.rootp: javafx.beans.property.ObjectProperty<javafx.scene.Parent>
    get() = rootProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.camerap: javafx.beans.property.ObjectProperty<javafx.scene.Camera>
    get() = cameraProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.windowp: javafx.beans.property.ReadOnlyObjectProperty<javafx.stage.Window>
    get() = windowProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Scene.focusOwnerp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.Node>
    get() = focusOwnerProperty()!!

// javafx.scene.Group

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.Group.autoSizeChildrenp: javafx.beans.property.BooleanProperty
    get() = autoSizeChildrenProperty()!!

// javafx.scene.control.MultipleSelectionModel

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.MultipleSelectionModel<T>.selectionModep: javafx.beans.property.ObjectProperty<javafx.scene.control.SelectionMode>
    get() = selectionModeProperty()!!

// javafx.scene.shape.Path

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Path.fillRulep: javafx.beans.property.ObjectProperty<javafx.scene.shape.FillRule>
    get() = fillRuleProperty()!!

// javafx.scene.web.WebView

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebView.widthp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebView.heightp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = heightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebView.minWidthp: javafx.beans.property.DoubleProperty
    get() = minWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebView.minHeightp: javafx.beans.property.DoubleProperty
    get() = minHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebView.prefWidthp: javafx.beans.property.DoubleProperty
    get() = prefWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebView.prefHeightp: javafx.beans.property.DoubleProperty
    get() = prefHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebView.maxWidthp: javafx.beans.property.DoubleProperty
    get() = maxWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebView.maxHeightp: javafx.beans.property.DoubleProperty
    get() = maxHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebView.fontScalep: javafx.beans.property.DoubleProperty
    get() = fontScaleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebView.zoomp: javafx.beans.property.DoubleProperty
    get() = zoomProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebView.contextMenuEnabledp: javafx.beans.property.BooleanProperty
    get() = contextMenuEnabledProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebView.fontSmoothingTypep: javafx.beans.property.ObjectProperty<javafx.scene.text.FontSmoothingType>
    get() = fontSmoothingTypeProperty()!!

// javafx.scene.control.cell.ChoiceBoxTreeTableCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.cell.ChoiceBoxTreeTableCell<S, T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

// javafx.scene.chart.XYChart.Data

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.nodep: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = nodeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.XValuep: javafx.beans.property.ObjectProperty<X>
    get() = XValueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.YValuep: javafx.beans.property.ObjectProperty<Y>
    get() = YValueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.extraValuep: javafx.beans.property.ObjectProperty<Any>
    get() = extraValueProperty()!!

// javafx.scene.control.Hyperlink

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Hyperlink.visitedp: javafx.beans.property.BooleanProperty
    get() = visitedProperty()!!

// javafx.scene.layout.Region

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.snapToPixelp: javafx.beans.property.BooleanProperty
    get() = snapToPixelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.paddingp: javafx.beans.property.ObjectProperty<javafx.geometry.Insets>
    get() = paddingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.backgroundp: javafx.beans.property.ObjectProperty<javafx.scene.layout.Background>
    get() = backgroundProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.borderp: javafx.beans.property.ObjectProperty<javafx.scene.layout.Border>
    get() = borderProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.opaqueInsetsp: javafx.beans.property.ObjectProperty<javafx.geometry.Insets>
    get() = opaqueInsetsProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.insetsp: javafx.beans.property.ReadOnlyObjectProperty<javafx.geometry.Insets>
    get() = insetsProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.widthp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.heightp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = heightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.minWidthp: javafx.beans.property.DoubleProperty
    get() = minWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.minHeightp: javafx.beans.property.DoubleProperty
    get() = minHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.prefWidthp: javafx.beans.property.DoubleProperty
    get() = prefWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.prefHeightp: javafx.beans.property.DoubleProperty
    get() = prefHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.maxWidthp: javafx.beans.property.DoubleProperty
    get() = maxWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.maxHeightp: javafx.beans.property.DoubleProperty
    get() = maxHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.shapep: javafx.beans.property.ObjectProperty<javafx.scene.shape.Shape>
    get() = shapeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.scaleShapep: javafx.beans.property.BooleanProperty
    get() = scaleShapeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.centerShapep: javafx.beans.property.BooleanProperty
    get() = centerShapeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.Region.cacheShapep: javafx.beans.property.BooleanProperty
    get() = cacheShapeProperty()!!

// javafx.scene.control.ToggleGroup

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ToggleGroup.selectedTogglep: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.Toggle>
    get() = selectedToggleProperty()!!

// javafx.beans.binding.SetExpression

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.beans.binding.SetExpression<E>.emptyp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = emptyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.beans.binding.SetExpression<E>.sizep: javafx.beans.property.ReadOnlyIntegerProperty
    get() = sizeProperty()!!

// javafx.scene.media.MediaPlayer

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.onErrorp: javafx.beans.property.ObjectProperty<Runnable>
    get() = onErrorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.ratep: javafx.beans.property.DoubleProperty
    get() = rateProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.currentRatep: javafx.beans.property.ReadOnlyDoubleProperty
    get() = currentRateProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.cycleDurationp: javafx.beans.property.ReadOnlyObjectProperty<javafx.util.Duration>
    get() = cycleDurationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.totalDurationp: javafx.beans.property.ReadOnlyObjectProperty<javafx.util.Duration>
    get() = totalDurationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.currentTimep: javafx.beans.property.ReadOnlyObjectProperty<javafx.util.Duration>
    get() = currentTimeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.cycleCountp: javafx.beans.property.IntegerProperty
    get() = cycleCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.statusp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.media.MediaPlayer.Status>
    get() = statusProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.mutep: javafx.beans.property.BooleanProperty
    get() = muteProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.stopTimep: javafx.beans.property.ObjectProperty<javafx.util.Duration>
    get() = stopTimeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.audioSpectrumListenerp: javafx.beans.property.ObjectProperty<javafx.scene.media.AudioSpectrumListener>
    get() = audioSpectrumListenerProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.audioSpectrumNumBandsp: javafx.beans.property.IntegerProperty
    get() = audioSpectrumNumBandsProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.audioSpectrumThresholdp: javafx.beans.property.IntegerProperty
    get() = audioSpectrumThresholdProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.audioSpectrumIntervalp: javafx.beans.property.DoubleProperty
    get() = audioSpectrumIntervalProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.autoPlayp: javafx.beans.property.BooleanProperty
    get() = autoPlayProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.volumep: javafx.beans.property.DoubleProperty
    get() = volumeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.balancep: javafx.beans.property.DoubleProperty
    get() = balanceProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.startTimep: javafx.beans.property.ObjectProperty<javafx.util.Duration>
    get() = startTimeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.bufferProgressTimep: javafx.beans.property.ReadOnlyObjectProperty<javafx.util.Duration>
    get() = bufferProgressTimeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.currentCountp: javafx.beans.property.ReadOnlyIntegerProperty
    get() = currentCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.onMarkerp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.media.MediaMarkerEvent>>
    get() = onMarkerProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.onEndOfMediap: javafx.beans.property.ObjectProperty<Runnable>
    get() = onEndOfMediaProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.onReadyp: javafx.beans.property.ObjectProperty<Runnable>
    get() = onReadyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.onPlayingp: javafx.beans.property.ObjectProperty<Runnable>
    get() = onPlayingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.onPausedp: javafx.beans.property.ObjectProperty<Runnable>
    get() = onPausedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.onStoppedp: javafx.beans.property.ObjectProperty<Runnable>
    get() = onStoppedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.onHaltedp: javafx.beans.property.ObjectProperty<Runnable>
    get() = onHaltedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.onRepeatp: javafx.beans.property.ObjectProperty<Runnable>
    get() = onRepeatProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.onStalledp: javafx.beans.property.ObjectProperty<Runnable>
    get() = onStalledProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaPlayer.errorp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.media.MediaException>
    get() = errorProperty()!!

// javafx.scene.shape.QuadCurve

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.QuadCurve.controlXp: javafx.beans.property.DoubleProperty
    get() = controlXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.QuadCurve.controlYp: javafx.beans.property.DoubleProperty
    get() = controlYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.QuadCurve.startYp: javafx.beans.property.DoubleProperty
    get() = startYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.QuadCurve.startXp: javafx.beans.property.DoubleProperty
    get() = startXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.QuadCurve.endYp: javafx.beans.property.DoubleProperty
    get() = endYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.QuadCurve.endXp: javafx.beans.property.DoubleProperty
    get() = endXProperty()!!

// javafx.scene.text.Text

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.text.Text.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.text.Text.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.text.Text.baselineOffsetp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = baselineOffsetProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.text.Text.wrappingWidthp: javafx.beans.property.DoubleProperty
    get() = wrappingWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.text.Text.boundsTypep: javafx.beans.property.ObjectProperty<javafx.scene.text.TextBoundsType>
    get() = boundsTypeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.text.Text.textp: javafx.beans.property.StringProperty
    get() = textProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.text.Text.textAlignmentp: javafx.beans.property.ObjectProperty<javafx.scene.text.TextAlignment>
    get() = textAlignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.text.Text.fontp: javafx.beans.property.ObjectProperty<javafx.scene.text.Font>
    get() = fontProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.text.Text.underlinep: javafx.beans.property.BooleanProperty
    get() = underlineProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.text.Text.lineSpacingp: javafx.beans.property.DoubleProperty
    get() = lineSpacingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.text.Text.fontSmoothingTypep: javafx.beans.property.ObjectProperty<javafx.scene.text.FontSmoothingType>
    get() = fontSmoothingTypeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.text.Text.textOriginp: javafx.beans.property.ObjectProperty<javafx.geometry.VPos>
    get() = textOriginProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.text.Text.strikethroughp: javafx.beans.property.BooleanProperty
    get() = strikethroughProperty()!!

// javafx.beans.binding.ListExpression

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.beans.binding.ListExpression<E>.emptyp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = emptyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.beans.binding.ListExpression<E>.sizep: javafx.beans.property.ReadOnlyIntegerProperty
    get() = sizeProperty()!!

// javafx.scene.control.PopupControl

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.PopupControl.idp: javafx.beans.property.StringProperty
    get() = idProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.PopupControl.stylep: javafx.beans.property.StringProperty
    get() = styleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.PopupControl.skinp: javafx.beans.property.ObjectProperty<javafx.scene.control.Skin<*>>
    get() = skinProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.PopupControl.minWidthp: javafx.beans.property.DoubleProperty
    get() = minWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.PopupControl.minHeightp: javafx.beans.property.DoubleProperty
    get() = minHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.PopupControl.prefWidthp: javafx.beans.property.DoubleProperty
    get() = prefWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.PopupControl.prefHeightp: javafx.beans.property.DoubleProperty
    get() = prefHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.PopupControl.maxWidthp: javafx.beans.property.DoubleProperty
    get() = maxWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.PopupControl.maxHeightp: javafx.beans.property.DoubleProperty
    get() = maxHeightProperty()!!

// javafx.beans.property.ReadOnlyDoubleWrapper

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.beans.property.ReadOnlyDoubleWrapper.getReadOnlyp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = getReadOnlyProperty()!!

// javafx.scene.control.cell.ChoiceBoxTableCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.cell.ChoiceBoxTableCell<S, T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

// javafx.scene.control.cell.ChoiceBoxListCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.cell.ChoiceBoxListCell<T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

// javafx.scene.control.TitledPane

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TitledPane.expandedp: javafx.beans.property.BooleanProperty
    get() = expandedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TitledPane.contentp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = contentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TitledPane.animatedp: javafx.beans.property.BooleanProperty
    get() = animatedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TitledPane.collapsiblep: javafx.beans.property.BooleanProperty
    get() = collapsibleProperty()!!

// javafx.scene.chart.StackedBarChart

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.StackedBarChart<X, Y>.categoryGapp: javafx.beans.property.DoubleProperty
    get() = categoryGapProperty()!!

// javafx.scene.control.Labeled

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Labeled.alignmentp: javafx.beans.property.ObjectProperty<javafx.geometry.Pos>
    get() = alignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Labeled.textp: javafx.beans.property.StringProperty
    get() = textProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Labeled.textAlignmentp: javafx.beans.property.ObjectProperty<javafx.scene.text.TextAlignment>
    get() = textAlignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Labeled.textOverrunp: javafx.beans.property.ObjectProperty<javafx.scene.control.OverrunStyle>
    get() = textOverrunProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Labeled.ellipsisStringp: javafx.beans.property.StringProperty
    get() = ellipsisStringProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Labeled.wrapTextp: javafx.beans.property.BooleanProperty
    get() = wrapTextProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Labeled.fontp: javafx.beans.property.ObjectProperty<javafx.scene.text.Font>
    get() = fontProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Labeled.graphicp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = graphicProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Labeled.underlinep: javafx.beans.property.BooleanProperty
    get() = underlineProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Labeled.lineSpacingp: javafx.beans.property.DoubleProperty
    get() = lineSpacingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Labeled.contentDisplayp: javafx.beans.property.ObjectProperty<javafx.scene.control.ContentDisplay>
    get() = contentDisplayProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Labeled.labelPaddingp: javafx.beans.property.ReadOnlyObjectProperty<javafx.geometry.Insets>
    get() = labelPaddingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Labeled.graphicTextGapp: javafx.beans.property.DoubleProperty
    get() = graphicTextGapProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Labeled.textFillp: javafx.beans.property.ObjectProperty<javafx.scene.paint.Paint>
    get() = textFillProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Labeled.mnemonicParsingp: javafx.beans.property.BooleanProperty
    get() = mnemonicParsingProperty()!!

// javafx.scene.control.TreeTableColumn

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TreeTableColumn<S, T>.cellFactoryp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.scene.control.TreeTableColumn<S, T>, javafx.scene.control.TreeTableCell<S, T>>>
    get() = cellFactoryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TreeTableColumn<S, T>.onEditStartp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>>
    get() = onEditStartProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TreeTableColumn<S, T>.onEditCommitp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>>
    get() = onEditCommitProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TreeTableColumn<S, T>.onEditCancelp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>>
    get() = onEditCancelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TreeTableColumn<S, T>.treeTableViewp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TreeTableView<S>>
    get() = treeTableViewProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TreeTableColumn<S, T>.cellValueFactoryp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.scene.control.TreeTableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>>>
    get() = cellValueFactoryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TreeTableColumn<S, T>.sortTypep: javafx.beans.property.ObjectProperty<javafx.scene.control.TreeTableColumn.SortType>
    get() = sortTypeProperty()!!

// javafx.scene.control.Pagination

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Pagination.maxPageIndicatorCountp: javafx.beans.property.IntegerProperty
    get() = maxPageIndicatorCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Pagination.pageCountp: javafx.beans.property.IntegerProperty
    get() = pageCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Pagination.currentPageIndexp: javafx.beans.property.IntegerProperty
    get() = currentPageIndexProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Pagination.pageFactoryp: javafx.beans.property.ObjectProperty<javafx.util.Callback<Int, javafx.scene.Node>>
    get() = pageFactoryProperty()!!

// javafx.beans.property.SetPropertyBase

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.beans.property.SetPropertyBase<E>.emptyp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = emptyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.beans.property.SetPropertyBase<E>.sizep: javafx.beans.property.ReadOnlyIntegerProperty
    get() = sizeProperty()!!

// javafx.scene.shape.CubicCurve

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.CubicCurve.controlY2p: javafx.beans.property.DoubleProperty
    get() = controlY2Property()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.CubicCurve.controlX2p: javafx.beans.property.DoubleProperty
    get() = controlX2Property()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.CubicCurve.controlY1p: javafx.beans.property.DoubleProperty
    get() = controlY1Property()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.CubicCurve.controlX1p: javafx.beans.property.DoubleProperty
    get() = controlX1Property()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.CubicCurve.startYp: javafx.beans.property.DoubleProperty
    get() = startYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.CubicCurve.startXp: javafx.beans.property.DoubleProperty
    get() = startXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.CubicCurve.endYp: javafx.beans.property.DoubleProperty
    get() = endYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.CubicCurve.endXp: javafx.beans.property.DoubleProperty
    get() = endXProperty()!!

// javafx.scene.image.ImageView

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.image.ImageView.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.image.ImageView.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.image.ImageView.imagep: javafx.beans.property.ObjectProperty<javafx.scene.image.Image>
    get() = imageProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.image.ImageView.smoothp: javafx.beans.property.BooleanProperty
    get() = smoothProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.image.ImageView.fitHeightp: javafx.beans.property.DoubleProperty
    get() = fitHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.image.ImageView.viewportp: javafx.beans.property.ObjectProperty<javafx.geometry.Rectangle2D>
    get() = viewportProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.image.ImageView.fitWidthp: javafx.beans.property.DoubleProperty
    get() = fitWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.image.ImageView.preserveRatiop: javafx.beans.property.BooleanProperty
    get() = preserveRatioProperty()!!

// javafx.scene.shape.ArcTo

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.ArcTo.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.ArcTo.radiusXp: javafx.beans.property.DoubleProperty
    get() = radiusXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.ArcTo.radiusYp: javafx.beans.property.DoubleProperty
    get() = radiusYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.ArcTo.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.ArcTo.largeArcFlagp: javafx.beans.property.BooleanProperty
    get() = largeArcFlagProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.ArcTo.sweepFlagp: javafx.beans.property.BooleanProperty
    get() = sweepFlagProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.ArcTo.XAxisRotationp: javafx.beans.property.DoubleProperty
    get() = XAxisRotationProperty()!!

// javafx.scene.shape.Ellipse

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Ellipse.centerXp: javafx.beans.property.DoubleProperty
    get() = centerXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Ellipse.centerYp: javafx.beans.property.DoubleProperty
    get() = centerYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Ellipse.radiusXp: javafx.beans.property.DoubleProperty
    get() = radiusXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Ellipse.radiusYp: javafx.beans.property.DoubleProperty
    get() = radiusYProperty()!!

// javafx.concurrent.Task

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Task<V>.onScheduledp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>
    get() = onScheduledProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Task<V>.onRunningp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>
    get() = onRunningProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Task<V>.onSucceededp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>
    get() = onSucceededProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Task<V>.onCancelledp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>
    get() = onCancelledProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Task<V>.onFailedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>
    get() = onFailedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Task<V>.exceptionp: javafx.beans.property.ReadOnlyObjectProperty<Throwable>
    get() = exceptionProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Task<V>.workDonep: javafx.beans.property.ReadOnlyDoubleProperty
    get() = workDoneProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Task<V>.totalWorkp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = totalWorkProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Task<V>.progressp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = progressProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Task<V>.runningp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = runningProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Task<V>.messagep: javafx.beans.property.ReadOnlyStringProperty
    get() = messageProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Task<V>.titlep: javafx.beans.property.ReadOnlyStringProperty
    get() = titleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Task<V>.statep: javafx.beans.property.ReadOnlyObjectProperty<javafx.concurrent.Worker.State>
    get() = stateProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <V> javafx.concurrent.Task<V>.valuep: javafx.beans.property.ReadOnlyObjectProperty<V>
    get() = valueProperty()!!

// javafx.scene.shape.VLineTo

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.VLineTo.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

// javafx.beans.property.ReadOnlyLongWrapper

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.beans.property.ReadOnlyLongWrapper.getReadOnlyp: javafx.beans.property.ReadOnlyLongProperty
    get() = getReadOnlyProperty()!!

// javafx.scene.shape.Sphere

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Sphere.radiusp: javafx.beans.property.DoubleProperty
    get() = radiusProperty()!!

// javafx.scene.layout.HBox

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.HBox.alignmentp: javafx.beans.property.ObjectProperty<javafx.geometry.Pos>
    get() = alignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.HBox.fillHeightp: javafx.beans.property.BooleanProperty
    get() = fillHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.HBox.spacingp: javafx.beans.property.DoubleProperty
    get() = spacingProperty()!!

// javafx.collections.transformation.SortedList

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.collections.transformation.SortedList<E>.comparatorp: javafx.beans.property.ObjectProperty<java.util.Comparator<in E>>
    get() = comparatorProperty()!!

// javafx.stage.Stage

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Stage.resizablep: javafx.beans.property.BooleanProperty
    get() = resizableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Stage.titlep: javafx.beans.property.StringProperty
    get() = titleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Stage.fullScreenp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = fullScreenProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Stage.iconifiedp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = iconifiedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Stage.maximizedp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = maximizedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Stage.fullScreenExitKeyp: javafx.beans.property.ObjectProperty<javafx.scene.input.KeyCombination>
    get() = fullScreenExitKeyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Stage.fullScreenExitHintp: javafx.beans.property.ObjectProperty<String>
    get() = fullScreenExitHintProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Stage.minWidthp: javafx.beans.property.DoubleProperty
    get() = minWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Stage.minHeightp: javafx.beans.property.DoubleProperty
    get() = minHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Stage.maxWidthp: javafx.beans.property.DoubleProperty
    get() = maxWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.Stage.maxHeightp: javafx.beans.property.DoubleProperty
    get() = maxHeightProperty()!!

// javafx.scene.chart.CategoryAxis

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.CategoryAxis.startMarginp: javafx.beans.property.DoubleProperty
    get() = startMarginProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.CategoryAxis.endMarginp: javafx.beans.property.DoubleProperty
    get() = endMarginProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.CategoryAxis.gapStartAndEndp: javafx.beans.property.BooleanProperty
    get() = gapStartAndEndProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.CategoryAxis.categorySpacingp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = categorySpacingProperty()!!

// javafx.scene.control.cell.TextFieldTableCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.cell.TextFieldTableCell<S, T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

// javafx.animation.FillTransition

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.FillTransition.durationp: javafx.beans.property.ObjectProperty<javafx.util.Duration>
    get() = durationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.FillTransition.fromValuep: javafx.beans.property.ObjectProperty<javafx.scene.paint.Color>
    get() = fromValueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.FillTransition.toValuep: javafx.beans.property.ObjectProperty<javafx.scene.paint.Color>
    get() = toValueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.FillTransition.shapep: javafx.beans.property.ObjectProperty<javafx.scene.shape.Shape>
    get() = shapeProperty()!!

// javafx.scene.layout.VBox

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.VBox.fillWidthp: javafx.beans.property.BooleanProperty
    get() = fillWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.VBox.alignmentp: javafx.beans.property.ObjectProperty<javafx.geometry.Pos>
    get() = alignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.VBox.spacingp: javafx.beans.property.DoubleProperty
    get() = spacingProperty()!!

// javafx.scene.effect.Glow

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Glow.inputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = inputProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Glow.levelp: javafx.beans.property.DoubleProperty
    get() = levelProperty()!!

// javafx.scene.control.Button

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Button.defaultButtonp: javafx.beans.property.BooleanProperty
    get() = defaultButtonProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Button.cancelButtonp: javafx.beans.property.BooleanProperty
    get() = cancelButtonProperty()!!

// javafx.scene.SubScene

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.SubScene.widthp: javafx.beans.property.DoubleProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.SubScene.heightp: javafx.beans.property.DoubleProperty
    get() = heightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.SubScene.fillp: javafx.beans.property.ObjectProperty<javafx.scene.paint.Paint>
    get() = fillProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.SubScene.rootp: javafx.beans.property.ObjectProperty<javafx.scene.Parent>
    get() = rootProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.SubScene.camerap: javafx.beans.property.ObjectProperty<javafx.scene.Camera>
    get() = cameraProperty()!!

// javafx.scene.chart.StackedAreaChart

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.StackedAreaChart<X, Y>.createSymbolsp: javafx.beans.property.BooleanProperty
    get() = createSymbolsProperty()!!

// javafx.scene.control.CustomMenuItem

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.CustomMenuItem.contentp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = contentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.CustomMenuItem.hideOnClickp: javafx.beans.property.BooleanProperty
    get() = hideOnClickProperty()!!

// javafx.scene.chart.LineChart

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.LineChart<X, Y>.createSymbolsp: javafx.beans.property.BooleanProperty
    get() = createSymbolsProperty()!!

// javafx.scene.control.TreeCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeCell<T>.treeItemp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TreeItem<T>>
    get() = treeItemProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeCell<T>.disclosureNodep: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = disclosureNodeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeCell<T>.treeViewp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TreeView<T>>
    get() = treeViewProperty()!!

// javafx.scene.shape.MoveTo

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.MoveTo.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.MoveTo.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

// javafx.scene.control.cell.ComboBoxTreeTableCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.cell.ComboBoxTreeTableCell<S, T>.comboBoxEditablep: javafx.beans.property.BooleanProperty
    get() = comboBoxEditableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.cell.ComboBoxTreeTableCell<S, T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

// javafx.scene.control.ScrollBar

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollBar.orientationp: javafx.beans.property.ObjectProperty<javafx.geometry.Orientation>
    get() = orientationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollBar.valuep: javafx.beans.property.DoubleProperty
    get() = valueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollBar.minp: javafx.beans.property.DoubleProperty
    get() = minProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollBar.maxp: javafx.beans.property.DoubleProperty
    get() = maxProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollBar.visibleAmountp: javafx.beans.property.DoubleProperty
    get() = visibleAmountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollBar.unitIncrementp: javafx.beans.property.DoubleProperty
    get() = unitIncrementProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ScrollBar.blockIncrementp: javafx.beans.property.DoubleProperty
    get() = blockIncrementProperty()!!

// javafx.scene.paint.PhongMaterial

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.paint.PhongMaterial.bumpMapp: javafx.beans.property.ObjectProperty<javafx.scene.image.Image>
    get() = bumpMapProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.paint.PhongMaterial.selfIlluminationMapp: javafx.beans.property.ObjectProperty<javafx.scene.image.Image>
    get() = selfIlluminationMapProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.paint.PhongMaterial.specularMapp: javafx.beans.property.ObjectProperty<javafx.scene.image.Image>
    get() = specularMapProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.paint.PhongMaterial.specularColorp: javafx.beans.property.ObjectProperty<javafx.scene.paint.Color>
    get() = specularColorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.paint.PhongMaterial.diffuseMapp: javafx.beans.property.ObjectProperty<javafx.scene.image.Image>
    get() = diffuseMapProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.paint.PhongMaterial.specularPowerp: javafx.beans.property.DoubleProperty
    get() = specularPowerProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.paint.PhongMaterial.diffuseColorp: javafx.beans.property.ObjectProperty<javafx.scene.paint.Color>
    get() = diffuseColorProperty()!!

// javafx.scene.chart.ValueAxis

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T:Number> javafx.scene.chart.ValueAxis<T>.minorTickCountp: javafx.beans.property.IntegerProperty
    get() = minorTickCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T:Number> javafx.scene.chart.ValueAxis<T>.scalep: javafx.beans.property.ReadOnlyDoubleProperty
    get() = scaleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T:Number> javafx.scene.chart.ValueAxis<T>.upperBoundp: javafx.beans.property.DoubleProperty
    get() = upperBoundProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T:Number> javafx.scene.chart.ValueAxis<T>.lowerBoundp: javafx.beans.property.DoubleProperty
    get() = lowerBoundProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T:Number> javafx.scene.chart.ValueAxis<T>.tickLabelFormatterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = tickLabelFormatterProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T:Number> javafx.scene.chart.ValueAxis<T>.minorTickLengthp: javafx.beans.property.DoubleProperty
    get() = minorTickLengthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T:Number> javafx.scene.chart.ValueAxis<T>.minorTickVisiblep: javafx.beans.property.BooleanProperty
    get() = minorTickVisibleProperty()!!

// javafx.animation.ScaleTransition

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.ScaleTransition.nodep: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = nodeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.ScaleTransition.durationp: javafx.beans.property.ObjectProperty<javafx.util.Duration>
    get() = durationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.ScaleTransition.fromXp: javafx.beans.property.DoubleProperty
    get() = fromXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.ScaleTransition.fromYp: javafx.beans.property.DoubleProperty
    get() = fromYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.ScaleTransition.fromZp: javafx.beans.property.DoubleProperty
    get() = fromZProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.ScaleTransition.toXp: javafx.beans.property.DoubleProperty
    get() = toXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.ScaleTransition.toYp: javafx.beans.property.DoubleProperty
    get() = toYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.ScaleTransition.toZp: javafx.beans.property.DoubleProperty
    get() = toZProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.ScaleTransition.byXp: javafx.beans.property.DoubleProperty
    get() = byXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.ScaleTransition.byYp: javafx.beans.property.DoubleProperty
    get() = byYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.animation.ScaleTransition.byZp: javafx.beans.property.DoubleProperty
    get() = byZProperty()!!

// javafx.scene.control.ToolBar

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ToolBar.orientationp: javafx.beans.property.ObjectProperty<javafx.geometry.Orientation>
    get() = orientationProperty()!!

// javafx.scene.control.SplitPane

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.SplitPane.orientationp: javafx.beans.property.ObjectProperty<javafx.geometry.Orientation>
    get() = orientationProperty()!!

// javafx.scene.control.Tab

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tab.idp: javafx.beans.property.StringProperty
    get() = idProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tab.stylep: javafx.beans.property.StringProperty
    get() = styleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tab.disablep: javafx.beans.property.BooleanProperty
    get() = disableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tab.disabledp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = disabledProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tab.tabPanep: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TabPane>
    get() = tabPaneProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tab.closablep: javafx.beans.property.BooleanProperty
    get() = closableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tab.onClosedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.Event>>
    get() = onClosedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tab.onSelectionChangedp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.Event>>
    get() = onSelectionChangedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tab.selectedp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = selectedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tab.textp: javafx.beans.property.StringProperty
    get() = textProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tab.graphicp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = graphicProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tab.tooltipp: javafx.beans.property.ObjectProperty<javafx.scene.control.Tooltip>
    get() = tooltipProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tab.contextMenup: javafx.beans.property.ObjectProperty<javafx.scene.control.ContextMenu>
    get() = contextMenuProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tab.contentp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = contentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Tab.onCloseRequestp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.Event>>
    get() = onCloseRequestProperty()!!

// javafx.scene.control.CheckMenuItem

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.CheckMenuItem.selectedp: javafx.beans.property.BooleanProperty
    get() = selectedProperty()!!

// javafx.scene.control.SplitPane.Divider

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.SplitPane.Divider.positionp: javafx.beans.property.DoubleProperty
    get() = positionProperty()!!

// javafx.scene.control.TextField

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextField.prefColumnCountp: javafx.beans.property.IntegerProperty
    get() = prefColumnCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextField.alignmentp: javafx.beans.property.ObjectProperty<javafx.geometry.Pos>
    get() = alignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextField.onActionp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.ActionEvent>>
    get() = onActionProperty()!!

// javafx.scene.effect.Light.Point

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Light.Point.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Light.Point.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Light.Point.zp: javafx.beans.property.DoubleProperty
    get() = zProperty()!!

// javafx.scene.media.MediaView

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaView.onErrorp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent>>
    get() = onErrorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaView.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaView.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaView.smoothp: javafx.beans.property.BooleanProperty
    get() = smoothProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaView.fitHeightp: javafx.beans.property.DoubleProperty
    get() = fitHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaView.viewportp: javafx.beans.property.ObjectProperty<javafx.geometry.Rectangle2D>
    get() = viewportProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaView.fitWidthp: javafx.beans.property.DoubleProperty
    get() = fitWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaView.mediaPlayerp: javafx.beans.property.ObjectProperty<javafx.scene.media.MediaPlayer>
    get() = mediaPlayerProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.MediaView.preserveRatiop: javafx.beans.property.BooleanProperty
    get() = preserveRatioProperty()!!

// javafx.scene.control.TableCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableCell<S, T>.tableColumnp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TableColumn<S, T>>
    get() = tableColumnProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableCell<S, T>.tableViewp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TableView<S>>
    get() = tableViewProperty()!!

// javafx.beans.binding.SetBinding

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.beans.binding.SetBinding<E>.emptyp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = emptyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.beans.binding.SetBinding<E>.sizep: javafx.beans.property.ReadOnlyIntegerProperty
    get() = sizeProperty()!!

// javafx.scene.shape.Circle

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Circle.centerXp: javafx.beans.property.DoubleProperty
    get() = centerXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Circle.centerYp: javafx.beans.property.DoubleProperty
    get() = centerYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Circle.radiusp: javafx.beans.property.DoubleProperty
    get() = radiusProperty()!!

// javafx.scene.control.CheckBox

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.CheckBox.indeterminatep: javafx.beans.property.BooleanProperty
    get() = indeterminateProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.CheckBox.allowIndeterminatep: javafx.beans.property.BooleanProperty
    get() = allowIndeterminateProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.CheckBox.selectedp: javafx.beans.property.BooleanProperty
    get() = selectedProperty()!!

// javafx.scene.layout.FlowPane

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.FlowPane.orientationp: javafx.beans.property.ObjectProperty<javafx.geometry.Orientation>
    get() = orientationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.FlowPane.columnHalignmentp: javafx.beans.property.ObjectProperty<javafx.geometry.HPos>
    get() = columnHalignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.FlowPane.hgapp: javafx.beans.property.DoubleProperty
    get() = hgapProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.FlowPane.vgapp: javafx.beans.property.DoubleProperty
    get() = vgapProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.FlowPane.alignmentp: javafx.beans.property.ObjectProperty<javafx.geometry.Pos>
    get() = alignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.FlowPane.rowValignmentp: javafx.beans.property.ObjectProperty<javafx.geometry.VPos>
    get() = rowValignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.FlowPane.prefWrapLengthp: javafx.beans.property.DoubleProperty
    get() = prefWrapLengthProperty()!!

// javafx.scene.control.ButtonBase

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ButtonBase.armedp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = armedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ButtonBase.onActionp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.ActionEvent>>
    get() = onActionProperty()!!

// javafx.scene.effect.ColorAdjust

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.ColorAdjust.huep: javafx.beans.property.DoubleProperty
    get() = hueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.ColorAdjust.saturationp: javafx.beans.property.DoubleProperty
    get() = saturationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.ColorAdjust.brightnessp: javafx.beans.property.DoubleProperty
    get() = brightnessProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.ColorAdjust.contrastp: javafx.beans.property.DoubleProperty
    get() = contrastProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.ColorAdjust.inputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = inputProperty()!!

// javafx.scene.layout.BorderPane

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.BorderPane.centerp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = centerProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.BorderPane.topp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = topProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.BorderPane.bottomp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = bottomProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.BorderPane.leftp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = leftProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.BorderPane.rightp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = rightProperty()!!

// javafx.scene.transform.Shear

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Shear.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Shear.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Shear.pivotXp: javafx.beans.property.DoubleProperty
    get() = pivotXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Shear.pivotYp: javafx.beans.property.DoubleProperty
    get() = pivotYProperty()!!

// javafx.beans.property.ListPropertyBase

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.beans.property.ListPropertyBase<E>.emptyp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = emptyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <E> javafx.beans.property.ListPropertyBase<E>.sizep: javafx.beans.property.ReadOnlyIntegerProperty
    get() = sizeProperty()!!

// javafx.scene.effect.SepiaTone

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.SepiaTone.inputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = inputProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.SepiaTone.levelp: javafx.beans.property.DoubleProperty
    get() = levelProperty()!!

// javafx.scene.shape.SVGPath

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.SVGPath.fillRulep: javafx.beans.property.ObjectProperty<javafx.scene.shape.FillRule>
    get() = fillRuleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.SVGPath.contentp: javafx.beans.property.StringProperty
    get() = contentProperty()!!

// javafx.scene.control.Skinnable

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Skinnable.skinp: javafx.beans.property.ObjectProperty<javafx.scene.control.Skin<*>>
    get() = skinProperty()!!

// javafx.scene.control.TableSelectionModel

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TableSelectionModel<T>.cellSelectionEnabledp: javafx.beans.property.BooleanProperty
    get() = cellSelectionEnabledProperty()!!

// javafx.scene.layout.GridPane

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.GridPane.hgapp: javafx.beans.property.DoubleProperty
    get() = hgapProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.GridPane.vgapp: javafx.beans.property.DoubleProperty
    get() = vgapProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.GridPane.alignmentp: javafx.beans.property.ObjectProperty<javafx.geometry.Pos>
    get() = alignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.GridPane.gridLinesVisiblep: javafx.beans.property.BooleanProperty
    get() = gridLinesVisibleProperty()!!

// javafx.scene.chart.XYChart

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.XYChart<X, Y>.datap: javafx.beans.property.ObjectProperty<javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X, Y>>>
    get() = dataProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.XYChart<X, Y>.verticalGridLinesVisiblep: javafx.beans.property.BooleanProperty
    get() = verticalGridLinesVisibleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.XYChart<X, Y>.horizontalGridLinesVisiblep: javafx.beans.property.BooleanProperty
    get() = horizontalGridLinesVisibleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.XYChart<X, Y>.alternativeColumnFillVisiblep: javafx.beans.property.BooleanProperty
    get() = alternativeColumnFillVisibleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.XYChart<X, Y>.alternativeRowFillVisiblep: javafx.beans.property.BooleanProperty
    get() = alternativeRowFillVisibleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.XYChart<X, Y>.verticalZeroLineVisiblep: javafx.beans.property.BooleanProperty
    get() = verticalZeroLineVisibleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.XYChart<X, Y>.horizontalZeroLineVisiblep: javafx.beans.property.BooleanProperty
    get() = horizontalZeroLineVisibleProperty()!!

// javafx.scene.control.Control

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Control.skinp: javafx.beans.property.ObjectProperty<javafx.scene.control.Skin<*>>
    get() = skinProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Control.tooltipp: javafx.beans.property.ObjectProperty<javafx.scene.control.Tooltip>
    get() = tooltipProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Control.contextMenup: javafx.beans.property.ObjectProperty<javafx.scene.control.ContextMenu>
    get() = contextMenuProperty()!!

// javafx.scene.effect.ImageInput

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.ImageInput.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.ImageInput.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.ImageInput.sourcep: javafx.beans.property.ObjectProperty<javafx.scene.image.Image>
    get() = sourceProperty()!!

// javafx.scene.control.cell.CheckBoxTreeTableCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.cell.CheckBoxTreeTableCell<S, T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.cell.CheckBoxTreeTableCell<S, T>.selectedStateCallbackp: javafx.beans.property.ObjectProperty<javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>>>
    get() = selectedStateCallbackProperty()!!

// javafx.scene.effect.PerspectiveTransform

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.PerspectiveTransform.ulyp: javafx.beans.property.DoubleProperty
    get() = ulyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.PerspectiveTransform.ulxp: javafx.beans.property.DoubleProperty
    get() = ulxProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.PerspectiveTransform.llyp: javafx.beans.property.DoubleProperty
    get() = llyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.PerspectiveTransform.llxp: javafx.beans.property.DoubleProperty
    get() = llxProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.PerspectiveTransform.lryp: javafx.beans.property.DoubleProperty
    get() = lryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.PerspectiveTransform.lrxp: javafx.beans.property.DoubleProperty
    get() = lrxProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.PerspectiveTransform.uryp: javafx.beans.property.DoubleProperty
    get() = uryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.PerspectiveTransform.urxp: javafx.beans.property.DoubleProperty
    get() = urxProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.PerspectiveTransform.inputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = inputProperty()!!

// javafx.scene.shape.HLineTo

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.HLineTo.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

// javafx.scene.layout.StackPane

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.StackPane.alignmentp: javafx.beans.property.ObjectProperty<javafx.geometry.Pos>
    get() = alignmentProperty()!!

// javafx.beans.property.ReadOnlyFloatWrapper

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.beans.property.ReadOnlyFloatWrapper.getReadOnlyp: javafx.beans.property.ReadOnlyFloatProperty
    get() = getReadOnlyProperty()!!

// javafx.scene.media.AudioClip

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.AudioClip.ratep: javafx.beans.property.DoubleProperty
    get() = rateProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.AudioClip.cycleCountp: javafx.beans.property.IntegerProperty
    get() = cycleCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.AudioClip.volumep: javafx.beans.property.DoubleProperty
    get() = volumeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.AudioClip.balancep: javafx.beans.property.DoubleProperty
    get() = balanceProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.AudioClip.priorityp: javafx.beans.property.IntegerProperty
    get() = priorityProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.AudioClip.panp: javafx.beans.property.DoubleProperty
    get() = panProperty()!!

// javafx.scene.effect.Lighting

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Lighting.specularExponentp: javafx.beans.property.DoubleProperty
    get() = specularExponentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Lighting.diffuseConstantp: javafx.beans.property.DoubleProperty
    get() = diffuseConstantProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Lighting.specularConstantp: javafx.beans.property.DoubleProperty
    get() = specularConstantProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Lighting.surfaceScalep: javafx.beans.property.DoubleProperty
    get() = surfaceScaleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Lighting.lightp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Light>
    get() = lightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Lighting.bumpInputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = bumpInputProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Lighting.contentInputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = contentInputProperty()!!

// javafx.scene.chart.PieChart

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.PieChart.datap: javafx.beans.property.ObjectProperty<javafx.collections.ObservableList<javafx.scene.chart.PieChart.Data>>
    get() = dataProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.PieChart.startAnglep: javafx.beans.property.DoubleProperty
    get() = startAngleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.PieChart.clockwisep: javafx.beans.property.BooleanProperty
    get() = clockwiseProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.PieChart.labelLineLengthp: javafx.beans.property.DoubleProperty
    get() = labelLineLengthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.PieChart.labelsVisiblep: javafx.beans.property.BooleanProperty
    get() = labelsVisibleProperty()!!

// javafx.scene.control.ComboBoxBase

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBoxBase<T>.valuep: javafx.beans.property.ObjectProperty<T>
    get() = valueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBoxBase<T>.editablep: javafx.beans.property.BooleanProperty
    get() = editableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBoxBase<T>.armedp: javafx.beans.property.BooleanProperty
    get() = armedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBoxBase<T>.onActionp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.ActionEvent>>
    get() = onActionProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBoxBase<T>.promptTextp: javafx.beans.property.StringProperty
    get() = promptTextProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBoxBase<T>.showingp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = showingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBoxBase<T>.onShowingp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.Event>>
    get() = onShowingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBoxBase<T>.onShownp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.Event>>
    get() = onShownProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBoxBase<T>.onHidingp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.Event>>
    get() = onHidingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.ComboBoxBase<T>.onHiddenp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.Event>>
    get() = onHiddenProperty()!!

// javafx.scene.control.cell.CheckBoxListCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.cell.CheckBoxListCell<T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.cell.CheckBoxListCell<T>.selectedStateCallbackp: javafx.beans.property.ObjectProperty<javafx.util.Callback<T, javafx.beans.value.ObservableValue<Boolean>>>
    get() = selectedStateCallbackProperty()!!

// javafx.scene.control.TableRow

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TableRow<T>.tableViewp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TableView<T>>
    get() = tableViewProperty()!!

// javafx.scene.control.CheckBoxTreeItem

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.CheckBoxTreeItem<T>.indeterminatep: javafx.beans.property.BooleanProperty
    get() = indeterminateProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.CheckBoxTreeItem<T>.independentp: javafx.beans.property.BooleanProperty
    get() = independentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.CheckBoxTreeItem<T>.selectedp: javafx.beans.property.BooleanProperty
    get() = selectedProperty()!!

// javafx.scene.control.FocusModel

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.FocusModel<T>.focusedIndexp: javafx.beans.property.ReadOnlyIntegerProperty
    get() = focusedIndexProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.FocusModel<T>.focusedItemp: javafx.beans.property.ReadOnlyObjectProperty<T>
    get() = focusedItemProperty()!!

// javafx.scene.chart.NumberAxis

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.NumberAxis.tickUnitp: javafx.beans.property.DoubleProperty
    get() = tickUnitProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.NumberAxis.forceZeroInRangep: javafx.beans.property.BooleanProperty
    get() = forceZeroInRangeProperty()!!

// javafx.scene.chart.AreaChart

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.AreaChart<X, Y>.createSymbolsp: javafx.beans.property.BooleanProperty
    get() = createSymbolsProperty()!!

// javafx.stage.DirectoryChooser

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.DirectoryChooser.titlep: javafx.beans.property.StringProperty
    get() = titleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.DirectoryChooser.initialDirectoryp: javafx.beans.property.ObjectProperty<java.io.File>
    get() = initialDirectoryProperty()!!

// javafx.stage.PopupWindow

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.PopupWindow.ownerWindowp: javafx.beans.property.ReadOnlyObjectProperty<javafx.stage.Window>
    get() = ownerWindowProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.PopupWindow.ownerNodep: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.Node>
    get() = ownerNodeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.PopupWindow.autoFixp: javafx.beans.property.BooleanProperty
    get() = autoFixProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.PopupWindow.autoHidep: javafx.beans.property.BooleanProperty
    get() = autoHideProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.PopupWindow.onAutoHidep: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.event.Event>>
    get() = onAutoHideProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.PopupWindow.hideOnEscapep: javafx.beans.property.BooleanProperty
    get() = hideOnEscapeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.PopupWindow.consumeAutoHidingEventsp: javafx.beans.property.BooleanProperty
    get() = consumeAutoHidingEventsProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.PopupWindow.anchorXp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = anchorXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.PopupWindow.anchorYp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = anchorYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.stage.PopupWindow.anchorLocationp: javafx.beans.property.ObjectProperty<javafx.stage.PopupWindow.AnchorLocation>
    get() = anchorLocationProperty()!!

// javafx.scene.control.RadioMenuItem

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.RadioMenuItem.toggleGroupp: javafx.beans.property.ObjectProperty<javafx.scene.control.ToggleGroup>
    get() = toggleGroupProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.RadioMenuItem.selectedp: javafx.beans.property.BooleanProperty
    get() = selectedProperty()!!

// javafx.print.PrinterJob

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.print.PrinterJob.printerp: javafx.beans.property.ObjectProperty<javafx.print.Printer>
    get() = printerProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.print.PrinterJob.jobStatusp: javafx.beans.property.ReadOnlyObjectProperty<javafx.print.PrinterJob.JobStatus>
    get() = jobStatusProperty()!!

// javafx.scene.control.Slider

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Slider.orientationp: javafx.beans.property.ObjectProperty<javafx.geometry.Orientation>
    get() = orientationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Slider.showTickLabelsp: javafx.beans.property.BooleanProperty
    get() = showTickLabelsProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Slider.minorTickCountp: javafx.beans.property.IntegerProperty
    get() = minorTickCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Slider.snapToTicksp: javafx.beans.property.BooleanProperty
    get() = snapToTicksProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Slider.majorTickUnitp: javafx.beans.property.DoubleProperty
    get() = majorTickUnitProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Slider.valuep: javafx.beans.property.DoubleProperty
    get() = valueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Slider.minp: javafx.beans.property.DoubleProperty
    get() = minProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Slider.maxp: javafx.beans.property.DoubleProperty
    get() = maxProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Slider.valueChangingp: javafx.beans.property.BooleanProperty
    get() = valueChangingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Slider.labelFormatterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<Double>>
    get() = labelFormatterProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Slider.blockIncrementp: javafx.beans.property.DoubleProperty
    get() = blockIncrementProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Slider.showTickMarksp: javafx.beans.property.BooleanProperty
    get() = showTickMarksProperty()!!

// javafx.scene.control.MenuButton

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.MenuButton.popupSidep: javafx.beans.property.ObjectProperty<javafx.geometry.Side>
    get() = popupSideProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.MenuButton.showingp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = showingProperty()!!

// javafx.scene.control.Separator

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Separator.orientationp: javafx.beans.property.ObjectProperty<javafx.geometry.Orientation>
    get() = orientationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Separator.halignmentp: javafx.beans.property.ObjectProperty<javafx.geometry.HPos>
    get() = halignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Separator.valignmentp: javafx.beans.property.ObjectProperty<javafx.geometry.VPos>
    get() = valignmentProperty()!!

// javafx.scene.chart.PieChart.Data

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.PieChart.Data.chartp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.chart.PieChart>
    get() = chartProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.PieChart.Data.namep: javafx.beans.property.StringProperty
    get() = nameProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.PieChart.Data.pieValuep: javafx.beans.property.DoubleProperty
    get() = pieValueProperty()!!

// javafx.beans.property.ReadOnlyStringWrapper

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.beans.property.ReadOnlyStringWrapper.getReadOnlyp: javafx.beans.property.ReadOnlyStringProperty
    get() = getReadOnlyProperty()!!

// javafx.scene.control.TextInputControl

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextInputControl.editablep: javafx.beans.property.BooleanProperty
    get() = editableProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextInputControl.textp: javafx.beans.property.StringProperty
    get() = textProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextInputControl.fontp: javafx.beans.property.ObjectProperty<javafx.scene.text.Font>
    get() = fontProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextInputControl.promptTextp: javafx.beans.property.StringProperty
    get() = promptTextProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextInputControl.lengthp: javafx.beans.property.ReadOnlyIntegerProperty
    get() = lengthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextInputControl.selectionp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.IndexRange>
    get() = selectionProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextInputControl.selectedTextp: javafx.beans.property.ReadOnlyStringProperty
    get() = selectedTextProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextInputControl.anchorp: javafx.beans.property.ReadOnlyIntegerProperty
    get() = anchorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextInputControl.caretPositionp: javafx.beans.property.ReadOnlyIntegerProperty
    get() = caretPositionProperty()!!

// javafx.scene.control.Cell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.Cell<T>.emptyp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = emptyProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.Cell<T>.itemp: javafx.beans.property.ObjectProperty<T>
    get() = itemProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.Cell<T>.selectedp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = selectedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.Cell<T>.editingp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = editingProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.Cell<T>.editablep: javafx.beans.property.BooleanProperty
    get() = editableProperty()!!

// javafx.scene.control.TableColumn

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumn<S, T>.cellFactoryp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.scene.control.TableColumn<S, T>, javafx.scene.control.TableCell<S, T>>>
    get() = cellFactoryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumn<S, T>.onEditStartp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>>
    get() = onEditStartProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumn<S, T>.onEditCommitp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>>
    get() = onEditCommitProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumn<S, T>.onEditCancelp: javafx.beans.property.ObjectProperty<javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>>
    get() = onEditCancelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumn<S, T>.cellValueFactoryp: javafx.beans.property.ObjectProperty<javafx.util.Callback<javafx.scene.control.TableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>>>
    get() = cellValueFactoryProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumn<S, T>.sortTypep: javafx.beans.property.ObjectProperty<javafx.scene.control.TableColumn.SortType>
    get() = sortTypeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumn<S, T>.tableViewp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TableView<S>>
    get() = tableViewProperty()!!

// javafx.scene.control.TreeItem

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeItem<T>.parentp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TreeItem<T>>
    get() = parentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeItem<T>.valuep: javafx.beans.property.ObjectProperty<T>
    get() = valueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeItem<T>.expandedp: javafx.beans.property.BooleanProperty
    get() = expandedProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeItem<T>.leafp: javafx.beans.property.ReadOnlyBooleanProperty
    get() = leafProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TreeItem<T>.graphicp: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = graphicProperty()!!

// javafx.scene.shape.Arc

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Arc.centerXp: javafx.beans.property.DoubleProperty
    get() = centerXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Arc.centerYp: javafx.beans.property.DoubleProperty
    get() = centerYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Arc.radiusXp: javafx.beans.property.DoubleProperty
    get() = radiusXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Arc.radiusYp: javafx.beans.property.DoubleProperty
    get() = radiusYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Arc.startAnglep: javafx.beans.property.DoubleProperty
    get() = startAngleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Arc.typp: javafx.beans.property.ObjectProperty<javafx.scene.shape.ArcType>
    get() = typeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Arc.lengthp: javafx.beans.property.DoubleProperty
    get() = lengthProperty()!!

// javafx.scene.control.TreeTableView.TreeTableViewFocusModel

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.TreeTableView.TreeTableViewFocusModel<S>.focusedCellp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.control.TreeTablePosition<S, *>>
    get() = focusedCellProperty()!!

// javafx.scene.shape.PathElement

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.PathElement.absolutep: javafx.beans.property.BooleanProperty
    get() = absoluteProperty()!!

// javafx.scene.transform.Scale

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Scale.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Scale.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Scale.pivotXp: javafx.beans.property.DoubleProperty
    get() = pivotXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Scale.pivotYp: javafx.beans.property.DoubleProperty
    get() = pivotYProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Scale.pivotZp: javafx.beans.property.DoubleProperty
    get() = pivotZProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.transform.Scale.zp: javafx.beans.property.DoubleProperty
    get() = zProperty()!!

// javafx.scene.chart.XYChart.Series

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.nodep: javafx.beans.property.ObjectProperty<javafx.scene.Node>
    get() = nodeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.chartp: javafx.beans.property.ReadOnlyObjectProperty<javafx.scene.chart.XYChart<X, Y>>
    get() = chartProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.namep: javafx.beans.property.StringProperty
    get() = nameProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.datap: javafx.beans.property.ObjectProperty<javafx.collections.ObservableList<javafx.scene.chart.XYChart.Data<X, Y>>>
    get() = dataProperty()!!

// javafx.beans.property.ReadOnlyIntegerWrapper

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.beans.property.ReadOnlyIntegerWrapper.getReadOnlyp: javafx.beans.property.ReadOnlyIntegerProperty
    get() = getReadOnlyProperty()!!

// javafx.scene.layout.TilePane

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.TilePane.orientationp: javafx.beans.property.ObjectProperty<javafx.geometry.Orientation>
    get() = orientationProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.TilePane.hgapp: javafx.beans.property.DoubleProperty
    get() = hgapProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.TilePane.vgapp: javafx.beans.property.DoubleProperty
    get() = vgapProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.TilePane.alignmentp: javafx.beans.property.ObjectProperty<javafx.geometry.Pos>
    get() = alignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.TilePane.tileWidthp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = tileWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.TilePane.tileHeightp: javafx.beans.property.ReadOnlyDoubleProperty
    get() = tileHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.TilePane.prefTileHeightp: javafx.beans.property.DoubleProperty
    get() = prefTileHeightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.TilePane.prefRowsp: javafx.beans.property.IntegerProperty
    get() = prefRowsProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.TilePane.prefTileWidthp: javafx.beans.property.DoubleProperty
    get() = prefTileWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.TilePane.prefColumnsp: javafx.beans.property.IntegerProperty
    get() = prefColumnsProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.TilePane.tileAlignmentp: javafx.beans.property.ObjectProperty<javafx.geometry.Pos>
    get() = tileAlignmentProperty()!!

// javafx.scene.control.TextArea

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextArea.prefColumnCountp: javafx.beans.property.IntegerProperty
    get() = prefColumnCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextArea.prefRowCountp: javafx.beans.property.IntegerProperty
    get() = prefRowCountProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextArea.scrollTopp: javafx.beans.property.DoubleProperty
    get() = scrollTopProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextArea.scrollLeftp: javafx.beans.property.DoubleProperty
    get() = scrollLeftProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.TextArea.wrapTextp: javafx.beans.property.BooleanProperty
    get() = wrapTextProperty()!!

// javafx.scene.shape.CubicCurveTo

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.CubicCurveTo.controlY2p: javafx.beans.property.DoubleProperty
    get() = controlY2Property()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.CubicCurveTo.controlX2p: javafx.beans.property.DoubleProperty
    get() = controlX2Property()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.CubicCurveTo.yp: javafx.beans.property.DoubleProperty
    get() = yProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.CubicCurveTo.xp: javafx.beans.property.DoubleProperty
    get() = xProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.CubicCurveTo.controlY1p: javafx.beans.property.DoubleProperty
    get() = controlY1Property()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.CubicCurveTo.controlX1p: javafx.beans.property.DoubleProperty
    get() = controlX1Property()!!

// javafx.scene.control.cell.TextFieldTreeCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.cell.TextFieldTreeCell<T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

// javafx.scene.chart.Axis.TickMark

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.chart.Axis.TickMark<T>.labelp: javafx.beans.binding.StringExpression
    get() = labelProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.chart.Axis.TickMark<T>.valuep: javafx.beans.binding.ObjectExpression<T>
    get() = valueProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.chart.Axis.TickMark<T>.positionp: javafx.beans.binding.DoubleExpression
    get() = positionProperty()!!

// javafx.scene.effect.InnerShadow

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.InnerShadow.chokep: javafx.beans.property.DoubleProperty
    get() = chokeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.InnerShadow.widthp: javafx.beans.property.DoubleProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.InnerShadow.heightp: javafx.beans.property.DoubleProperty
    get() = heightProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.InnerShadow.colorp: javafx.beans.property.ObjectProperty<javafx.scene.paint.Color>
    get() = colorProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.InnerShadow.inputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = inputProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.InnerShadow.radiusp: javafx.beans.property.DoubleProperty
    get() = radiusProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.InnerShadow.blurTypep: javafx.beans.property.ObjectProperty<javafx.scene.effect.BlurType>
    get() = blurTypeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.InnerShadow.offsetXp: javafx.beans.property.DoubleProperty
    get() = offsetXProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.InnerShadow.offsetYp: javafx.beans.property.DoubleProperty
    get() = offsetYProperty()!!

// javafx.scene.control.SelectionModel

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.SelectionModel<T>.selectedIndexp: javafx.beans.property.ReadOnlyIntegerProperty
    get() = selectedIndexProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.SelectionModel<T>.selectedItemp: javafx.beans.property.ReadOnlyObjectProperty<T>
    get() = selectedItemProperty()!!

// javafx.scene.control.Toggle

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Toggle.toggleGroupp: javafx.beans.property.ObjectProperty<javafx.scene.control.ToggleGroup>
    get() = toggleGroupProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.Toggle.selectedp: javafx.beans.property.BooleanProperty
    get() = selectedProperty()!!

// javafx.scene.chart.Chart

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.Chart.titlep: javafx.beans.property.StringProperty
    get() = titleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.Chart.titleSidep: javafx.beans.property.ObjectProperty<javafx.geometry.Side>
    get() = titleSideProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.Chart.legendVisiblep: javafx.beans.property.BooleanProperty
    get() = legendVisibleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.Chart.legendSidep: javafx.beans.property.ObjectProperty<javafx.geometry.Side>
    get() = legendSideProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.chart.Chart.animatedp: javafx.beans.property.BooleanProperty
    get() = animatedProperty()!!

// javafx.scene.web.WebHistory

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebHistory.currentIndexp: javafx.beans.property.ReadOnlyIntegerProperty
    get() = currentIndexProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.web.WebHistory.maxSizep: javafx.beans.property.IntegerProperty
    get() = maxSizeProperty()!!

// javafx.beans.property.ReadOnlyObjectWrapper

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.beans.property.ReadOnlyObjectWrapper<T>.getReadOnlyp: javafx.beans.property.ReadOnlyObjectProperty<T>
    get() = getReadOnlyProperty()!!

// javafx.scene.layout.ColumnConstraints

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.ColumnConstraints.percentWidthp: javafx.beans.property.DoubleProperty
    get() = percentWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.ColumnConstraints.hgrowp: javafx.beans.property.ObjectProperty<javafx.scene.layout.Priority>
    get() = hgrowProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.ColumnConstraints.halignmentp: javafx.beans.property.ObjectProperty<javafx.geometry.HPos>
    get() = halignmentProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.ColumnConstraints.fillWidthp: javafx.beans.property.BooleanProperty
    get() = fillWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.ColumnConstraints.minWidthp: javafx.beans.property.DoubleProperty
    get() = minWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.ColumnConstraints.prefWidthp: javafx.beans.property.DoubleProperty
    get() = prefWidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.layout.ColumnConstraints.maxWidthp: javafx.beans.property.DoubleProperty
    get() = maxWidthProperty()!!

// javafx.scene.control.ProgressIndicator

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ProgressIndicator.indeterminatep: javafx.beans.property.ReadOnlyBooleanProperty
    get() = indeterminateProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.control.ProgressIndicator.progressp: javafx.beans.property.DoubleProperty
    get() = progressProperty()!!

// javafx.scene.control.cell.TextFieldTreeTableCell

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.cell.TextFieldTreeTableCell<S, T>.converterp: javafx.beans.property.ObjectProperty<javafx.util.StringConverter<T>>
    get() = converterProperty()!!

// javafx.scene.shape.Box

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Box.depthp: javafx.beans.property.DoubleProperty
    get() = depthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Box.widthp: javafx.beans.property.DoubleProperty
    get() = widthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.shape.Box.heightp: javafx.beans.property.DoubleProperty
    get() = heightProperty()!!

// javafx.scene.media.EqualizerBand

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.EqualizerBand.gainp: javafx.beans.property.DoubleProperty
    get() = gainProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.EqualizerBand.bandwidthp: javafx.beans.property.DoubleProperty
    get() = bandwidthProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.media.EqualizerBand.centerFrequencyp: javafx.beans.property.DoubleProperty
    get() = centerFrequencyProperty()!!

// javafx.scene.effect.Blend

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Blend.opacityp: javafx.beans.property.DoubleProperty
    get() = opacityProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Blend.modep: javafx.beans.property.ObjectProperty<javafx.scene.effect.BlendMode>
    get() = modeProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Blend.bottomInputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = bottomInputProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.Blend.topInputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = topInputProperty()!!

// javafx.scene.effect.MotionBlur

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.MotionBlur.anglep: javafx.beans.property.DoubleProperty
    get() = angleProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.MotionBlur.inputp: javafx.beans.property.ObjectProperty<javafx.scene.effect.Effect>
    get() = inputProperty()!!

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val  javafx.scene.effect.MotionBlur.radiusp: javafx.beans.property.DoubleProperty
    get() = radiusProperty()!!
