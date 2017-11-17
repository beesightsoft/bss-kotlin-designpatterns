package prototype.pattern

abstract class Shape : Cloneable {
    lateinit var id: String
    lateinit var type: String

    abstract fun draw()
    override public fun clone() = super.clone()

}