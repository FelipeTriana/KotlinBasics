package SOLID.OpenClosedPrinciple

interface Polygon {

    fun area(): Double
}

data class TriangleOC(val lenght: Double, val height: Double): Polygon {

    override fun area(): Double {
        return (lenght*height)/2
    }
}

data class CircleOC(val radius: Double): Polygon {

    override fun area(): Double {
        return Math.PI*(radius*radius)
    }
}

data class RectangleOC(val lenght: Double, val height: Double): Polygon {

    override fun area(): Double {
        return lenght*height
    }
}

class AreaOC{

    fun calculateArea(polygon: Polygon): Double? {
        return polygon.area()
    }
}

fun main(){
    val calculate = AreaOC()
    println(calculate.calculateArea(RectangleOC(5.0,4.0)))
}