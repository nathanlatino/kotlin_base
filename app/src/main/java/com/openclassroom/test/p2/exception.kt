package com.openclassroom.test.p2

import android.app.Notification
import android.os.Message
import android.provider.ContactsContract
import android.view.inspector.IntFlagMapping
import java.lang.Exception


fun main() {

}

private fun subtractNumber(a: Int, b: Int) =
    if (a >= b) a - b else throw  Exception("a is smaller than b!")


private fun useSubV1() {
    subtractNumber(20, 10) // pas protégé

    try {
        subtractNumber(20, 10) // protégé
    } catch (e: Exception) {
        print(e.message)
    }
}


class User(val email: String?, val password: String?)

private fun UseUser() {
    val user = User("toto@gmail.com", "qwertz")
    val password = user.password ?: throw IllegalAccessException("Password required")
}

private fun fail(message: String): Nothing = throw IllegalAccessException(message)

private fun useSubV2() {
    val result = try {
        subtractNumber(10, 20)
    } catch (e: Exception) {
        0
    }

    print(result)
}
