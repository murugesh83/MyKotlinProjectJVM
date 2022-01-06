package com.kotlin.program

fun main(arg: Array<String>){

    var student= StudentClassSecondary("Murugesh", 10)

    print(student.id)
}


class StudentClassSecondary(var name: String){

    var id:Int =-1;
    init{
        println("Student has got a name as $name ")
    }


    //Secondary constructor not allowed var , val keyword
    //Seondary constructor have own body



    constructor( name: String, id:Int): this(name){
        //The body of the secondary constuctor is called after the init block

           this.id =id;

    }
}