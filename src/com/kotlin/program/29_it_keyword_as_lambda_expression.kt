package com.kotlin.program

fun main(args: Array<String>){

    val programResult = ProgramResult()

   // programResult.reverseAndDisplay("Hello", { s -> s.reversed() )
    //it keyword acceptable only when we have only one parameter
    programResult.reverseAndDisplay("Hello", {it.reversed()})
}

class ProgramResult{


    fun reverseAndDisplay(str: String, myFunc: (String) -> String){
        var result = myFunc(str)
        println(result)
    }

}