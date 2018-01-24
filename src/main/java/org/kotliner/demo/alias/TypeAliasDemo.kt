package org.kotliner.demo.alias

typealias IntList = List<Int>

fun printFirst(list: IntList) {
    println(list.first())
}

typealias Predicate<T> = (T) -> Boolean

fun foo(p: Predicate<Int>) = p(42)

fun main(args: Array<String>) {
    val list: IntList = listOf(1, 2, 3)
    printFirst(list)

    val f: (Int) -> Boolean = { it > 0 }
    println(foo(f)) // prints "true"

    val p: Predicate<Int> = { it > 0 }
    println(listOf(1, -2).filter(p)) // prints "[1]"
}