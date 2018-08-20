package com.example.syend.womaniya.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Gif{
    @SerializedName("source")
    @Expose
    private var source: Source_? = null
    @SerializedName("resolutions")
    @Expose
    private var resolutions: List<Resolution_>? = null

    fun getSource(): Source_? {
        return source
    }

    fun setSource(source: Source_) {
        this.source = source
    }

    fun getResolutions(): List<Resolution_>? {
        return resolutions
    }

    fun setResolutions(resolutions: List<Resolution_>) {
        this.resolutions = resolutions
    }
}