package practise

fun main() {

    val a = arrayOf(2, 5, 1, 6, 3, 7, 9, 4)
    println(secondLargestElement(a))
}

fun secondLargestElement(a: Array<Int>): Int {
    val rev = a.sortedArrayDescending()
    println(rev.contentToString())
    val first = rev.drop(1).first()
    return first
}