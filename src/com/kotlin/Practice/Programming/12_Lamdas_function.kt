package com.kotlin.Practice.Programming

fun main(){

    val square : (Int) -> Int = {number -> number*2}
    println(square(5))



    val printName : (String) -> Unit = {
        println(it)
    }

    printName("Murugesh")

    val name : (a: String, b: String) -> String ={ name, name1 ->

        name + " "+name1
    }


    println(name("Murugesh", "Sagadevan"))

    val myName : () -> Unit ={
        println("Hello******")
    }

    myName()
}