package com.sbsj.baseproduct.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sbsj.baseproduct.model.User
import com.sbsj.baseproduct.util.RetrofitService
import retrofit2.Call
import retrofit2.Response

open class BaseViewModel() : ViewModel() {


    val _toastMsg: MutableLiveData<String> = MutableLiveData("")
    val toastMsg: LiveData<String> = _toastMsg


}
