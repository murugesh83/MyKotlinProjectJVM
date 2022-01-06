
fun main(arg : Array<String>){

    var a= 5
    var b= 2

    var maxValue:Int = if(a > b) {
        println("A is greater")
        a
    }
    else {
        println("B is greatter")
        b
    }

    println("The max value is : ${maxValue}")

    //When as Expression
    //We are using When instread of Switch statement

    var x:Int = 21

    when(x){

        1 -> print("X is 1")
        2 -> print("X is 2")
        3,4 -> print("X is 3 or 4")
        in 5..20  -> print("X is inbetwwen 5 to 20")
        else -> {
            print("X value is unknown")
            print("I do not know x value")
        }

    }

    println()
    var x1:Int = 1

    var str:String = when(x1){

        1 -> "X is 1"
        2 -> "X is 2"
        3,4 -> "X is 3 or 4"
        in 5..20  -> "X is inbetwwen 5 to 20"
        else -> {

            "I do not know x value"
        }
    }

    println(str)
}