fun main() {
    Constructors(1)
    // If a class have primary constructor with default value of all fields,
    // compiler generates new parameterless constructor which uses the default values.
    Constructors1()
    Constructors1("Constructor")
}

class Constructors {
    init {
        println("in the Init block")
        println("code in Init block is part of primary constructor")
    }

    constructor(i: Int) {
        println("constructor $i")
    }
}

class Constructors1(val name: String = "Hello")