package Four_OOP_Properties

class Employe(name: String) : Person(name) {

    override fun sayHello() {
        System.out.println("Hi, I'm " + super.name)
    }

}