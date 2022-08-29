package com.example.madpractical3_20012021027

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.core.view.WindowCompat
import com.example.madpractical3_20012021027.databinding.ActivityLoginBinding
import com.example.madpractical3_20012021027.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }
}
