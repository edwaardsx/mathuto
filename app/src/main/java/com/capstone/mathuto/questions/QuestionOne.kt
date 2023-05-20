package com.capstone.mathuto.questions

import com.capstone.mathuto.sqlite.Question

object QuestionOne {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"

    fun getQuestions(): ArrayList<Question>{

        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "What is a part of a whole or a set.",
            "Fraction",
            "Simular Fraction",
            "LCD",
            "Similar",
            1,
            0
        )
        questionList.add(question1)

        val question2 = Question(
            1,
            "Fractions with the same denominator",
            "Fraction",
            "Simular Fraction",
            "LCD",
            "Similar",
            2,
            0
        )
        questionList.add(question2)

        val question3 = Question(
            1,
            "Fractions with different denominators.",
            "LCD",
            "Mixed Fraction",
            "Dissimilar Fraction",
            "Similar",
            3,
            0
        )
        questionList.add(question3)

        val question4 = Question(
            1,
            "Composed of a whole number and a fraction.",
            "Dissimilar Fraction",
            "Mixed Fractions",
            "GFC",
            "Similar",
            2,
            0
        )
        questionList.add(question4)

        val question5 = Question(
            1,
            "To add or subtract dissimilar fractions, This is the smallest number that can be divided by the denominators.",
            "Fraction",
            "Simular Fraction",
            "LCD",
            "Similar",
            3,
            0
        )
        questionList.add(question5)

        val question6 = Question(
            1,
            "It is the highest number that divides exactly into two or more numbers.",
            "Dissimilar Fraction",
            "Mixed Fractions",
            "GFC",
            "Similar",
            3,
            0
        )
        questionList.add(question6)

        val question7 = Question(
            1,
            "When adding and subtracting fractions, all answers must be express in the..?",
            "Lowest Term",
            "Similar",
            "Dissimilar",
            "Mixed Fractions",
            1,
            0
        )
        questionList.add(question7)

        val question8 = Question(
            1,
            "A pizza is a great example of fractions! Each piece represents a part of a whole. The pizza is divided into 8 pieces. If you have one piece, what fraction of pizza you are eating?.",
            "1/8",
            "1/4",
            "2/4",
            "4/3",
            1,
            0
        )
        questionList.add(question8)

        val question9 = Question(
            1,
            "3/4 + 2/4 is what example of fraction?",
            "Dissimilar",
            "Similar",
            "Mixed",
            "LCD",
            2,
            0
        )
        questionList.add(question9)

        val question10 = Question(
            1,
            "5/6 - 3/4 is what example of fraction.",
            "Dissimilar",
            "Similar",
            "Mixed",
            "GCF",
            1,
            0
        )
        questionList.add(question10)

        return questionList
    }
}