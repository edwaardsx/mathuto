package com.capstone.mathuto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.capstone.mathuto.databinding.ActivityMainScoresBinding
import com.capstone.mathuto.databinding.ActivityQuizResultBinding
import com.capstone.mathuto.sqlite.Highscores
import com.capstone.mathuto.sqlite.SQLiteHelper

class MainScoresActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainScoresBinding
    lateinit var db: SQLiteHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        db = SQLiteHelper(this);

        binding = ActivityMainScoresBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val scores = db.getAllHighScores()
        if(scores.isEmpty()){
            binding.scoreNoContent.visibility = View.VISIBLE
            binding.cardViewLesoonOne.visibility  = View.GONE
            binding.cardViewLessonTwo.visibility  = View.GONE
            binding.cardViewLessonThree.visibility  = View.GONE
        }else{
            binding.scoreNoContent.visibility = View.INVISIBLE

            if(scores.get(0).id != null){
                binding.lessonOneHighScore.setText(scores.get(0).score)
                binding.cardViewLesoonOne.visibility  = View.VISIBLE
            }else if(scores.get(1).id != null){
                binding.lessonTwoHighScore.setText(scores.get(1).score)
                binding.lessonTwoHighScore.visibility  = View.VISIBLE
            }

        }

        binding.btnBack.setOnClickListener{
            finish()
        }
    }
}