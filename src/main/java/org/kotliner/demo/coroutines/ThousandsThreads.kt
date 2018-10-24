package org.kotliner.demo.coroutines

import kotlin.concurrent.thread

fun main() {
    val jobs = List(100_000) {
        thread {
            Thread.sleep(1000L)
            print(".")
        }
    }
    jobs.forEach { it.join() }
}