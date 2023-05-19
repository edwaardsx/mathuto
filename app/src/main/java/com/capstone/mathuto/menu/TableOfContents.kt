package com.capstone.mathuto.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.mathuto.lessons.Lesson1
import com.capstone.mathuto.databinding.ActivityMenuTableOfContentsBinding

class TableOfContents : AppCompatActivity() {

    private lateinit var binding: ActivityMenuTableOfContentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuTableOfContentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener{
            finish()
            overridePendingTransition(0, 0)
        }
    }
}