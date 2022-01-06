package com.kotlin.Practice.GenericsKotlin

data class Course(val name: String)

class SampleTest<T> (private val list: List<T>) {

    fun oddItem() : List<T>{

        return  list.filterIndexed{index, _-> index%2 == 1}
    }
}

fun main(args : Array<String>){
    val listOfString = listOf<String>("Kotlin", "Java","C","C++", "Python")

    val resultOfString : SampleTest<String> = SampleTest(listOfString)

    println(resultOfString.oddItem())


    val listOfInteger = listOf<Int>(4,3,2,4,5,6,4)

    val resultOfInteger : SampleTest<Int> = SampleTest(listOfInteger)

    println(resultOfInteger.oddItem())


    val courses = listOf(Course("Kotlin"), Course("Java"),Course("C"),Course("C++"), Course("Python"))

    val resultCourses = SampleTest(courses).oddItem()
    print(resultCourses)
}