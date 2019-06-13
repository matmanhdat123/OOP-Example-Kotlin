package Four_OOP_Properties

class Student(name: String) : Person(name) {

    override fun sayHello() {
        System.out.println("Hi, I'm " + super.name)
    }

}