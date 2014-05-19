package demos.sevenguis.crud

import kotlinfx.properties.*
import kotlinfx.builders.*
import kotlinfx.bindings.*
import kotlinfx.abbreviations.*
import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.control.SelectionMode
import javafx.collections.ObservableList
import javafx.beans.property.SimpleListProperty
import javafx.collections.FXCollections
import java.util.ArrayList
import javafx.beans.value.ChangeListener
import javafx.beans.value.ObservableValue
import javafx.geometry.Pos
import javafx.collections.ListChangeListener
import java.util.function.Predicate

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
        entries.selectionModel.selectionMode = SelectionMode.SINGLE

        val externDb = arrayListOf("Emil, Hans", "Musterman, Max", "Tisch, Roman")
        val db = FXCollections.observableArrayList(externDb)!!
        // TODO: Why not anonymous function?
        db.addListener(object : ListChangeListener<String> {
            override fun onChanged(c: ListChangeListener.Change<out String>?) {
                c!!
                while (c.next()) {
                    if (c.wasReplaced()) externDb.set(c.getFrom(), c.getAddedSubList()!!.get(0))
                    else {
                        if (c.wasAdded()) externDb.add(c.getAddedSubList()!!.get(0))
                        if (c.wasRemoved()) externDb.remove(c.getFrom())
                    }
                    // TODO: Type inference fails
//                    if (c.wasReplaced()) externDb.set(c.from, c.addedSubList.get(0))
//                    else {
//                        if (c.wasAdded()) externDb.add(c.addedSubList.get(0))
//                        if (c.wasRemoved()) externDb.remove(c.from)
//                    }
                }
            }
        })
        // TODO: Why not anonymous function?
        val dbView = db.filtered(object : Predicate<String> {
            override fun test(t: String?): Boolean = true
        })!!
        entries.setItems(dbView)

        val fullname = surname.textp + ", " + name.textp
        val selectedIndex = entries.selectionModel.selectedIndexp
        // TODO: Why not anonymous function?
        prefix.textp.addListener(object : ChangeListener<String> {
            override fun changed(v: ObservableValue<out String>?, o: String?, n: String?) {
                dbView.setPredicate(object : Predicate<String> {
                    override fun test(t: String?): Boolean = t!!.startsWith(n!!)
                })
            }
        })
        create.setOnAction { db.add(fullname.v) }
        delete.setOnAction { db.remove(dbView.getSourceIndex(selectedIndex.v)) }
        update.setOnAction { db.set(dbView.getSourceIndex(selectedIndex.v), fullname.v) }
        delete.disablep bind (selectedIndex isEqualTo -1)
        update.disablep bind (selectedIndex isEqualTo -1)

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

