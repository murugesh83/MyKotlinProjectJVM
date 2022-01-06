package com.kotlin.Practice.Programming


fun main(args : Array<String>){

    var list = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    val num = list.filter { it >7 }

    println(num)

    println()

    val numList = list.filter( fun(a : Int) :Boolean {return  a > 7})

    println(numList)
    println()

    val getAge2 = Lamda@{
        age : Int ->
        if(age >= 65)
            return@Lamda "senior discount"
        else if(age >= 21)
            return@Lamda "regular"
        "Underage"
    }

    println("Client pays ${getAge2(32)} price")

    println()

    val getAgeDetails = fun(age :Int): String{
        if(age >= 65)
            return "senior discount"
        else if(age >= 21)
            return "regular"
        else
        return "Underage"
    }

    println("Client pays ${getAgeDetails(32)} price")

    println()
}