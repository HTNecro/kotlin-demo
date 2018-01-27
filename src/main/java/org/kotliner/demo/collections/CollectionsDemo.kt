package org.kotliner.demo.collections

import org.kotliner.demo.dataclass.Gender
import org.kotliner.demo.dataclass.KotlinUser

fun main(args: Array<String>) {
    val list = listOf(
            KotlinUser("1", 16, Gender.FEMALE),
            KotlinUser("2", 17, Gender.MALE),
            KotlinUser("3", 18, Gender.FEMALE),
            KotlinUser("4", 21, Gender.MALE),
            KotlinUser("5", 30, Gender.FEMALE)
    )
    // list.add(KotlinUser("6", 40)) // compile fail

    println(list.first())
    println(list.firstOrNull())
    println(list.last())
    println(list.lastOrNull())
    println(list.slice(0..2))

    println(list.none { it.age > 18 })
    println(list.any { it.age > 18 })

    val group = list.filter { it.age >= 18 }.groupBy(KotlinUser::gender)
    println(group[Gender.FEMALE])
    println(group[Gender.MALE])

    val totalAge = list.map(KotlinUser::age).sum()
    println(totalAge)

    val mutable = (1..10).toMutableList()
    println(mutable.requireNoNulls())
    mutable.add(100)
    mutable.remove(2)
    println(mutable)


    val map = mapOf("1" to 1, "2" to 2)
//    map["3"] = 3
    println(map)

    val hashMap = hashMapOf("1" to 1, "2" to 2)
    hashMap["3"] = 3
    hashMap.remove("1")
    println(hashMap["2"])
    println(hashMap["3"])
}