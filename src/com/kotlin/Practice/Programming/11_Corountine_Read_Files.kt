package com.kotlin.Practice.Programming

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import java.io.File

fun main(args: Array<String>){
    reader()
}


fun reader() = runBlocking {
    val d1 =async { readFile("write.txt") }
    d1.await().forEach{
        if(!it.equals(""))
        println(it)
    }
}

fun readFile(fileName: String): List<String>{
    val file = File("./res/$fileName")
    return file.readLines()
}