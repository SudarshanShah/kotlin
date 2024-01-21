package collections

fun main() {
    val names = listOf(
        "Tony",
        "Steve",
        "Clark",
        "Bruce"
    )

    // destructuring the list/array
    val (t, s, c) = names
    println("$t $s $c")
}