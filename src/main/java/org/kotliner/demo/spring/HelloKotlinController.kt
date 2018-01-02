package org.kotliner.demo.spring

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloKotlinController {

    @RequestMapping("/kotlin/hello")
    fun hello(@RequestParam name: String?): String {
        name ?: return "Hello Kotlin"
        return "Hello $name"
    }

}