package SOLID.InterfaceSegregationPrinciple

interface VehicleIS {

    fun move()

}

interface WaterVehicle {

    fun swim()

}

interface FlyingVehicle {

    fun fly()

}

//CarIS solo implementaría vehiculo
class CarIS: VehicleIS {
    override fun move() {
        TODO("Not yet implemented")
    }
}

class BoatIS: VehicleIS, WaterVehicle {
    override fun swim() {
        TODO("Not yet implemented")
    }

    override fun move() {
        TODO("Not yet implemented")
    }

}

class PlaneIS: VehicleIS, FlyingVehicle {
    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun move() {
        TODO("Not yet implemented")
    }

}