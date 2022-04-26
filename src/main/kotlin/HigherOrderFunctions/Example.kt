package HigherOrderFunctions

// Función de orden superior
fun playEffectCard(cardCost1: Int, cardCost2: Int, onSuccess: () -> Unit) {
    if (cardCost1 > cardCost2) {
        onSuccess()
    } else {
        println("Sin efectos")
    }
}

fun main() {
    val warriorCardCost = 4
    val randomDeckCardCost = 2
    playEffectCard(warriorCardCost, randomDeckCardCost) { print("Aumentar armadura por 10") }
}