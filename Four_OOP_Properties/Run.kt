package Four_OOP_Properties

import Abstraction_Oop_Example.Cat


object OopDemo {

    @JvmStatic
    fun main(args: Array<String>) {
        val student = Student("Nguyễn Văn A")
        val employe = Employe("Nguyễn Văn B")

        val office = Office()
        office.add(student)
        office.add(employe)
        office.showListAnimal()
    }

}