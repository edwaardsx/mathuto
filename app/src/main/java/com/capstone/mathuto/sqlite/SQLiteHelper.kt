package com.capstone.mathuto.sqlite

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SQLiteHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "questions.db"

        private const val TABLE_NAME = "questions"
        private const val COLUMN_ID = "id"
        private const val COLUMN_QUESTION = "question"
        private const val COLUMN_OPTION_A = "optionA"
        private const val COLUMN_OPTION_B = "optionB"
        private const val COLUMN_OPTION_C = "optionC"
        private const val COLUMN_OPTION_D = "optionD"
        private const val COLUMN_ANSWER = "answer"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val createTableQuery = "CREATE TABLE $TABLE_NAME (" +
                "$COLUMN_ID INTEGER PRIMARY KEY," +
                "$COLUMN_QUESTION TEXT," +
                "$COLUMN_OPTION_A TEXT," +
                "$COLUMN_OPTION_B TEXT," +
                "$COLUMN_OPTION_C TEXT," +
                "$COLUMN_OPTION_D TEXT," +
                "$COLUMN_ANSWER TEXT" +
                ")"

        db.execSQL(createTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    // Method to insert a new question
    fun insertQuestion(question: Question) {
        val db = writableDatabase
        val values = ContentValues().apply {
            put(COLUMN_QUESTION, question.question)
            put(COLUMN_OPTION_A, question.optionA)
            put(COLUMN_OPTION_B, question.optionB)
            put(COLUMN_OPTION_C, question.optionC)
            put(COLUMN_OPTION_D, question.optionD)
            put(COLUMN_ANSWER, question.correctAnswer)
        }
        db.insert(TABLE_NAME, null, values)
        db.close()
    }

    // Method to retrieve all questions
    @SuppressLint("Range")
    fun getAllQuestions(): List<Question> {
        val questionsList = mutableListOf<Question>()
        val db = readableDatabase
        val selectQuery = "SELECT * FROM $TABLE_NAME"

        val cursor = db.rawQuery(selectQuery, null)

        if (cursor.moveToFirst()) {
            do {
                val id = cursor.getInt(cursor.getColumnIndex(COLUMN_ID))
                val question = cursor.getString(cursor.getColumnIndex(COLUMN_QUESTION))
                val optionA = cursor.getString(cursor.getColumnIndex(COLUMN_OPTION_A))
                val optionB = cursor.getString(cursor.getColumnIndex(COLUMN_OPTION_B))
                val optionC = cursor.getString(cursor.getColumnIndex(COLUMN_OPTION_C))
                val optionD = cursor.getString(cursor.getColumnIndex(COLUMN_OPTION_D))
                val correctAnswer = cursor.getInt(cursor.getColumnIndex(COLUMN_ANSWER))

                val questionObject = Question(id, question, optionA, optionB, optionC, optionD, correctAnswer,0)
                questionsList.add(questionObject)
            } while (cursor.moveToNext())
        }

        cursor.close()
        db.close()

        return questionsList
    }
}
