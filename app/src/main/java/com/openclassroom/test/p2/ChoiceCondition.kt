package com.openclassroom.test.p2

fun main() {

}


fun condition() {
    var a = 10
    var b = 12
    val result = if (a > b) {
        a++
        a
    } else {
        b++
        b
    }
}

fun switchV1() {
    var apiResponse = 404

    when (apiResponse) {
        200 -> print("OK")
        404 -> print("Not Found")
        401 -> print("Unauthorized")
        403 -> print("Forbidden")
        else -> print("Unknown")
    }
}

fun switchV2() {
    var apiResponse = 200

    when (apiResponse) {
        200, 201, 202 -> print("SUCCESS")
        300, 301, 302 -> print("REDIRECTION")
        400, 404 -> print("ERROR")
        else -> print("Unknown")
    }
}


fun switchV3() {
    var apiResponse = 200

    when  {
        isSuccess(apiResponse) -> print("SUCCESS")
        isError(apiResponse) -> print("ERROR")
    }
}

fun isSuccess(apiResponse: Int) = apiResponse ==200 || apiResponse == 201 || apiResponse == 202
fun isError(apiResponse: Int) = apiResponse == 400 || apiResponse == 404


enum class ApiResponseV1 {
    OK,
    NOT_FOUND,
    UNAUTORIDZED,
    FORBIDEN,
    UNKNOWN
}

enum class ApiResponseV2(val code:Int){
    OK(200),
    NOT_FOUND(404),
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    UNKNOWN(0),
}

fun switchV4(){
    val response: ApiResponseV2 = ApiResponseV2.OK

    when(response){
        ApiResponseV2.OK-> print("OK")
        ApiResponseV2.NOT_FOUND-> print("Not Found")
        ApiResponseV2.UNAUTHORIZED-> print("Unauthorized")
        ApiResponseV2.FORBIDDEN-> print("Forbidden")
        ApiResponseV2.UNKNOWN-> print("Unknown")
    }

}

fun switchV5(){
    val numberToFind = 55

    when(numberToFind){
        in 1..33 -> print("Number is between 1 and 33")
        in 34..66 -> print("Number is between 34 and 66")
        in 67..100 -> print("Number is between 67 and 100")

    }
}
