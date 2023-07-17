package com.learnkotlinbasic.learnkotlinbasic

class Functions {
    init {
        fun test() {
            println("test")
        }

//        Named Arguments
        fun testNamedArguments(message : String, name : String) {
            println("kocak ${message} and ${name}")
        }

//        Default Parameters Value

        fun testDefaultParameters(message : String = "mantap", name : String = "Kocak"){
            println("kocak ${message} and ${name}")
        }

//        Single Expression
        fun sum(x:Int, y:Int) = x + y

        test()
        testNamedArguments("halo", "bay")
        testDefaultParameters()
        println(sum(3, 4))
    }
}

fun main(args: Array<String>) {
    Functions()
}