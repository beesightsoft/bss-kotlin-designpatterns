package builder.pattern

abstract class ColdDrink : Item {
    override fun packing(): Packing = Bottle()
}