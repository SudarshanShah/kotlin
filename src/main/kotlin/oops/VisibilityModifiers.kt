package oops

fun main() {

}

open class Outer {
    private val a = 1 // private to Outer class
    protected open val b = 2  // Visible to subclasses
    internal open val c = 3  // Visible
    val d = 4

    protected class Nested {
        val e = 5  // visible to Outer class
        private val f = 6  // Outer class can't see it
    }
}

class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 5   // 'b' is protected
    override val c = 7   // 'c' is internal
}

class Unrelated(o: Outer) {
    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
}