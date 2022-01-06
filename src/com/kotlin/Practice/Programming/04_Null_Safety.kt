package com.kotlin.Practice.Programming

import kotlinx.coroutines.channels.consumesAll

fun main(args : Array<String>){

   // exampleLetNullCheck()

   // exmapleSafeCallNull()


    var value = "123456".toString()
    var sumValue : Int = 0;
    var productValue : Int =1;
    for (value1 in value){
        println(value1.toString().toInt())
        sumValue = sumValue + value1.toString().toInt()
        productValue = productValue * value1.toString().toInt()
    }

    println(productValue)

}

fun exampleLetNullCheck()
{
    var name : String? = "Kotlin let null check"
    name?.let { println(it) }
    name = null
    name?.let { println("Hello $it") }
    println("$name Hello")
}

fun exmapleSafeCallNull()
{
    var name : String? ="Hello"
    println("Hello ${name?.length}")
    name = null
    println("Hello ${name?.length}")

}