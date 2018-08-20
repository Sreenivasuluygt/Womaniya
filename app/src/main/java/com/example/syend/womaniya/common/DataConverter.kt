package com.example.syend.womaniya.common

import android.arch.persistence.room.TypeConverter

import com.example.syend.womaniya.data.remote.models.Data
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

import java.lang.reflect.Type

class DataConverter {
    @TypeConverter
    fun fromCountryLangList(countryLang: List<Data>?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<List<Data>>() {

        }.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun toCountryLangList(countryLangString: String?): Data? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<Data>() {

        }.type
        return gson.fromJson<Data>(countryLangString, type)
    }
}
