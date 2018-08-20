package com.example.syend.womaniya.data.local

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update

@Dao
interface MainDao {
    @Insert
    fun insert(model: DbModel)


    @Insert
    fun insertBulk(models: List<DbModel>)

    @Update
    fun update(model: DbModel)

    @Query("SELECT * FROM DbModel")
    fun fetchData(): List<DbModel>

    @Query("DELETE FROM DbModel")
    fun delete()
}