package com.Sample.Shape

import java.util.*

class GetterSetter {

    var input : Int

    get(){
       if(input > 5){
           print("This is good book")
       }
        return input
    }
    set(value){
        input = value
    }

    var input1 : String

        get(){
            return input1
        }
        set(value){
            input1 = value
        }

}

fun main(args : Array<String>){
    var book = GetterSetter()
   // book.input = 8

    var str1 : String ="123456";
    var str2 : Int = 123456

     var charArray= str2.toString()
    for (value in str1){
       // println(value)
    }

    for (value in charArray){
         //println(value.toString().toInt())
    }

    val a = 12
    val b = 13

    var max: Int

    max = if (a > b) a else b
    println("$max")

    var str3 = Scanner(System.`in`)

    val str4 =str3.nextLong()


}