package org.kotliner.demo.typecast

open class TypeA {
    open fun printA() {
        println("A")
    }
}

class TypeB : TypeA() {

    override fun printA() {
        println("B")
    }

    fun printB() {
        println("B")
    }
}

fun main(args: Array<String>) {
    val type: TypeA = TypeB()
    // type.printB()
    if (type is TypeB) {
        type.printB()
    }

}