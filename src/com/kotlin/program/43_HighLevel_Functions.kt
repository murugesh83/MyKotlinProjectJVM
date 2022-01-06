package com.kotlin.program

fun main(args : Array<String>){

    val value =greater("Murugesh")
    println(value)

    val volume = volume(6,2,4)
    println(volume)

    val volumeCal = volumeCalculate(width = 7, height = 6)
    println("Volumes : $volumeCal")

}

/*fun greater(name : String){

    println("Hello $name")
}
*/

fun greater(name : String) =  "Hello $name"


fun volume(lenght : Int, width : Int, height : Int = 10) = lenght * width * height

fun volumeCalculate(length : Int = 10, width : Int, height : Int) = length * width * height



