package com.example.syend.womaniya.common

import android.content.Context
import android.net.ConnectivityManager

fun utlIsNetworkAvailable(): Boolean {

    val connectivityManager = App.appContext.getSystemService(
            Context.CONNECTIVITY_SERVICE
    ) as ConnectivityManager

    val activeNetworkInfo = connectivityManager.activeNetworkInfo
    return activeNetworkInfo != null && activeNetworkInfo.isConnected
}