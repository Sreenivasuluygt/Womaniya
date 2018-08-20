package com.example.syend.womaniya.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Mp4{
    @SerializedName("source")
    @Expose
    private var source: Source__? = null
    @SerializedName("resolutions")
    @Expose
    private var resolutions: List<Resolution__>? = null

    fun getSource(): Source__? {
        return source
    }

    fun setSource(source: Source__) {
        this.source = source
    }

    fun getResolutions(): List<Resolution__>? {
        return resolutions
    }

    fun setResolutions(resolutions: List<Resolution__>) {
        this.resolutions = resolutions
    }
}