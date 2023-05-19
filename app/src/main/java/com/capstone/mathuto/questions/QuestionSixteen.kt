package com.capstone.mathuto.questions

import com.capstone.mathuto.quiz.QuestionMultipleChoice

object QuestionSixteen {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"

    fun getQuestions(): ArrayList<QuestionMultipleChoice>{

        val questionList = ArrayList<QuestionMultipleChoice>()

        val que1 = QuestionMultipleChoice(
            1,
            "1.) 32.781 ÷ 10 = ?",
            "3278.1 ",
            "327.81 ",
            "32 781",
            "3.2781",
            4
        )
        questionList.add(que1)

        val que2 = QuestionMultipleChoice(
            1,
            "2.) 979.34 ÷ 100 = ?",
            "9.7934",
            "97.934",
            "0.97934",
            "9 793.4",
            1
        )
        questionList.add(que2)

        val que3 = QuestionMultipleChoice(
            1,
            "3.) 4 212.54 ÷1000 = ?",
            "4 2.1254",
            "4 21.254",
            "4.21254",
            "0.421254",
            3
        )
        questionList.add(que3)

        val que4 = QuestionMultipleChoice(
            1,
            "4.) 157.06 ÷ 100 = ?",
            "15.706",
            "1.5706",
            "1570.6",
            "0.15706",
            2
        )
        questionList.add(que4)

        val que5 = QuestionMultipleChoice(
            1,
            "5.) 821.8 ÷ 10 = ?",
            "0.8218",
            "8.218 ",
            "82.18",
            "8.218",
            3
        )
        questionList.add(que5)

        val que6 = QuestionMultipleChoice(
            1,
            "6. What is the result of dividing 8.4 by 10?",
            "0.084",
            "0.84",
            "8.4",
            "84",
            2
        )
        questionList.add(que6)

        val que7 = QuestionMultipleChoice(
            1,
            "7. If you divide 3.56 by 100, what is the quotient?",
            "0.0356",
            "0.356",
            "3.56",
            "35.6",
            1
        )
        questionList.add(que7)

        val que8 = QuestionMultipleChoice(
            1,
            "8. Calculate the value of 42.789 divided by 1000.",
            "0.042789",
            "0.42789",
            "4.2789",
            "42.789",
            1
        )
        questionList.add(que8)

        val que9 = QuestionMultipleChoice(
            1,
            "9. When dividing 0.93 by 1000, what is the result?",
            "0.000093",
            "0.00093",
            "0.0093",
            "0.093",
            2
        )
        questionList.add(que9)

        val que10 = QuestionMultipleChoice(
            1,
            "10. What is the quotient of dividing 9.75 by 10?",
            "0.975",
            "0.0975",
            "0.9750",
            "9.75",
            1
        )
        questionList.add(que10)

        return questionList
    }
}