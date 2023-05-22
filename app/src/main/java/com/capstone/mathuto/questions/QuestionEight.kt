package com.capstone.mathuto.questions

import com.capstone.mathuto.sqlite.Question

object  QuestionEight {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<Question>{

        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "When the sum of 1.3240 and 1.4872 is subtracted from 4.0121, it will give you the difference of?.",
            "1.2109",
            "2.0905",
            "1.2009",
            "2.7009",
            3
        )
        questionList.add(que1)

        val que2 = Question(
            1,
            "What should be subtracted from 9.4518 to get 5.6324?",
            "3.4018",
            "3.8194",
            "3.0832",
            "3.1948",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            1,
            "Take away 28.567 from the sum of 10.548 and 27.69, what's you get?.",
            "9.671",
            "8.671",
            "7.176",
            "6.176",
            1
        )
        questionList.add(que3)

        val que4 = Question(
            1,
            "Rina bought school items at the department store: bag for Php. 223.75, pencil  case for Php. 55.90, 6 notebooks for Php. 78.65 and a crayons for Php. 25.55. How much did she spend?",
            "Php. 382",
            "Php. 383",
            "Php. 384",
            "Php. 385",
            3
        )
        questionList.add(que4)

        val que5 = Question(
            1,
            "Father bought 15.5833 liters of gasoline for his car. He consumed 0.58 litres on Monday and 4.7501 litres on Tuesday. How many liters of gasoline were left?",
            "11.2532",
            "10.2532",
            "9.3225",
            "8.5322",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            1,
            "Jean and Manny joined a walkathon to raise fund for a charitable organization. In six minutes, Jean walked 0.4805 km., while Manny walked 0.4818 km. By how many kilometer does Jean walks farther than Manny?",
            "0.0213 km",
            "0.1022km",
            "0.2021km",
            "0.0013km",
            4
        )
        questionList.add(que6)

        val que7 = Question(
            1,
            "Mario had a long copper wire, from which he cut two pieces. One piece was 0.8324m and the other was 1.3568m. After cutting the two pieces, there was 3.9m copper wire left. What are the length of the wire at the start?",
            "3.0892",
            "4.0892",
            "5.0892",
            "6.0892",
            4
        )
        questionList.add(que7)

        val que8 = Question(
            1,
            "Bob went shopping. He bought a pair of sandals for Php 85.50 and a pair of socks for Php 32.95. How much change did he get from Php 500.00 bill?",
            "Php 183.55",
            "Php 831.55",
            "Php 381.55",
            "Php 531.55",
            3
        )
        questionList.add(que8)

        val que9 = Question(
            1,
            "What number will you add 892.013 to get 958.2?",
            "46.187",
            "56.187",
            "66.187",
            "76.187",
            2
        )
        questionList.add(que9)

        val que10 = Question(
            1,
            "The sum of 1.0768 and 1.096 minus 1.0120 is",
            "1.1615",
            "1.1716",
            "2.1715",
            "2.5611",
            1
        )
        questionList.add(que10)

        return questionList
    }
}