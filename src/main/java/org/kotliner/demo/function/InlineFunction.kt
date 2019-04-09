package org.kotliner.demo.function

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

inline fun <T> lock(l: Lock, block: () -> T): T {
    l.lock()
    try {
        return block()
    } finally {
        l.unlock()
    }
}

fun doSomeThings(): String {
    return "Kotlin lambda"
}

fun main() {
    val l = ReentrantLock()

    lock(l, ::doSomeThings)

    lock(l) {
        doSomeThings()
    }
}