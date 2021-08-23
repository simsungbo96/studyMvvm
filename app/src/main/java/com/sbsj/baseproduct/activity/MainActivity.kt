package com.sbsj.baseproduct.activity


import android.os.Bundle
import android.util.Log
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.sbsj.baseproduct.R
import com.sbsj.baseproduct.databinding.ActivityMainBinding
import com.sbsj.baseproduct.viewmodel.MainViewModel
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.sbsj.baseproduct.adapter.UserRecyclerAdapter


class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutId: Int
        get() = R.layout.activity_main
    override val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewSetting()
        initDataSetting()
        binding.viewmodel!!.toastMsg.observe(this, Observer {

        })

    }
    // 뷰 셋 , 데이터바인딩 , 이벤트
    override fun initViewSetting() {
        binding.viewmodel = viewModel
        binding.activity = this
        val layoutManager = LinearLayoutManager(this)
        binding.mainRv.layoutManager = layoutManager
        val urAdapter = UserRecyclerAdapter(applicationContext)
        binding.mainRv.adapter = urAdapter

    }

    override fun initDataSetting(){

        viewModel.practice()

    }

    override fun setToast() {
        val myToast = Toast.makeText(this, binding.viewmodel!!._toastMsg.value.toString(), Toast.LENGTH_SHORT)
        myToast.show()

    }



}