package com.kotlin.Practice.Programming

import kotlin.concurrent.thread

fun rollDice(
    range : IntRange,
    time : Int,
    callBack : (result : Int) -> Unit
){

    for (i in 0 until  time){
        val result = range.random()
        callBack(result)
    }
}

fun rollDice(callBack: (result: Int) -> Unit) : String{
    thread {
        Thread.sleep(3000)
        callBack(4)
    }
    return "Murugesh"
}
fun main(){
    rollDice(1..6, 4, {result ->
        println(result)
    })
    val result = rollDice {
        println(it)
    }
    println(result)

    val make : (String, String) -> String ={realName, HeroName ->"$realName is now $HeroName"}
    makeMyHero("Tony Stark", "Iron man", make)

    makeMyHero("Tony Stark", "Iron man", {realName, HeroName -> "$realName is now $HeroName"})
    makeMyHero("Tony Stark", "Iron man"){
        a, b -> "$a is now $b"
    }
}

fun makeMyHero(realName : String , HeroName: String, make : (String, String)-> String){
    val result = make(realName, HeroName)
    println(result)
}



