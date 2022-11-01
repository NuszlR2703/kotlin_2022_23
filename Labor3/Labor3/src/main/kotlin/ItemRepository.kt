import java.io.File

object ItemRepository {

    private var items = mutableListOf<item>();

    init {
        val lines = File("F:\\IV. EV\\Android\\kotlin_2022_23\\Labor3\\src\\main\\kotlin\\in.txt").useLines { it.toList() };
        for (i:Int in lines.indices step 5){
            val question:String = lines[i];
            val ans1:String = lines[i+1];
            val ans2:String = lines[i+2];
            val ans3:String = lines[i+3];
            val correct: String = lines[i+4];

            save(item(mutableListOf(ans1,ans2,ans3),correct,question));
        }
    }

    fun save(item: item) = items.add(item);

    fun size() = items.size;

    fun randomItem() = items.random();
}