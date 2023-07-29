package oops

fun main() {

    obj.invoke()

    lambdaObj.invoke()

    println(isEven(4))

}

val isEven: IntPredicate = { it % 2 == 0 }

val obj = object : KRunnable {
    override fun invoke() {
        println("invoke() method call from inside Anonymous Class")
    }
}

val lambdaObj = KRunnable { println("invoke() method call from inside Lambda Expression") }

fun interface KRunnable {
    fun invoke()
}

typealias IntPredicate = (i: Int) -> Boolean