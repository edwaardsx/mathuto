package com.capstone.mathuto.questions

import com.capstone.mathuto.sqlite.Question

object QuestionSeventeen {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<Question>{

        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Which of the following fractions when converted to decimal will have a repeating decimal quotient?",
            "1/2 ",
            "1/3 ",
            "3/7",
            "2/5",
            2
        )
        questionList.add(que1)

        val que2 = Question(
            1,
            "What is the remainder of a terminating decimal quotient?",
            "0",
            "1",
            "2",
            "3",
            1
        )
        questionList.add(que2)

        val que3 = Question(
            1,
            "What do we call the digit that is repeated in a repeating decimal quotient?",
            "repetitor",
            "repetend",
            "repeating",
            "recurring",
            2
        )
        questionList.add(que3)

        val que4 = Question(
            1,
            "A repeating decimal quotient results when the division algorithms gives the same repeatedly.",
            "quotient",
            "dividend",
            "remainders",
            "divisor",
            3
        )
        questionList.add(que4)

        val que5 = Question(
            1,
            "When you divide 5 by 17, it will give you a what decimal quotient?",
            "repeating",
            "terminating",
            "non-terminating",
            "repeating and non-terminating decimal quotient\n",
            3
        )
        questionList.add(que5)

        val que6 = Question(
            1,
            "Which of the following decimals is a terminating decimal?",
            "0.125",
            "0.333...",
            "0.7151515...",
            "0.833...",
            1
        )
        questionList.add(que6)

        val que7 = Question(
            1,
            "What type of decimal is 0.75?",
            "Terminating",
            "Non-terminating",
            "Repeating",
            "None of the above",
            1
        )
        questionList.add(que7)

        val que8 = Question(
            1,
            "Which of the following decimals is a non-terminating decimal?",
            "0.25",
            "0.5",
            "0.75",
            "0.333...",
            4
        )
        questionList.add(que8)

        val que9 = Question(
            1,
            "What type of decimal is 0.625?",
            "Terminating",
            "Non-terminating",
            "Repeating",
            "None of the above",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            1,
            "Which of the following decimals is a repeating decimal?",
            "0.2",
            "0.333...",
            "0.75",
            ".41",
            2
        )
        questionList.add(que10)

        return questionList
    }
}