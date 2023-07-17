package com.learnkotlinbasic.learnkotlinbasic

class Variables {
    init {
        println("Variables")

        // Variables
        // Immutable
        val test = "test"
        // Mutable
        var test1 = "test1"

        test1 = "kocak1"

        println(test)
        println(test1)
    }
}

fun main(args: Array<String>) {
    Variables()
}