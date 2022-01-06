package com.kotlin.program

import java.io.File


fun main(args : Array<String>){

    val res = "./res"
    val fileName = "myfiles.txt"

    val pFile = File("${res}/${fileName}")

    println(pFile)

    pFile.forEachLine { println(it) }

    val writFile = File("${res}/write.txt")

    writFile.writeText("Koltin = Programming")

    val exists = pFile.exists()
    println(exists)
}