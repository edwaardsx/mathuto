package com.capstone.mathuto.quiz

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.capstone.mathuto.Main.Companion.QUIZ13_PASSED
import com.capstone.mathuto.R
import com.capstone.mathuto.databinding.ActivityQuizThirteenBinding
import com.capstone.mathuto.questions.QuestionOne.WRONG_ANS
import com.capstone.mathuto.questions.QuestionThirteen
import com.capstone.mathuto.questions.QuestionThirteen.CORRECT_ANS
import com.capstone.mathuto.questions.QuestionThirteen.SELECTED_ANSWERS
import com.capstone.mathuto.questions.QuestionThirteen.TOTAL_QUESTIONS
import com.capstone.mathuto.questions.QuestionThirteen.UNANSWERED_QUESTIONS
import com.capstone.mathuto.sqlite.Question
import com.capstone.mathuto.sqlite.SQLiteHelper

class QuizThirteen : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityQuizThirteenBinding
    private lateinit var selectedAnswer: ArrayList<Int>
    private lateinit var db: SQLiteHelper

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mWrongAnswers: Int = 0
    private var mUnansweredQuestion: Int = 0
    private var areOptionsEnabled = true

    private val handler = Handler()
    private val delayDuration: Long = 2000
    private var remainingTime: Long = 60000

    private var seCorrect: MediaPlayer? = null
    private var seWrong: MediaPlayer? = null
    private var seBackgroundMusic: MediaPlayer? = null
    private var isBackgroundMusicPlaying: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuizThirteenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = SQLiteHelper(this)

        binding.tvOptionOne.setOnClickListener(this)
        binding.tvOptionTwo.setOnClickListener(this)
        binding.tvOptionThree.setOnClickListener(this)
        binding.tvOptionFour.setOnClickListener(this)

        seCorrect = MediaPlayer.create(this, R.raw.sound_effect_correct)
        seWrong = MediaPlayer.create(this, R.raw.sound_effect_wrong)
        seBackgroundMusic = MediaPlayer.create(this, R.raw.sound_background_music)

        mQuestionList = QuestionThirteen.getQuestions()
        mQuestionList?.shuffle()
        setQuestion()

        selectedAnswer = ArrayList()

        seBackgroundMusic?.setOnCompletionListener {
            if (isBackgroundMusicPlaying) {
                seBackgroundMusic?.start()
            }
        }
        startBackgroundMusic()
    }

    private fun startBackgroundMusic() {
        if (!isBackgroundMusicPlaying) {
            seBackgroundMusic?.start()
            isBackgroundMusicPlaying = true
        }
    }

    private fun stopBackgroundMusic() {
        if (isBackgroundMusicPlaying) {
            seBackgroundMusic?.pause()
            seBackgroundMusic?.seekTo(0)
            isBackgroundMusicPlaying = false
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        stopBackgroundMusic()
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion() {
        defaultOptionView()
        if (mCurrentPosition <= mQuestionList!!.size) {
            timer.start()
            if (!areOptionsEnabled) {
                disableOptions()
            } else {
                enableOptions()
            }
            val question: Question = mQuestionList!![mCurrentPosition - 1]
            binding.progressBar.progress = mCurrentPosition
            binding.tvProgress.text = "Question $mCurrentPosition/${binding.progressBar.max}"
            binding.tvQuestion.text = question.question
            binding.tvOptionOne.text = question.optionA
            binding.tvOptionTwo.text = question.optionB
            binding.tvOptionThree.text = question.optionC
            binding.tvOptionFour.text = question.optionD
        }
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
        timer.cancel()
        disableOptions()
        val question = mQuestionList?.get(mCurrentPosition - 1)
        selectedAnswer.add(mSelectedOptionPosition)
        if (question!!.correctAnswer != mSelectedOptionPosition) {
            answerView(mSelectedOptionPosition, R.drawable.quiz_wrong_option_border_bg)
            mWrongAnswers++
            seWrong?.start()
            mQuestionList
        } else {
            mCorrectAnswers++
            seCorrect?.start()
        }
        answerView(question.correctAnswer, R.drawable.quiz_correct_option_border_bg)
        if (mCurrentPosition == mQuestionList!!.size) {
            handler.postDelayed({
                val intent = Intent(applicationContext, QuizResult13::class.java)
                seBackgroundMusic?.stop()
                intent.putExtra(CORRECT_ANS, mCorrectAnswers)

                val scores = db.getAllHighScores()
                if (scores.size == 12) {
                    db.insertHighScores("Lesson 13", mCorrectAnswers.toString())
                } else if (scores.size >= 13) {
                    val previousScore = Integer.parseInt(scores[12].score)
                    if (mCorrectAnswers > previousScore) {
                        db.updateHighScores("Lesson 13", mCorrectAnswers.toString())
                    }
                }

                if(mCorrectAnswers >= 6) {
                    QUIZ13_PASSED = true
                }
                intent.putExtra(TOTAL_QUESTIONS, mQuestionList!!.size)
                intent.putExtra(WRONG_ANS, mQuestionList!!.size - (mCorrectAnswers + mUnansweredQuestion))
                intent.putExtra(UNANSWERED_QUESTIONS, mQuestionList!!.size - (mCorrectAnswers + mWrongAnswers))
                intent.putExtra(CORRECT_ANS, mCorrectAnswers)
                intent.putIntegerArrayListExtra(SELECTED_ANSWERS, selectedAnswer)
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

    private val timer = object : CountDownTimer(remainingTime, 1000) {
        @SuppressLint("SetTextI18n")
        override fun onTick(millisUntilFinished: Long) {
            remainingTime = millisUntilFinished
            val seconds = millisUntilFinished / 1000
            val minutes = seconds / 60
            val remainingSeconds = seconds % 60
            binding.tvTimer.text = "Time Left: ${minutes}:${String.format("%02d", remainingSeconds)}"
        }

        override fun onFinish() {
            mCurrentPosition++
            areOptionsEnabled = true
            setQuestion()
            seWrong?.start()
        }
    }
}