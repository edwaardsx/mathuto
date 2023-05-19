package com.capstone.mathuto.questions

import com.capstone.mathuto.quiz.QuestionMultipleChoice

object QuestionEighteen {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"

    fun getQuestions(): ArrayList<QuestionMultipleChoice>{

        val questionList = ArrayList<QuestionMultipleChoice>()

        val que1 = QuestionMultipleChoice(
            1,
            "1. A recipe calls for 0.75 cups of sugar to make 24 cookies. How much sugar is needed to make 36 cookies?",
            "1 cup",
            "1.25 cups",
            "1.5 cups",
            "1.75 cups",
            2
        )
        questionList.add(que1)

        val que2 = QuestionMultipleChoice(
            1,
            "2. A car travels a distance of 360 miles in 9 hours. What is the average speed of the car in miles per hour?",
            "36 mph",
            "40 mph",
            "45 mph",
            "50 mph",
            3
        )
        questionList.add(que2)

        val que3 = QuestionMultipleChoice(
            1,
            "3. A store sold 180 boxes of cereal in one week. If each box weighs 0.5 pounds, what is the total weight of the cereal sold?",
            "80 pounds",
            "90 pounds",
            "100 pounds",
            "120 pounds",
            1
        )
        questionList.add(que3)

        val que4 = QuestionMultipleChoice(
            1,
            "4. A rectangular field is 45.6 meters long and 12.8 meters wide. If the field is divided into square plots with side lengths of 2 meters, how many plots are there in total?",
            "140 plots",
            "160 plots",
            "180 plots",
            "200 plots",
            3
        )
        questionList.add(que4)

        val que5 = QuestionMultipleChoice(
            1,
            "5. A recipe requires 2.5 cups of flour to make 12 muffins. How many cups of flour are needed to make 36 muffins?",
            "6 cups",
            "7.5 cups",
            "9 cups",
            "10.5 cups",
            3
        )
        questionList.add(que5)

        val que6 = QuestionMultipleChoice(
            1,
            "6. A group of friends shared a pizza with a total cost of $16.80. If each person contributed $2.10, how many friends were there?",
            "6 friends",
            "7 friends",
            "8 friends",
            "9 friends",
            3
        )
        questionList.add(que6)

        val que7 = QuestionMultipleChoice(
            1,
            "7. A tank can hold 24.5 gallons of water. If it is filled to 75% of its capacity, how many gallons of water are in the tank?",
            "16.25 gallons",
            "18.375 gallons",
            "20.75 gallons",
            "22.125 gallons",
            3
        )
        questionList.add(que7)

        val que8 = QuestionMultipleChoice(
            1,

            "8. A shipment of 240 toys is divided equally into 12 boxes. How many toys are there in each box?",
            "12 toys",
            "18 toys",
            "20 toys",
            "24 toys",
            4
        )
        questionList.add(que8)

        val que9 = QuestionMultipleChoice(
            1,
            "9. A marathon race is 26.2 miles long. If a runner completes the race in 3.5 hours, what is the average speed of the runner in miles per hour?",
            "7.49 mph",
            "7.48 mph",
            "7.46 mph",
            "7.45 mph",
            3
        )
        questionList.add(que9)

        val que10 = QuestionMultipleChoice(
            1,
            "10. A bag of candy weighs 0.35 pounds. If there are 40 candies in the bag, what is the weight of one candy?",
            "0.00875 pounds",
            "0.0085 pounds",
            "0.008 pounds",
            "0.0075 pounds",
            1
        )
        questionList.add(que10)

        return questionList
    }
}