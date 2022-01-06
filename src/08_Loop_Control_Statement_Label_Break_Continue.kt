
fun main(arg: Array<String>){


    for (i in 1..10){
        if(i == 5){
            break
        }
        println(i)
    }

    println("**********************")

    for(i in 1..3){
        for (j in 1..3){
            if(i == 2)
            break
             println("$i  $j")
        }
    }

    println("**********************")

    myloop1@ for(i in 1..3){
        for (j in 1..3){
            if(i == 2)
                break@myloop1
            println("$i  $j")
        }
    }

    println("**********************")
    //Continue Statement

    for(i in 1..10){

      if(i == 5){
          continue
      }
            println("$i")

    }

    println("**********************")
   //Continue statement
    myOuterLoop@ for(i in 1..5){
        for (j in 1..5){
            if(i == 2)
                continue@myOuterLoop
            println("$i  $j")
        }
    }

}