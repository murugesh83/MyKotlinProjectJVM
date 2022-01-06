package com.kotlin.program

fun main(arg: Array<String>){

    MyClass.count = 20
    println(MyClass.count);
    println(MyClass.typeOfCustomers())
    MyClass.myMethods()

}

class MyClass{

    companion object CustomerData{
        var count : Int = -1

        fun typeOfCustomers() : String {
            return "Indian"
        }
        fun myMethods()
        {
            println("Hello my method")
        }

    }

}