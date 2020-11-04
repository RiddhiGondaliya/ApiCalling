package com.example.apicalling.ui.main

import com.example.apicalling.ui.base.BasePresenter

class MainPresenter : BasePresenter<MainView>(){
    fun getTodoDetail(id: Int){
        val result="Hello Universe"

        view?.displayTitle(result)

    }
    fun getbuttonText(id: Int){
        val butntxt = "Click me"
        view?.buttonText(butntxt)
    }
}