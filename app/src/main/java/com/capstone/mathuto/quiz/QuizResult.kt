package com.capstone.mathuto.quiz

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.capstone.mathuto.Main
import com.capstone.mathuto.QuizResultSummaryActivity
import com.capstone.mathuto.databinding.ActivityQuizResultBinding
import com.capstone.mathuto.lessons.Lesson1
import com.capstone.mathuto.questions.QuestionOne.CORRECT_ANS
import com.capstone.mathuto.questions.QuestionOne.TOTAL_QUESTIONS
import com.capstone.mathuto.questions.QuestionOne.UNANSWERED_QUESTIONS
import com.capstone.mathuto.questions.QuestionOne.WRONG_ANS
import com.capstone.mathuto.sqlite.Question
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.formatter.ValueFormatter

class QuizResult : AppCompatActivity() {

    private lateinit var binding: ActivityQuizResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuizResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val totalQuestions = intent.getIntExtra(TOTAL_QUESTIONS, 0)
        val correctAnswer = intent.getIntExtra(CORRECT_ANS, 0)
        val wrongAnswer = intent.getIntExtra(WRONG_ANS, 0)
        val unansweredQuestion = intent.getIntExtra(UNANSWERED_QUESTIONS, 0)

        val entries = mutableListOf<PieEntry>()
        entries.add(PieEntry(correctAnswer.toFloat(), "Correct"))
        entries.add(PieEntry(wrongAnswer.toFloat(), "Wrong"))
        entries.add(PieEntry(unansweredQuestion.toFloat(), "Unanswered"))

        val dataSet = PieDataSet(entries, "")
        val colors = mutableListOf<Int>()
        colors.add(Color.GREEN)
        colors.add(Color.RED)
        colors.add(Color.YELLOW)
        dataSet.colors = colors

        val data = PieData(dataSet)
        data.setValueTextSize(12f)
        data.setValueTextColor(Color.WHITE)
        data.setValueFormatter(object : ValueFormatter() {
            override fun getFormattedValue(value: Float): String {
                return value.toInt().toString()
            }
        })

        binding.pieChart.data = data
        binding.pieChart.description.isEnabled = false
        binding.pieChart.setEntryLabelTextSize(12f)
        binding.pieChart.setEntryLabelColor(Color.WHITE)
        binding.pieChart.legend.isEnabled = false
        binding.pieChart.animateY(1000)
        binding.pieChart.invalidate()

        binding.tvScoreCorrect.text = "$correctAnswer"
        binding.tvScoreCorrect.setTextColor(Color.WHITE)

        binding.tvScoreWrong.text = "$wrongAnswer"
        binding.tvScoreWrong.setTextColor(Color.WHITE)

        binding.tvUnansweredQuestion.text = "$unansweredQuestion"
        binding.tvUnansweredQuestion.setTextColor(Color.WHITE)

        binding.totalNumberOfQuestions.text = "Total number of questions: $totalQuestions"
        binding.totalNumberOfQuestions.setTextColor(Color.WHITE)


        binding.btnBack.setOnClickListener{
            val intent = Intent(applicationContext,  Lesson1::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            applicationContext.startActivity(intent)
            overridePendingTransition(0, 0)
        }
        binding.btnMainMenu.setOnClickListener {
            startActivity(Intent(this, Main::class.java))
            overridePendingTransition(0, 0)
        }
        binding.btnSummary.setOnClickListener{
            val intent = Intent(applicationContext,  QuizResultSummaryActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            applicationContext.startActivity(intent)
            overridePendingTransition(0, 0)
        }
    }
}