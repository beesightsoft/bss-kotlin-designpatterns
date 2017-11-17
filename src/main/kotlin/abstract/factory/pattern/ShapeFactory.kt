package abstract.factory.pattern

class ShapeFactory : AbstractFactory() {
    override fun getShape(shape: String): Shape? {

        if (shape.equals("CIRCLE", true)) return Circle()
        if (shape.equals("RECTANGLE", true)) return Rectangle()
        if (shape.equals("SQUARE", true)) return Square()

        return null
    }

    override fun getColor(color: String): Color? {
        return null
    }

}