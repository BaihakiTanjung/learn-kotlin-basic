package com.learnkotlinbasic.learnkotlinbasic

class ClassKotlin(val id: Int, var email : String) {

}

fun main(args: Array<String>) {
    val mantap = ClassKotlin(1, "test@gmail.com")

    println(mantap.email)
}