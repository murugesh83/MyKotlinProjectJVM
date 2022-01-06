package com.kotlin.program

val pi: Float by lazy {3.14f  }
//Some time we will initilize the value but we never use that will be waste of memory
fun main(args : Array<String>)
{
    println("Some initial code.....")

    val area1 = pi *4*4;

    println("Some more code...${area1}")

}