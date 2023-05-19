package com.capstone.mathuto.questions

import com.capstone.mathuto.sqlite.Question

object QuestionOne {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"

    fun getQuestions(): ArrayList<Question>{

        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "1. What is a part of a whole or a set.",
            "Fraction",
            "Simular Fraction",
            "LCD",
            "Similar",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            1,
            "2. Fractions with the same denominator",
            "Fraction",
            "Simular Fraction",
            "LCD",
            "Similar",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            1,
            "3. Fractions with different denominators.",
            "LCD",
            "Mixed Fraction",
            "Dissimilar Fraction",
            "Similar",
            3
        )
        questionList.add(que3)

        val que4 = Question(
            1,
            "4. Composed of a whole number and a fraction.",
            "Dissimilar Fraction",
            "Mixed Fractions",
            "GFC",
            "Similar",
            2
        )
        questionList.add(que4)

        val que5 = Question(
            1,
            "5. To add or subtract dissimilar fractions, This is the smallest number that can be divided by the denominators.",
            "Fraction",
            "Simular Fraction",
            "LCD",
            "Similar",
            3
        )
        questionList.add(que5)

        val que6 = Question(
            1,
            "6. It is the highest number that divides exactly into two or more numbers.",
            "Dissimilar Fraction",
            "Mixed Fractions",
            "GFC",
            "Similar",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            1,
            "7. When adding and subtracting fractions, all answers must be express in the..?",
            "Lowest Term",
            "Similar",
            "Dissimilar",
            "Mixed Fractions",
            1
        )
        questionList.add(que7)

        val que8 = Question(
            1,
            "8. A pizza is a great example of fractions! Each piece represents a part of a whole. The pizza is divided into 8 pieces. If you have one piece, what fraction of pizza you are eating?.",
            "1/8",
            "1/4",
            "2/4",
            "4/3",
            1
        )
        questionList.add(que8)

        val que9 = Question(
            1,
            "9. 3/4 + 2/4 is what example of fraction?",
            "Dissimilar",
            "Similar",
            "Mixed",
            "LCD",
            2
        )
        questionList.add(que9)

        val que10 = Question(
            1,
            "10. 5/6 - 3/4 is what example of fraction.",
            "Dissimilar",
            "Similar",
            "Mixed",
            "GCF",
            1
        )
        questionList.add(que10)

        questionList.shuffle()
        return questionList
    }
}