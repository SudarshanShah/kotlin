package oops

fun main() {

    val childCaller = ChildCaller()
    childCaller.call(Parent())
    childCaller.call(Child())

    val parentCaller = ParentCaller()
    parentCaller.call(Parent())
    parentCaller.call(Child())
}

open class Parent {}

class Child: Parent() {}

open class ParentCaller {

    open fun Parent.printFunctionInfo() {
        println("Parent extension function from ParentCaller")
    }

    open fun Child.printFunctionInfo() {
        println("Child extension function from ChildCaller")
    }

    fun call(parent: Parent) {
        parent.printFunctionInfo()
    }
}

class ChildCaller: ParentCaller() {
    override fun Parent.printFunctionInfo() {
        println("Parent extension function from ChildCaller")
    }

    override fun Child.printFunctionInfo() {
        println("Child extension function from ChildCaller")
    }
}

