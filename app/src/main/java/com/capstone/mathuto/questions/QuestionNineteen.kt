package com.capstone.mathuto.questions

import com.capstone.mathuto.quiz.QuestionTrueFalse

object QuestionNineteen {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"

    fun getQuestions(): ArrayList<QuestionTrueFalse>{

        val questionList = ArrayList<QuestionTrueFalse>()

        val que1 = QuestionTrueFalse(
            1,
            "1. When solving multi-step problems involving division of decimals and other operations, you must always perform the division operation first.",
            "True",
            "False",
            2
        )
        questionList.add(que1)

        val que2 = QuestionTrueFalse(
            1,
            "2. In multi-step problems involving division of decimals, you should always round the quotient to the nearest whole number.",
            "True",
            "False",
            2
        )
        questionList.add(que2)

        val que3 = QuestionTrueFalse(
            1,
            "3. In multi-step problems, the order in which you perform the operations can affect the final result.",
            "True",
            "False",
            1
        )
        questionList.add(que3)

        val que4 = QuestionTrueFalse(
            1,
            "4. When solving multi-step problems involving division of decimals and other operations, you should always start with the operation that appears first from left to right.",
            "True",
            "False",
            2
        )
        questionList.add(que4)

        val que5 = QuestionTrueFalse(
            1,
            "5. When solving multi-step problems, it is not necessary to show the intermediate steps or calculations.",
            "True",
            "False",
            2
        )
        questionList.add(que5)

        val que6 = QuestionTrueFalse(
            1,
            "6. In multi-step problems involving division of decimals, it is acceptable to approximate decimal numbers to whole numbers to simplify the calculations.",
            "True",
            "False",
            1
        )
        questionList.add(que6)

        val que7 = QuestionTrueFalse(
            1,
            "7. The order of operations is the same when solving multi-step problems with both whole numbers and decimals.",
            "True",
            "False",
            1
        )
        questionList.add(que7)

        val que8 = QuestionTrueFalse(
            1,
            "8. When solving multi-step problems, you can perform the operations in any order as long as you end up with the correct answer.",
            "True",
            "False",
            2
        )
        questionList.add(que8)

        val que9 = QuestionTrueFalse(
            1,
            "9. In multi-step problems involving division of decimals, the final answer should always be expressed as a decimal.",
            "True",
            "False",
            2
        )
        questionList.add(que9)

        val que10 = QuestionTrueFalse(
            1,
            "10. It is not necessary to check the reasonableness of the final answer in multi-step problems involving division of decimals.",
            "True",
            "False",
            2
        )
        questionList.add(que10)

        return questionList
    }
}