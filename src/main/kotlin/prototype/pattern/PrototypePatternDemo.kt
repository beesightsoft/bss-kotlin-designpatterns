package prototype.pattern

fun main(args: Array<String>) {

    ShapeCache.loadCache()
    val clonedShape: Shape? = ShapeCache.getShape("1")
    println("Shape: ${clonedShape?.type}")
    val clonedShape2: Shape? = ShapeCache.getShape("2")
    println("Shape2: ${clonedShape2?.type}")
    val clonedShape3: Shape? = ShapeCache.getShape("3")
    println("Shape3: ${clonedShape3?.type}")

}