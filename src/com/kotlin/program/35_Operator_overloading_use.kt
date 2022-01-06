package com.kotlin.program


fun main(args : Array<String>){

    var personsName = Person("Java");
    personsName.skills = "Java"
    var personName2 = Person("SQL");
    personName2.skills = "SQL"

    personsName.show()
    personName2.show()

    //Operator over loading use the operator
    var personName3 = personsName - personName2

    personName3.show()
}


// Infix function allow only one parameter
operator infix fun Person.minus(person: Person) : Person{

    var newPerson = Person("Hello");
    newPerson.skills = this.skills +" and "+ person.skills

    return newPerson
}
