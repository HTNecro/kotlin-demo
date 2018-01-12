package org.kotliner.demo.coroutines

import kotlin.coroutines.experimental.buildSequence

val fibonacci = buildSequence {
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

fun main(args: Array<String>) {
    println(fibonacci.take(10).joinToString())
}