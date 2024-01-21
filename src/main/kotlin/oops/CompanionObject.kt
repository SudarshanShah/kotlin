package oops

fun main() {
    Student.study()

}

class Student  {
    // companion object is similar to 'static' keyword in Java
    // but it can also extend class / interface
    // it can use members of parent class
    // default name of this object is 'Companion'
    // but we can give it any name
    companion object: XYZ(), ABC {
        fun study() = println("Study now!")
    }
}

interface ABC

open class XYZ