package org.kotliner.demo.function

fun pagingList(param: String, pageNo: Int = 1, pageSize: Int = 10): List<Any> {
    println("param: $param, pageNo: $pageNo, pageSize $pageSize")
    return emptyList()
}

fun main() {
    pagingList("parameters")
    pagingList("parameters", 2, 20)
    pagingList("parameters", pageNo = 2)
    pagingList(pageNo = 2, pageSize = 20, param = "parameters")
}