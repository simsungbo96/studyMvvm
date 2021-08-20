package com.sbsj.baseproduct.activity


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.sbsj.baseproduct.viewmodel.BaseViewModel

abstract class BaseActivity<T : ViewDataBinding, M :BaseViewModel> : AppCompatActivity() {


    protected lateinit var binding : T

    abstract val viewModel : M
    abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.inflate(layoutInflater,layoutId,null,false)
        setContentView(binding.root)
        binding.lifecycleOwner =this

    }

    abstract fun initViewSetting()

    abstract fun setToast()
}