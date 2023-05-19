package com.capstone.mathuto.questions

import com.capstone.mathuto.quiz.QuestionTrueFalse

object QuestionFourteen {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"

    fun getQuestions(): ArrayList<QuestionTrueFalse>{

        val questionList = ArrayList<QuestionTrueFalse>()

        val que1 = QuestionTrueFalse(
            1,
            "1. When dividing decimals, the number of decimal places in the quotient is always equal to the difference in the decimal places of the dividend and divisor.",
            "True",
            "False",
            1
        )
        questionList.add(que1)

        val que2 = QuestionTrueFalse(
            1,
            "2. Dividing a decimal by a whole number always results in a smaller quotient than the original decimal.",
            "True",
            "False",
            2
        )
        questionList.add(que2)

        val que3 = QuestionTrueFalse(
            1,
            "3. When dividing decimals, you shift the decimal point to the left in both the dividend and divisor to convert them to whole numbers before performing the division.",
            "True",
            "False",
            1
        )
        questionList.add(que3)

        val que4 = QuestionTrueFalse(
            1,
            "4. The quotient of two decimal numbers is always a decimal number.",
            "True",
            "False",
            1
        )
        questionList.add(que4)

        val que5 = QuestionTrueFalse(
            1,
            "5. When dividing decimals, you can count the total number of decimal places in the dividend and divisor and place the decimal point in the quotient accordingly.",
            "True",
            "False",
            1
        )
        questionList.add(que5)

        val que6 = QuestionTrueFalse(
            1,
            "6. When dividing decimals, the quotient will have more decimal places than either the dividend or divisor.",
            "True",
            "False",
            2
        )
        questionList.add(que6)

        val que7 = QuestionTrueFalse(
            1,

            "7. The quotient of a decimal divided by 1 is always equal to the original decimal.",
            "True",
            "False",
            1
        )
        questionList.add(que7)

        val que8 = QuestionTrueFalse(
            1,
            "8. When dividing decimals, you can ignore the decimal points and treat the numbers as whole numbers.",
            "True",
            "False",
            2
        )
        questionList.add(que8)

        val que9 = QuestionTrueFalse(
            1,
            "9. When dividing decimals, the quotient will always be greater than the dividend.",
            "True",
            "False",
            2
        )
        questionList.add(que9)

        val que10 = QuestionTrueFalse(
            1,
            "10. When dividing mixed decimals, it is important to convert them to improper fractions before performing the division.",
            "True",
            "False",
            2
        )
        questionList.add(que10)

        return questionList
    }
}