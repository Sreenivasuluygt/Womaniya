package com.example.syend.womaniya.data.remote.models

import android.print.PrintAttributes.Resolution
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Image {
    @SerializedName("source")
    @Expose
    private var source: Source? = null
    @SerializedName("resolutions")
    @Expose
    private var resolutions: List<Resolution>? = null
    @SerializedName("variants")
    @Expose
    private var variants: Variants? = null
    @SerializedName("id")
    @Expose
    private var id: String? = null

    fun getSource(): Source? {
        return source
    }

    fun setSource(source: Source) {
        this.source = source
    }

    fun getResolutions(): List<Resolution>? {
        return resolutions
    }

    fun setResolutions(resolutions: List<Resolution>) {
        this.resolutions = resolutions
    }

    fun getVariants(): Variants? {
        return variants
    }

    fun setVariants(variants: Variants) {
        this.variants = variants
    }

    fun getId(): String? {
        return id
    }

    fun setId(id: String) {
        this.id = id
    }

}