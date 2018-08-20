package com.example.syend.womaniya.features

import android.databinding.BaseObservable
import com.example.syend.womaniya.data.local.DbModel

class ItemViewModel(var dbModel: DbModel) : BaseObservable() {
    fun getTitle(): String? {
        return dbModel.title
    }

    fun getUpdatedBy(): String? {
        return dbModel.updatedByName
    }

    fun getComments(): String? {
        return dbModel.comments.toString() + " Comments"
    }
}