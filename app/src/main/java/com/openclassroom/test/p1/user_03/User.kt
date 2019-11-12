package com.openclassroom.test.p1.user_03

//val -> getter
//var -> getter/setter
class User(email: String,private var password: String, var age: Int) {
    var email: String = email
        get() {
            println("User is getting his email");return field
        }
        set(value) {
            println("User is setting his email"); field = value
        }
}


