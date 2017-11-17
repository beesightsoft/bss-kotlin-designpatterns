package builder.pattern

abstract class Burger : Item {
    override fun packing(): Packing = Wrapper()
}