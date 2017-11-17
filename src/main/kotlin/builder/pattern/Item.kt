package builder.pattern

interface Item {
    fun name(): String
    fun packing(): Packing
    fun price(): Float
}