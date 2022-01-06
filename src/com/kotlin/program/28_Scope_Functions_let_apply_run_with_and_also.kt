package com.kotlin.program
//with  retrun : lambda result , Context object : this
// if you want to operate on a non-null object


//let   retrun : lambda result , Context object : it
//if you want to just execute lambda expression on a nullable object and avoid NullPointerException


//run  retrun : lambda result , Context object : this
//if you want to operate on a nullable object, execute lambda expression and avoid NullPointerException

//apply  retrun : lambda result , Context object : this
// if you want to initialise or configure an object

//also  retrun : lambda result , Context object : it
//if you want to do some additional object configuration or operations
fun main(args: Array<String>){

    var personObject =PersonObject()
    personObject.name
    personObject.id

    //with
    val idValue: Int =with(personObject){
        println(this.name)
        println(this.id)
        id+5
    }

    println(idValue)
    //apply
    var personObj=PersonObject().apply {
        this.name = "Sanjit and Sai"
        this.id = 85
    }

    println(personObj.name)

//Property 1. Refer to context object by using 'it'
//Property 2. The return value is the 'context object'
    val numbersList : MutableList<Int> = mutableListOf(1,2,3)

   var duplicateNumberslist= numbersList.also {
        //it using instread of numbersList Object
        println("The list element are $it")

        it.add(5)
        println("The list element are after adding $it")

        it.remove(2)
        println("The list element are after removed $it")

    }

    println("Original numbers :$numbersList")
    println("Duplicate Numbers :$duplicateNumberslist")

    //also function we can use if we want to modify the personObject
   val duplicatePerson = personObject.also {
        it.name ="SM Global"
        println("New name is : ${it.name}")
    }


    //Let scope function to avoid null pointer exceptions
    val name:String? = "Hello"

   val stringLength= name.let {
        println(it?.reversed())
        println(it?.capitalize())
        it?.length
   }

    println("The length of the String is: $stringLength")

    //Run scope function to avoid null pointer exception
    //Property 1: Refer to context object by using 'this'
    //property 2: The return value is the 'lambda result'
    // 'run' is combination of 'with' and 'let'
    //if you want to operate on a Nullable object and avoid null pointer exception then use 'run'

   val personObjcets1= personObj?.run {
        println(name)
        println(id)
        id +78
        "Hello"
    }

    println(personObjcets1)



}


class PersonObject{

    var name : String ="Murugesan"
    var id: Int = 78


}


