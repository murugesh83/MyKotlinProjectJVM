package com.kotlin.program


fun main(arg : Array<String>){

    var device = MyDevice("ABCD");
    device.myFuction()
    device.myDeviceDetails()
    device.myPhoneNumber()
    println("Device details : ${device.id}")

}
abstract class KotlinAbstarct{

    var name:String ="Samsung"
    abstract  var id:Int
    abstract  fun myPhoneNumber();
    fun myDeviceDetails(){
        println("This is my device details")
    }

}


class MyDevice(var deviceModel:String) : KotlinAbstarct(){

    init {
        println("Device model details : ${deviceModel}")
    }

    fun myFuction(){
        println("The device name is : $name")
    }

    override var id: Int = 10


    override fun myPhoneNumber() {
       println("This is my Phone number details")
    }

}