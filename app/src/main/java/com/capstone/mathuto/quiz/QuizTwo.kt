package com.capstone.mathuto.quiz

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.capstone.mathuto.Main
import com.capstone.mathuto.R
import com.capstone.mathuto.databinding.ActivityQuizTwoBinding
import com.capstone.mathuto.questions.QuestionOne
import com.capstone.mathuto.questions.QuestionOne.WRONG_ANS
import com.capstone.mathuto.questions.QuestionTwo
import com.capstone.mathuto.questions.QuestionTwo.CORRECT_ANS
import com.capstone.mathuto.questions.QuestionTwo.TOTAL_QUESTIONS

class QuizTwo : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityQuizTwoBinding

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<QuestionMultipleChoice>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mWrongAnswers: Int = 0
    private var areOptionsEnabled = true

    private val handler = Handler()
    private val delayDuration: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuizTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvOptionOne.setOnClickListener(this)
        binding.tvOptionTwo.setOnClickListener(this)
        binding.tvOptionThree.setOnClickListener(this)
        binding.tvOptionFour.setOnClickListener(this)

        mQuestionList = QuestionTwo.getQuestions()
        mQuestionList?.shuffle()
        setQuestion()
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion() {
        defaultOptionView()
        if (!areOptionsEnabled) {
            disableOptions()
        } else {
            enableOptions()
        }
        val question: QuestionMultipleChoice = mQuestionList!![mCurrentPosition - 1]
        binding.progressBar.progress = mCurrentPosition
        binding.tvProgress.text = "$mCurrentPosition /${binding.progressBar.max}"
        binding.tvQuestion.text = question.question
        binding.tvOptionOne.text = question.optionOne
        binding.tvOptionTwo.text = question.optionTwo
        binding.tvOptionThree.text = question.optionThree
        binding.tvOptionFour.text = question.optionFour
    }

    private fun disableOptions() {
        binding.tvOptionOne.isEnabled = false
        binding.tvOptionTwo.isEnabled = false
        binding.tvOptionThree.isEnabled = false
        binding.tvOptionFour.isEnabled = false
    }

    private fun enableOptions() {
        binding.tvOptionOne.isEnabled = true
        binding.tvOptionTwo.isEnabled = true
        binding.tvOptionThree.isEnabled = true
        binding.tvOptionFour.isEnabled = true
    }

    private fun defaultOptionView() {
        val options = ArrayList<TextView>()
        binding.tvOptionOne.let {
            options.add(0, it)
        }
        binding.tvOptionTwo.let {
            options.add(1, it)
        }
        binding.tvOptionThree.let {
            options.add(2, it)
        }
        binding.tvOptionFour.let {
            options.add(3, it)
        }
        for (option in options) {
            option.setTextColor(Color.parseColor("#FFFFFF"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.quiz_default_option_border_bg)
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.quiz_default_option_border_bg)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(view: View?) {
        when(view?.id){
            R.id.tv_option_one -> {
                selectedOptionView(binding.tvOptionOne,1)
                processOptionSelected()
            }
            R.id.tv_option_two -> {
                selectedOptionView(binding.tvOptionTwo,2)
                processOptionSelected()
            }
            R.id.tv_option_three -> {
                selectedOptionView(binding.tvOptionThree,3)
                processOptionSelected()
            }
            R.id.tv_option_four -> {
                selectedOptionView(binding.tvOptionFour,4)
                processOptionSelected()
            }
        }
    }

    private fun processOptionSelected() {
        areOptionsEnabled = false
        disableOptions()
        val question = mQuestionList?.get(mCurrentPosition - 1)
        if (question!!.correctAnswer != mSelectedOptionPosition) {
            answerView(mSelectedOptionPosition, R.drawable.quiz_wrong_option_border_bg)
            mWrongAnswers++
        } else {
            mCorrectAnswers++
        }
        answerView(question.correctAnswer, R.drawable.quiz_correct_option_border_bg)
        if (mCurrentPosition == mQuestionList!!.size) {
            handler.postDelayed({
                val intent = Intent(applicationContext, QuizResult::class.java)
                intent.putExtra(CORRECT_ANS, mCorrectAnswers)

                if(mCorrectAnswers >= 6) Main.QUIZ2_PASSED = true

                intent.putExtra(WRONG_ANS,mQuestionList!!.size - mCorrectAnswers)
                intent.putExtra(TOTAL_QUESTIONS, mQuestionList?.size)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                applicationContext.startActivity(intent)
                overridePendingTransition(0, 0)
            }, delayDuration)
        } else {
            handler.postDelayed({
                mCurrentPosition++
                areOptionsEnabled = true
                setQuestion()
            }, delayDuration)
        }
        mSelectedOptionPosition = 0
    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                binding.tvOptionOne.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
            2 ->{
                binding.tvOptionTwo.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
            3 ->{
                binding.tvOptionThree.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
            4 ->{
                binding.tvOptionFour.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
        }
    }
}