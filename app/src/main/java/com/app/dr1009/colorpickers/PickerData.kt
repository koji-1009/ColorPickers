package com.app.dr1009.colorpickers

import android.databinding.BaseObservable
import android.databinding.Bindable

class PickerData : BaseObservable() {

    @get:Bindable
    val TYPE_R = "R"

    @get:Bindable
    val TYPE_G = "G"

    @get:Bindable
    val TYPE_B = "B"

    @get:Bindable
    val TYPE_A = "Alpha"

    @get:Bindable
    val TYPE_ROTATION = "Rotation"

    @get:Bindable
    val MAX_RGBA = 255

    @get:Bindable
    val MAX_ROTATION = 360

    @get:Bindable
    val img = RGBAData(aDefault = 255, rDefault = 180, gDefault = 180, bDefault = 180)

    @get:Bindable
    val back = RGBAData(aDefault = 50, rDefault = 60, gDefault = 60, bDefault = 60)

    @get:Bindable
    val rotation = RotationData()
}