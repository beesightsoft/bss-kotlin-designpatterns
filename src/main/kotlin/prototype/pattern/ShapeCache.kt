package prototype.pattern

class ShapeCache {
    companion object SHAPE_MAP {
        val shapeMap = HashMap<String, Shape>()
        fun getShape(shapeId: String): Shape? = shapeMap.get(shapeId)?.clone() as Shape?
        fun loadCache() {
            val circle = Circle()
            circle.id = "1"
            shapeMap.put(circle.id, circle)

            val square = Square()
            square.id = "2"
            shapeMap.put(square.id, square)

            val rectangle = Rectangle()
            rectangle.id = "3"
            shapeMap.put(rectangle.id, rectangle)

        }
    }

}