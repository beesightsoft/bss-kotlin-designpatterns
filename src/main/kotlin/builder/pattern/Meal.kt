package builder.pattern

class Meal {
    private val items: MutableList<Item> = mutableListOf()

    fun addItem(item: Item) {
        items.add(item)
    }

    fun getCost(): Float = items.map { it.price() }.sum()

    fun showItems() {
        items.map {
            print("Item: ${it.name()}")
            print(", Packing: ${it.packing().pack()}")
            println(", Price: ${it.price()}")
        }
    }

}