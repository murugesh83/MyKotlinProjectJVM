package com.Sample.Shape

import kotlinx.coroutines.selects.select
import java.util.*

class CodePractice {


}

fun main(args : Array<String>){

    var arr =  Array<Int>(5){0}

    for (value in arr){
        //print(value)
    }

    var arrList = listOf<Int>(2,3,4,0, 0,0,5,6,4,6,4);

    /*var arrList1 =  Array<Int>(arrList.size){0}

    for ((i, e) in arrList.withIndex()){
        if(!arrList1.contains(arrList[i])){
            arrList1[i] = arrList[i];
        }
    }

    for (e in arrList1){
        print("$e, ")
    }
*/

    var mutableArrayList = mutableListOf<Int>(2,3,4,0,0,0,5,6,0,4,4)
    var tempMutableArrayList = mutableListOf<Int>();

   /* var count = 0;
    for ((i, e) in mutableArrayList.withIndex())
    {
        if(mutableArrayList[i] != 0){
            var temp = mutableArrayList[count]
            mutableArrayList[count] = mutableArrayList[i];
            mutableArrayList[i] = temp;
            count = count + 1;
           // print(mutableArrayList[count])
            //tempMutableArrayList.add(mutableArrayList[i])
        }
    }

   print(Arrays.asList(mutableArrayList))*/

    /*var countZero = 0;
    for ((i, e) in mutableArrayList.withIndex())
    {
        if(mutableArrayList[i] != 0){
            // print(mutableArrayList[count])
            tempMutableArrayList.add(mutableArrayList[i])
        }else
        {
            countZero = countZero + 1
        }
    }

    for (i in 1..countZero){
        tempMutableArrayList.add(0)
    }*/
    //mutableArrayList.sort()
    //print(Arrays.asList(mutableArrayList))
    var k =0;
    for (i in mutableArrayList.indices){
        for (j in mutableArrayList.indices)
        {
             k= j+1;
            if(k < mutableArrayList.size) {
              //  println("${mutableArrayList.get(i)}    ${mutableArrayList.get(k)}")
                if (mutableArrayList.get(i) < mutableArrayList.get(k)) {

                    val temp = mutableArrayList[i];
                    mutableArrayList[i] = mutableArrayList[k]
                    mutableArrayList[k] = temp
                }
            }

        }
        println("**********")
    }

    print(Arrays.asList(mutableArrayList))

    var num = 6;

    var result =1;

    if(num == 1) {
        //Find Factorials
        result = 1
    }else {
      //  print("result ")
        for (i in 1..6) {
            result = result * i;
        }
    }
  //  print(result)



    val array= arrayOf(10,20,30,40,50,60,70)

    println("Indices: "+array.indices) // output: Indices: 0..6
    array.forEach { println(it) }

    val products = arrayOf(Product("iPhone 8 Plus 64G", 850.00),
        Product("iPhone 8 Plus 256G", 1100.00),
        Product("Apple iPod touch 16GB", 246.00),
        Product("Apple iPod Nano 16GB", 234.75),
        Product("iPad Pro 9.7-inch 32 GB", 474.98),
        Product("iPad Pro 9.7-inch 128G", 574.99),
        Product("Apple 42mm Smart Watch", 284.93))


    products.sortBy({selector(it)})

    products.forEach { println(it) }
}

data class Product(val name: String, val price: Double /*USD*/)

fun selector(p: Product): Double = p.price