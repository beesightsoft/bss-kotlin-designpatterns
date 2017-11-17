package prototype.pattern

class Square : Shape() {
    init {
        type = "Square"
    }

    override fun draw() {
        println("Inside Square::draw() method.")
    }
}