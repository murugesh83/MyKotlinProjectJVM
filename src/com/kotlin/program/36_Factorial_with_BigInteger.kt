package com.kotlin.program

import java.math.BigInteger

fun main(args : Array<String>){

    var num = BigInteger("7")

    println(fact(num, BigInteger.ONE));
}

/*
Find Factorials
5 factorial is 5*4*3*2*1

* */

tailrec fun fact(num : BigInteger, result:BigInteger) : BigInteger{

    if(num == BigInteger.ZERO)
        return BigInteger.ONE
else

    return num* fact(num - BigInteger.ONE, num*result)
}