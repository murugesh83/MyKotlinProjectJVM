package com.kotlin.program


fun main(args : Array<String>){

    var personsName = Person("Java");
    personsName.skills = "Java"
    var personName2 = Person("SQL");
    personName2.skills = "SQL"

    personsName.show()
    personName2.show()

    var personName3 = personsName.Plus2(personName2)

    personName3.show()
}


fun Person.Plus2(person: Person) : Person{

    var newPerson = Person("Hello");
    newPerson.skills = this.skills +" and "+ person.skills

    return newPerson
}





