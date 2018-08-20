package com.example.syend.womaniya.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Source {
    @SerializedName("url")
    @Expose
    private var url: String? = null
    @SerializedName("width")
    @Expose
    private var width: Int? = null
    @SerializedName("height")
    @Expose
    private var height: Int? = null

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String) {
        this.url = url
    }

    fun getWidth(): Int? {
        return width
    }

    fun setWidth(width: Int?) {
        this.width = width
    }

    fun getHeight(): Int? {
        return height
    }

    fun setHeight(height: Int?) {
        this.height = height
    }
}