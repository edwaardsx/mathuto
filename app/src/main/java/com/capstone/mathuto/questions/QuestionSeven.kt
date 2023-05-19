package com.capstone.mathuto.questions

import com.capstone.mathuto.quiz.QuestionMultipleChoice

object QuestionSeven {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"

    fun getQuestions(): ArrayList<QuestionMultipleChoice>{

        val questionList = ArrayList<QuestionMultipleChoice>()

        val que1 = QuestionMultipleChoice(
            1,
            "1. Can be defined as a whole number whose fractional part is separated by a decimal value.",
            "Decimal",
            "Place Value",
            "Whole Number",
            "Standard Form",
            1
        )
        questionList.add(que1)

        val que2 = QuestionMultipleChoice(
            1,
            "2. This is the value of where a digit is in a decimal number.",
            "Decimal",
            "Place Value",
            "Whole Number",
            "Standard Form",
            2
        )
        questionList.add(que2)

        val que3 = QuestionMultipleChoice(
            1,
            "3. The decimal point show a value smaller than one.",
            "Decimal",
            "Place Value",
            "Whole Number",
            "Standard Form",
            3
        )
        questionList.add(que3)

        val que4 = QuestionMultipleChoice(
            1,
            "4. The usual way to write a decimal.",
            "Decimal",
            "Place Value",
            "Whole Number",
            "Standard Form",
            4
        )
        questionList.add(que4)

        val que5 = QuestionMultipleChoice(
            1,
            "5. Writing the decimals in words, such as four and two tenths.",
            "Word Form",
            "\"and\"",
            "Zeros",
            "Column",
            1
        )
        questionList.add(que5)

        val que6 = QuestionMultipleChoice(
            1,
            "6. A decimal point is read as.",
            "Word Form",
            "\"and\"",
            "Zeros",
            "Column",
            2
        )
        questionList.add(que6)

        val que7 = QuestionMultipleChoice(
            1,
            "7. That numbers have the same length or decimal places.",
            "Word Form",
            "\"and\"",
            "Zeros",
            "Column",
            3
        )
        questionList.add(que7)

        val que8 = QuestionMultipleChoice(
            1,
            "8. Numbers should be written in and align the decimal points.",
            "Word Form",
            "\"and\"",
            "Zeros",
            "Column",
            4
        )
        questionList.add(que8)

        val que9 = QuestionMultipleChoice(
            1,
            "9. In adding or subtracting decimals, we have to start from the?.",
            "Right",
            "Ten Thousand",
            "Zeros",
            "Column",
            1
        )
        questionList.add(que9)

        val que10 = QuestionMultipleChoice(
            1,
            "10. In the decimal number, 24.5678, the number 5 is in the tenths place and number 8 is in the what place.",
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