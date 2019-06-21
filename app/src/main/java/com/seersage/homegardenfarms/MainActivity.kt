package com.seersage.homegardenfarms

import androidx.databinding.DataBindingUtil

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.seersage.homegardenfarms.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(R.layout.activity_main)
    }
}
