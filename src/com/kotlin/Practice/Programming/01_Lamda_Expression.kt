package com.kotlin.Practice.Programming

import com.kotlin.program.age

fun main(args : Array<String>)
{
  // var lamda1 = lamdaExmaple1()
  // lamdaExample2()
   // lamdaExample3()

    //Example4()

    //lamdaExmaple5()

    //lamdaExample6()
    //lamdaExmaple7()

    lamdaExample7()
}


fun lamdaExmaple1()
{
    var greating = { println("Hellow")}
    greating()
}

fun lamdaExample2()
{

    var sum = {a : Int , b :Int -> a + b}

    val result = sum(3,4)

    println(result)
}

data class Cats(val age : Int, val name: String)


fun lamdaExample3()
{

   val cats = listOf(Cats(3,"Hello"),
       Cats(3,"Hello"),
       Cats(4,"Hello1"),
       Cats(34,"Hello2"),
       Cats(5,"Hello3"),
       Cats(36,"Hello4"),
       Cats(5,"Hello6")
   )

    var oldestCat = cats.maxBy { cats -> cats.age }

    println("the Cat name is : ${oldestCat?.name}")

    var oldestCat1 = cats.maxBy { it.age }

    println("the Cat name is : ${oldestCat1?.name}")

    var  cats1 =cats.indexOf(Cats(3, "Hello"))
    println(cats1)
}



fun Example4()
{

    //with type annotation in lamda expression
    val sum1 ={a : Int, b: Int -> a+b}

    //without type annotation in lamda expression
    val sum2 :(Int, Int)-> Int = {a , b -> a+b}

    val summ3 : (String, String) -> String = {str, str2 -> str + str2}

    println(sum1(5,6))
    println(sum2(5,4))

}

val sum1 = {x :Int, y : Int ->
    print("Hello ")
    print("X + Y value is : ")
    x+y
}
fun lamdaExmaple5()
{
    println(sum1(6,7))
    var a  =3
    var b = 4
    val lambda1: (Int) -> Int = {  a -> a * a}
    val lambda2: (String,String) -> String = { a , b -> a + b }
    val lambda3: (Int)-> Unit = {print(b)}

    println(lambda1(a))
    println(lambda2("Sanjit", " Sai"))
    lambda3(b)

}

//Lamdas can be used as class extension

fun lamdaExample6()
{
    val lamda1 : String.(Int) -> String = {this+ " Hello" + it}

    val result = "Greeks".lamda1(10)
    println(result)
}

//Kotlin program using shorthand form of lamda expression
fun lamdaExmaple7()
{
    val list = arrayOf(23,54,5,67,7,8)

    for (value in list){
        print("$value, ")
    }

    println()

    val reversedList : List<Int> = list.reversed();
    for (value in reversedList){
     print("$value, ")
    }
    println()

    println("${list.reversed()}")

    val listFilter = list.filter { list -> list > 50 }
    println()
    println(listFilter)

}

val find = fun(num : Int) : String {
    println(num % 2)
    if(num % 2 == 0 && num < 0){
        return  "Number is even and negative"
    }else if (num %2 ==0 && num >0){
        return "Number is even and positive"
    }
    else if(num %2 !=0 && num < 0){
        return "Number is odd and negative"
    }
    else {
        return "Number is odd and positive"
    }
}
fun lamdaExample7()
{
   println(find(14))
}
