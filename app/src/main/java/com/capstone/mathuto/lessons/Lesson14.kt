package com.capstone.mathuto.lessons

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
import com.capstone.mathuto.Main.Companion.WATCHED_TUTORIAL14
import com.capstone.mathuto.R
import com.capstone.mathuto.databinding.ActivityLessonFourteenBinding
import com.capstone.mathuto.menu.DevelopmentTeam
import com.capstone.mathuto.menu.IntroductoryMessage
import com.capstone.mathuto.menu.TableOfContents
import com.capstone.mathuto.timer.QuizTimer1
import com.capstone.mathuto.timer.QuizTimer14
import com.capstone.mathuto.watch.ModuleEleven
import com.capstone.mathuto.watch.ModuleFourteen
import java.util.*

class Lesson14 : AppCompatActivity(), TextToSpeech.OnInitListener {

    private lateinit var binding: ActivityLessonFourteenBinding

    private lateinit var tts: TextToSpeech
    private var isReadingAloud = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLessonFourteenBinding.inflate(layoutInflater)
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
            val intent = Intent(applicationContext, ModuleFourteen::class.java)
            WATCHED_TUTORIAL14 = true

            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            applicationContext.startActivity(intent)
            overridePendingTransition(0, 0)
        }
        binding.btnStartQuiz.setOnClickListener {
            val intent = Intent(applicationContext, com.capstone.mathuto.timer.QuizTimer14::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            applicationContext.startActivity(intent)
            overridePendingTransition(0, 0)
        }
        binding.btnTts.setOnClickListener {
            val text = binding.tvLessonsDescriptionOne.text.toString()
            val lessonDescriptions = "$text"
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
        binding.btnTts2.setOnClickListener {
            val text2 = binding.tvLessonsDescriptionTwo.text.toString()
            val text3 = binding.tvLessonsDescriptionThree.text.toString()
            val lessonDescriptions = "$text2 $text3"
            if (lessonDescriptions.isNotEmpty()) {
                if (isReadingAloud) {
                    tts.stop()
                    isReadingAloud = false
                    binding.btnTts2.text = "Read"
                } else {
                    tts.speak(lessonDescriptions, TextToSpeech.QUEUE_FLUSH, null, null)
                    isReadingAloud = true
                    binding.btnTts2.text = "Stop"
                }
            }
        }
        binding.btnTts3.setOnClickListener {
            val text4 = binding.tvLessonsDescriptionFour.text.toString()
            val text5 = binding.tvLessonsDescriptionFive.text.toString()
            val lessonDescriptions = "$text4 $text5"
            if (lessonDescriptions.isNotEmpty()) {
                if (isReadingAloud) {
                    tts.stop()
                    isReadingAloud = false
                    binding.btnTts3.text = "Read"
                } else {
                    tts.speak(lessonDescriptions, TextToSpeech.QUEUE_FLUSH, null, null)
                    isReadingAloud = true
                    binding.btnTts3.text = "Stop"
                }
            }
        }
        binding.btnTts4.setOnClickListener {
            val text6 = binding.tvLessonsDescriptionSix.text.toString()
            val text7 = binding.tvLessonsDescriptionSeven.text.toString()
            val lessonDescriptions = "$text6 $text7"
            if (lessonDescriptions.isNotEmpty()) {
                if (isReadingAloud) {
                    tts.stop()
                    isReadingAloud = false
                    binding.btnTts4.text = "Read"
                } else {
                    tts.speak(lessonDescriptions, TextToSpeech.QUEUE_FLUSH, null, null)
                    isReadingAloud = true
                    binding.btnTts4.text = "Stop"
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
        dialog.setContentView(R.layout.activity_objectives_fourteen)
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