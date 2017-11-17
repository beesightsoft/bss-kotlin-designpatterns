package abstract.factory.pattern

class ColorFactory : AbstractFactory() {
    override fun getShape(shape: String): Shape? = null

    override fun getColor(color: String): Color? {

        if (color.equals("RED", true)) return Red()
        if (color.equals("GREEN", true)) return Green()
        if (color.equals("BLUE", true)) return Blue()

        return null
    }

}