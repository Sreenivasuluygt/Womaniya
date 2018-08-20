package com.example.syend.womaniya.data.remote.repo

import android.util.Log
import com.example.syend.womaniya.data.remote.APIClient
import com.example.syend.womaniya.data.remote.APIInterface
import com.example.syend.womaniya.data.remote.models.MainModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Data {

    companion object {
        fun getData(listener: Result) {
            val apiInterface = APIClient.getClient()?.create(APIInterface::class.java)
            val call = apiInterface?.getData()

            call?.enqueue(object : Callback<MainModel> {
                override fun onFailure(call: Call<MainModel>?, t: Throwable?) {
                    Log.e("response failure", t.toString())
                    listener.onFailure()
                }

                override fun onResponse(call: Call<MainModel>?, response: Response<MainModel>?) {
                    Log.e("response printing", response.toString())
                    response?.body()?.let { listener.onSuccess(it) }
                }
            })

        }
    }


    interface Result {
        fun onSuccess(model: MainModel)
        fun onFailure()
    }
}