package com.app.dr1009.colorpickers

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.app.dr1009.colorpickers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBindin: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBindin = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        mBindin.data = PickerData()
    }
}
