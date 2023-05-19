package com.capstone.mathuto.questions

import com.capstone.mathuto.quiz.QuestionMultipleChoice

object QuestionNine {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"

    fun getQuestions(): ArrayList<QuestionMultipleChoice>{

        val questionList = ArrayList<QuestionMultipleChoice>()

        val que1 = QuestionMultipleChoice(
            1,
            "1.) 0.23\\nx 0.7\\n_______",
            "3.325",
            "4.1393",
            "0.161",
            "16.56",
            3
        )
        questionList.add(que1)

        val que2 = QuestionMultipleChoice(
            1,
            "2.) 7.2\\nx 2.3\\n_______",
            "3.325",
            "16.56",
            "15.762",
            "1,896.3",
            2
        )
        questionList.add(que2)

        val que3 = QuestionMultipleChoice(
            1,
            "3.) 0.35\\nx 9.5\\n________",
            "90",
            "15.808",
            "3.325",
            "47.25",
            3
        )
        questionList.add(que3)

        val que4 = QuestionMultipleChoice(
            1,
            "\n" +
                    "4.) 4.16\\nx 3.8\\n________",
            "0.161",
            "15.808",
            "15.808",
            "47.25",
            3
        )
        questionList.add(que4)

        val que5 = QuestionMultipleChoice(
            1,
            "5.) 21.3 x 0.74",
            "15.762",
            "15.808",
            "0.161",
            "47.25",
            1
        )
        questionList.add(que5)

        val que6 = QuestionMultipleChoice(
            1,
            "6.) 7.81 x 0.53",
            "15.762",
            "15.808",
            "0.161",
            "229.68",
            4
        )
        questionList.add(que6)

        val que7 = QuestionMultipleChoice(
            1,
            "7.) 39.6 x 5.8",
            "15.762",
            "15.808",
            "0.161",
            "4. 1393",
            4
        )
        questionList.add(que7)

        val que8 = QuestionMultipleChoice(
            1,
            "8.) A fruit vendor was able to sell 7.5 dozens of mangoes. How many pieces of mangoes were he able to sell?",
            "90",
            "80",
            "30",
            "100",
            1
        )
        questionList.add(que8)

        val que9 = QuestionMultipleChoice(
            1,
            "9.) A lumberyard sells 21 long wood mouldings. If each moulding measures 2.25 meters each, how many meters of mouldings are there?\n",
            "47.25",
            "23.54",
            "32.12",
            "32.54",
            1
        )
        questionList.add(que9)

        val que10 = QuestionMultipleChoice(
            1,
            "10.) A school lawn has a dimension of 73.5 meters by 25.8 meters. What is the area of the school lawn?",
            "1,896.3 ",
            "123.2",
            "3124.2",
            "543.5",
            1
        )
        questionList.add(que10)

        return questionList
    }
}