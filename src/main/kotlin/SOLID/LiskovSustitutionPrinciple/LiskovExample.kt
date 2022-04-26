package SOLID.LiskovSustitutionPrinciple


abstract class CreatureLiskov {

    fun move(){
        println("Moviendose")
    }

    fun swim(){
        println("Nadando")
    }

}

class HumanLiskov: CreatureLiskov(){

}

class BirdLiskov: CreatureLiskov(){
    fun fly(){
        println("Volando")
    }
}

class FishLiskov: CreatureLiskov(){}

fun main(){
    val creature = BirdLiskov()
    creature.move()
    creature.swim()

    //creature2 puede volar, pero no viola liskov ya que se define directamente en la propia clase
    val creature2 = BirdLiskov();
    creature2.fly()

}