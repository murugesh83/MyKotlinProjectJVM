package com.kotlin.program


fun main(arg: Array<String>){

    var a:Int = 10
    var b:Int = 5

    val greaterValue = b.greaterNumberValue(a);

    println(greaterValue)

    val greaterVal = b greaterNumberValue 20;

    println(greaterVal)




}


//Infix function can be a member function or Extension Function
//They have SINGLE Parameter
//They have prefix of 'infix'

//All Infix functions are extension function But all extention function are not Infix
//INFIX funxtion just have ONE Parameter

infix fun Int.greaterNumberValue(a: Int):Any{ //Infix function and also Extension func

    if(this > a)
    return this
    else
        return a

}