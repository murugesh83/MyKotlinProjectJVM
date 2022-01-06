package com.kotlin.Practice.Programming

data class  Book(val name: String, val age: Int)

fun main(args: Array<String>){

    val book = Book("Murugesan", 36)
    val (n, a) = book
    println(n)
    println(a)
}
