package com.app.dr1009.colorpickers.data

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.app.dr1009.colorpickers.BR

class RotationData(rotateDefault: Int = 0) : BaseObservable() {

    @get:Bindable
    var rotation = rotateDefault // Max rotation is 360(degree)
        set(value) {
            field = value
            notifyPropertyChanged(BR.rotation)
        }

}