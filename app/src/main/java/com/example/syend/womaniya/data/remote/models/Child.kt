package com.example.syend.womaniya.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Child {
    @SerializedName("kind")
    @Expose
    private var kind: String? = null
    @SerializedName("data")
    @Expose
    private var data: Data_? = null

    fun getKind(): String? {
        return kind
    }

    fun setKind(kind: String) {
        this.kind = kind
    }

    fun getData(): Data_? {
        return data
    }

    fun setData(data: Data_) {
        this.data = data
    }
}