package com.capstone.mathuto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.capstone.mathuto.databinding.ActivityMainScoresBinding
import com.capstone.mathuto.sqlite.SQLiteHelper

class MainScoresActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainScoresBinding
    lateinit var db: SQLiteHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        db = SQLiteHelper(this)

        binding = ActivityMainScoresBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val scores = db.getAllHighScores()
        if(scores.isEmpty()){
            binding.scoreNoContent.visibility = View.VISIBLE
            binding.cardViewLesoonOne.visibility  = View.GONE
            binding.cardViewLessonTwo.visibility  = View.GONE
            binding.cardViewLessonThree.visibility  = View.GONE
            binding.cardViewLessonFour.visibility  = View.GONE
            binding.cardViewLessonFive.visibility  = View.GONE
            binding.cardViewLessonSix.visibility  = View.GONE
            binding.cardViewLessonSeven.visibility  = View.GONE
            binding.cardViewLessonEight.visibility  = View.GONE
            binding.cardViewLessonNine.visibility  = View.GONE
            binding.cardViewLessonTen.visibility  = View.GONE
            binding.cardViewLessonEleven.visibility  = View.GONE
            binding.cardViewLessonTwelve.visibility  = View.GONE
            binding.cardViewLessonThirteen.visibility  = View.GONE
            binding.cardViewLessonFourteen.visibility  = View.GONE
            binding.cardViewLessonFifteen.visibility  = View.GONE
            binding.cardViewLessonSixteen.visibility  = View.GONE
            binding.cardViewLessonSeventeen.visibility  = View.GONE
            binding.cardViewLessonEighteen.visibility  = View.GONE
            binding.cardViewLessonNineteen.visibility  = View.GONE
        }else{
            binding.scoreNoContent.visibility = View.INVISIBLE

            binding.lessonOneHighScore.text = scores[0].score
            binding.cardViewLesoonOne.visibility  = View.VISIBLE

            binding.lessonTwoHighScore.text = scores[0].score
            binding.cardViewLessonTwo.visibility  = View.VISIBLE

            /*binding.lessonThreeHighScore.text = scores[0].score
            binding.cardViewLessonThree.visibility  = View.VISIBLE

            binding.lessonFourHighScore.text = scores[0].score
            binding.cardViewLessonFour.visibility  = View.VISIBLE

            binding.lessonFiveHighScore.text = scores[0].score
            binding.cardViewLessonFive.visibility  = View.VISIBLE

            binding.lessonSixHighScore.text = scores[0].score
            binding.cardViewLessonSix.visibility  = View.VISIBLE

            binding.lessonSevenHighScore.text = scores[0].score
            binding.cardViewLessonSeven.visibility  = View.VISIBLE

            binding.lessonEightHighScore.text = scores[0].score
            binding.cardViewLessonEight.visibility  = View.VISIBLE

            binding.lessonNineHighScore.text = scores[0].score
            binding.cardViewLessonNine.visibility  = View.VISIBLE

            binding.lessonTenHighScore.text = scores[0].score
            binding.cardViewLessonTen.visibility  = View.VISIBLE

            binding.lessonElevenHighScore.text = scores[0].score
            binding.cardViewLessonEleven.visibility  = View.VISIBLE

            binding.lessonTwelveHighScore.text = scores[0].score
            binding.cardViewLessonTwelve.visibility  = View.VISIBLE

            binding.lessonThirteenHighScore.text = scores[0].score
            binding.cardViewLessonThirteen.visibility  = View.VISIBLE

            binding.lessonFourteenHighScore.text = scores[0].score
            binding.cardViewLessonFourteen.visibility  = View.VISIBLE

            binding.lessonFifteenHighScore.text = scores[0].score
            binding.cardViewLessonFifteen.visibility  = View.VISIBLE

            binding.lessonSixteenHighScore.text = scores[0].score
            binding.cardViewLessonSixteen.visibility  = View.VISIBLE

            binding.lessonSeventeenHighScore.text = scores[0].score
            binding.cardViewLessonSeventeen.visibility  = View.VISIBLE

            binding.lessonEighteenHighScore.text = scores[0].score
            binding.cardViewLessonEighteen.visibility  = View.VISIBLE

            binding.lessonNineteenHighScore.text = scores[0].score
            binding.cardViewLessonNineteen.visibility  = View.VISIBLE*/
        }

        binding.btnBack.setOnClickListener{
            finish()
        }
    }
}