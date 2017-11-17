package abstract.factory.pattern

fun main(args: Array<String>) {

    val shapeFactory = FactoryProducer.getFactory("SHAPE")
    shapeFactory?.getShape("CIRCLE")?.draw()
    shapeFactory?.getShape("RECTANGLE")?.draw()
    shapeFactory?.getShape("SQUARE")?.draw()

    val colorFactory = FactoryProducer.getFactory("COLOR")
    colorFactory?.getColor("RED")?.fill()
    colorFactory?.getColor("GREEN")?.fill()
    colorFactory?.getColor("BLUE")?.fill()
}