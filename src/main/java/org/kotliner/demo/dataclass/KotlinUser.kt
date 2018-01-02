package org.kotliner.demo.dataclass

data class KotlinUser(
        val name: String,
        val age: Int
)

fun main(args: Array<String>) {
    val user = KotlinUser("Haitao", 18)
    println("Current User is $user")
    println("Current User age is ${user.age}")
}