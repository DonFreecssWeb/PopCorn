package com.jorgemartinez.popcorn.common

import android.app.Application

class MyApp: Application() {
    companion object{
        lateinit var instance: MyApp
    }

    init {
        instance = this
    }
}