package com.example.platformview_arcgis

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import io.flutter.plugin.platform.PlatformView

import com.arcgismaps.ApiKey
import com.arcgismaps.ArcGISEnvironment
import com.arcgismaps.mapping.ArcGISMap
import com.arcgismaps.mapping.BasemapStyle
import com.arcgismaps.mapping.Viewpoint
import com.arcgismaps.mapping.view.MapView

//import com.example.flutter_platform_views.databinding.ActivityMainBinding

internal class MapView(context: Context, id: Int, creationParams: Map<String?, Any?>?) : PlatformView {
    private val mapView: MapView

    init {
        ArcGISEnvironment.apiKey = ApiKey.create("ARCGIS_APIKEY")

        mapView = MapView(context)
        mapView.map = ArcGISMap(BasemapStyle.ArcGISTopographic)
        mapView.setViewpoint(Viewpoint(28.538336, -81.379234, 7200.0))

        // To be added:
        MainActivity.getInstance().lifecycle.addObserver(mapView)
    }

    override fun getView(): View {
        return mapView
    }

    override fun dispose() {}
}