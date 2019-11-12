package com.openclassroom.test.p2

import java.io.Console

fun main() {

}

fun loopV1() {
    val names = listOf("Jake Wharton", "Joe Birch", "Robert Martin")

    for (name in names) {
        println("This developer rocks : $name")
    }

    for (i in names.indices){
        println("This developer with number $i rocks : ${names[i]}")
    }

    for ((index, value) in names.withIndex()) {
        println("This developer with number $index rocks : $value")
    }

    for (i in 1..42 step 2) {
        println("I love this number : $i")
    }

    // listOf, mutableListOf, ŝetOf, mutableSetOf
}
