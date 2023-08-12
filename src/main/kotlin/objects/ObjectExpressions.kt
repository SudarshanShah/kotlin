package objects

fun main() {
    // Object expressions create objects of anonymous classes, that is,
    // classes that aren't explicitly declared with the class declaration.
    // Such classes are useful for one-time use
    val helloWorld = object {
        val hello = "Hello"
        val world = "world"

        override fun toString() = "$hello $world"
    }

    println(helloWorld)

    println(ab.y)
}

open class A(x: Int) {
    open val y: Int = x
}

interface B

// anonymous object inheriting class & interface
val ab: A = object : A(1), B {
    override val y = 10
}