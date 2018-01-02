package org.kotliner.demo.function

fun pagingList(param: String, pageNo: Int = 1, pageSize: Int = 10): List<Any> {
    return emptyList()
}

fun main(args: Array<String>) {
    val page1 = pagingList("param")
    val page2 = pagingList("param", 2, 20)
    val page3 = pagingList("param", pageNo = 2)
    val page4 = pagingList(pageNo = 2, pageSize = 20, param = "param")
}