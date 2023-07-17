package com.learnkotlinbasic.learnkotlinbasic

class NullSafety {
    init {
//        var neverNull : String = "Test Kosong"
//
//        neverNull = null

//        println(neverNull)

        var neverNull2 : String? = "Test Kosong"

        neverNull2 = null

        println(neverNull2)
    }
}

fun main(args: Array<String>) {
    NullSafety()
}