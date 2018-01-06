package org.kotliner.demo.operator

data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(this.x + other.x, this.y + other.y)
}

operator fun Point.minus(other: Point): Point {
    return Point(this.x - other.x, this.y - other.y)
}

fun main(args: Array<String>) {
    val a = Point(1, 3)
    val b = Point(3, 1)
    println(a + b)
    println(a - b)
}