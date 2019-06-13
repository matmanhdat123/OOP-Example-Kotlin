package Four_OOP_Properties

import java.util.ArrayList

class Office {

    private val persons = ArrayList<Person>()

    fun add(person: Person) {
        persons.add(person)
    }

    fun remove(person: Person) {
        persons.remove(person)
    }

    fun showListAnimal() {
        for (person in persons) {
            person.sayHello()
        }
    }

}