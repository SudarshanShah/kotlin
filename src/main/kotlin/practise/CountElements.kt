package practise

// In a given array, count no of elements
// which have at least one element greater than it.
fun main() {
    val a = arrayOf(5, 5, 3)
    println(countElements(a))
}

fun countElements(a: Array<Int>): Int {
    var count = 0
    var max = Int.MIN_VALUE

    for (i in a) {
        if (i > max) {
            max = i
        }
    }

    for (i in a) {
        if (i < max) {
            count++
        }
    }

    return count
}