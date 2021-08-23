package com.sbsj.baseproduct.di

import com.google.gson.GsonBuilder
import com.sbsj.baseproduct.util.RetrofitService
import com.sbsj.baseproduct.viewmodel.*
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit

val viewModelModule = module {
    viewModel { BaseViewModel()}
    viewModel { MainViewModel()}
}

val RetrofitModule = module {


    val gson = GsonBuilder().setLenient().create()
    var client: OkHttpClient
    val interceptor = HttpLoggingInterceptor()
    single {
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        client = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .retryOnConnectionFailure(false)
            .cache(null)
            //파일 같은 경우 read, write timeout 시간 1~2분 좋음
            .connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS) // 클라 to 서버
            .readTimeout(10, TimeUnit.SECONDS) // 서버 to 클라
            .build()
    }

   single {  Retrofit.Builder()
        .baseUrl("http://192.168.15.90:8080/LFSD/")
        .client(get())
        .addConverterFactory(GsonConverterFactory.create(gson))
        .addConverterFactory(ScalarsConverterFactory.create())
        .build()
        .create(RetrofitService::class.java)}

}