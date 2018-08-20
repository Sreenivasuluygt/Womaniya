package com.example.syend.womaniya.data.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [
    DbModel::class], version = 1)
abstract class ReditDatabase : RoomDatabase() {
    abstract fun countryDao(): MainDao
}