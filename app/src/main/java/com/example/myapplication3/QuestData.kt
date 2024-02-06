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
    ls.add(
        QuestData(
            imageOne = R.drawable.flag1,
            imageTwo = R.drawable.flag2,
            imageThree = R.drawable.flag3,
            imageFour = R.drawable.flag4,
            word = "Flag"
        )
    )
    ls.add(
        QuestData(
            imageOne = R.drawable.smartphone1,
            imageTwo = R.drawable.smartphone,
            imageThree = R.drawable.smartphone3,
            imageFour = R.drawable.smartphone4,
            word = "Phone"
        )
    )
    ls.add(
        QuestData(
            imageOne = R.drawable.laptop1,
            imageTwo = R.drawable.laptop2,
            imageThree = R.drawable.laptop3,
            imageFour = R.drawable.laptop4,
            word = "Laptop"
        )
    )
    ls.add(
        QuestData(
            imageOne = R.drawable.math1,
            imageTwo = R.drawable.math2,
            imageThree = R.drawable.math3,
            imageFour = R.drawable.math4,
            word = "Math"
        )
    )
    ls.add(
        QuestData(
            imageOne = R.drawable.book1,
            imageTwo = R.drawable.book2,
            imageThree = R.drawable.book3,
            imageFour = R.drawable.book4,
            word = "Book"
        )
    )
    ls.add(
        QuestData(
            imageOne = R.drawable.stars1,
            imageTwo = R.drawable.stars2,
            imageThree = R.drawable.stars3,
            imageFour = R.drawable.stars4,
            word = "Stars"
        )
    )

    return ls
}
