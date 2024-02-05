package com.example.myapplication3

import androidx.annotation.DrawableRes

data class QuestData(
    @DrawableRes
    var imageOne: Int,
    @DrawableRes
    var imageTwo: Int,
    @DrawableRes
    val imageThree: Int,
    @DrawableRes
    val imageFour: Int,
    val word: String
)

fun loadQuest(): List<QuestData> {
    val ls = ArrayList<QuestData>()
    ls.add(
        QuestData(
            imageOne = R.drawable.animal1,
            imageTwo = R.drawable.animal2,
            imageThree = R.drawable.animal3,
            imageFour = R.drawable.animal4,
            word = "Animal"
        )
    )
    ls.add(
        QuestData(
            imageOne = R.drawable.car1,
            imageTwo = R.drawable.car2,
            imageThree = R.drawable.car3,
            imageFour = R.drawable.car4,
            word = "Car"
        )
    )
    return ls
}
