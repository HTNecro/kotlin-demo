package org.kotliner.demo.operator

data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(this.x + other.x, this.y + other.y)
}

operator fun Point.minus(other: Point): Point {
    return Point(this.x - other.x, this.y - other.y)
}

operator fun Point.inc(): Point {
    return Point(this.x + 1, this.y + 1)
}

operator fun Point.dec(): Point {
    return Point(this.x - 1, this.y - 1)
}

fun main(args: Array<String>) {
    var a = Point(1, 3)
    var b = Point(1, 3)
    println(a + b)
    println(a - b)
    println(a++)
    println(b--)
    println(a == b)

}