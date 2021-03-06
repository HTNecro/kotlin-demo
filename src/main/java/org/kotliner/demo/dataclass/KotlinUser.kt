package org.kotliner.demo.dataclass

data class KotlinUser(
    val name: String,
    val age: Int,
    val gender: Gender
)

enum class Gender {
    MALE,
    FEMALE
}

fun main() {
    val user = KotlinUser("Haitao", 18, Gender.MALE)
    println("Current User is $user")
    println("Current User age is ${user.age}")

    val (name, age, _) = user
    println(name)
    println(age)
}