package org.kotliner.demo.coroutines

import kotlin.coroutines.experimental.buildSequence

val sequence = buildSequence {
    val start = 0
    yield(start)
    yieldAll(1..5 step 2)
    yieldAll(generateSequence(8) { it * 8 })
}

fun main(args: Array<String>) {
    println(sequence.take(2).joinToString())
    println(sequence.take(5).joinToString())
}