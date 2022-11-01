fun main(args: Array<String>) {

    val n: Int = 5;
    val ItemController = ItemController(ItemService(ItemRepository),n);
    ItemController.quiz(n);
}