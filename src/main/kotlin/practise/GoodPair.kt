package practise

/*
* Given an array A and an integer B. A pair(i, j) in the array is a good pair
* if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
* */
fun main() {
    val a = arrayOf(1, 2, 3, 4)
    println(doesGoodPairExist(a, 5))
}

fun doesGoodPairExist(a: Array<Int>, b: Int): Int {
    for (i in a.indices) {
        for (j in a.indices) {
            if (j > i && a[i] + a[j] == b) {
                return 1
            }
        }
    }

    return 0
}