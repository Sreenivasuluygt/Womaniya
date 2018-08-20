package com.example.syend.womaniya.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Preview{
    @SerializedName("images")
    @Expose
    private var images: List<Image>? = null
    @SerializedName("reddit_video_preview")
    @Expose
    private var redditVideoPreview: RedditVideoPreview? = null
    @SerializedName("enabled")
    @Expose
    private var enabled: Boolean? = null

    fun getImages(): List<Image>? {
        return images
    }

    fun setImages(images: List<Image>) {
        this.images = images
    }

    fun getRedditVideoPreview(): RedditVideoPreview? {
        return redditVideoPreview
    }

    fun setRedditVideoPreview(redditVideoPreview: RedditVideoPreview) {
        this.redditVideoPreview = redditVideoPreview
    }

    fun getEnabled(): Boolean? {
        return enabled
    }

    fun setEnabled(enabled: Boolean?) {
        this.enabled = enabled
    }

}