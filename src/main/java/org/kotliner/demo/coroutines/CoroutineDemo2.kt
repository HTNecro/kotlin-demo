package org.kotliner.demo.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun fetchData(): String {
    delay(1000L)// fetch data from remote
    return ""
}

suspend fun parseData(originData: String): String {
    println(originData)
    delay(1000L)// parse data
    return ""
}

suspend fun saveData(data: String) {
    println(data)
    delay(100L)// save data
}

fun main() {
    GlobalScope.launch {
        val originData = fetchData()
        val data = parseData(originData)
        saveData(data)
    }
    // block main thread to keep JVM alive
}

