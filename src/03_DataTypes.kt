
fun main(args : Array<String>){

    var  name : String ="Murugesh"



    var myInt:Int =10
    var myFloat: Float = 10.5F
    var myDecimal: Double = 19.20
    var myBoolean: Boolean = true
    var myChar : Char = 'A'


    println(name)
    println(myFloat)
    println(myDecimal)
    println(myBoolean)
    println(myChar)

    name ="Muru"
    println(name)

    var obj : Any = false
    if(obj is String){
       print("${obj.length}")
    }else
    if(obj is Boolean)
    {
        println("obj is boolean")
    }else

        {
            println("obj is not string")
        }
}