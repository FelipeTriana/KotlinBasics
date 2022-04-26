package SOLID.OpenClosedPrinciple

import java.awt.Polygon

data class Triangle(val lenght: Double, val height: Double)

data class Circle(val radius: Double)

class Area{

    fun calculateArea(polygon: Any): Double? {
        return when(polygon){
            is Triangle -> {
                (polygon.lenght*polygon.height)/2
            }
            is Circle -> {
                Math.PI*(polygon.radius*polygon.radius)
            }
            else -> {
                null
            }
        }
    }

}

fun main(){
    val calculate = Area()
    println(calculate.calculateArea(Triangle(6.0,6.0)))
}