package com.kotlin.program


fun main(args : Array<String>){

    var personsName = Person("Java");
    personsName.skills = "Java"
    var personName2 = Person("SQL");
    personName2.skills = "SQL"

    personsName.show()
    personName2.show()

    //Infix function is more like general English language, Easy to understand

    var personName3 = personsName Plus1 personName2

    personName3.show()
}


// Infex function allow only one parameter
infix fun Person.Plus1(person: Person) : Person{

    var newPerson = Person("Hello");
    newPerson.skills = this.skills +" and "+ person.skills

    return newPerson
}
