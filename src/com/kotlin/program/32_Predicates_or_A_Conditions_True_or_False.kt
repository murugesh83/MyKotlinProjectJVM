package com.kotlin.program


fun main(args: Array<String>){

    val numbers = listOf<Int>(2,3,4,55, 46, 100)

    for (value1 in numbers){
        println(value1)
    }

    println()

    val check1 = numbers.all { it > 10 }
    println(check1)

    println()

    val check2 = numbers.any { it > 10 }
    println(check2)

    println()
    val totalCount: Int = numbers.count { it > 10 }
    println(totalCount)

    println()

    val num = numbers.find { it > 10 }
    println(num)

    println()

    val myPredicate = {num:Int -> num >10}
    val check12 = numbers.all(myPredicate)
    println(check12)

    val check22 = numbers.any(myPredicate)
    println(check22)

    println()
    val totalCount2: Int = numbers.count(myPredicate)
    println(totalCount2)

    println()

    val num1 = numbers.find(myPredicate)
    println(num1)




}