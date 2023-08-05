package functions

fun main() {

    val list = mutableListOf(1, 2, 3, 4, 5)
    println(list)

    list.swap(1, 4)
    println(list)


    val names = mutableListOf("Sudarshan", "Harry", "Navin", "Hitesh", "John")
    println(names)

    names.swap(2, 3)
    println(names)
}

// extending functionality of MutableList interface
fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]        // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}
