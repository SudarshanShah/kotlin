package basics

fun main() {
    var name = "Sudarshan"
    // by default, variables can't have value as null
    // name = null

    // to define a type of variable which can store null values
    var brand: String? = "Kotlin"
    println(brand?.uppercase())  // will convert String to uppercase
    brand = null // this is allowed to have value as null
    //println(brand.uppercase()) // will give compile-time error

    // using safe call operator(?), if any value is 'null' then whole thing evaluates to null,
    // or it returns null, rather than throwing NullPointerException
    println((brand as String?)?.uppercase()) // will print null

}