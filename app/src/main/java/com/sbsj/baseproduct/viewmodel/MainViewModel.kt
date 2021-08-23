package com.sbsj.baseproduct.viewmodel


import android.util.Log
import com.sbsj.baseproduct.MyApplication
import com.sbsj.baseproduct.di.RetrofitModule
import com.sbsj.baseproduct.util.RetrofitService

import kotlinx.coroutines.*
import org.koin.java.KoinJavaComponent.get

import org.koin.java.KoinJavaComponent.inject


class MainViewModel : BaseViewModel() {



    fun plusToOne() {

        _toastMsg.value = toastMsg.value!! + 1
        Log.e("plus", "fun(): " + toastMsg.value)

    }

    fun minusToTwo() {

        _toastMsg.value = toastMsg.value!! + -1
    }


     fun practice()
    {
        CoroutineScope(Dispatchers.IO).launch {
            retrofitService.getName().let {
                Log.e("response: ", "" + it.code())
            }


        }

    }


}