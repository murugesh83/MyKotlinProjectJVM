package com.kotlin.program

/*
High level functions and Lambdas
1. Introduction : Small Demo
  Using object oriencted way : Interface
  Using High Level function
  Using Lambdas

2. Lambdas and high Level Functions
  Explanation
  Demo

  High level functions

  Can accept function as parameters
  Can return a Function
  or Can do both

  Lambdas
   It is just a Function with no name

*/


fun main(args: Array<String>){
    var mProgram = Program()

    mProgram.addTwoNumbers(3, 4)
    mProgram.addTwoNumbers(7, 3, object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }

    })

    val test : String ="Hello"
    val myLambda: (Int)-> Unit = {s :Int -> println(s)} // Lambda Expression [Function]

    mProgram.addTwoNumbers(3, 4, myLambda)
}

class Program{

    fun addTwoNumbers(a: Int, b: Int , action : (Int) -> Unit){   //High level function with lambdas way.... just adding two numbers
        val sum = a + b
        action(sum)

    }

    fun addTwoNumbers(a: Int, b: Int, action:MyInterface){   //Using Interface way.... just adding two numbers
        val sum = a + b
        action.execute(sum)

    }

    fun addTwoNumbers(a: Int, b: Int){   //Simple way.... just adding two numbers
        val sum = a + b
        println(sum)
    }
}

//interface is listner
interface MyInterface{
    fun execute(sum: Int)
}