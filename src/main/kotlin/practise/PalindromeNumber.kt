package practise

fun main() {

    println(isPalindrome(101))
}

fun isPalindrome(x: Int): Boolean {
    var rev = 0
    var y = x

    while (y > 0) {
        rev = rev * 10 + y % 10
        y /= 10
    }

    return x == rev
}
