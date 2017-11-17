package builder.pattern

class ChickenBurger : Burger() {
    override fun name(): String = "Chicken Burger"

    override fun price(): Float = 50.5f
}