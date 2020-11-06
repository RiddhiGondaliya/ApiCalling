package com.example.apicalling.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.apicalling.R
import com.example.apicalling.data.PostModel
import com.example.apicalling.network.RetrofitInterface
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    //lateinit var presenter: MainPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //in Retrofit.Builder we can call the function  of the Base_URL and the convertofactory that we want to define
        // Base_URL define in the RetrofitInterface in which we can extract the data
        var rf = Retrofit.Builder()
            .baseUrl(RetrofitInterface.Base_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()


        // creating API
        //vairable API is initialize
        var API : RetrofitInterface = rf.create(RetrofitInterface:: class.java)
        // creating Call variable
        var call = API.posts


        //defining onResponse and
        call?.enqueue(object:Callback<List<PostModel?>?>{
            override fun onFailure(call: Call<List<PostModel?>?>, t: Throwable) {
            }

            override fun onResponse(
                call: Call<List<PostModel?>?>,
                response: Response<List<PostModel?>?>
            ) {
               var postlist : List<PostModel>? = response.body() as List<PostModel>
                var post : Array<String?> = arrayOfNulls<String>(postlist!!.size)

                for(i in postlist !!.indices)
                    post[i] = postlist!![i]!!.title
                var adapter = ArrayAdapter<String>(applicationContext,android.R.layout.simple_dropdown_item_1line, post)
                listview.adapter = adapter

            }

        })
}
}
