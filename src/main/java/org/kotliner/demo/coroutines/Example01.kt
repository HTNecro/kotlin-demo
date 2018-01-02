package org.kotliner.demo.coroutines

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch

fun main(args: Array<String>) {
    launch {
        // launch new coroutine in background and continue
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
}