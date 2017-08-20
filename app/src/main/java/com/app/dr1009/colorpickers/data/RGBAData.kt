package com.app.dr1009.colorpickers.data

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.app.dr1009.colorpickers.BR

class RGBAData(aDefault: Int = 0, rDefault: Int = 0, gDefault: Int = 0, bDefault: Int = 0) : BaseObservable() {

    @get:Bindable
    var r = rDefault
        set(value) {
            field = value
            notifyPropertyChanged(BR.r)
        }

    @get:Bindable
    var g = gDefault
        set(value) {
            field = value
            notifyPropertyChanged(BR.g)
        }

    @get:Bindable
    var b = bDefault
        set(value) {
            field = value
            notifyPropertyChanged(BR.b)
        }

    @get:Bindable
    var a = aDefault
        set(value) {
            field = value
            notifyPropertyChanged(BR.a)
        }
}