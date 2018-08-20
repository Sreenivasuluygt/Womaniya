package com.example.syend.womaniya.data.local

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class DbModel {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    var updatedByName: String? = null
    var title: String? = null
    var comments: Int? = 0
    var imgUrl: String? = null
}