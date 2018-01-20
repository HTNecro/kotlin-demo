package org.kotliner.demo.reflect

import org.kotliner.demo.dataclass.Gender
import org.kotliner.demo.dataclass.KotlinUser
import kotlin.reflect.full.memberProperties

fun main(args: Array<String>) {
    val user = KotlinUser("Haitao", 18, Gender.MALE)
    val kClass = user.javaClass.kotlin
    println(kClass.simpleName)
    kClass.memberProperties.forEach { println(it) }

    val nameProperty = KotlinUser::name
    println(nameProperty.get(user))
}