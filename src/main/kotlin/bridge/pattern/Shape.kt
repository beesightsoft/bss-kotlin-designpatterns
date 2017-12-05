package bridge.pattern

abstract class Shape(protected val drawAPI: DrawAPI) {
    abstract fun draw()

}