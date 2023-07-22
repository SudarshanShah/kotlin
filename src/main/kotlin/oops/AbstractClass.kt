package oops

fun main() {

    val obj = Rectangle()
    obj.draw()

    val sqr = Square()
    sqr.draw()
}

abstract class Polygon {
    abstract fun draw()
}

class Rectangle: Polygon() {
    override fun draw() {
        println("Draw a rectangle")
    }
}

open class Polygons {
    open fun draw() {
        println("Draw a Polygon")
    }
}

abstract class WildShape: Polygons() {
    // Classes that inherit WildShape need to provide their own
    // draw method instead of using the default on Polygons
    abstract override fun draw()
}

class Square: WildShape() {
    override fun draw() {
        println("Draw a Square")
    }
}