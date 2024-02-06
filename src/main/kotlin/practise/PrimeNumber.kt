package practise

import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {

    println(isPrime(73))

}

fun isPrime(num: Int): Boolean {
    if (num == 0 || num == 1) return false

    if (num == 2) return true

    if (num % 2 == 0) return false

    for (i in 3 .. sqrt(num.toDouble()).roundToInt()) {
        if (num % i == 0) return false
    }

    return true
}