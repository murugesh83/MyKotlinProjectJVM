package com.kotlin.program

fun main(args : Array<String>){


    var country = County()
  //  country.name ="USA"
    val i = country.name
    println(country.name)
    //lateinit used only with mutable data type [var]
    //lateinit user only with non-nullable data type
    //lateinit values must be initialised before you use it

}


class County{
    lateinit var name: String
}