package com.app.dr1009.colorpickers.data

import android.databinding.BaseObservable
import android.databinding.Bindable

class PickerData : BaseObservable() {

    @get:Bindable
    val img = RGBAData(aDefault = 255, rDefault = 180, gDefault = 180, bDefault = 180)

    @get:Bindable
    val back = RGBAData(aDefault = 50, rDefault = 60, gDefault = 60, bDefault = 60)

    @get:Bindable
    val rotation = RotationData()
}