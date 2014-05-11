package demos.sevenguis.crud

import kotlinfx.properties.*
import kotlinfx.builders.*
import kotlinfx.bindings.*
import kotlinfx.abbreviations.*
import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.control.ListView
import javafx.scene.control.SelectionMode
import javafx.collections.ObservableList
import javafx.beans.property.SimpleListProperty
import javafx.collections.FXCollections
import java.util.ArrayList
import javafx.beans.value.ChangeListener
import javafx.beans.value.ObservableValue
import javafx.scene.control.Label
import javafx.geometry.Pos

fun main(args: Array<String>) {
    Application.launch(javaClass<CRUD>())
}

class CRUD : Application() {
    override fun start(stage: Stage?) {
        val prefix = TextField { prefWidth = 60.0 }
        val name = TextField { prefWidth = 100.0 }
        val surname = TextField { prefWidth = 100.0 }
        val create = Button("Create")
        val update = Button("Update") { disable = true }
        val delete = Button("Delete") { disable = true }
        val entries = ListView<String>()
        entries.getSelectionModel()!!.setSelectionMode(SelectionMode.SINGLE) // TODO

        val database = arrayListOf("Emil, Hans", "Musterman, Max", "Tisch, Roman")
        val filterableView = FilterableView(database)
        entries.setItems(filterableView)

        val fullname = surname.textp + ", " + name.textp
        val selectedIndex = entries.getSelectionModel()!!.selectedIndexProperty()!! // TODO
        // TODO How to use closure syntax?
        prefix.textp.addListener(object : ChangeListener<String> {
            override fun changed(v: ObservableValue<out String>?, o: String?, n: String?) {
                filterableView.filterByPrefix(n!!)
            }
        })
        create.setOnAction { filterableView.create(fullname.v) }
        delete.setOnAction { filterableView.delete(selectedIndex.v) }
        update.setOnAction { filterableView.update(fullname.v, selectedIndex.v) }
        delete.disablep bind (selectedIndex eq -1)
        update.disablep bind (selectedIndex eq -1)

        Stage(stage, title = "CRUD") {
            scene = Scene {
                root = BorderPane(padding=Insets(10.0)) {
                    prefWidth = 400.0
                    prefHeight = 400.0
                    top = HBox(spacing=10.0, padding=Insets(bottom=10.0)) {
                        alignment = Pos.BASELINE_LEFT
                        + Label("Filter prefix: ") + prefix
                    }
                    center = entries
                    right = GridPane(padding=Insets(left=10.0)) {
                        hgap = 10.0
                        vgap = 10.0
                        addRow(0, Label("Name: "), name)
                        addRow(1, Label("Surname: "), surname)
                    }
                    bottom = HBox(spacing=10.0, padding=Insets(top=10.0)) {
                        + create + update + delete
                    }
                }
            }
        }.show()
    }
}


public class FilterableView(database: MutableList<String>) : SimpleListProperty<String>() {

    private val database: MutableList<String>
    private val filteredDatabase: ObservableList<String>
    private val filteredOriginalMap: MutableList<Int>
    private var cachedPrefix: String = ""

    {
        this.database = database
        filteredDatabase = FXCollections.observableArrayList()!!
        filteredDatabase.addAll(database)
        filteredOriginalMap = ArrayList<Int>()
        for (i in 0..database.lastIndex) {
            filteredOriginalMap.add(i)
        }
        this.set(filteredDatabase)
    }

    public fun filterByPrefix(prefix: String) {
        cachedPrefix = prefix
        filteredDatabase.clear()
        filteredOriginalMap.clear()
        for (i in 0..database.lastIndex) {
            val entry = database.get(i)
            if (entry.startsWith(prefix)) {
                filteredDatabase.add(entry)
                filteredOriginalMap.add(i)
            }
        }
    }

    public fun create(newEntry: String) {
        database.add(newEntry)
        if (newEntry.startsWith(cachedPrefix)) {
            filteredDatabase.add(newEntry)
            filteredOriginalMap.add(database.size() - 1)
        }
    }

    public fun update(newEntry: String, index: Int) {
        database.set(filteredOriginalMap.get(index), newEntry)
        if (newEntry.startsWith(cachedPrefix)) {
            filteredDatabase.set(index, newEntry)
        } else {
            filteredDatabase.remove(index)
            filteredOriginalMap.remove(index)
        }
    }

    public fun delete(index: Int) {
        database.remove(filteredOriginalMap.get(index))
        filteredDatabase.remove(index)
        filteredOriginalMap.remove(index)
    }

}