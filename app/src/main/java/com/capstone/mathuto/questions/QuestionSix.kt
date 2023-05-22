package com.capstone.mathuto.questions

import com.capstone.mathuto.quiz.QuestionTrueFalse

object QuestionSix {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<QuestionTrueFalse>{

        val questionList = ArrayList<QuestionTrueFalse>()

        val que1 = QuestionTrueFalse(
            1,
            "Danna cuts the yellow ribbon 5 1/3 meter long into 8 pieces equal length each piece is equal to 2/3m.",
            "True",
            "False",
            1
        )
        questionList.add(que1)

        val que2 = QuestionTrueFalse(
            1,
            "Mr. Antonio brought home 8 slices of cheese cake for his children. If each got 1 4/16 slice of the cake there's a 6 pieces of cheese cake.",
            "True",
            "False",
            1
        )
        questionList.add(que2)

        val que3 = QuestionTrueFalse(
            1,
            "Johnny combined 7/4 cups of pancake mix and 3/4 of a cup of water to make a pancake batter. If he uses 1/4 of a cup of batter to make each pancake, there's a pancakes can Johnny make 6.",
            "True",
            "False",
            1
        )
        questionList.add(que3)

        val que4 = QuestionTrueFalse(
            1,
            "Janette brought to school 4/5 of a cake which she and her 3 friends shared equally 5 cake each of them.\n",
            "True",
            "False",
            2
        )
        questionList.add(que4)

        val que5 = QuestionTrueFalse(
            1,
            "A ship is carrying 200 passengers. This is 2/3 of its full capacity and the capacity of the ship is 300.",
            "True",
            "False",
            1
        )
        questionList.add(que5)

        val que6 = QuestionTrueFalse(
            1,
            "When dividing fractions, you invert the divisor and multiply.",
            "True",
            "False",
            1
        )
        questionList.add(que6)

        val que7 = QuestionTrueFalse(
            1,
            "The dividend is the number being divided in a division problem.",
            "True",
            "False",
            1
        )
        questionList.add(que7)

        val que8 = QuestionTrueFalse(
            1,
            "To divide a mixed fraction, you convert it to an improper fraction and then follow the same division process.",
            "True",
            "False",
            1
        )
        questionList.add(que8)

        val que9 = QuestionTrueFalse(
            1,
            "In a division problem involving fractions, you can simplify the fractions before performing the division.",
            "True",
            "False",
            1
        )
        questionList.add(que9)

        val que10 = QuestionTrueFalse(
            1,
            "Division is the inverse operation of multiplication, and the same rules apply when dividing fractions.",
            "True",
            "False",
            1
        )
        questionList.add(que10)

        return questionList
    }
}