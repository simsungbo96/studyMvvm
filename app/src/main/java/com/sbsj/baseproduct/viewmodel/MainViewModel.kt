package com.sbsj.baseproduct.viewmodel


import android.util.Log
import org.koin.android.ext.android.inject

import com.sbsj.baseproduct.util.RetrofitService
import kotlinx.coroutines.*
import org.koin.experimental.property.inject
import org.koin.java.KoinJavaComponent.inject

class MainViewModel(val mainService: RetrofitService) : BaseViewModel() {



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
            mainService.getName()
        }
    }


}