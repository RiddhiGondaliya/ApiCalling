package com.example.apicalling.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apicalling.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    lateinit var presenter: MainPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter()
        presenter.attachView(this)
        presenter.getTodoDetail(1)
    }

    override fun displayTitle(title: String) {
        tvTitle.text = title
    }
}