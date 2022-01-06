package com.kotlin.program


fun main(arg : Array<String>){

    var user1= User("muru", 1)
    var user2= User("muru", 1)

    println(user1.toString())
    if(user1 == user2){
        println("Both user equal")
    }else
    {
        println("Both user not equal")
    }

    var newUser = user1.copy(name = "murugesh", id=25)
    println(newUser)
}

//data class deal with data not object
data class User(var name:String, var id:Int ){

}