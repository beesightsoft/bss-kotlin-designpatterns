package singleton.pattern

fun main(args: Array<String>) {
    val test = SingleObject
    test.showMessage()
    //@nhancv TODO: or can use its name directly
    SingleObject.showMessage()

}