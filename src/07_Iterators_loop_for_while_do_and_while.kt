import java.util.*

fun main(arg : Array<String>){

    //For loop

    for(i in 1..5){

       // println(i)
    }


    //print Even number 1 to 10
    for(i in 1..10){

        //% modular operator
        if(i % 2 == 0) {
         //   println(i)
        }
    }

    //print Odd number 1 to 100
    for (i in 1..100){
        if(i%2 != 0){
         //   println(i)
        }
    }


    var i:Int =1;

    while (i <= 10){
        if(i%2 == 0)
        println(i)
        i++
    }

    var k:Int = 1

    do{
        if(k%2 == 0)
        println(k)
        k++
    }while (k <=10)

    /*var b:Int = 1
    do {
       val read = Scanner(System.`in`)
        b = read.nextInt()
    }while (b > 5)*/
}