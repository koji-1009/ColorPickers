package com.app.dr1009.colorpickers

import android.databinding.BindingAdapter
import android.graphics.Color
import android.util.Log
import android.view.View

object ViewCustomizer {

    private val TAG = ViewCustomizer::class.java.simpleName

    @JvmStatic
    @BindingAdapter("backR", "backG", "backB", "backA")
    fun setViewBackgroundRGBA(view: View, r: Int, g: Int, b: Int, a: Int) {
        Log.d(TAG, "r $r g $g b $b a $a")
        view.setBackgroundColor(Color.argb(a, r, g, b))
        view.invalidate()
    }
}
