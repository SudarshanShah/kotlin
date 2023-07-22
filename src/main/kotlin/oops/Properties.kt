package oops

fun main() {

    val address = Address()
    println(address.copyAddress(address))

    val rect = Rectangles(5, 8)
    println(rect.area)
}

class Address {
    var name: String = "Sudarshan"
    var city: String = "Jodhpur"
    var state: String? = null

    fun copyAddress(address: Address): Address {
        val result = Address()
        result.name = address.name
        result.city = address.city
        result.state = address.state

        return result
    }

    override fun toString(): String {
        return "Address(name='$name', city='$city', state=$state)"
    }

}

class Rectangles(val width: Int, val length: Int) {
    val area get() = this.width * this.length
}