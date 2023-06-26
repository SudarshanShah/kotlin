fun main() {
    val name1 = "Superman"
    val name2 = "Batman"
    val name3 = "Superman"
    val name4 = String("Superman".toCharArray())

    // == and equals() --> both check for content
    println(name1 == name3)
    println(name1.equals(name3))
    println(name1 == name4)

    // === check for reference equality
    println(name1 === name3)
    println(name1 === name4)
}