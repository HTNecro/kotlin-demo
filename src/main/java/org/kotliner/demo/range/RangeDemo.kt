package org.kotliner.demo.range

fun main() {
    for (i in 1..8 step 2) {
        print("$i ")
    }
    println()

    for (i in 8 downTo 1) {
        print("$i ")
    }
    println()

    for (i in 1 until 8) {
        print("$i ")
    }
    println()
}