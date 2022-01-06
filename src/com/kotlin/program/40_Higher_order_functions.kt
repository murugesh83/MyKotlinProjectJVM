package com.kotlin.program

import java.util.function.Consumer


class Human1
{

}
fun main(args : Array<String>){

    var list= listOf<Int>(4,43,345,4,5,7)

   /* var con : Consumer<Int> = object : Consumer<Int>{
        override fun accept(t: Int) {
            println(t)
        }
    }*/
    list.forEach({ println(it) });

    println()
    // or use this  High order function
    list.forEach(({n -> println(n)}))

    //or

    println()

    list.forEach(::println)
}