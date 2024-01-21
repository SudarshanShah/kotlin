fun main() {
    // It creates immutable list
    val names = listOf(
        "Sudarshan",
        "Tony",
        "Steve",
        "Clark",
        "Bruce"
    )

    println(names)
    println(names[1])
    println(names.size)
    println(names.contains("Bruce"))
    println(names.first())
    println(names.last())
    println(names.indexOf("Clark"))
    println(names.lastIndexOf("Steve"))

    // It creates a mutable list
    val heroes = mutableListOf(
        "Tony",
        "Steve",
        "Clark",
        "Bruce"
    )

    println(heroes)
    heroes.add("Peter")
    heroes.add("Diana")
    heroes.add(1, "Natasha")
    heroes += "Wanda"
    println(heroes)
    println(heroes.isEmpty())
    heroes.sort()
    println(heroes)

    // Iterating through list
    for(hero in heroes) {
        println(hero)
    }

}