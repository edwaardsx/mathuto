package com.capstone.mathuto.questions

import com.capstone.mathuto.sqlite.Question

object QuestionThirteen {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<Question>{

        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the quotient of 30 and 0.5?",
            "60",
            "62",
            "64",
            "66",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            1,
            "What is 0.48 ÷ 4?",
            "0.012",
            "0.12",
            "1.2",
            "12",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            1,
            "4 ÷ 0.02 = ?.",
            "100",
            "200",
            "300",
            "400",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            1,
            "What is 0.45 divided by 5?",
            "9",
            "0.9",
            "0.09",
            "0.009",
            3
        )
        questionList.add(que4)

        val que5 = Question(
            1,
            "How many 2 tenths are in 18?",
            "50",
            "70",
            "90",
            "99",
            3
        )
        questionList.add(que5)

        val que6 = Question(
            1,
            "What is the quotient when we divide 0.264 by 6?",
            "0.44",
            "0.044",
            "0.004",
            "0.0004",
            2
        )
        questionList.add(que6)

        val que7 = Question(
            1,
            "Which of the following is the quotient of 0.362 divided by 4?",
            "0.0905",
            "0.9050",
            "0.9051",
            "0.9005",
            1
        )
        questionList.add(que7)

        val que8 = Question(
            1,
            "962 ÷ 0.74 is equal to ?.",
            "1300",
            "130",
            "103",
            "13",
            1
        )
        questionList.add(que8)

        val que9 = Question(
            1,
            "Divide 72 by 0.9 what is the quotient?",
            "8",
            "80",
            "800",
            "8000",
            2
        )
        questionList.add(que9)

        val que10 = Question(
            1,
            "362 ÷ 0.04 is equal to ?.",
            "9050",
            "905",
            "95",
            "90",
            1
        )
        questionList.add(que10)

        return questionList
    }
}