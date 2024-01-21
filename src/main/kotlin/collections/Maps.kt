package collections

fun main() {

    // immutable map -> fixed size
    val students = mapOf("Ali" to 17, "Jack" to 19,"Sammy" to 12)
    println(students)

    // mutable map
    var studentMap = mutableMapOf("Tony" to 100)
    println(studentMap)

    // accessing value by key
    println(studentMap["Tony"])

    // accessing value by key using get()
    println(studentMap.get("Tony"))

    // no of elements in map
    println(students.size)

    // add elements to the map
    studentMap.put("Steve", 96)
    studentMap["Natasha"] = 94
    println(studentMap)

    // update value of a key in map
    studentMap["Tony"] = 99
    println(studentMap)

    // iterating through map
    for( (name, num) in students ) {
        println("$name : $num")
    }

    // iterating through keys
    for(name in studentMap.keys) {
        println(name)
    }
}