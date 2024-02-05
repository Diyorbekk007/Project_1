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

fun loadQuest():List<QuestData>{
    val ls=ArrayList<QuestData>()
    ls.add(
        QuestData(
            imageOne = R.drawable.animal1,
            imageTwo = R.drawable.animal2,
            imageThree = R.drawable.animal3,
            imageFour = R.drawable.animal4,
            word = "Dog"
        )
    )
    ls.add(QuestData(
        imageOne = R.drawable.dog_2,
        imageTwo = R.drawable.dog,
        imageThree = R.drawable.dog_2,
        imageFour = R.drawable.dog,
        word = "Animal"
    ))
    return ls
}
