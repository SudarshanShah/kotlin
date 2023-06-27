fun main() {
    val n1 = 30
    val n2 = 20

    if (n1 > n2) {
        println(":)")
    } else if (n1 == n2) {
        println("(::)")
    } else {
        println(":(")
    }

    val res = if (n1 > n2) {
        ":)"
    } else {
        ":("
    }
    println("If-Else evaluates to $res")

    val ans = if (n1 > n2) ":)" else ":("
    println(ans)
}