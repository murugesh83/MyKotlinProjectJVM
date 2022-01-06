import com.kotlin.program.Rectangle

fun main(arg : Array<String>){

    var name = "Muru"

    var st ="Hello $name"

    println("This statement is $st  . The sting length is ${st.length}")

    var a = 10
    var b= 20
    println("The a add b : ${a+b}")

    println("The value is ${a+b}")
    var mRectagle= Rectangle()
    println("The length is : ${+mRectagle.length}")
    println("The breath is : ${mRectagle.breath}")
    println("The length * breath is :${mRectagle.length *mRectagle.breath}")


}

