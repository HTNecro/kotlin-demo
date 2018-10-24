package org.kotliner.demo.coroutines


val fibonacci = sequence {
    yield(1)
    var cur = 1
    var next = 1
    while (true) {
        yield(next)
        val tmp = cur + next
        cur = next
        next = tmp
    }
}

fun main() {
    println(fibonacci.take(10).joinToString())
}