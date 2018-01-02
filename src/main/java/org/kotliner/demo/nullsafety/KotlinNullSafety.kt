package org.kotliner.demo.nullsafety

fun getNullableString(): String? {
    return null
}

fun getNotNullString(): String {
    return "Hello, Kotlin"
}

fun main(args: Array<String>) {
    val nullable = getNullableString()

    // println(nullable.length) //编译错误

    nullable?.let { println(it.length) }

    val result = nullable ?: getNotNullString()
    println(result.length)

    nullable ?: throw IllegalArgumentException()
    println(nullable.length)

    val notNull = getNotNullString()
    println(notNull.length)
}