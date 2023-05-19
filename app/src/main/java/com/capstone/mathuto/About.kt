package com.capstone.mathuto

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.TextView
import com.capstone.mathuto.databinding.ActivityMainAboutBinding
import com.google.android.material.button.MaterialButton
import java.util.*

class About : AppCompatActivity(), TextToSpeech.OnInitListener {

    private lateinit var binding: ActivityMainAboutBinding
    private lateinit var tts: TextToSpeech

    private var isReadingAloud = false

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tts = TextToSpeech(this, this)

        binding.btnBack.setOnClickListener {
            val intent = Intent(applicationContext, Main::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            applicationContext.startActivity(intent)
            overridePendingTransition(0, 0)
        }
        binding.btnReadAloud.setOnClickListener {
            val text = binding.tvAbout.text.toString()
            if (text.isNotEmpty()) {
                if (isReadingAloud) {
                    // Stop reading aloud
                    tts.stop()
                    isReadingAloud = false
                    binding.btnReadAloud.text = "Read Aloud"
                } else {
                    // Start reading aloud
                    tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, null)
                    isReadingAloud = true
                    binding.btnReadAloud.text = "Stop Read Aloud"
                }
            }
        }
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val result = tts.setLanguage(Locale.US)
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                // Language data is missing or the language is not supported.
                // You can handle this according to your app's requirements.
            }
        } else {
            // Failed to initialize the TextToSpeech engine.
            // You can handle this according to your app's requirements.
        }
        binding.btnReadAloud.isEnabled = status == TextToSpeech.SUCCESS
    }

    override fun onDestroy() {
        super.onDestroy()
        tts.stop()
        tts.shutdown()
    }
}