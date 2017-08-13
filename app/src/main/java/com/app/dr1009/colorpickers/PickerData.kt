package com.app.dr1009.colorpickers

import android.databinding.BaseObservable
import android.databinding.Bindable

class PickerData : BaseObservable() {

    @get:Bindable
    val typeR = "R"

    @get:Bindable
    val typeG = "G"

    @get:Bindable
    val typeB = "B"

    @get:Bindable
    val typeA = "Alpha"

    @get:Bindable
    val img = RGBAData()

    @get:Bindable
    val back = RGBAData()
}