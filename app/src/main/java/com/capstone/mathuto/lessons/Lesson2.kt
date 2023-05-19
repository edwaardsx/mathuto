package com.capstone.mathuto.lessons

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import com.capstone.mathuto.Main
import com.capstone.mathuto.R
import com.capstone.mathuto.databinding.ActivityLessonTwoBinding
import com.capstone.mathuto.menu.DevelopmentTeam
import com.capstone.mathuto.menu.IntroductoryMessage
import com.capstone.mathuto.menu.TableOfContents
import com.capstone.mathuto.timer.QuizTimer2
import com.capstone.mathuto.watch.ModuleTwo
import java.util.*

class Lesson2 : AppCompatActivity(), TextToSpeech.OnInitListener {

    private lateinit var binding: ActivityLessonTwoBinding

    private lateinit var tts: TextToSpeech
    private var isReadingAloud = false

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLessonTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tts = TextToSpeech(this, this)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = ""

        showObjectivesDialog()

        binding.btnBack.setOnClickListener {
            finish()
            overridePendingTransition(0, 0)
        }
        binding.btnWatchTutorial.setOnClickListener {
            val intent = Intent(applicationContext, ModuleTwo::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            applicationContext.startActivity(intent)
            overridePendingTransition(0, 0)
        }
        binding.btnStartQuiz.setOnClickListener {
            val intent = Intent(applicationContext, QuizTimer2::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            applicationContext.startActivity(intent)
            overridePendingTransition(0, 0)
        }
        binding.btnTts.setOnClickListener {
            val text = binding.tvLessonsDescriptionOne.text.toString()
            val text2 = binding.tvLessonsDescriptionTwo.text.toString()
            val text3 = binding.tvLessonsDescriptionThree.text.toString()
            val lessonDescriptions = "$text $text2 $text3"
            if (lessonDescriptions.isNotEmpty()) {
                if (isReadingAloud) {
                    // Stop reading aloud
                    tts.stop()
                    isReadingAloud = false
                    binding.btnTts.text = "Read"
                } else {
                    // Start reading aloud
                    tts.speak(lessonDescriptions, TextToSpeech.QUEUE_FLUSH, null, null)
                    isReadingAloud = true
                    binding.btnTts.text = "Stop"
                    }
                }
            }
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

    private fun showObjectivesDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.activity_objectives_two)
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