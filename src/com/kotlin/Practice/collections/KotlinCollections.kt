package com.kotlin.Practice.collections

class KotlinCollections {




    fun joinTwoArrayList()
    {
        var arr1 = ArrayList<String>()

    }
}


fun main(args: Array<String>){


    var input = "aabbbbbb"
    var charArr= input.toCharArray()

    var result = ""
    var value = 1
    for(i in 0..charArr.size-1){
        println(charArr[i])
        var str = charArr[i];
        if(i < charArr.size-1) {
            if (charArr[i] != charArr[i + 1]) {
                result = result+ str + value.toString()
                value = 1
            } else {
                value = value + 1
            }
        }
    }

    print("$result")
}