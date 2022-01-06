package com.kotlin.program


fun main(arg: Array<String>){

    var student= StudentClass("Muru")

    //student.name ="Sriyank"

    //println("Student Name is ** ${student.name}");

}
//Property Field Variables in Java
//Primary Contstuctors
// Init Block
//Primary Constuctor with Property
//Primary Constuctor with just Parameters

class StudentClass(var mName: String){


   // var name:String = "dummy"

    init{
      //  this.name = mName;
        println("Student Name is ${mName}");
    }


}


