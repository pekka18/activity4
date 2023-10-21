package com.dignos.activity4.datastore

import android.content.Context

abstract class SharedPref(context: Context) {
    private val sharedPref = context
        .getSharedPreferences("GENERAL", Context.MODE_PRIVATE)

}