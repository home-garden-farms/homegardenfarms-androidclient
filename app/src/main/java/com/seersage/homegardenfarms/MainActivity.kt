package com.seersage.homegardenfarms

import androidx.databinding.DataBindingUtil

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.seersage.homegardenfarms.databinding.ActivityMainBinding
import com.seersage.homegardenfarms.repository.login

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(v: View){
        Log.d("Login", "Login clicked")
//        login("e@f", "12345")
    }
}
