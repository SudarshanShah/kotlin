fun main() {
    val names = listOf("Sudarshan", "Stark", "Steve", "Peter", "Harry")
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    for (name in names) {
        println(name)
    }

    // prints elements
    for (num in numbers) {
        println(num)
    }

    // prints indices, and elements by using indices
    for (index in numbers.indices) {
        println("$index - ${numbers[index]}")
    }

    // prints indices, and elements by using indices --> in reverse order
    for (index in numbers.indices.reversed()) {
        println("$index - ${numbers[index]}")
    }

    // working with List
    for (index in names.indices) {
        println("$index - ${names[index]}")
    }
}