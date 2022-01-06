package com.kotlin.program


fun main(arg : Array<String>){
    var personsDetails =PersonsDetails()
    personsDetails.mydetails()
    personsDetails.myDeviceDetails()
}
interface KotlinInterface {
    var name: String
    fun mydetails()
}

interface deviceInterface{
    var deviceName:String
    fun myDeviceDetails()
}

class PersonsDetails : KotlinInterface, deviceInterface{
    override var name: String ="Murugesh"
    override fun mydetails() {
       println("My name is : $name")
    }

    override var deviceName: String = "Samsung"

    override fun myDeviceDetails() {
        println("My device name is : ${deviceName}")
    }


}