package com.kotlin.program


/* filter : Filter our desired elements from a Collection
   map : Perform operation, modify elements

   Predicates: Or a condition that returns TRUE or FALSE
* */

fun main(args: Array<String>){
    val myNumbers: List<Int> = listOf(2,3,4,6,23,90)
    for(value in myNumbers){
        println(value)
    }
    println()
    val mySmallNums = myNumbers.filter{ it < 10}  //or { v -> v <10 }
    for (value in mySmallNums)
    {
        println(value)
    }


    println()
    val mySquaredNums =myNumbers.map{it * it} ///or { num -> num *num }

    for (value in mySquaredNums){
        println(value)
    }

    println()

    val mySmallSquaredNums = myNumbers.filter { it < 6 }.map { it * it }
    for (value in mySmallSquaredNums){
        println(value)
    }

    println()
    var people = listOf<PersonObj>(PersonObj(10, "Murugesh"), PersonObj(20, "Sanjit"), PersonObj(30, "Sai Sarvesh"))
    // using map get all the personobj name
    var name = people.map { it.name }
    println(name)

    for (value in name){
        println(value)
    }

    println()
    // using filter get only start with 's' char
    var nameStartWithS = people.filter { it.name.startsWith('S') }.map { it.name }

    for(name in nameStartWithS){
        println(name)
    }

}

class PersonObj(var age:Int, var name:String){

}