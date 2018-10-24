package org.kotliner.demo.hello

class Greeter(private val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun main() {
    val name = "Kotlin"
    Greeter(name).greet()
}