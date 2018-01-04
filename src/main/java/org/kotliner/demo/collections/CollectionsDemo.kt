package org.kotliner.demo.collections

fun main(args: Array<String>) {
    val list = listOf<Int>()
    list.filter { it > 0 }.map { it.toString() }.forEach(::println)
}