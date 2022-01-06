import com.kotlin.program.Person

fun main(arg : Array<String>){

    var mNumber = 10;
    var myDecimal = 10.10;

    //Immutable
    var myString =" Hello word"

    var isAlive = true;

    println(mNumber)
    println(myDecimal)
    println(myString)
    println(isAlive)

    var personObj1 = Person1()
    personObj1.display(myString)

    personObj1.myName = "Murugesh"
    personObj1.display(personObj1.myName)

    println("The name of the person is ${personObj1.myName}")

    var personObj = Person("Hello Murugesh")
    personObj.display()

}

class Person1()
{

    var myName : String = ""

    fun display(name : String){
        print(name)
    }
}