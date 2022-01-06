package com.kotlin.Practice.Programming

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main(args: Array<String>)
{
    /*val time = measureTimeMillis {
        synchronous()
    }
    println("$time ms")
    val time2 = measureTimeMillis {
        asyncAwait()
    }
    println("$time2 ms")*/

   /* val time3 = measureTimeMillis {
        asyncAwaitWithTimeOutBlock()
    }
    println("$time3 ms")*/

    val time4 = measureTimeMillis {
       cancel()
    }
    println("$time4 ms")
}

suspend  fun longCalc(startNum : Int) :Int{
    delay(1000)
    return startNum +1
}

fun synchronous() = runBlocking {
   val x1 = longCalc(100)
    val x2 = longCalc(200)
    val x3 = longCalc(300)
    val sum = listOf(x1, x2, x3).sum()
     println("Result : $sum")
}


fun asyncAwait() = runBlocking {
    println("Async tasking begining******")
    val x1 = async {  longCalc(100)}
    val x2 = async { longCalc(200) }
    val x3 = async { longCalc(300) }
    val sum = listOf(x1, x2, x3).awaitAll().sum()
    println("Result : $sum")
    println("Async tasking Ending******")
}

fun asyncAwaitWithTimeOutBlock() = runBlocking {
    println("Async tasking begining******")
    val result = withTimeoutOrNull(600L) {
        val x1 = async { longCalc(100) }
        val x2 = async { longCalc(200) }
        val x3 = async { longCalc(300) }
        val sum = listOf(x1, x2, x3).awaitAll().sum()
        println("Result : $sum")
       "finished"
    } ?: "Time out"

    println("Results = $result")
}

fun cancel() = runBlocking {

    val job = launch(Dispatchers.Default) {
        var i=0
        var nextPrintTime = System.currentTimeMillis()

        while (isActive){
            if(System.currentTimeMillis() >= nextPrintTime){
                println("Working for ${i*100} milliseconds ...")
                nextPrintTime += 100L
                i++
            }
        }
        println("Canceled job")
    }
    delay(1000L)
    println("Canceling job")
    job.cancelAndJoin()
    println("done")

}


