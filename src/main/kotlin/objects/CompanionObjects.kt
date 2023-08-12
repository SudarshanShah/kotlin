package objects

fun main() {

    val myClass = MyClass.create()

    myClass.draw()
}

// even though the members of companion objects look like static members in other languages,
// at runtime those are still instance members of real objects.
class MyClass {
    // name of 'companion object' is not mandatory
    companion object Factory {
        fun create(): MyClass = MyClass()
    }

    fun draw() {
        println("Drawing a nice house")
    }
}