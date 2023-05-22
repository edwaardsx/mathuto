package com.capstone.mathuto.questions

import com.capstone.mathuto.sqlite.Question

object QuestionTwelve {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<Question>{

        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What does the problem ask for?.",
            "Andrei will share ₱60.50 to Hanna so that she could buy the book and bookmarks.",
            "How much the cost of 2 books and 8 pieces bookmarks?",
            "Addition, Subtraction and Multiplication",
            "Subtraction and Multiplication",
            3
        )
        questionList.add(que1)

        val que2 = Question(
            1,
            "What are given?.",
            "Subtraction and Multiplication?",
            "How much did Andrei share to  Hanna so that she could buy the books and bookmarks?",
            "Addition, Subtraction and Multiplication",
            "Andrei will share ₱60.50 to Hanna so that she could buy the book and bookmarks.",
            1
        )
        questionList.add(que2)

        val que3 = Question(
            1,
            "What process/es will you use to solve?",
            "Subtraction and Multiplication",
            "How much did Andrei share to  Hanna so that she could buy the books and bookmarks?",
            "2 books costing ₱44.85 and  ₱67.50 each 8 pieces of bookmarks wich cost ₱8.75 each Hanna only had ₱125.85",
            "Andrei will share ₱60.50 to Hanna so that she could buy the book and bookmarks.",
            3
        )
        questionList.add(que3)

        val que4 = Question(
            1,
            "Translate it into a number sentence.",
            "Subtraction and Multiplication",
            "How much did Andrei share to  Hanna so that she could buy the books and bookmarks?",
            "₱48.85 + ₱67.50) + (8 x ₱8.75) – 125.85 =?",
            "Addition, Subtraction and Multiplication",
            4
        )
        questionList.add(que4)

        val que5 = Question(
            1,
            "The answer of the problem",
            "Subtraction and Multiplication",
            "How much did Andrei share to  Hanna so that she could buy the books and bookmarks?",
            "Andrei will share ₱60.50 to Hanna so that she could buy the book and bookmarks.",
            "Addition, Subtraction and Multiplication",
            3
        )
        questionList.add(que5)

        val que6 = Question(
            1,
            "The cost of a toy car is $12.50. If Sarah buys two toy cars and a toy train for $27.75 in total, how much does the toy train cost?",
            "$2.75",
            "$3.75",
            "$4.75",
            "$5.75",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            1,
            "A recipe calls for 1.5 cups of flour and 0.75 cups of sugar. If Tom wants to double the recipe, how many cups of flour and sugar does he need in total?",
            "2.25 cups of flour and 1.25 cups of sugar",
            "2.50 cups of flour and 1.50 cups of sugar",
            "3.00 cups of flour and 1.50 cups of sugar",
            "3.25 cups of flour and 1.75 cups of sugar",
            2
        )
        questionList.add(que7)

        val que8 = Question(
            1,
            "A restaurant sold 85 hamburgers on Monday and 92 hamburgers on Tuesday. If each hamburger costs $4.50, how much money did the restaurant make from hamburger sales on those two days?",
            "$756.00",
            "$804.50",
            "$814.50",
            "$842.50",
            4
        )
        questionList.add(que8)

        val que9 = Question(
            1,
            "Emma has $35.50. She spends $9.75 on a movie ticket and then buys a book. If the book costs $12.25, how much money does Emma have left?",
            "$11.25",
            "$13.50",
            "$13.75",
            "$15.00",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            1,
            "Samantha has a rectangular garden that is 6.5 meters long and 4.25 meters wide. If she wants to add a pathway around the garden that is 1.75 meters wide, what will be the total area of the garden and the pathway?",
            "40.75 square meters",
            "47.50 square meters",
            "50.75 square meters",
            "55.25 square meters",
            3
        )
        questionList.add(que10)

        return questionList
    }
}