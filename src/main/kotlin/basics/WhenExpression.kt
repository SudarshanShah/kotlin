package basics

fun main() {
    val gender = "F"

    val g = when(gender) {
        "F" -> "Female"
        "M" -> "Male"
        else -> "Others"
    }

    println(g)

    val age = 25

    when(age) {
        in 13..19 -> println("Teenager")
        in 20..25 -> println("Youthful")
        else -> println()
    }
}