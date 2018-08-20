package com.example.syend.womaniya.features

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.syend.womaniya.common.App
import com.example.syend.womaniya.data.local.DbModel
import com.example.syend.womaniya.data.remote.models.MainModel
import com.example.syend.womaniya.data.remote.repo.Data

class MainViewModel : ViewModel() {
    var mDataList = MutableLiveData<List<DbModel>>()
    var obsError = MutableLiveData<String>()


    fun getOnlineData() {
        Data.getData(object : Data.Result {
            override fun onSuccess(mainModel: MainModel) {


                val list = mainModel.getData()?.getChildren()

                val dbList: MutableList<DbModel> = App.clientDatabase.countryDao().fetchData() as MutableList<DbModel>

                if (dbList.isEmpty()) {
                    for (i in 0 until list!!.size) {
                        val dbModel = DbModel()
                        dbModel.comments = list[i].getData()?.getNumComments()
                        dbModel.imgUrl = list[i].getData()?.getThumbnail()
                        dbModel.updatedByName = list[i].getData()?.getAuthor()
                        dbModel.title = list[i].getData()?.getTitle()
                        dbList.add(dbModel)
                    }
                    App.clientDatabase.countryDao().insertBulk(dbList)
                }
                mDataList.value = dbList
            }

            override fun onFailure() {
                obsError.value = "Issue with Api"
            }

        })
    }

    fun getOfflineData(){
        mDataList.value= App.clientDatabase.countryDao().fetchData()
    }

}