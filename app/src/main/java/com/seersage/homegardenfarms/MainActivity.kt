package com.seersage.homegardenfarms

import androidx.databinding.DataBindingUtil

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.seersage.homegardenfarms.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
