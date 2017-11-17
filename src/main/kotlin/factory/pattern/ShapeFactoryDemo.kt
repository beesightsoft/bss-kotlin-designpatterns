package factory.pattern

fun main(args: Array<String>) {

    val shapeFactory = ShapeFactory()
    shapeFactory.getShape("CIRCLE")?.draw()
    shapeFactory.getShape("RECTANGLE")?.draw()
    shapeFactory.getShape("SQUARE")?.draw()

}