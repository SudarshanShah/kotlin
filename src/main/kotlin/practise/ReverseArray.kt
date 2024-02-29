package practise

fun main() {

    val a = arrayOf(1, 1, 10)
    println(reverseArray(a).contentToString())
}

fun reverseArray(a: Array<Int>): IntArray {
    val r = IntArray(a.size)

    var j = 0
    for (i in a.indices.reversed()) {
        r[j] = a[i]
        j++
    }

    return r

}