package com.kotlin.program

//What is Singleton?
//Singleton : When we have just ONE INSTANCE of a class in the whole application
//Meaning : if class Student is declared Singleton then we cannot create objects for this class
//There exists only one object for this class by default
//And we cannot create objects like student1, student2 etc

//In Java, we define SINGLETON, by using keyword "static" varibles and methods

//In Kotlin we cannot declare "static" variables and methods
//So we have alternative to that
//Declare "Object"
//This create

//When we use keyword 'object'
//kotlin internally, create a class and object/instace

//These objects
//Can have properties, methods and initializers
//Can not constuctors
//As we cann't create object/instance manually
//Object can also have super class
//Supports Inheritance

fun main(arg: Array<String>){

CustomerData.count = 98
CustomerData.typeOfCustomer();
    println("Customer count ${CustomerData.count}")

    println("Customer Name : ${CustomerData.typeOfCustomer()}")

    CustomerData.myMethod("Hello")

}

open class MySuperClass{
    open fun myMethod(str: String){
        println("MySuperClass ${str}")
    }
}

object CustomerData : MySuperClass(){
    var count:Int = 1

    fun typeOfCustomer(): String{
        return "Indian"
    }

    override fun myMethod(str: String) {
        super.myMethod(str)
        println("Object Customerdata : ${str}");
    }


}


