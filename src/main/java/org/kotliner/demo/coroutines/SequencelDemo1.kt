package org.kotliner.demo.coroutines

import kotlin.coroutines.experimental.buildSequence


fun main(args: Array<String>) {
//    println((1..100_000_000).toMutableList().sum())

    println(buildSequence {
        yieldAll(1..100_000_000)
    }.sum())
}
