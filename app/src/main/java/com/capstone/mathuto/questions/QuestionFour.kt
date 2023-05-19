package com.capstone.mathuto.questions

import com.capstone.mathuto.quiz.QuestionTrueFalse

object QuestionFour {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"

    fun getQuestions(): ArrayList<QuestionTrueFalse>{

        val questionList = ArrayList<QuestionTrueFalse>()

        val que1 = QuestionTrueFalse(
            1,
            "1. When multiplying fractions, the product is always larger than either of the fractions being multiplied.",
            "True",
            "False",
            2
        )
        questionList.add(que1)

        val que2 = QuestionTrueFalse(
            1,
            "2. When multiplying a fraction by a whole number, the whole number can be written as a fraction with a denominator of 1.",
            "True",
            "False",
            1
        )
        questionList.add(que2)

        val que3 = QuestionTrueFalse(
            1,
            "3. When multiplying fractions, if one fraction is proper and the other is improper, the product will always be an improper fraction.",
            "True",
            "False",
            2
        )
        questionList.add(que3)

        val que4 = QuestionTrueFalse(
            1,
            "4. Multiplying any number by 1 results in the same number.",
            "True",
            "False",
            1
        )
        questionList.add(que4)

        val que5 = QuestionTrueFalse(
            1,
            "5. When multiplying fractions, it is necessary to find a common denominator before performing the multiplication.",
            "True",
            "False",
            2
        )
        questionList.add(que5)

        val que6 = QuestionTrueFalse(
            1,
            "6. The product of two fractions with the same numerator will always be less than 1.",
            "True",
            "False",
            1
        )
        questionList.add(que6)

        val que7 = QuestionTrueFalse(
            1,
            "7. The product of any fraction and 0 is always 0.",
            "True",
            "False",
            1
        )
        questionList.add(que7)

        val que8 = QuestionTrueFalse(
            1,
            "8. When multiplying two fractions, if one fraction is a reciprocal of the other, the product will always be 1.",
            "True",
            "False",
            1
        )
        questionList.add(que8)

        val que9 = QuestionTrueFalse(
            1,
            "9. When multiplying fractions, the order of multiplication does not matter.",
            "True",
            "False",
            1
        )
        questionList.add(que9)

        val que10 = QuestionTrueFalse(
            1,
            "10. When multiplying mixed fractions, it is necessary to convert them to improper fractions before performing the multiplication.",
            "True",
            "False",
            2
        )
        questionList.add(que10)

        return questionList
    }
}