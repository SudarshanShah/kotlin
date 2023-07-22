package oops

fun main() {
    val tv = SmartDevice("Sony", 70000.0)
//    tv.brand = "Sony"
//    tv.price = 70000.0
    println("${tv.brand} ${tv.price}")
    tv.turnOn()
    println(tv)

    val tv1 = SmartDevice("Sony", 70000.0)

    // check content
    println(tv == tv1)

    // check references
    println(tv === tv1)

    val phone = SmartDevice()
    phone.brand = "Samsung"
    phone.price = 20000.0
    println("${phone.brand} ${phone.price}")
    phone.turnOff()
    println(phone)
}

class SmartDevice(
    // getter and setter are by-default created for the fields,
    // but we can change default logic of getter and setter too
    var brand: String,
    var price: Double
) {
    // secondary constructor
    // 'this' refers to primary constructor
    constructor(): this("", 0.0)

    fun turnOn() {
        println("$brand is switching on")
    }

    fun turnOff() {
        println("$brand is switching off")
    }

    override fun toString(): String {
        return "SmartDevice(brand='$brand', price=$price)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        return price == other.price
    }

    override fun hashCode(): Int {
        var result = brand.hashCode()
        result = 31 * result + price.hashCode()
        return result
    }


}