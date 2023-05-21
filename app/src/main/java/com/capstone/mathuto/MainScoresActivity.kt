package com.capstone.mathuto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.mathuto.databinding.ActivityMainScoresBinding
import com.capstone.mathuto.databinding.ActivityQuizResultBinding

class MainScoresActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainScoresBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainScoresBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener{
            finish()
        }
    }
}