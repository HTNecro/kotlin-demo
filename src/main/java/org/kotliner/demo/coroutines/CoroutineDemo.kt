package org.kotliner.demo.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        // launch new coroutine in background and continue
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
}