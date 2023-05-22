package com.capstone.mathuto.questions

import com.capstone.mathuto.sqlite.Question

object QuestionTen {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<Question>{

        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "27.83 x 10",
            "0.905",
            "278.35",
            "250.5",
            "3244.2",
            2
        )
        questionList.add(que1)

        val que2 = Question(
            1,
            "806.25 x 100",
            "5454.0",
            "2345.0",
            "80625.9",
            "0.234",
            3
        )
        questionList.add(que2)

        val que3 = Question(
            1,
            "9.05 x 0.1",
            "0.789",
            "0.384",
            "0.905",
            "0.653",
            3
        )
        questionList.add(que3)

        val que4 = Question(
            1,
            "0.36 x 0.01",
            "0.0036",
            "0.00345",
            "0.0034",
            "0.0052",
            1
        )
        questionList.add(que4)

        val que5 = Question(
            1,
            "100 x 2.50",
            "240.9",
            "23.0",
            "250.0",
            "900",
            3
        )
        questionList.add(que5)

        val que6 = Question(
            1,
            "What is the result of multiplying 5.6 by 0.1?.",
            "0.056",
            "0.56",
            "0.0560",
            "0.560",
            2
        )
        questionList.add(que6)

        val que7 = Question(
            1,
            "Calculate the value of 0.075 multiplied by 0.01.",
            "0.00075",
            "0.0075",
            "0.75",
            "0.0750",
            1
        )
        questionList.add(que7)

        val que8 = Question(
            1,
            "If you multiply 3.45 by 10, what is the result?",
            "0.345",
            "3.45",
            "34.5",
            "345",
            3
        )
        questionList.add(que8)

        val que9 = Question(
            1,
            "Calculate the product of 2.8 multiplied by 100.",
            "280",
            "28",
            "2.8",
            "0.028",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            1,
            "What is the result of multiplying 4.2 by 0.1?",
            "0.042",
            "0.42",
            "4.2",
            "0.0042",
            1
        )
        questionList.add(que10)

        return questionList
    }
}