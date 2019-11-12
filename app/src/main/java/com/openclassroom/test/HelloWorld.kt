package com.openclassroom.test

import android.os.UserHandle

//attributs
private const val SERVER_URL: String = "https://my.api.com"


//var username:String                           // property must be initialized
private var username1 :String? = null           // works but not good (enable null value)
private lateinit var username: String           // best


fun main(args : Array<String>){
    print("Bonjour monde!")
}

fun containNullValue() {
    var message: String? = "My message can possibly be null"
    //message.toUpperCase()                     // error here

    message?.toUpperCase()                      // best
    if(message != null) message.toUpperCase()   // possible behavior when null
}

fun referenceString() {
    val name = "Nathan"
    print("hello $name")
}

fun varInit() {


}


