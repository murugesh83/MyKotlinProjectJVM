package com.kotlin.program


fun main(args : Array<String>){
    var list = listOf<Int>(8,5,6,6,7,7)

    var evens = list.filter { it%2 ==0 }
    for (value in evens) {
        println(value)
    }

    var greater = list.filter { it>=5 }
    for (value in greater) {
        println(value)
    }

    var mappingEvenNumber = list.filter { it%2==0 }.map { it*2 }
    for (value in mappingEvenNumber) {
        println(value)
    }


}