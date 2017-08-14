package com.app.dr1009.colorpickers

import android.databinding.BaseObservable
import android.databinding.Bindable

class RotationData(rotateDefault: Int = 0) : BaseObservable() {

    @get:Bindable
    var rotation = rotateDefault // Max rotation is 360(degree)
        set(value) {
            field = value
            notifyPropertyChanged(BR.rotation)
        }

}