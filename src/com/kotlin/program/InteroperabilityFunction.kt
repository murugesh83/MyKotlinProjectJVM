@file:JvmName("MyCustomKotlinName")
package com.kotlin.program

import com.java.program.Interoperability

// You can call Java functions into Kotlin and Kotlin functions into Java
// You can have JAVA and KOTLIN files within the same project

fun main(arg: Array<String>){


     var addedNo= addNumber(4, 4);
    println(addedNo)

    Interoperability.getNumber(4 , 4)

    var result = findValue(2, 5)

    println("The find value of the result : "+result)

    result = findValue(2, 3, 5)

    println("The find value of the result : "+result)

    //Function as Named parameters
    result = findValue(length = 2, height = 5, breath = 3)

    println("The find value of the result : "+result)
}


fun addNumber(a:Int, b:Int):Int{

    return a+b
}

@JvmOverloads
fun findValue(length:Int, breath:Int, height:Int = 10) : Int{

    println(length)
    println(breath)
    println(height)
    return length*breath*height

}