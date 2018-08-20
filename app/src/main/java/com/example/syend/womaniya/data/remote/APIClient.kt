package com.example.syend.womaniya.data.remote

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class APIClient {

    companion object {
        private var retrofit: Retrofit? = null

        fun getClient(): Retrofit? {

            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            val client = OkHttpClient.Builder().addInterceptor(interceptor).build()


            retrofit = Retrofit.Builder()
                    .baseUrl("https://www.reddit.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build()



            return retrofit
        }

    }

}