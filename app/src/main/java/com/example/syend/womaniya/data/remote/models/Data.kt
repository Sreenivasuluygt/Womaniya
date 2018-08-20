package com.example.syend.womaniya.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Data {
    @SerializedName("modhash")
    @Expose
    private var modhash: String? = null
    @SerializedName("dist")
    @Expose
    private var dist: Int? = null
    @SerializedName("children")
    @Expose
    private var children: List<Child>? = null
    @SerializedName("after")
    @Expose
    private var after: String? = null
    @SerializedName("before")
    @Expose
    private var before: Any? = null

    fun getModhash(): String? {
        return modhash
    }

    fun setModhash(modhash: String) {
        this.modhash = modhash
    }

    fun getDist(): Int? {
        return dist
    }

    fun setDist(dist: Int?) {
        this.dist = dist
    }

    fun getChildren(): List<Child>? {
        return children
    }

    fun setChildren(children: List<Child>) {
        this.children = children
    }

    fun getAfter(): String? {
        return after
    }

    fun setAfter(after: String) {
        this.after = after
    }

    fun getBefore(): Any? {
        return before
    }

    fun setBefore(before: Any) {
        this.before = before
    }
}