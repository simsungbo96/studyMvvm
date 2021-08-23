package com.sbsj.baseproduct.util


import com.sbsj.baseproduct.model.User
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface RetrofitService{

    @POST("test.do")
   suspend fun getName(): Response<User>

}