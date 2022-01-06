package com.kotlin.program

fun main(args: Array<String>)
{
    var strValue :Boolean =equalCharFrequency("ab", "ba")
    if(strValue){
        println("Both String is equal")
    }else
    {
        println("Both String is not equal")
    }
}

fun equalCharFrequency(str1 : String, str2 : String) : Boolean{
    var charArray1 = str1.toCharArray()
    var charArray2 = str2.toCharArray()
    var setValue1: Set<CharArray> = setOf(charArray1)
    var setValue2: Set<CharArray> = setOf(charArray2)
   // println(setValue1)
    //println(setValue2)
     var str1Value :String = ""
    var str2Value : String = ""
    for(value in setValue1){
        str1Value = str1Value.plus(value)
        println(value)
    }
    //println(str1Value.toString())
    for(value in setValue2){
        str2Value = str2Value.plus(value)
        println(value)
    }
    //println(str2Value.toString())
    if(str1Value.toString().equals(str2Value.toString())){
        return true
    }else
    {
        return false
    }
}

