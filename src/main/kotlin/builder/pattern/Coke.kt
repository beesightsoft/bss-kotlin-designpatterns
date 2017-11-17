package builder.pattern

class Coke : ColdDrink() {
    override fun name(): String = "Coke"

    override fun price(): Float = 30.0f
}