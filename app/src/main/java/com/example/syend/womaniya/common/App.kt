package com.example.syend.womaniya.common

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import com.example.syend.womaniya.data.local.ReditDatabase

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = this
        clientDatabase = Room.databaseBuilder(
                appContext,
                ReditDatabase::class.java,
                CLIENT_DATABASE_NAME
        ).allowMainThreadQueries().build()
    }

    companion object {
        lateinit var appContext: Context private set
        lateinit var clientDatabase: ReditDatabase
        private const val CLIENT_DATABASE_NAME="RedDatabase"
    }
}
