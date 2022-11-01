class ItemService(private val ItemRepository: ItemRepository) {

    fun selectRandomItems(n:Int): List<item>{
        if( n > ItemRepository.size()){
            println("N")
            return emptyList();
        }
        val items= mutableListOf<item>();
        while(items.size < n){
            val item = ItemRepository.randomItem();

            if(!items.contains(item)){
                items.add(item);
            }
        }
        return items;
    }
}