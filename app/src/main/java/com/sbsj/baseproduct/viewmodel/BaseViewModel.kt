package com.sbsj.baseproduct.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {

    val _toastMsg : MutableLiveData<String> = MutableLiveData("0")
    val toastMsg : LiveData<String> = _toastMsg

    fun setToastMsg()
    {
        _toastMsg.value = "뷰모델의 showToast()"
    }

    fun deleteToastMsg()
    {
        _toastMsg.value = ""
    }
}