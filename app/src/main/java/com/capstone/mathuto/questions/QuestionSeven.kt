package com.capstone.mathuto.questions

import com.capstone.mathuto.sqlite.Question

object QuestionSeven {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<Question>{

        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Can be defined as a whole number whose fractional part is separated by a decimal value.",
            "Decimal",
            "Place Value",
            "Whole Number",
            "Standard Form",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            1,
            "This is the value of where a digit is in a decimal number.",
            "Decimal",
            "Place Value",
            "Whole Number",
            "Standard Form",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            1,
            "The decimal point show a value smaller than one.",
            "Decimal",
            "Place Value",
            "Whole Number",
            "Standard Form",
            3
        )
        questionList.add(que3)

        val que4 = Question(
            1,
            "The usual way to write a decimal.",
            "Decimal",
            "Place Value",
            "Whole Number",
            "Standard Form",
            4
        )
        questionList.add(que4)

        val que5 = Question(
            1,
            "Writing the decimals in words, such as four and two tenths.",
            "Word Form",
            "\"and\"",
            "Zeros",
            "Column",
            1
        )
        questionList.add(que5)

        val que6 = Question(
            1,
            "A decimal point is read as.",
            "Word Form",
            "\"and\"",
            "Zeros",
            "Column",
            2
        )
        questionList.add(que6)

        val que7 = Question(
            1,
            "That numbers have the same length or decimal places.",
            "Word Form",
            "\"and\"",
            "Zeros",
            "Column",
            3
        )
        questionList.add(que7)

        val que8 = Question(
            1,
            "Numbers should be written in and align the decimal points.",
            "Word Form",
            "\"and\"",
            "Zeros",
            "Column",
            4
        )
        questionList.add(que8)

        val que9 = Question(
            1,
            "In adding or subtracting decimals, we have to start from the?.",
            "Right",
            "Ten Thousand",
            "Zeros",
            "Column",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            1,
            "In the decimal number, 24.5678, the number 5 is in the tenths place and number 8 is in the what place.",
            "Right",
            "Ten Thousand",
            "Zeros",
            "Column",
            2
        )
        questionList.add(que10)

        return questionList
    }
}