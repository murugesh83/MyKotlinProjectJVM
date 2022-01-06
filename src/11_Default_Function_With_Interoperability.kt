


fun main(arg: Array<String>){

    var result = findValue(2, 5)

    println("The find value of the result : $result")

    result = findValue(2, 3, 5)

    println("The find value of the result : $result")
}

fun findValue(length:Int, breath:Int, height:Int = 10) : Int{

    return length*breath*height

}