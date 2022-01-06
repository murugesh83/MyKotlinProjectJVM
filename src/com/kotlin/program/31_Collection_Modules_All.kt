package com.kotlin.program

fun main(args: Array<String>){

    //Immutable in nature and fixed size,
    var listValue = listOf<String>("Yogi", "Manmohan", "Vajpayee")

    for (element in listValue){
        println(listValue)
    }

    println()

    for (index in 0..listValue.size-1){
        println(listValue[index])
    }

    //MutabeListOf  you can change the list if you use mutabelListOf
    var mutableListValue = mutableListOf<String>("Yogi", "Manmohan", "Vajpayee")

    /*for (element in mutableListValue){
        println(mutableListValue)
    }*/
    println()
    for (index in 0..mutableListValue.size-1){
        println(mutableListValue[index])
    }

    println()
    mutableListValue.add("Added Yogi")
    for (index in 0..mutableListValue.size-1){
        println(mutableListValue[index])
    }

    //ArrayList  you can change the list if you use mutabelListOf
    var arrayListValue = ArrayList<String>()
    //or use below
    // var arrayListOfValue = arrayListOf<String>()

    arrayListValue.add("Murugesan")
    arrayListValue.add("Sanjit")
    arrayListValue.add("Sai")
    arrayListValue.add("Anbu")





    println()
    for (index in 0..arrayListValue.size-1){
        println(arrayListValue[index])
    }

    println()
    arrayListValue.add("Murugesan")
    for (index in 0..arrayListValue.size-1){
        println(arrayListValue[index])
    }


    //Map
    var myMap = mapOf<Int, String>(1 to "Yogi", 2 to "Manmohan", 3 to "Vajpayee")
    for (element in myMap.keys){
        println("Key : ${element} Value : ${myMap[element]}")
    }

    println()

    var myHashMap = HashMap<Int, String>()
     //var myHashMap = mutableMapOf<Int, String>()
    //var myHashMap = hashMapOf<Int, String>()
    myHashMap.put(1, "Yogi")
    myHashMap.put(2, "Manmohan")
    myHashMap.put(3, "Vajpayee")

    myHashMap.put(3, "Vajpayee1")

    for (element in myHashMap.keys){
        println("Key : ${element} Value : ${myHashMap[element]}")
    }


    //set
   // "Set" contains unique elements
    // "HashSet"  also contain unique element but sequence is not guaranteed in output
    var setValue = setOf<Int>(1,2,3,3,4,4)

    println()
    for (element in setValue){
        println(element)
    }

    var hashSetValue = hashSetOf<Int>()
    hashSetValue.add(2)
    hashSetValue.add(0)
    hashSetValue.add(5)
    hashSetValue.add(4)
    hashSetValue.add(19)
    hashSetValue.add(25)
    hashSetValue.add(5)






    println()
    for (element in hashSetValue){
        println(element)
    }


    var mutableSetValue = mutableSetOf<Int>()
    mutableSetValue.add(2)
    mutableSetValue.add(0)
    mutableSetValue.add(5)
    mutableSetValue.add(4)
    mutableSetValue.add(19)
    mutableSetValue.add(25)
    mutableSetValue.add(5)


    println()
    for (element in mutableSetValue){
        println(element)
    }

}


fun removeItemFromList()
{
    var list = mutableListOf<Int>(1,2,3,4,5,5)
    for (l in list){
        println(l)
    }
}