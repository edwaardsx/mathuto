package com.capstone.mathuto.questions

import com.capstone.mathuto.quiz.QuestionMultipleChoice

object QuestionTwo {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"

    fun getQuestions(): ArrayList<QuestionMultipleChoice>{

        val questionList = ArrayList<QuestionMultipleChoice>()

        val que1 = QuestionMultipleChoice(
            1,
            "Justine bought 8 1/2 meters of rope. He used 4 3/4 meters for his project. How many meters of rope were left?",
            "3 3/4",
            "4 3/4",
            "5 3/4",
            "6 3/4",
            1
        )
        questionList.add(que1)

        val que2 = QuestionMultipleChoice(
            1,
            "James painted his room during summer. He used 1 2/4 gallons of white paint and 3 3/5 gallons of blue paint. Solve for the total gallons of paints James used.",
            "4 1/10",
            "5 1/10",
            "6 1/10",
            "7 1/10\n",
            2
        )
        questionList.add(que2)

        val que3 = QuestionMultipleChoice(
            1,
            "Eoin rode his bike for one-sixth of a kilometer on Saturday and two-sixths of a kilometer on Sunday. How many kilometers did he ride altogether?",
            "1/5",
            "1/4",
            "1/2",
            "1/3",
            3
        )
        questionList.add(que3)

        val que4 = QuestionMultipleChoice(
            1,
            "It took Yuan three-fourths of an hour to complete his math homework on Monday, seven-sixths on Tuesday, and two-thirds of an hour on Wednesday. How many hours did he take to complete his homework altogether?",
            "2 4/12",
            "2 5/12",
            "2 6/12",
            "2 7/12",
            4
        )
        questionList.add(que4)

        val que5 = QuestionMultipleChoice(
            1,
            "Ann added four-fifths of a bag of soil to her garden. Her neighbor Marie added nine-sevenths bags of soil to her garden. How much more soil did Marie add than Ann?",
            "17/35",
            "18/35",
            "19/35",
            "20/35",
            1
        )
        questionList.add(que5)

        val que6 = QuestionMultipleChoice(
            1,
            "Carlos has two and three-sevenths meters of cloth. He uses one and two-fourths to cover the table. How much meter is he left with?",
            "11/14",
            "13/14",
            "9/14",
            "12/14",
            2
        )
        questionList.add(que6)

        val que7 = QuestionMultipleChoice(
            1,
            "Roel and Riza own a 10-hectare of cornfields. Roel harvested four and one-sixth hectares of corn on Friday and Riza harvested two and five-eighths hectares. How many more hectares did Roel harvest than Riza?\n",
            "3 13/14",
            "4 13/14",
            "1 13/24",
            "2 13/24",
            3
        )
        questionList.add(que7)

        val que8 = QuestionMultipleChoice(
            1,
            "Three scouts brought three pieces of rope of lengths five and three-fourths meters, six and two-thirds meters and five and seven-eighths meters to their camp. How long are the 3 pieces together?",
            "15 7/24",
            "16 7/24",
            "17 7/24",
            "18 7/24",
            4
        )
        questionList.add(que8)

        val que9 = QuestionMultipleChoice(
            1,
            "Mary found one-half of a pie on the plate. He ate one-half of it. What fraction of the whole pie was left? ",
            "1/3",
            "1/4",
            "1/5",
            "1/6",
            2
        )
        questionList.add(que9)

        val que10 = QuestionMultipleChoice(
            1,
            "A box contains five and two-thirds cups of rice. If three-fourths of the rice will be used, how many cups of rice remained in the box?",
            "4 11/12",
            "3 11/12",
            "2 11/12",
            "1 11/12",
            1
        )
        questionList.add(que10)

        return questionList
    }
}