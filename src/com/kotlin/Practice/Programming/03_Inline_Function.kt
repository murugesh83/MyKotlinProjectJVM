package com.kotlin.Practice.Programming

/*Inline functions are used to save us memory overhead by preventing object
allocations for the anonymous functions/lambda expressions called. Instead,
it provides that functions body to the function that calls it at runtime.
This increases the bytecode size slightly but saves us a lot of memory.*/


fun main(args : Array<String>)
{

    val result =inLineFunctionExample({println("Hello")},{ println("Another Hello")})

    println("The value is $result")

    var name :String ="Inline Function"

    for (value in name){
        println(value)
    }

    val arrList = arrayOf(1,2,3,4,5,5,6)
    for (arr in arrList){
        print("$arr,")
    }
    println()
    var list =arrList.reversed()
    for (i in list) {
        print("$i, ")
    }
    println()
    val setList = arrList.toSet()

    for (setValue in setList){
        print("${setValue}, ")
    }
}

inline fun inLineFunctionExample(myFunction: () -> Unit, myAnotherFunction : () -> Unit ) :Int{
    myFunction()
    myAnotherFunction()
    println("It's a nice")
    return 10
}