package SOLID.SingleResponsibilityPrinciple;

abstract class Employee (private val firstName: String, private val lastName: String) {

    abstract fun earnings(): Double

    fun getInfoEmploye(): String {
        return firstName+" "+lastName
    }
}

class Programmer(firstName: String, lastName: String) : Employee(firstName, lastName) {

    override fun earnings(): Double {
        //Los ingresos del programador
        return 1000.0
    }

}

class Tester(firstName: String, lastName: String) : Employee(firstName, lastName) {

    override fun earnings(): Double {
        //Los ingresos del tester
        return 2000.0
    }
}

fun main(){
    val programmer = Programmer("Felipe", "Triana")
    println(programmer.getInfoEmploye())
    println(programmer.earnings())
    val tester = Tester("Luis", "Spinetta")
    println(tester.getInfoEmploye())
    println(tester.earnings())
}