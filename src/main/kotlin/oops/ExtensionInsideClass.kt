package oops

fun main() {

    val host = Host("localhost")
    val connection = Connection(host, 8080)
    connection.connect()

    println()

    Connection(Host("localhost"), 5000).connect()

    Connection(Host("localhost"), 7634).printToString()

}

class Host(private val name: String) {
    fun printHostName() {
        print(name)
    }
}

class Connection(private val host: Host, private val port: Int) {
    // member function
    private fun printPortName() {
        print(port)
    }

    // member function & extension function of class Host
    // not accessible outside of class by instance of Host or Connection either.
    private fun Host.printConnectionString() {
        printHostName()   // calling function of class Host directly
        print(":")
        printPortName()
    }

    // member function
    fun connect() {
        // calling extension function using class Host instance
        host.printConnectionString()
    }

    /*
    * In the event of a name conflict between the members of a dispatch receiver(Connection)
    * and an extension receiver(Host),
    * the extension receiver(Host) takes precedence.
    */
    private fun Host.printToString() {
        toString()  // Host.toString()
        this@Connection.toString()   // Connection.toString()
    }

    fun printToString() {
        host.printToString()
    }
}