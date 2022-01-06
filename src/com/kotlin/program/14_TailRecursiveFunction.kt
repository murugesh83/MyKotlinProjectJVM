package com.kotlin.program

import java.math.BigInteger


    fun main(arg : Array<String> ){
    println(getFabonacciNumber(10, BigInteger("1"),BigInteger("0")))
}

//user Recursion in optimised way
//Recursion function is a call inside their own function
//Prevent Stack Overflow exception
//Prefix of 'tailrec' is used

//Fabonacci Series
//0,1,1,2,3,5,8,13,21....

tailrec fun getFabonacciNumber(n:Int, a:BigInteger, b:BigInteger) : BigInteger {

    if(n == 0)
        return  b;
    else
        return getFabonacciNumber(n-1, a+b, a)

}


