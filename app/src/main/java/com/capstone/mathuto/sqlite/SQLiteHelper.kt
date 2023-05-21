package com.capstone.mathuto.sqlite

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SQLiteHelper(context: Context) : SQLiteOpenHelper(context, "Userscores.db", null, 1) {

    companion object {
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE HIGHSCORES(id Integer PRIMARY KEY, lesson TEXT, score TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS HIGHSCORES")
        onCreate(db)
    }

    // Method to insert a new highscores
    fun insertHighScores(lesson: String, score: String) :Boolean {

        val db = writableDatabase
        val values = ContentValues().apply {
            put("id", 1)
            put("lesson", lesson)
            put("score", score)
        }
        db.insert("HIGHSCORES", null, values)
        db.close()
        return true;
    }

    fun updateHighScores(lesson: String, score: String): Boolean {
        val DB = this.getWritableDatabase()
        val contentValues = ContentValues()
        contentValues.put("lesson", lesson)
        contentValues.put("score", score)
        val cursor = DB.rawQuery("SELECT * FROM HIGHSCORES WHERE lesson = ?", arrayOf(lesson))

        return if (cursor.count > 0) {
            val result = DB.update("HIGHSCORES", contentValues, "lesson=?", arrayOf(lesson))
            result != -1
        } else {
            false
        }
    }

    // Method to retrieve all highscores
    @SuppressLint("Range")
    fun getAllHighScores(): List<Highscores> {
        val HighscoresList = mutableListOf<Highscores>()
        val db = readableDatabase
        val selectQuery = "SELECT * FROM HIGHSCORES"

        val cursor = db.rawQuery(selectQuery, null)

        if (cursor.moveToFirst()) {
            do {
                val id = cursor.getInt(cursor.getColumnIndex("id"))
                val lesson = cursor.getString(cursor.getColumnIndex("lesson"))
                val score = cursor.getString(cursor.getColumnIndex("score"))

                val HighscoresObject = Highscores(id, lesson, score)
                HighscoresList.add(HighscoresObject)
            } while (cursor.moveToNext())
        }

        cursor.close()
        db.close()
        return HighscoresList
    }



}
