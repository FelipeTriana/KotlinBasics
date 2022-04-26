/**
 * Liskov Sustitution Principle
 */
/* Un humano no puede volar, por lo que la operacion volar debería ser abierta y al nosotros
   implementarla en un humano no podríamos darle un comportamiento concreto.
 * Cuando no se cumple el principio de sustitucion de Liskov tampoco se cumple el Open Closed
 */

package SOLID.LiskovSustitutionPrinciple

abstract class Creature {

    fun move(){
        println("Moviendose")
    }

    open fun fly(){
        println("Volando")
    }

    fun swim(){
        println("Swim")
    }

}

class Human: Creature(){
    override fun fly(){
        //No puede volar
    }
}

class Bird: Creature(){}

class Fish: Creature(){}

fun main(){
    val human = Human()
    human.move()
    human.fly()

}

