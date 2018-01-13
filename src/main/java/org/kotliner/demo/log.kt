package org.kotliner.demo

import java.time.Instant

fun log(msg: String) = print("${Instant.now()} [${Thread.currentThread().name}] $msg")