package loops

fun main() {

    // printing numbers in range
    for (i in 1..5) {
        println(i)
    }

    // to print range in reverse
    for (i in 10 downTo 1) println(i)

    // using steps
    for (i in 1..10 step 2) println(i)
}