class ItemService (private val itemRepository : ItemRepository) {
    fun selectRandomItems(numberOfItems : Int):List<Item>
    {
        if(numberOfItems > itemRepository.size())
        {
            println("The asked number of questions is too large. The biggest number is ${itemRepository.size()}")
            return emptyList()
        }

        val items = mutableListOf<Item>()

        while (items.size < numberOfItems)
        {
            val item = itemRepository.random()
            if (!items.contains(item))
                items.add(item)
        }
        return items
    }
}