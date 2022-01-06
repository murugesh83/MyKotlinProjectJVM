package com.kotlin.Practice.Programming

fun main(args: Array<String>){

    var circle = Shape.Circle(4.5f)
    var square = Shape.Square(4)
    var rectangle = Shape.Rectangle(4,5)

    eval(circle)
    eval(square)
    eval(rectangle)

    var low = Volume.Low(5)
    var  medium = Volume.Medium(45)
    var high = Volume.High(70)

    volumeEval(low)
    volumeEval(medium)
    volumeEval(high)
}


sealed class Shape()
{
    class Circle(var radius : Float) : Shape()
    class Square(var lenghtShape : Int) : Shape()
    class Rectangle(var lengthRect : Int, var breadth : Int ) : Shape()
}

fun eval(e: Shape){
    when(e){
        is Shape.Circle -> println("Circle area is ${3.14*e.radius*e.radius}")
        is Shape.Square -> println("Square area is ${e.lenghtShape * e.lenghtShape}")
        is Shape.Rectangle -> println("Rectangle area is ${e.lengthRect * e.breadth}")
    }
}

sealed class Volume()
{
    class Low(var value : Int) : Volume()
    class Medium(var value : Int) : Volume()
    class High(var value : Int) : Volume()
}

fun volumeEval(ve : Volume) {
    when (ve) {
        is Volume.Low -> println("The Volume adjusted to low")
        is Volume.Medium -> println("The volume adjusted to medium")
        is Volume.High -> println("The volume adjusted to Hihg")
    }
}

enum class respose()
{
   SUCCESS,
    FAILURE
}


