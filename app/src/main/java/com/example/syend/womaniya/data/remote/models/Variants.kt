package com.example.syend.womaniya.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Variants {
    @SerializedName("gif")
    @Expose
    private var gif: Gif? = null
    @SerializedName("mp4")
    @Expose
    private var mp4: Mp4? = null

    fun getGif(): Gif? {
        return gif
    }

    fun setGif(gif: Gif) {
        this.gif = gif
    }

    fun getMp4(): Mp4? {
        return mp4
    }

    fun setMp4(mp4: Mp4) {
        this.mp4 = mp4
    }

}