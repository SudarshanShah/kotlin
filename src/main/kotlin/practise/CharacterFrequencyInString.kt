package practise

fun main() {
    val str = "abcdacbdefabcfed"
    println(characterFrequency(str))
}

fun characterFrequency(str: String): Map<Char, Int> {
    val map = mutableMapOf<Char, Int>()
    val n = str.length

    for (i in 0 until n) {
        if (map.containsKey(str[i])) {
            val count = map[str[i]]
            map[str[i]] = count!!+1
        } else {
            map[str[i]] = 1
        }
    }

    return map
}