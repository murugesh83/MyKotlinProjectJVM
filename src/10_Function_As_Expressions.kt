

fun main(arg : Array<String>)
{

    var maxV = max(4, 3)

    println("The max value is : $maxV")

    var maximumValue = maximum(4, 3)

    println("The max value is : $maximumValue")

    var maximum = printMax(4, 3)

    println("The max value is : $maximum")

    var maximumAsaExpression = printMaximumAsAExpression(4, 3)

    println("The max value is : $maximumAsaExpression")
}

fun max(a:Int, b:Int) : Int{

    if(a > b)
        return  a
    else
        return b

}


fun maximum(a:Int, b:Int) : Int =  if(a > b) a else b


//Expression more than one statment
fun printMax(a:Int, b:Int) : Int{

    if(a>b)
    {
        println("A is greater")
        return a
    }else
    {
        println("B is greater")
        return b
    }
}


//Expression more than one statment
fun printMaximumAsAExpression(a:Int, b:Int) : Int =
        if(a>b)
       {
        println("A is greater")
         a
       }else
       {
        println("B is greater")
         b
           78
       }


