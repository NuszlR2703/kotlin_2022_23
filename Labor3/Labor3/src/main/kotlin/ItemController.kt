class ItemController(val ItemService:ItemService, val n:Int) {

    val items = ItemService.selectRandomItems(n);

    fun quiz(n : Int){
        for(item in items){
            println(item.question)

            for(item in item.answers){
                println(item)
            }

            println();
            print("Answer:");

            val answer: String? = readLine();

            if(answer?.toInt() == item.correct.toInt()){
                println("Correct answer!");
            }else
            {
                println("Wrong answer!");
            }
        }
    }
}