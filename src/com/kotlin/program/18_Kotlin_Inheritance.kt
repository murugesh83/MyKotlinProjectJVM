package com.kotlin.program

fun main(arg: Array<String>){

    println("Sanjit and Sai")

    var aClass = AClass()
    aClass.eat();
    println("Color is :  ${aClass.colorValue}")


    var bClass= BClass();
    bClass.eat();
    bClass.speak()
    println("Color is :  ${bClass.colorValue}")

    var cClass = CClass();
    cClass.doing()
    cClass.eat()
    println("The Color is : "+cClass.colorValue)
}



open class AClass{

    open var colorValue:String ="Blue";

    open fun eat(){
        println("He is eating")
    }
}


class BClass : AClass(){


    fun speak(){
        println("B is speaking")
    }

    override fun eat(){
        println("B is eating")
    }

    override var colorValue:String ="Red"


}


class CClass : AClass(){

    fun doing()
    {
        println("C is doing")
    }

    override fun eat(){
        println("C is eating");
    }

    override var colorValue ="Green"
}

