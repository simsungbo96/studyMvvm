package com.sbsj.baseproduct.viewmodel

import android.util.Log
import android.widget.Toast


class MainViewModel : BaseViewModel(){


    fun plusToOne()
    {
        _toastMsg.value = (toastMsg.value!!.toInt()+1).toString()
    }

    fun minusToTwo()
    {
        _toastMsg.value =  (toastMsg.value!!.toInt()-1).toString()
    }

}