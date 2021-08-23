package com.sbsj.baseproduct

import android.app.Application
import com.sbsj.baseproduct.di.RetrofitModule
import com.sbsj.baseproduct.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class MyApplication :Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(listOf(viewModelModule,RetrofitModule))

        }

    }
}