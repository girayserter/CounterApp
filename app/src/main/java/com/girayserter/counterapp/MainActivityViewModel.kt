package com.girayserter .counterapp

import com.girayserter.counterapp.CounterModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var counterModel:CounterModel=CounterModel(count = 0)
    var counter= MutableLiveData<CounterModel>(counterModel)

    fun increaseCounter(){
        counterModel.count+=1
        counter.value=counterModel
    }
}