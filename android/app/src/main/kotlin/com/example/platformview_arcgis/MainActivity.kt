package com.example.platformview_arcgis

import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine

class MainActivity : FlutterActivity() {

    init {
        instance = this
    }

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        val factory = MapViewFactory()
        flutterEngine.platformViewsController.registry.registerViewFactory("mapView", factory)
    }

    companion object {
        fun getInstance(): MainActivity {
            return instance
        }
        lateinit private var instance: MainActivity
    }
}