package com.girayserter.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.girayserter.counterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        val viewModel= MainActivityViewModel()

        binding.btnAdd.setOnClickListener{
            viewModel.increaseCounter()
        }

        binding.counter= viewModel.counterModel

        viewModel.counter.observe(this, Observer{
            binding.counter=it
        })
    }
}