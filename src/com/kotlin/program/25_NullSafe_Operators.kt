package com.kotlin.program

fun main(args: Array<String>){

    //var name: String? = "Murugesh"

    var name: String? = null

    //1. Safe Call  ?.
    println("The length of name is ${name?.length}")

    //2. Safe call with let ( ?.let)
    name?.let {
        println("The length of name is ${name.length}")
    }

    //3. Elvis-operator (?:)
    val length = name?.length ?: -1

    println("The length of name is ${length}")

    //4. Non null assertion operator (!!)
    println("The length of name is ${name!!.length}")




}

