package com.example.syend.womaniya.features

import android.arch.lifecycle.Observer
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.syend.womaniya.R
import com.example.syend.womaniya.common.ProgressDialogFragment
import com.example.syend.womaniya.common.utlIsNetworkAvailable
import com.example.syend.womaniya.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mViewModel: MainViewModel? = null
    private var mBinding: ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
        setupObserver()
    }


    private fun init() {
        mViewModel = MainViewModel()
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding?.setLifecycleOwner(this)
        mBinding?.viewModel = mViewModel
    }

    private fun setupObserver() {

        val dFragment = ProgressDialogFragment()
        // Show DialogFragment
        dFragment.show(supportFragmentManager, dFragment.javaClass.simpleName)
        dFragment.isCancelable = false



        if (utlIsNetworkAvailable())
            mViewModel?.getOnlineData()
        else mViewModel?.getOfflineData()
        mViewModel?.mDataList?.observe(this, Observer {
            dFragment.dismiss()
            mBinding?.rvRecycler?.layoutManager = LinearLayoutManager(this)
            val adapter = Adapter()
            if (it != null) {
                adapter.setList(it)
                mBinding?.rvRecycler?.adapter = adapter
            }


        })

        mViewModel?.obsError?.observe(this, Observer {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        })
    }
}
