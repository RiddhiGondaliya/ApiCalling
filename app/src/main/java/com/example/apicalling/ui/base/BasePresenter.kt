package com.example.apicalling.ui.base

open class BasePresenter<T : BaseView> {
    var view : T? = null
    fun attachView(view: T){
        this.view = view
    }
    fun detachView(){
        view = null
    }
}