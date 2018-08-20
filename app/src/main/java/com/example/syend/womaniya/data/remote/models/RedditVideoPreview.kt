package com.example.syend.womaniya.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class RedditVideoPreview {

    @SerializedName("fallback_url")
    @Expose
    private var fallbackUrl: String? = null
    @SerializedName("height")
    @Expose
    private var height: Int? = null
    @SerializedName("width")
    @Expose
    private var width: Int? = null
    @SerializedName("scrubber_media_url")
    @Expose
    private var scrubberMediaUrl: String? = null
    @SerializedName("dash_url")
    @Expose
    private var dashUrl: String? = null
    @SerializedName("duration")
    @Expose
    private var duration: Int? = null
    @SerializedName("hls_url")
    @Expose
    private var hlsUrl: String? = null
    @SerializedName("is_gif")
    @Expose
    private var isGif: Boolean? = null
    @SerializedName("transcoding_status")
    @Expose
    private var transcodingStatus: String? = null

    fun getFallbackUrl(): String? {
        return fallbackUrl
    }

    fun setFallbackUrl(fallbackUrl: String) {
        this.fallbackUrl = fallbackUrl
    }

    fun getHeight(): Int? {
        return height
    }

    fun setHeight(height: Int?) {
        this.height = height
    }

    fun getWidth(): Int? {
        return width
    }

    fun setWidth(width: Int?) {
        this.width = width
    }

    fun getScrubberMediaUrl(): String? {
        return scrubberMediaUrl
    }

    fun setScrubberMediaUrl(scrubberMediaUrl: String) {
        this.scrubberMediaUrl = scrubberMediaUrl
    }

    fun getDashUrl(): String? {
        return dashUrl
    }

    fun setDashUrl(dashUrl: String) {
        this.dashUrl = dashUrl
    }

    fun getDuration(): Int? {
        return duration
    }

    fun setDuration(duration: Int?) {
        this.duration = duration
    }

    fun getHlsUrl(): String? {
        return hlsUrl
    }

    fun setHlsUrl(hlsUrl: String) {
        this.hlsUrl = hlsUrl
    }

    fun getIsGif(): Boolean? {
        return isGif
    }

    fun setIsGif(isGif: Boolean?) {
        this.isGif = isGif
    }

    fun getTranscodingStatus(): String? {
        return transcodingStatus
    }

    fun setTranscodingStatus(transcodingStatus: String) {
        this.transcodingStatus = transcodingStatus
    }

}