package com.capstone.mathuto.timer

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import com.capstone.mathuto.databinding.ActivityQuizTimerTwelveBinding
import com.capstone.mathuto.quiz.QuizTwelve
import kotlin.random.Random

class QuizTimer12 : AppCompatActivity() {

    private lateinit var binding: ActivityQuizTimerTwelveBinding
    private lateinit var timer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuizTimerTwelveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val countdownValues = arrayOf("3", "2", "1", "Start!")

        timer = object : CountDownTimer(3_000,1000){

            private var currentIndex = 0

            override fun onTick(remaining: Long) {
                val countdownText = countdownValues[currentIndex]
                binding.textTimer.text = countdownText
                binding.root.setBackgroundColor(getRandomColor().toArgb())
                currentIndex++
            }

            @SuppressLint("SuspiciousIndentation")
            override fun onFinish() {
                binding.textTimer.text = "Start!"
                    Handler().postDelayed({
                        val intent = Intent(applicationContext, QuizTwelve::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                        applicationContext.startActivity(intent)
                        overridePendingTransition(0, 0)
                    }, 1000)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        timer.start()
    }

    override fun onStop() {
        super.onStop()
        timer.cancel()
    }

    private fun getRandomColor(): Color {
        return Color.valueOf(
        Random.nextFloat() * 255.0f,
        Random.nextFloat() * 255.0f,
        Random.nextFloat() * 255.0f
        )
    }
}