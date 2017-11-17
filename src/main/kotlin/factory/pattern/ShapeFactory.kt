package factory.pattern

class ShapeFactory {
    fun getShape(shapeType: String?): Shape? {

        if (shapeType.equals("CIRCLE", true)) return Circle()
        if (shapeType.equals("RECTANGLE", true)) return Rectangle()
        if (shapeType.equals("SQUARE", true)) return Square()

        return null
    }
}