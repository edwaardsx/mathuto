package com.capstone.mathuto.lessons

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.capstone.mathuto.menu.DevelopmentTeam
import com.capstone.mathuto.menu.IntroductoryMessage
import com.capstone.mathuto.menu.TableOfContents
import com.capstone.mathuto.R
import com.capstone.mathuto.databinding.ActivityLessonOneBinding
import com.capstone.mathuto.timer.QuizTimer1
import com.capstone.mathuto.watch.ModuleOne
import java.util.*
import android.view.MotionEvent
import com.capstone.mathuto.Main.Companion.WATCHED_TUTORIAL1

class Lesson1 : AppCompatActivity(), TextToSpeech.OnInitListener {

    private lateinit var binding: ActivityLessonOneBinding

    private lateinit var tts: TextToSpeech
    private var isReadingAloud = false

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLessonOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = ""

        tts = TextToSpeech(this, this)

        showObjectives()

        binding.btnBack.setOnClickListener {
            finish()
            overridePendingTransition(0, 0)
        }
        binding.btnStartQuiz.setOnClickListener {
            val intent = Intent(applicationContext, QuizTimer1::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            applicationContext.startActivity(intent)
            overridePendingTransition(0, 0)
        }
        binding.btnWatchTutorial.setOnClickListener {
            val intent = Intent(applicationContext, ModuleOne::class.java)
            WATCHED_TUTORIAL1 = true

            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            applicationContext.startActivity(intent)
            overridePendingTransition(0, 0)
        }
        binding.btnTts.setOnClickListener {
            val description1 = binding.tvDescriptionOne.text.toString()
            val description2 = binding.tvDescriptionTwo.text.toString()
            val mDescriptions = "$description1 $description2"

            if (mDescriptions.isNotEmpty()) {
                if (isReadingAloud) {
                    tts.stop()
                    isReadingAloud = false
                    binding.btnTts.text = "Read"
                } else {
                    tts.speak(mDescriptions, TextToSpeech.QUEUE_FLUSH, null, null)
                    isReadingAloud = true
                    binding.btnTts.text = "Stop"
                }
            }
            binding.btnTts2.setOnClickListener {
                val description3 = binding.tvDescriptionThree.text.toString()
                val description4 = binding.tvDescriptionFour.text.toString()
                val description5 = binding.tvDescriptionFive.text.toString()
                val mDescriptions = "$description3 $description4 $description5"

                if (mDescriptions.isNotEmpty()) {
                    if (isReadingAloud) {
                        tts.stop()
                        isReadingAloud = false
                        binding.btnTts.text = "Read"
                    } else {
                        tts.speak(mDescriptions, TextToSpeech.QUEUE_FLUSH, null, null)
                        isReadingAloud = true
                        binding.btnTts.text = "Stop"
                    }
                }
            }
            binding.btnTts3.setOnClickListener {
                val description6 = binding.tvDescriptionSix.text.toString()
                val description7 = binding.tvDescriptionSeven.text.toString()
                val description8 = binding.tvDescriptionEight.text.toString()
                val description9 = binding.tvDescriptionNine.text.toString()
                val description10 = binding.tvDescriptionTen.text.toString()
                val description11 = binding.tvDescriptionEleven.text.toString()
                val mDescriptions = "$description6 $description7 $description8 $description9 $description10 $description11"

                if (mDescriptions.isNotEmpty()) {
                    if (isReadingAloud) {
                        tts.stop()
                        isReadingAloud = false
                        binding.btnTts.text = "Read"
                    } else {
                        tts.speak(mDescriptions, TextToSpeech.QUEUE_FLUSH, null, null)
                        isReadingAloud = true
                        binding.btnTts.text = "Stop"
                    }
                }
            }
        }

        val startColor = resources.getColor(R.color.gradient_start_color, null)
        val endColor = resources.getColor(R.color.gradient_end_color, null)

        val shader: Shader = LinearGradient(
            0f, 0f, 0f, binding.tvTitle.textSize,
            intArrayOf(startColor, endColor),
            null,
            Shader.TileMode.CLAMP
        )
        binding.tvTitle.paint.shader = shader
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item_lessons, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_introductory_message -> {
                val intent = Intent(applicationContext, IntroductoryMessage::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                applicationContext.startActivity(intent)
                overridePendingTransition(0, 0)
            }
            R.id.action_table_of_contents -> {
                val intent = Intent(applicationContext, TableOfContents::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                applicationContext.startActivity(intent)
                overridePendingTransition(0, 0)
            }
            R.id.action_development_team_of_the_module -> {
                val intent = Intent(applicationContext, DevelopmentTeam::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                applicationContext.startActivity(intent)
                overridePendingTransition(0, 0)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showObjectives() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.activity_objectives_one)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val btnClose = dialog.findViewById<ImageButton>(R.id.btn_objectives_close)
        btnClose.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
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
        binding.btnTts.isEnabled = status == TextToSpeech.SUCCESS
    }

    override fun onDestroy() {
        super.onDestroy()
        tts.stop()
        tts.shutdown()
    }
}