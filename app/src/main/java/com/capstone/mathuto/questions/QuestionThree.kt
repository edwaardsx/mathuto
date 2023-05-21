package com.capstone.mathuto.questions

import com.capstone.mathuto.quiz.QuestionMultipleChoice

object QuestionThree {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"

    fun getQuestions(): ArrayList<QuestionMultipleChoice>{

        val questionList = ArrayList<QuestionMultipleChoice>()

        val que1 = QuestionMultipleChoice(
            1,
            "Solve: 3/5 x 6 2/3 = ?",
            "3",
            "3 1/3",
            "4",
            "4 3/5",
            3
        )
        questionList.add(que1)

        val que2 = QuestionMultipleChoice(
            1,
            "Give the product of 4 2/5 and 3/8.",
            "14/3",
            "11/3",
            "4",
            "3",
            3
        )
        questionList.add(que2)

        val que3 = QuestionMultipleChoice(
            1,
            "Multiply 4 2/5 and 3/8.",
            "1 1/3",
            "1 13/20",
            "1 18/ 20",
            "2 3/20",
            3
        )
        questionList.add(que3)

        val que4 = QuestionMultipleChoice(
            1,
            "What is the value of x in 1/3 x 5 = x?",
            "1 1/3",
            "1 2/3",
            "5/2",
            "5/4",
            2
        )
        questionList.add(que4)

        val que5 = QuestionMultipleChoice(
            1,
            "What is the product of 9 3/10 and its reciprocal?",
            "0",
            "1",
            "2",
            "3",
            2
        )
        questionList.add(que5)

        val que6 = QuestionMultipleChoice(
            1,
            "Solve: 1/8 x 6 = ?",
            "9",
            "3/4",
            "18",
            "1/8",
            2
        )
        questionList.add(que6)

        val que7 = QuestionMultipleChoice(
            1,
            "Find 4/5 of 10",
            "1/3",
            "1/2",
            "8",
            "5 2/3",
            3
        )
        questionList.add(que7)

        val que8 = QuestionMultipleChoice(
            1,
            "Solve: 1/2 x 1/2 x 1/2 = ?",
            "2/32",
            "1/5",
            "1/8",
            "4",
            3
        )
        questionList.add(que8)

        val que9 = QuestionMultipleChoice(
            1,
            "What is n in 4/5 of 5/8 = n",
            "1/2",
            "1/8",
            "1/3",
            "1/5",
            1
        )
        questionList.add(que9)

        val que10 = QuestionMultipleChoice(
            1,
            "12 1/3 x 2 1/2 = ?",
            "5 1/9",
            "5 4/9",
            "3",
            "4",
            2
        )
        questionList.add(que10)

        return questionList
    }
}