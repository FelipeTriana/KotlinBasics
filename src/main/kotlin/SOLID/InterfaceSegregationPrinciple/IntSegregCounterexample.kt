package SOLID.InterfaceSegregationPrinciple

interface Vehicle {

    fun move() //La unica funcion en comun de esos tres tipos de vehiculos es moverse

    fun fly()

    fun swim()

}

class Car: Vehicle {
    override fun move() {
        TODO("Not yet implemented")
    }

    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun swim() {
        TODO("Not yet implemented")
    }

}

class Boat: Vehicle {
    override fun move() {
        TODO("Not yet implemented")
    }

    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun swim() {
        TODO("Not yet implemented")
    }

}

class Plane: Vehicle {
    override fun move() {
        TODO("Not yet implemented")
    }

    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun swim() {
        TODO("Not yet implemented")
    }

}