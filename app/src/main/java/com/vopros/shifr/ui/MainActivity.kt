package com.vopros.shifr.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vopros.shifr.R
import com.vopros.shifr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}