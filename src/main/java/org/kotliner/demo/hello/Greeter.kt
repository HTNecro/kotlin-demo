package org.kotliner.demo.hello

class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun main(args: Array<String>) {
    val name = "Kotlin"
    Greeter(name).greet()
}