package com.sbsj.baseproduct.activity


import android.os.Bundle
import com.sbsj.baseproduct.R
import com.sbsj.baseproduct.databinding.ActivityMainBinding
import com.sbsj.baseproduct.viewmodel.MainViewModel
import android.widget.Toast




class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutId: Int
        get() = R.layout.activity_main
    override val viewModel: MainViewModel
        get() = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewSetting()


    }

    override fun initViewSetting() {
        binding.viewmodel = viewModel
        binding.activity = this


    }

    override fun setToast() {
        val myToast = Toast.makeText(this, binding.viewmodel!!._toastMsg.value, Toast.LENGTH_SHORT)
        myToast.show()

    }


}