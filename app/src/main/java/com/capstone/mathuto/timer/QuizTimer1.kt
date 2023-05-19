package com.capstone.mathuto.timer

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import com.capstone.mathuto.quiz.QuizOne
import com.capstone.mathuto.databinding.ActivityQuizTimerOneBinding
import kotlin.random.Random

class QuizTimer1 : AppCompatActivity() {

    private lateinit var binding: ActivityQuizTimerOneBinding
    private lateinit var timer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuizTimerOneBinding.inflate(layoutInflater)
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
                        val intent = Intent(applicationContext, QuizOne::class.java)
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