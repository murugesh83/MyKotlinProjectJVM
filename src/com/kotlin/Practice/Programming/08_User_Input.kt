package com.kotlin.Practice.Programming

fun main(args : Array<String>){

    val name = mutableListOf<String>()

    do {
        println("Enter your Input name : ")
        val str = readLine();
        if (str.isNullOrEmpty())
            break

        name.add(str.toString())

    }while (true)

    println(name)

    println("Enter your Integer value : ")

    val string1 = readLine() ?: ""
    val value :Int = string1.toIntOrNull() ?: 0

    println("${value+40}")


}