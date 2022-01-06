package com.kotlin.program

fun main(arg: Array<String>){

    var studentObj= Student()

    //Add new function to the class
    //Can "add" function to a class without declaring it
    //The new function added behaves like static
   var passed:Boolean= studentObj.hasPassed(78)

    println("Student passed ${ studentObj.hasPassed(78)}")

    //They can become part of own class
    //For example  Student, Employee etc..
    println("Student passed ${ studentObj.isScholar(95)}")

    var str1:String = "hi"
    var str2:String = "Hello"
    var str3:String = "How are you"

    println("Added there string value : "+str3.add(str1, str2))


    var b:Int = 8

    //Entention function Benefits
    //Reduces code
    //Code is much cleaner and easy to read
    val greaterVal =b.greaterValue(5)

    println("This is the greater value :"+greaterVal)




}

fun Student.isScholar(marks: Int) :Boolean{

    if(marks >76 )
    return true
    else
        return false
}
fun isScholar(marks: Int) :Boolean{

    if(marks >76 )
        return true
    else
        return false
}


class Student()
{

    fun hasPassed(marks: Int) : Boolean{

        if(marks > 10)
            return true
        else
            return false
    }
}

//Kotlin can able to add method to pre define
//but Java can not able to add the method to predefined method
fun String.add(str1:String, str2:String) : String{

    return this+str1 +str2;

}

fun Int.greaterValue(a: Int) : Int{

    if(this > a)
    return this
    else
        return a


}