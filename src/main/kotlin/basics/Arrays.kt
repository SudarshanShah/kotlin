package basics

fun main() {
    val names = arrayOf("Superman", "Batman", "Wonder Woman")
    println(names.contentToString())
    println(names[0])
    names[1] = "Dark Knight"
    println(names[1])
    println(names.size)

    if ("Superman" in names) {
        println("Found")
    } else println("Not found")

    // array pre-filled with null values
    val arrayOfNulls = arrayOfNulls<String>(5)
    arrayOfNulls[3] = "Kotlin"
    println(arrayOfNulls.contentToString())

    // returns an empty array
    val emptyArray = emptyArray<String>()
    println(emptyArray.contentToString())


    // initialize Array using code logic
    val array = Array(5) {it * 2}
    println(array.contentToString())
}