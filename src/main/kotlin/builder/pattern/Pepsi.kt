package builder.pattern

class Pepsi : ColdDrink() {
    override fun name(): String = "Pepsi"

    override fun price(): Float = 35.0f
}