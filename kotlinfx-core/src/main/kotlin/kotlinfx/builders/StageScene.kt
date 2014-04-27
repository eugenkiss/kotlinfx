package kotlinfx.builders

import javafx.stage.Stage
import javafx.scene.Scene

import kotlinfx.properties.*
import javafx.scene.layout.Pane


public fun Stage(
stage: Stage?,
title: String = "",
f: Stage.() -> Unit): Stage {
    stage!!
    stage.title = title
    stage.f()
    return stage
}

public fun Scene(
width: Double? = null,
height: Double? = null,
f: Scene.() -> Unit): Scene {
    val scene =
        if (width != null && height != null) {
            javafx.scene.Scene(Pane(), width, height)
        } else {
            javafx.scene.Scene(Pane())
        }
    scene.f()
    return scene
}

