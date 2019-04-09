package org.kotliner.demo.delegate

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        println(x)
    }
}

class Derived(b: Base) : Base by b {
    fun delegate() {
        println("Pre...")
        print()
        println("Post...")
    }
}


fun main() {
    val b = BaseImpl(10)
    Derived(b).delegate()
}