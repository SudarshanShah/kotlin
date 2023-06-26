fun main() {
    val name = "Sudarshan"
    println(name)
    println(name.length)
    println(name.uppercase())
    println(name.lowercase())
    println(name[0])
    println(name[8])
    println(name.isEmpty())

    val age = 25

    val msg = "$name $age"
    println(msg)

    val email = """
        Hello %s,
        How are you?
    """.trimIndent()

    println(email.format("Stark"))
}