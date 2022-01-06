package com.Sample.Shape

import java.sql.SQLClientInfoException


interface Shape {
    fun calculateShape() : Float
}


fun main(args : Array<String>){
    var circle = Circle();

    var shapeObject : Shape
    shapeObject = circle
    checkShape(shapeObject)

    var square= Square()
    shapeObject = square
    checkShape(shapeObject)

    val rectangle = Rectangle()
    shapeObject = rectangle
    checkShape(shapeObject)

    //it is unsafe cast
    var otherShapeObject = shapeObject as Circle


    var nullOtherShareObject1 : Circle? = shapeObject as Circle?

    //it is safe cast if not possible to cast then assign value null to object
    var nullOtherShareObject : Circle? = shapeObject as? Circle?
}

fun checkShape(shapeObject : Shape)
{
    when(shapeObject) {
        is Circle -> shapeObject.radius = 3.0f
        is Square -> shapeObject.sideLength = 4.0f
        is Rectangle -> {
            shapeObject.length = 4.0f
            shapeObject.breadth = 5.0f
        }
        else -> println("Unidentified type")
    }
        if(shapeObject is Circle){
        println(shapeObject.calculateShape())
    }

    if(shapeObject is Square){
        println(shapeObject.calculateShape())
    }

    if(shapeObject is Rectangle){
        println(shapeObject.calculateShape())
    }

}
class Circle : Shape
{
    var radius : Float = 10.3f
    override fun calculateShape(): Float {
        return (22 * radius * radius) / 7
    }
}

class Square : Shape{
    var sideLength: Float = 10.0f
    override fun calculateShape(): Float {
        return sideLength * sideLength
    }

}

class Rectangle : Shape{
    var length : Float = 10.0f
    var breadth : Float = 5.0f
    override fun calculateShape(): Float {

        return  length * breadth;
    }

}
