package collections

fun main() {

    // set -> unordered collection of unique values
    val names = setOf("Tony", "Bruce", "Steve", "Natasha")
    println(names)

    // set from array
    val grades = arrayOf(83, 45, 72, 56)
    val gradesSet = mutableSetOf(*grades)
    println(gradesSet)

    // add element to set
    gradesSet.add(69)
    println(gradesSet)

    // check elements in Set
    println(names.contains("Steve"))
    println("Tony" in names)


}