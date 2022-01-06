package com.kotlin.program


fun main(args : Array<String>){


   arrayFunction()

}

fun arrayFunction()
{
    var nums = intArrayOf(10,12, 15, 17)
    nums[1] = 13
    nums.set(1, 24)

   var s= nums.iterator()

    while(s.hasNext()){
        println(s.next())
    }


    for ((i, e) in nums.withIndex()){
        // println(e)
        if(e == 15)
            println("$i  vlaue $e" )
        else
            println("$i" )
    }

    println(nums.last())


    println()
    var num = IntArray(4)

    num.set(0, 50)
    num.set(2, 60)
    num.set(3, 49)
    num.set(1, 34)
   // num.set(5, 65)

    for (value in num){
        println(value)
    }

    var numFloatArray = FloatArray(5)
    numFloatArray.set(0, 50.0F)
    numFloatArray.set(2, 60.0F)
    numFloatArray.set(3, 49.0F)
    numFloatArray.set(1, 34.1F)

    println()
    //String Arrays

    var strArray = arrayOfNulls<String>(5)

    strArray.set(0, "Helo");
    strArray.set(1, "Hello");
    strArray.set(2, "Hi");
    strArray.set(3, "Hey");

    for (value in strArray){
        println(value)
    }




}


