package com.openclassroom.test.p1

fun main(args: Array<String>) {
    println("Hello, world!")
}

var hello: Unit = main(arrayOf(""))

//minOf
private fun minOfV1(a: Int, b: Int): Int {
    return if (a < b) a else b
}

private fun minOfV2(a: Int, b: Int): Int = if (a < b) a else b

private fun minOfV3(a: Int, b: Int) = if (a < b) a else b

//sayHello
fun sayHelloV1(): Unit {
    println("Hello!")
}

fun sayHelloV2(): Unit = println("Hello!")
fun sayHelloV3() = println("Hello!")

