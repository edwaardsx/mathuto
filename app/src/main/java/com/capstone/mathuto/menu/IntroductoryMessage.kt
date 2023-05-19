package com.capstone.mathuto.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.mathuto.lessons.Lesson1
import com.capstone.mathuto.databinding.ActivityMenuIntroductoryMessageBinding

class IntroductoryMessage : AppCompatActivity() {

    private lateinit var binding: ActivityMenuIntroductoryMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuIntroductoryMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
            overridePendingTransition(0, 0)
        }
    }
}