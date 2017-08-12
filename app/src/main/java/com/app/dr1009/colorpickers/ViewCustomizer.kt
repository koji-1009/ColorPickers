package com.app.dr1009.colorpickers

import android.databinding.BindingAdapter
import android.graphics.Color
import android.util.Log
import android.view.View

object ViewCustomizer {

    private val TAG = ViewCustomizer::class.java.simpleName

    @JvmStatic
    @BindingAdapter("r", "g", "b")
    fun setViewBackgroundRGBA(view: View, r: Int, g: Int, b: Int) {
        Log.d(TAG, "r $r g $g b $b")
        view.setBackgroundColor(Color.rgb(r, g, b))
        view.invalidate()
    }
}
