package com.kotlin.Practice.Programming

fun main(args : Array<String>){

    var car1 = Car()
    var car2 = Car()
    var car3 = Car()
    Car.showCountValue()
}

class  Car{
    companion object{
        var count = 0;
        fun increment(){
            count++
        }

        fun showCountValue(){
            println(" Total count value : ${count}")
        }
    }

    init {
        Car.increment()
    }


}

