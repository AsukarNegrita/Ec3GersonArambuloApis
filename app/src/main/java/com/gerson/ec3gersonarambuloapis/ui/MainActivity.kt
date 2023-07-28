package com.gerson.ec3gersonarambuloapis.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.gerson.ec3gersonarambuloapis.R
import com.gerson.ec3gersonarambuloapis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fragment = supportFragmentManager.findFragmentById(R.id.fcv_navigation) as NavHostFragment
        val navcontroller = fragment.navController
        binding.btnvValo.setupWithNavController(navcontroller)


    }

}