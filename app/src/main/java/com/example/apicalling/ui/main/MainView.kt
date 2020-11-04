package com.example.apicalling.ui.main

import com.example.apicalling.ui.base.BaseView

interface MainView : BaseView{
    fun displayTitle(title: String)

    fun buttonText(btn : String)
}