package com.learnkotlinbasic.learnkotlinbasic

class ControlFlow {
    init {
        var test : Int
        val check = false

        if(check) {
            test = 1
        }else {
            test = 2
        }

        println(test)

    }
}

fun main(args: Array<String>) {
    ControlFlow()
}