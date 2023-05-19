package com.capstone.mathuto

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
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

    private var isShowingAll: Boolean = false

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
            TitleData("Lesson 1", "Addition and Subtraction of Fractions"),
            TitleData("Lesson 2", "Problem Solving Involving Addition and Subtraction of Fractions"),
            TitleData("Lesson 3", "Multiplication of Simple Fractions and Mixed Fractions"),
            TitleData("Lesson 4", "Problem Solving on Multiplication of Fractions"),
            TitleData("Lesson 5", "Dividing Simple Fractions and Mixed Fractions"),
            TitleData("Lesson 6", "Solving Routine or Non-Routine Problems Involving Division Without or With Any of the Other Operations of Fractions and Mixed Fractions"),
            TitleData("Lesson 7", "Addition and Subtraction of Fractions"),
            TitleData("Lesson 8", "Solving Routine or Non-Routine Problems Involving Addition and Subtraction of Decimals and Mixed Decimals Using Appropriate Problem Solving Strategies and Tools"),
            TitleData("Lesson 9", "Multiplication of Decimals and Mixed Decimals"),
            TitleData("Lesson 10", "Multiplication of Decimals and Mixed Decimals Mentally by 0.1, 0.01, 10 and 100"),
            TitleData("Lesson 11", "Problem-Solving on Multiplication of Decimals"),
            TitleData("Lesson 12", "Multi-Step Problems Involving Multiplication and Addition or Subtraction of Decimals"),
            TitleData("Lesson 13", "Dividing Whole Numbers by Decimals Up 2 Decimal Places"),
            TitleData("Lesson 14", "Dividing Decimals/Mixed Decimals"),
            TitleData("Lesson 15", "Dividing Decimals Up to 4 Decimal Places by 0.1, 0.01 and 0.001"),
            TitleData("Lesson 16", "Dividing Decimals Up to 2 Decimal Places by 10, 100 and 1000 Mentally"),
            TitleData("Lesson 17", "Differentiating Repeating from Terminating and Non-Terminating Decimal Quotient"),
            TitleData("Lesson 18", "Solving Word Problems Involving Division of Decimals"),
            TitleData("Lesson 19", "Solving Multi-Step Problems Involving Division of Decimals and Any of the Other Operations"))

        val adapter = RecyclerAdapter(itemList, this)
        recyclerAdapter = adapter

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        binding.btnShowMore.setOnClickListener {
            isShowingAll = !isShowingAll
            recyclerAdapter.setShowAll(isShowingAll)
            updateButtonText()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun updateButtonText() {
        if (isShowingAll) {
            binding.btnShowMore.text = "Show less"
        } else {
            binding.btnShowMore.text = "Show more"
        }
    }

     override fun onItemClick(titleData: TitleData) {
        val intent = when (titleData.lesson) {
            "Lesson 1" -> Intent(this, Lesson1::class.java)
            "Lesson 2" -> Intent(this, Lesson2::class.java)
            "Lesson 3" -> Intent(this, Lesson3::class.java)
            "Lesson 4" -> Intent(this, Lesson4::class.java)
            "Lesson 5" -> Intent(this, Lesson5::class.java)
            "Lesson 6" -> Intent(this, Lesson6::class.java)
            "Lesson 7" -> Intent(this, Lesson7::class.java)
            "Lesson 8" -> Intent(this, Lesson8::class.java)
            "Lesson 9" -> Intent(this, Lesson9::class.java)
            "Lesson 10" -> Intent(this, Lesson10::class.java)
            "Lesson 11" -> Intent(this, Lesson11::class.java)
            "Lesson 12" -> Intent(this, Lesson12::class.java)
            "Lesson 13" -> Intent(this, Lesson13::class.java)
            "Lesson 14" -> Intent(this, Lesson14::class.java)
            "Lesson 15" -> Intent(this, Lesson15::class.java)
            "Lesson 16" -> Intent(this, Lesson16::class.java)
            "Lesson 17" -> Intent(this, Lesson17::class.java)
            "Lesson 18" -> Intent(this, Lesson18::class.java)
            "Lesson 19" -> Intent(this, Lesson19::class.java)
            else -> null
        }
        intent?.let {
            startActivity(intent)
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
}