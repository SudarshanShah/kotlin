package oops

import kotlin.reflect.typeOf

fun main() {

    val obj = DerivedClass("Sudarshan", "Shah")
    println("The name is ${obj.name} and full name size is ${obj.size}")

    val c = C()
    c.draw()
}

open class Base(p: Int) {
    constructor(p: Int, q: String): this(p)
}

// If the derived class has a primary constructor, the base class can (and must)
// be initialized in that primary constructor according to its parameters.
class Derived1(p: Int): Base(p)

// If the derived class has no primary constructor, then each secondary constructor
// has to initialize the base type using the super keyword, or it has to delegate
// to another constructor which does.
// In this case, different secondary constructors can call different constructors of the base type
class Derived2: Base {
    constructor(p: Int): super(p)

    constructor(p: Int, q: String): super(p)

    constructor(p: Int, q: String, r: Double): super(p, q)
}

open class BaseClass(val name: String) {
    init {
        println("Initializing in Base class")
    }

    open val size: Int = name.length.also { println("Initializing size in Base class as $it") }
}

class DerivedClass(
    name: String,
    lastName: String): BaseClass(name.replaceFirstChar { it.uppercase() }
        .also { println("Argument for Base class $it") })
{
        init {
            println("Initializing in Derived class")
        }

    override val size: Int = (super.size + lastName.length)
        .also { println("Initializing size in Derived class as $it") }

}


open class A {
    open fun draw() {
        println("In Class A")
    }
}

interface B {
    fun draw() {
        println("In Interface B")
    }
}

class C() : A(), B {
    override fun draw() {
        super<A>.draw()
        super<B>.draw()
    }
}