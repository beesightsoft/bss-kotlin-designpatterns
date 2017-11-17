package abstract.factory.pattern

object FactoryProducer {
    fun getFactory(choice: String): AbstractFactory? {
        if (choice.equals("SHAPE", true)) return ShapeFactory()
        if (choice.equals("COLOR", true)) return ColorFactory()
        return null
    }
}