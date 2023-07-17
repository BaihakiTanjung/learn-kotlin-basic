package com.learnkotlinbasic.learnkotlinbasic

class Collections {
    init {

//        With List
//        Read Only List
        val testArray = listOf<String>("test1", "test2", "test3")
//        Mutable List
        val testMutableArray: MutableList<String> = mutableListOf("test1", "test2", "test3")


//        println(testArray.first())
//        println(testArray.last())
//        println(testArray.count())
//        println(testMutableArray.add("kocak1"))
//        println(testMutableArray.remove("test1"))
//        println(testArray)
//        println(testMutableArray)

//        With Set
//        Read Only Set
        val testArraySet = setOf<Int>(1,2,3,)
//        Mutable Set
        val testArrayMutableSet :  MutableSet<Int> = mutableSetOf(1,2,3)

        testArrayMutableSet.add(4)

        println(testArraySet)
        println(testArrayMutableSet)


//        With Map
        val testArrayMap = mapOf(1 to 100)

        val testMutableMap : MutableMap<Int, Int> = mutableMapOf(1 to 100)

        println(testArrayMap)
        println(testMutableMap)

    }
}

fun main(args: Array<String>){
    Collections()
}