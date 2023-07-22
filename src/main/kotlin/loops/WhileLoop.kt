package loops

fun main() {
    var number = 1
    while (number <= 5) {
        println(number)
        number++
    }

    while (number >= 0) {
        println(number)
        number--
    }

    val brand = "Sudarshan"
    var index = 0
    while (index < brand.length) {
        println("Brand ${brand[index]}")
        index++
    }

    val nums = arrayOf(1, 2, 3, 4, 5)
    var idx = 0
    while (idx < nums.size) {
        println("Element is ${nums[idx]}")
        idx++
    }

    do {
        println("Hello")
    } while (false)
}