package practise

fun main() {

    println(isPalindrome("xx"))

}

fun isPalindrome(str: String): Boolean {
    val n = str.length

    if (n == 1) return true

    var i = 0
    var j = n-1

    while(i < j) {
        if(str[i] != str[j]) return false
        i++
        j--
    }

    return true
}