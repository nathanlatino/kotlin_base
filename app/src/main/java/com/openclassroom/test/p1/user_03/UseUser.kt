package com.openclassroom.test.p1.user_03

fun main() {
    val user = User("hello@gmail.com", "qwertz", 27)
    user.email //getter
    //user.email = "new_email@gmail.com" //setter qui ne fonctionne plus (val)
}
