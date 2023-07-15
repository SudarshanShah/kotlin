fun main() {
    greet("Sudarshan", 26)
    greet("Alex", 17)
    greet(age = 21, name = "Shiv")
    greet("Krishna")

    foo(bar = { println("bar as a argument") })
    // this syntax only applicable if function is last argument
    foo { println("bar as a func arg") }
    foo()

    foo1{ 5 }
    foo1()

    println(doubleTheNumber(5))

    println(tripleTheNumber(8))

    val (s, i) = getTwoValues()
    println("$s $i")
    val (t1, t2, t3) = getThreeValues()
    println("$t1 $t2 $t3")
}

fun doubleTheNumber(num: Int): Int {
    return num * 2
}

// this works when we have single line body
fun tripleTheNumber(num: Int): Int = num * 3

fun getTwoValues(): Pair<String, Int> = "Sudarshan" to 50

fun getThreeValues(): Triple<String, Int, Char> = Triple("Ironman", 3000, 'S')

fun foo(bar: () -> Unit = {}) {
    println("bar function")
    bar()
}

fun foo1(bar: () -> Int = {2}) {
    println("passing function which return Integer")
    println(bar())
}

// same as public void greet() in Java
fun greet(name: String, age: Int = 18) {
    println("Hello $name")
    if (age >= 18) println("Adult")
    else println("Not Adult")
}