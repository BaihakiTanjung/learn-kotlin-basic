package com.learnkotlinbasic.learnkotlinbasic

class StringTemplates {
    init {
        val name = "Baihaki"
        val stringTemplate = "tulisan gabung ${name}"

        println(stringTemplate)
    }
}

fun main(args: Array<String>){
    StringTemplates()
}