package org.kotliner.demo.function

import org.kotliner.demo.nullsafety.getNullableString

fun String?.isNotEmpty() = this != null && this != ""

fun main(args: Array<String>) {
    val s = getNullableString()
    if (s.isNotEmpty()) {
        println("String: $s")
    } else {
        println("String is empty")
    }
}