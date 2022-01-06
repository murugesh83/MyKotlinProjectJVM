
fun main(arg : Array<String>){

   var sum = add(1,5)

    println("Sum of the number is : "+sum)

    printAddhere(2, 5)

}

//Method return mention data type or Unit is like void no return the value

fun add(a:Int, b:Int):Int{

    return a*b
}

//void method need to give Unit

fun printAddhere(a:Int, b:Int):Unit{

    var sum = a + b;
    println("Sum of the number is : "+sum)
}


