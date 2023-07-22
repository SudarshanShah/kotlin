package strings

fun main() {
    val brand = "Sudarshan"
    for (c in brand) {
        println(c)
    }

    for (index in brand.indices) {
        println("${brand[index]}")
    }
}