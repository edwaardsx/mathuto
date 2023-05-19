package com.capstone.mathuto.questions

import com.capstone.mathuto.quiz.QuestionTrueFalse

object QuestionEleven {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"

    fun getQuestions(): ArrayList<QuestionTrueFalse>{

        val questionList = ArrayList<QuestionTrueFalse>()

        val que1 = QuestionTrueFalse(
            1,
            "1. When multiplying decimals, the number of decimal places in the product is always equal to the sum of the decimal places in the factors.",
            "True",
            "False",
            1
        )
        questionList.add(que1)

        val que2 = QuestionTrueFalse(
            1,
            "2. Multiplying a decimal by a whole number always results in a smaller product than the original decimal.",
            "True",
            "False",
            2
        )
        questionList.add(que2)

        val que3 = QuestionTrueFalse(
            1,
            "3. When multiplying decimals, you ignore the decimal point until the final step of the calculation.",
            "True",
            "False",
            2
        )
        questionList.add(que3)

        val que4 = QuestionTrueFalse(
            1,
            "4.The product of two decimal numbers is always a decimal number.",
            "True",
            "False",
            1
        )
        questionList.add(que4)

        val que5 = QuestionTrueFalse(
            1,
            "5. When multiplying decimals, you can count the total number of decimal places in the factors and place the decimal point in the product accordingly.",
            "True",
            "False",
            1
        )
        questionList.add(que5)

        val que6 = QuestionTrueFalse(
            1,
            "6. It is the highest number that divides exactly into two or more numbers.",
            "True",
            "False",
            2
        )
        questionList.add(que6)

        val que7 = QuestionTrueFalse(
            1,
            "7. When adding and subtracting fractions, all answers must be express in the __________.",
            "True",
            "False",
            1
        )
        questionList.add(que7)

        val que8 = QuestionTrueFalse(
            1,
            "8. A pizza is a great example of fractions! Each piece represents a part of a whole. The pizza is divided into 8 pieces. If you have one piece, what fraction of pizza you are eating?.",
            "True",
            "False",
            2
        )
        questionList.add(que8)

        val que9 = QuestionTrueFalse(
            1,
            "9. 3/4 + 2/4 is what example of fraction?",
            "True",
            "False",
            2
        )
        questionList.add(que9)

        val que10 = QuestionTrueFalse(
            1,
            "10. 5/6 - 3/4 is what example of fraction.",
            "True",
            "False",
            1
        )
        questionList.add(que10)

        return questionList
    }
}