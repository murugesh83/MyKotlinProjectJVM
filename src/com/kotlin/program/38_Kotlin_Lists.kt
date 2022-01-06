package com.kotlin.program


fun main(args : Array<String>){

    listExecise();
}

fun listExecise(){
    var list = listOf<Int>(8,5,6,6,7,7)

    for (value in list){
        //println(value)
    }

    println()

   // println(list.get(0))

    /*Mutable List of */

    var listMutable = mutableListOf<Int>(8,5,6,6,7,7)

    for (value in 6..10) {
        listMutable.add(value)
    }

    for (value in listMutable){
        println(value)
    }

}