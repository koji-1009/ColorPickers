package com.app.dr1009.colorpickers

import android.databinding.BaseObservable
import android.databinding.Bindable

class PickerData : BaseObservable() {

    @get:Bindable
    val typeR = "R"

    @get:Bindable
    var r = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.r)
        }

    @get:Bindable
    val typeG = "G"

    @get:Bindable
    var g = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.g)
        }

    @get:Bindable
    val typeB = "B"

    @get:Bindable
    var b = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.b)
        }
}