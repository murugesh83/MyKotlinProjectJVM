
fun main(arg : Array<String>){

    //Ranges use for while we running for loop

    var r1 = 1..5
    //This range contain the number 1,2,3,4,5

    var rb = 1..5
    var rb1 = 1..5 step 2
    var rb3 = 10.downTo(1) step  2

    for (a in rb3){
        println(a)
    }

    println("$rb3")

    var r2 = 1..5 step 2  //
    //This range contain the number 1,3,5

    var r3 = 5 downTo 1
    //This range contain the number 5,4,3,2,1

    var r4 = 5 downTo 1 step 2
    //This range contain the number 5, 3, 1

    var r5 = 'a'..'z'
    //This range contain the Letters A to Z

    var isPresent = 'c' in r5

    println(isPresent)

    var countDownTo = 10.downTo(1)
    //This range contain the number 10,9,8,7 to 1

    var countMoveUp = 10.rangeTo(1)
    //This range contain the number 1,2,3,4...10
   var str =""
    for (value in r5){
        print(value+",")
        str = str+value;
    }

    /*var str2 ="";
    var length = str.length-1
   for (index in str.indices)
   {
     str2 = str2+str[length]
       length--;
   }

    print("Value revesed : "+str2)*/


    var str1 = "Hello";
    var length = str1.length-1
    for (index in str1.indices)
    {
        print(str1[length-index])
        //length--
    }

    println()
    var myfunction : (Int, Int) -> Int ={a:Int, b:Int -> a+b}

    var result = myfunction(3,5)

    println("${result}")

    var strValue = "Hello"
    for ((i, e) in strValue.withIndex()){
        println("$i   ${strValue.get(i)} ")
    }
}