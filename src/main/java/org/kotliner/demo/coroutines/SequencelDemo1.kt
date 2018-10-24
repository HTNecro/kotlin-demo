package org.kotliner.demo.coroutines


fun main() {
    println(sequence {
        yieldAll(1..100_000_000)
    }.sum())
}
