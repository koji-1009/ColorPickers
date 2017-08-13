package com.app.dr1009.colorpickers

import android.databinding.BindingAdapter
import android.graphics.Color
import android.support.v4.graphics.drawable.DrawableCompat
import android.view.View
import android.widget.ImageView

object ViewCustomizer {

    @JvmStatic
    @BindingAdapter("backR", "backG", "backB", "backA")
    fun setViewBackgroundRGBA(view: View, r: Int, g: Int, b: Int, a: Int) {
        view.setBackgroundColor(Color.argb(a, r, g, b))
        view.invalidate()
    }

    @JvmStatic
    @BindingAdapter("tintR", "tintG", "tintB", "tintA")
    fun setViewTintColor(view: ImageView, r: Int, g: Int, b: Int, a: Int) {
        val drawable = view.drawable

        DrawableCompat.setTint(drawable, Color.argb(a, r, g, b))
        view.setImageDrawable(drawable)
    }
}
