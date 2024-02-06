package practise

fun main() {

    println(firstNonRepeatingCharacter("aabbcc"))

}

fun firstNonRepeatingCharacter(str: String): Char {
    val n = str.length
    var ans = '0'
    val charCountMap = mutableMapOf<Char, Int>()

    for (i in 0 until n) {
        if (charCountMap.containsKey(str[i])) {
            val count = charCountMap[str[i]]
            charCountMap[str[i]] = count!! + 1
        } else {
            charCountMap[str[i]] = 1
        }
    }

    println(charCountMap)

    for (i in 0 until n) {
        if (charCountMap[str[i]] == 1) {
            ans = str[i]
            break
        }
    }

    return ans
}