package com.app.dr1009.colorpickers

import android.databinding.BaseObservable
import android.databinding.Bindable

class RGBAData : BaseObservable() {

    @get:Bindable
    var r = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.r)
        }

    @get:Bindable
    var g = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.g)
        }

    @get:Bindable
    var b = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.b)
        }

    @get:Bindable
    var a = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.a)
        }
}