package functions

fun main() {
    // 1. Assign Lambda to variable
    val upperCaseString = { string: String -> string.uppercase() }
    println(upperCaseString("Kotlin"))

    // 2. Pass Lambda to another function
    val list = listOf(1, 2, 3, 4, 5)

    val evenValues = list.filter { it % 2 == 0 }
    val oddValues = list.filter { it % 2 != 0 }
    println(evenValues)
    println(oddValues)

    val doubled = list.map { x -> x * 2 }
    val tripled = list.map { x -> x * 3 }
    println(doubled)
    println(tripled)


    // 3. Return Lambda from a function
    val timeInMinutes = listOf(2, 5, 10)
    // this returns a lambda of type Function<Int, Int>
    val min2sec = toSeconds("minute")
    println(min2sec)
    // passing lambda 'min2sec' to map()
    val totalTimeInSeconds = timeInMinutes.map(min2sec).sum()
    println(totalTimeInSeconds)


    // 4. Invoking Lambda separately
    println({ string: String -> string.uppercase() } ("Kotlin"))


    // 5. Trailing Lambda -> if Lambda is last parameter of function, then
    // lambda expression can be written outside function

    // In this example, fold() function takes a lambda, which is a last parameter of fold() function
    // So, we have written Lambda outside function
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item })
}

// Return Lambda from a function
fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> {value -> value * 60 * 60}
    "minute" -> {value -> value * 60}
    "second" -> {value -> value}
    else -> {value -> value}
}