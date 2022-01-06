package com.kotlin.program;


fun main(arr : Array<String>){

    var list = mutableListOf<Int>(1,34,4,2,1,1)

    var setList = list.toSet()

    for (l in setList){
        println(l)
    }
}