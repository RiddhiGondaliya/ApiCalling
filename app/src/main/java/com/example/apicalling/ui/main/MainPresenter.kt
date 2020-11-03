package com.example.apicalling.ui.main

import com.example.apicalling.ui.base.BasePresenter

class MainPresenter : BasePresenter<MainView>(){
    fun getTodoDetail(id: Int){
        val result="Hello Universe"
        view?.displayTitle(result)
    }
}