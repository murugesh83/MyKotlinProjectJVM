package com.kotlin.program



 data class Human(var name: String, var age:Int){

}

fun main(args : Array<String>){

    var listObj = listOf<Human>(Human("Muru", 35), Human("Sai", 6), Human("Sanjit", 8))

    for (value in listObj){
        println(value)
    }

}