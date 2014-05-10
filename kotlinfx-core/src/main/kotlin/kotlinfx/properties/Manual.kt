// These are extension properties that had to be provided by hand
// as the generation script could not handle them correctly.
package kotlinfx.properties


// javafx.print.JobSettings

[suppress("UNNECESSARY_NOT_NULL_ASSERTION", "CAST_NEVER_SUCCEEDS")]
public var  javafx.print.JobSettings.pageRanges: Array<javafx.print.PageRange>
    get() = getPageRanges()!!
    set(v) = setPageRanges(*(v as Array<javafx.print.PageRange?>))

// javafx.scene.control.TableColumnBase

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.columns: javafx.collections.ObservableList<out javafx.scene.control.TableColumnBase<S,*>?>
    get() = getColumns()!!


[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TableColumnBase<S, T>.parentColumn: javafx.scene.control.TableColumnBase<S,*>
    get() = getParentColumn()!!


// javafx.scene.control.TablePosition

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S, T> javafx.scene.control.TablePosition<S, T>.tableColumn: javafx.scene.control.TableColumnBase<S,*>
    get() = getTableColumn()!!


// javafx.fxml.FXMLLoader

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public var <T> javafx.fxml.FXMLLoader.root: T
    get() = getRoot()!!
    set(v) = setRoot(v)

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public var  javafx.fxml.FXMLLoader.controllerFactory: javafx.util.Callback<Class<*>, Any>
    get() = getControllerFactory()!!
    set(v) = setControllerFactory(v)

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public var <T> javafx.fxml.FXMLLoader.controller: T
    get() = getController()!!
    set(v) = setController(v)

// javafx.scene.control.ResizeFeaturesBase

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <S> javafx.scene.control.ResizeFeaturesBase<S>.column: javafx.scene.control.TableColumnBase<S,*>
    get() = getColumn()!!


// javafx.scene.control.SplitPane

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public var  javafx.scene.control.SplitPane.dividerPositions: DoubleArray
    get() = getDividerPositions()!!
    set(v) = setDividerPositions(*v)

// javafx.scene.control.TableSelectionModel

[suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
public val <T> javafx.scene.control.TableSelectionModel<T>.selectedIndices: javafx.collections.ObservableList<Int>
    get() = getSelectedIndices()!!

