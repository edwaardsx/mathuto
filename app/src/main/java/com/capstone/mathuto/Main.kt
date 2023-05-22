package com.capstone.mathuto

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.capstone.mathuto.databinding.ActivityMainBinding
import com.capstone.mathuto.lessons.*
import com.capstone.mathuto.recycler.RecyclerAdapter
import com.capstone.mathuto.recycler.TitleData
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class Main : AppCompatActivity(), RecyclerAdapter.OnItemClickListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var carouselView: CarouselView
    private lateinit var recyclerAdapter: RecyclerAdapter

    private val carouselImages = intArrayOf(
        R.drawable.img_carousel_one,
        R.drawable.img_carousel_two,
        R.drawable.img_carousel_three)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = ""

        carouselView = findViewById(R.id.carouselView)
        carouselView.pageCount = carouselImages.size
        carouselView.setImageListener(imageListener)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val itemList = listOf(
            if(QUIZ1_PASSED && WATCHED_TUTORIAL1)
                TitleData("Lesson 1",
                    "Addition and Subtraction of Fractions",
                    COMPLETED
                )
            else
                TitleData("Lesson 1",
                    "Addition and Subtraction of Fractions",
                    ONGOING
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ1_PASSED && WATCHED_TUTORIAL1)
                TitleData("Lesson 2",
                    "Problem Solving Involving Addition and Subtraction of Fractions",
                    ONGOING
                )
            else if (QUIZ2_PASSED && WATCHED_TUTORIAL2)
                TitleData("Lesson 2",
                    "Problem Solving Involving Addition and Subtraction of Fractions",
                    COMPLETED
                )
            else
                TitleData("Lesson 2",
                    "Problem Solving Involving Addition and Subtraction of Fractions",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ2_PASSED && WATCHED_TUTORIAL2)
                TitleData("Lesson 3",
                    "Multiplication of Simple Fractions and Mixed Fractions",
                    ONGOING
                )
            else if (QUIZ3_PASSED && WATCHED_TUTORIAL3)
                TitleData("Lesson 3",
                    "Multiplication of Simple Fractions and Mixed Fractions",
                    COMPLETED
                )
            else
                TitleData("Lesson 3",
                    "Multiplication of Simple Fractions and Mixed Fractions",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ3_PASSED && WATCHED_TUTORIAL3)
                TitleData("Lesson 4",
                    "Problem Solving on Multiplication of Fractions",
                    ONGOING
                )
            else if (QUIZ4_PASSED && WATCHED_TUTORIAL4)
                TitleData("Lesson 4",
                    "Problem Solving on Multiplication of Fractions",
                    COMPLETED
                )
            else
                TitleData("Lesson 4",
                    "Problem Solving on Multiplication of Fractions",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ4_PASSED && WATCHED_TUTORIAL4)
                TitleData("Lesson 5",
                    "Dividing Simple Fractions and Mixed Fractions",
                    ONGOING
                )
            else if (QUIZ5_PASSED && WATCHED_TUTORIAL5)
                TitleData("Lesson 5",
                    "Dividing Simple Fractions and Mixed Fractions",
                    COMPLETED
                )
            else
                TitleData("Lesson 5",
                    "Dividing Simple Fractions and Mixed Fractions",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ5_PASSED && WATCHED_TUTORIAL5)
                TitleData("Lesson 6",
                    "Solving Routine or Non-Routine Problems Involving Division Without or With Any of the Other Operations of Fractions and Mixed Fractions",
                    ONGOING
                )
            else if (QUIZ6_PASSED && WATCHED_TUTORIAL6)
                TitleData("Lesson 6",
                    "Solving Routine or Non-Routine Problems Involving Division Without or With Any of the Other Operations of Fractions and Mixed Fractions",
                    COMPLETED
                )
            else
                TitleData("Lesson 6",
                    "Solving Routine or Non-Routine Problems Involving Division Without or With Any of the Other Operations of Fractions and Mixed Fractions",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ6_PASSED && WATCHED_TUTORIAL6)
                TitleData("Lesson 7",
                    "Addition and Subtraction of Fractions",
                    ONGOING
                )
            else if (QUIZ7_PASSED && WATCHED_TUTORIAL7)
                TitleData("Lesson 7",
                    "Addition and Subtraction of Fractions",
                    COMPLETED
                )
            else
                TitleData("Lesson 7",
                    "Addition and Subtraction of Fractions",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ7_PASSED && WATCHED_TUTORIAL7)
                TitleData("Lesson 8",
                    "Solving Routine or Non-Routine Problems Involving Addition and Subtraction of Decimals and Mixed Decimals Using Appropriate Problem Solving Strategies and Tools",
                    ONGOING
                )
            else if (QUIZ8_PASSED && WATCHED_TUTORIAL8)
                TitleData("Lesson 8",
                    "Solving Routine or Non-Routine Problems Involving Addition and Subtraction of Decimals and Mixed Decimals Using Appropriate Problem Solving Strategies and Tools",
                    COMPLETED
                )
            else
                TitleData("Lesson 8",
                    "Solving Routine or Non-Routine Problems Involving Addition and Subtraction of Decimals and Mixed Decimals Using Appropriate Problem Solving Strategies and Tools",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ8_PASSED && WATCHED_TUTORIAL8)
                TitleData("Lesson 9",
                    "Multiplication of Decimals and Mixed Decimals",
                    ONGOING
                )
            else if (QUIZ9_PASSED && WATCHED_TUTORIAL9)
                TitleData("Lesson 9",
                    "Multiplication of Decimals and Mixed Decimals",
                    COMPLETED
                )
            else
                TitleData("Lesson 9",
                    "Multiplication of Decimals and Mixed Decimals",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ9_PASSED && WATCHED_TUTORIAL9)
                TitleData("Lesson 10",
                    "Multiplication of Decimals and Mixed Decimals Mentally by 0.1, 0.01, 10 and 100",
                    ONGOING
                )
            else if (QUIZ10_PASSED && WATCHED_TUTORIAL10)
                TitleData("Lesson 10",
                    "Multiplication of Decimals and Mixed Decimals Mentally by 0.1, 0.01, 10 and 100",
                    COMPLETED
                )
            else
                TitleData("Lesson 10",
                    "Multiplication of Decimals and Mixed Decimals Mentally by 0.1, 0.01, 10 and 100s",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ9_PASSED && WATCHED_TUTORIAL9)
                TitleData("Lesson 10",
                    "Multiplication of Decimals and Mixed Decimals Mentally by 0.1, 0.01, 10 and 100",
                    ONGOING
                )
            else if (QUIZ10_PASSED && WATCHED_TUTORIAL10)
                TitleData("Lesson 10",
                    "Multiplication of Decimals and Mixed Decimals Mentally by 0.1, 0.01, 10 and 100",
                    COMPLETED
                )
            else
                TitleData("Lesson 10",
                    "Multiplication of Decimals and Mixed Decimals Mentally by 0.1, 0.01, 10 and 100",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ10_PASSED && WATCHED_TUTORIAL10)
                TitleData("Lesson 11",
                    "Problem-Solving on Multiplication of Decimals",
                    ONGOING
                )
            else if (QUIZ11_PASSED && WATCHED_TUTORIAL11)
                TitleData("Lesson 11",
                    "Problem-Solving on Multiplication of Decimals",
                    COMPLETED
                )
            else
                TitleData("Lesson 11",
                    "Problem-Solving on Multiplication of Decimals",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ11_PASSED && WATCHED_TUTORIAL11)
                TitleData("Lesson 12",
                    "Multi-Step Problems Involving Multiplication and Addition or Subtraction of Decimals",
                    ONGOING
                )
            else if (QUIZ12_PASSED && WATCHED_TUTORIAL12)
                TitleData("Lesson 12",
                    "Multi-Step Problems Involving Multiplication and Addition or Subtraction of Decimals",
                    COMPLETED
                )
            else
                TitleData("Lesson 12",
                    "Multi-Step Problems Involving Multiplication and Addition or Subtraction of Decimals",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ12_PASSED && WATCHED_TUTORIAL12)
                TitleData("Lesson 13",
                    "Dividing Whole Numbers by Decimals Up 2 Decimal Places",
                    ONGOING
                )
            else if (QUIZ13_PASSED && WATCHED_TUTORIAL13)
                TitleData("Lesson 13",
                    "Dividing Whole Numbers by Decimals Up 2 Decimal Places",
                    COMPLETED
                )
            else
                TitleData("Lesson 13",
                    "Dividing Whole Numbers by Decimals Up 2 Decimal Places",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ13_PASSED && WATCHED_TUTORIAL13)
                TitleData("Lesson 14",
                    "Dividing Decimals/Mixed Decimals",
                    ONGOING
                )
            else if (QUIZ14_PASSED && WATCHED_TUTORIAL14)
                TitleData("Lesson 14",
                    "Dividing Decimals/Mixed Decimals",
                    COMPLETED
                )
            else
                TitleData("Lesson 14",
                    "Dividing Decimals/Mixed Decimals",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ14_PASSED && WATCHED_TUTORIAL14)
                TitleData("Lesson 15",
                    "Dividing Decimals Up to 4 Decimal Places by 0.1, 0.01 and 0.001",
                    ONGOING
                )
            else if (QUIZ15_PASSED && WATCHED_TUTORIAL15)
                TitleData("Lesson 15",
                    "Dividing Decimals Up to 4 Decimal Places by 0.1, 0.01 and 0.001",
                    COMPLETED
                )
            else
                TitleData("Lesson 15",
                    "Dividing Decimals Up to 4 Decimal Places by 0.1, 0.01 and 0.001",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ15_PASSED && WATCHED_TUTORIAL15)
                TitleData("Lesson 16",
                    "Dividing Decimals Up to 2 Decimal Places by 10, 100 and 1000 Mentally",
                    ONGOING
                )
            else if (QUIZ16_PASSED && WATCHED_TUTORIAL16)
                TitleData("Lesson 16",
                    "Dividing Decimals Up to 2 Decimal Places by 10, 100 and 1000 Mentally",
                    COMPLETED
                )
            else
                TitleData("Lesson 16",
                    "Dividing Decimals Up to 2 Decimal Places by 10, 100 and 1000 Mentally",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ16_PASSED && WATCHED_TUTORIAL16)
                TitleData("Lesson 17",
                    "Differentiating Repeating from Terminating and Non-Terminating Decimal Quotient",
                    ONGOING
                )
            else if (QUIZ17_PASSED && WATCHED_TUTORIAL17)
                TitleData("Lesson 17",
                    "Differentiating Repeating from Terminating and Non-Terminating Decimal Quotient",
                    COMPLETED
                )
            else
                TitleData("Lesson 17",
                    "Differentiating Repeating from Terminating and Non-Terminating Decimal Quotient",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ17_PASSED && WATCHED_TUTORIAL17)
                TitleData("Lesson 18",
                    "Solving Word Problems Involving Division of Decimals",
                    ONGOING
                )
            else if (QUIZ18_PASSED && WATCHED_TUTORIAL18)
                TitleData("Lesson 18",
                    "Solving Word Problems Involving Division of Decimals",
                    COMPLETED
                )
            else
                TitleData("Lesson 18",
                    "Solving Word Problems Involving Division of Decimals",
                    LOCK
                ),
////////////////////////////////////////////////////////////////////////////////////////////////////
            if(QUIZ18_PASSED && WATCHED_TUTORIAL18)
                TitleData("Lesson 19",
                    "Solving Multi-Step Problems Involving Division of Decimals and Any of the Other Operations",
                    ONGOING
                )
            else if (QUIZ19_PASSED && WATCHED_TUTORIAL19)
                TitleData("Lesson 19",
                    "Solving Multi-Step Problems Involving Division of Decimals and Any of the Other Operations",
                    COMPLETED
                )
            else
                TitleData("Lesson 19",
                    "Solving Multi-Step Problems Involving Division of Decimals and Any of the Other Operations",
                    LOCK
                ),
        )
        val adapter = RecyclerAdapter(itemList, this)
        recyclerAdapter = adapter

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun onItemClick(titleData: TitleData) {
        val intent = when (titleData.lesson) {
            "Lesson 1" -> Intent(this, Lesson1::class.java)
            else -> null
        }
        intent?.let {
            startActivity(intent)
        }
        if (titleData.lesson == "Lesson 2" && QUIZ1_PASSED && WATCHED_TUTORIAL1) {
            val intent = when (titleData.lesson) {
                "Lesson 2" -> Intent(this, Lesson2::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 3" && QUIZ2_PASSED && WATCHED_TUTORIAL2) {
            val intent = when (titleData.lesson) {
                "Lesson 3" -> Intent(this, Lesson3::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 4" && QUIZ3_PASSED && WATCHED_TUTORIAL3) {
            val intent = when (titleData.lesson) {
                "Lesson 4" -> Intent(this, Lesson4::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 5" && QUIZ4_PASSED && WATCHED_TUTORIAL4) {
            val intent = when (titleData.lesson) {
                "Lesson 5" -> Intent(this, Lesson5::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 6" && QUIZ5_PASSED && WATCHED_TUTORIAL5) {
            val intent = when (titleData.lesson) {
                "Lesson 6" -> Intent(this, Lesson6::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 7" && QUIZ6_PASSED && WATCHED_TUTORIAL6) {
            val intent = when (titleData.lesson) {
                "Lesson 7" -> Intent(this, Lesson7::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 8" && QUIZ7_PASSED && WATCHED_TUTORIAL7) {
            val intent = when (titleData.lesson) {
                "Lesson 8" -> Intent(this, Lesson8::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 9" && QUIZ8_PASSED && WATCHED_TUTORIAL8) {
            val intent = when (titleData.lesson) {
                "Lesson 9" -> Intent(this, Lesson9::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 10" && QUIZ9_PASSED && WATCHED_TUTORIAL9) {
            val intent = when (titleData.lesson) {
                "Lesson 10" -> Intent(this, Lesson10::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 11" && QUIZ10_PASSED && WATCHED_TUTORIAL10) {
            val intent = when (titleData.lesson) {
                "Lesson 11" -> Intent(this, Lesson11::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 12" && QUIZ11_PASSED && WATCHED_TUTORIAL11) {
            val intent = when (titleData.lesson) {
                "Lesson 12" -> Intent(this, Lesson12::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 13" && QUIZ12_PASSED && WATCHED_TUTORIAL12) {
            val intent = when (titleData.lesson) {
                "Lesson 13" -> Intent(this, Lesson13::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 14" && QUIZ13_PASSED && WATCHED_TUTORIAL13) {
            val intent = when (titleData.lesson) {
                "Lesson 14" -> Intent(this, Lesson14::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 15" && QUIZ14_PASSED && WATCHED_TUTORIAL14) {
            val intent = when (titleData.lesson) {
                "Lesson 15" -> Intent(this, Lesson15::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 16" && QUIZ15_PASSED && WATCHED_TUTORIAL15) {
            val intent = when (titleData.lesson) {
                "Lesson 16" -> Intent(this, Lesson16::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 17" && QUIZ16_PASSED && WATCHED_TUTORIAL16) {
            val intent = when (titleData.lesson) {
                "Lesson 17" -> Intent(this, Lesson17::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 18" && QUIZ17_PASSED && WATCHED_TUTORIAL17) {
            val intent = when (titleData.lesson) {
                "Lesson 18" -> Intent(this, Lesson18::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
        if (titleData.lesson == "Lesson 19" && QUIZ18_PASSED && WATCHED_TUTORIAL18) {
            val intent = when (titleData.lesson) {
                "Lesson 19" -> Intent(this, Lesson19::class.java)
                else -> null
            }
            intent?.let {
                startActivity(intent)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item_main, menu)

        val searchItem = menu?.findItem(R.id.search)
        val searchView = searchItem?.actionView as SearchView
        searchView.queryHint = "Search for lessons"

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return true
            }
            @SuppressLint("SetTextI18n")
            override fun onQueryTextChange(newText: String): Boolean {
                recyclerAdapter.filterItems(newText)
                return true
            }
        })
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about -> {
                val intent = Intent(applicationContext, About::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                applicationContext.startActivity(intent)
                overridePendingTransition(0, 0)
            }
            R.id.list_of_quiz_score -> {
                val intent = Intent(applicationContext, MainScoresActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                applicationContext.startActivity(intent)
                overridePendingTransition(0, 0)
            }
            R.id.search -> {

            }
            else -> super.onOptionsItemSelected(item)
        }
        return super.onOptionsItemSelected(item)
    }

    private val imageListener = ImageListener { position, imageView ->
        val imagePosition = position % carouselImages.size
        imageView.setImageResource(carouselImages[imagePosition])
    }

    companion object {
        var WATCHED_TUTORIAL1: Boolean = false
        var WATCHED_TUTORIAL2: Boolean = false
        var WATCHED_TUTORIAL3: Boolean = false
        var WATCHED_TUTORIAL4: Boolean = false
        var WATCHED_TUTORIAL5: Boolean = false
        var WATCHED_TUTORIAL6: Boolean = false
        var WATCHED_TUTORIAL7: Boolean = false
        var WATCHED_TUTORIAL8: Boolean = false
        var WATCHED_TUTORIAL9: Boolean = false
        var WATCHED_TUTORIAL10: Boolean = false
        var WATCHED_TUTORIAL11: Boolean = false
        var WATCHED_TUTORIAL12: Boolean = false
        var WATCHED_TUTORIAL13: Boolean = false
        var WATCHED_TUTORIAL14: Boolean = false
        var WATCHED_TUTORIAL15: Boolean = false
        var WATCHED_TUTORIAL16: Boolean = false
        var WATCHED_TUTORIAL17: Boolean = false
        var WATCHED_TUTORIAL18: Boolean = false
        var WATCHED_TUTORIAL19: Boolean = false

        var QUIZ1_PASSED: Boolean = false
        var QUIZ2_PASSED: Boolean = false
        var QUIZ3_PASSED: Boolean = false
        var QUIZ4_PASSED: Boolean = false
        var QUIZ5_PASSED: Boolean = false
        var QUIZ6_PASSED: Boolean = false
        var QUIZ7_PASSED: Boolean = false
        var QUIZ8_PASSED: Boolean = false
        var QUIZ9_PASSED: Boolean = false
        var QUIZ10_PASSED: Boolean = false
        var QUIZ11_PASSED: Boolean = false
        var QUIZ12_PASSED: Boolean = false
        var QUIZ13_PASSED: Boolean = false
        var QUIZ14_PASSED: Boolean = false
        var QUIZ15_PASSED: Boolean = false
        var QUIZ16_PASSED: Boolean = false
        var QUIZ17_PASSED: Boolean = false
        var QUIZ18_PASSED: Boolean = false
        var QUIZ19_PASSED: Boolean = false

        const val COMPLETED: String = "Complete"
        const val LOCK: String = "Lock"
        const val ONGOING: String = "In progress"
    }
}