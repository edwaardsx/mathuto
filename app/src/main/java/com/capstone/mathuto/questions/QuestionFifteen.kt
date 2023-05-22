package com.capstone.mathuto.questions

import com.capstone.mathuto.sqlite.Question

object QuestionFifteen {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<Question>{

        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "57.213 ÷ 0.1 = ?",
            "5.7213",
            "572.13",
            "5 721.3",
            "57 213",
            2
        )
        questionList.add(que1)

        val que2 = Question(
            1,
            "6.4903 ÷ 0.001 = ?",
            "64.903",
            "649.03",
            "6 490.3",
            "64 903",
            3
        )
        questionList.add(que2)

        val que3 = Question(
            1,
            "23.841 ÷ 0.01 = ?",
            "238.41",
            "2.3841",
            "23 841",
            "2 384.1",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            1,
            "7.442 ÷ 0.1, ?",
            "74.42",
            "744.2",
            "7 442",
            "74 420",
            1
        )
        questionList.add(que4)

        val que5 = Question(
            1,
            "12.6361 ÷ 0.01 = ?",
            "126.361",
            "1263.61",
            "12 636.1",
            "126.361",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            1,
            "70.8923 ÷ 0.001 = ?",
            "708.923",
            "70 892.3",
            "7.089.23 ",
            "708 923",
            2
        )
        questionList.add(que6)

        val que7 = Question(
            1,
            "65.43 ÷ 0.1 = ?",
            "65.43",
            "6 543",
            "654.3",
            "6.543",
            3
        )
        questionList.add(que7)

        val que8 = Question(
            1,
            "8.4923 ÷ 0.001 = ?",
            "8.492.3",
            "84.923",
            "849.23",
            "84.923",
            1
        )
        questionList.add(que8)

        val que9 = Question(
            1,
            "3 774.8 ÷ 0.1 = ?",
            "37.748",
            "377.48",
            "3.7748",
            "37 748",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            1,
            "84.591 ÷ 0.01 = ?",
            "8.4591",
            "84.591",
            "845.91",
            "8.459.1",
            4
        )
        questionList.add(que10)

        return questionList
    }
}