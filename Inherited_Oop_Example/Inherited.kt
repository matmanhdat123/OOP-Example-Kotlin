package Inherited_Oop_Example

open class Animal {
    fun eat() {
        println("eating...")
    }
}

class Dog : Animal() {
    fun bark() {
        println("barking...")
    }
}

object TestInheritance1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val d = Dog()
        d.bark()
        d.eat()
    }
}
