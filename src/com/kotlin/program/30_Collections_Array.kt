package com.kotlin.program

//Array: Mutable but has fixed size
/*Collections
* Immutable collections : Read only Operations
* 1. Immutable list : listOf
* 2. Immutable Map : mapOf
* 3. Immutable Set : setOf
*
*  Mutable Collections : Read and Write Both
*  Mutable List :  ArrayList, arrayListOf, mutableListOf
*  Mutable Map  :  HashMap, hashMapOf, mutableListOf
*  Mutable Set  :  mutableSetOf, hashSetOf
* */
fun main(args: Array<String>){
    // Elements  0, 0, 0, 0, 0
    //Index      0, 1, 2, 3, 4
    var myArray = Array<Int>(5) {0}
    myArray[0] = 32
    myArray[3] = 54

    println(myArray.size)

    for (index in 0..myArray.size-1){
        myArray[index] = index+5
        println( myArray[index])
    }
      //myArray[8] = 23

   // println(myArray[3])

    /*for(element in myArray){
        println(element)
    }*/



}