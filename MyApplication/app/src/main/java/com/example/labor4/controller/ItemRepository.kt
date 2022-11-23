import java.io.File

object ItemRepository {
    private val items = mutableListOf<Item>()

    init {
//        val lines = File("D:\\Egyetem\\IV\\Androidprogramozas\\labor3\\src\\questions.txt").useLines { it.toList() }
//        for (i in lines.indices step 6)
//        {
//            val text = lines[i]
//            val correct = lines[i+1]
//            val answer1 = lines[i+2]
//            val answer2 = lines[i+3]
//            val answer3 = lines[i+4]
//            val answer4 = lines[i+5]
//            save(Item(text, mutableListOf(answer1,answer2,answer3,answer4),correct.toInt()))
//        }
        var question1 = "What was Meta Platforms Inc formerly known as?"
        val answers1 = mutableListOf<String>("Facebook", "Instagram", "ZuckTM", "Google")
        val correct1 = 1
        save(Item(question1,answers1,correct1))
        var question2 = "Which English city is known as the Steel City?"
        val answers2 = mutableListOf<String>("London", "Sheffield", "Liverpool", "Manchester")
        val correct2 = 2
        save(Item(question2,answers2,correct2))
        var question3 = "Which former British colony was given back to China in 1997?"
        val answers3 = mutableListOf<String>("You are lucky", "I give you", "The answer", "Hong Kong")
        val correct3 = 4
        save(Item(question3,answers3,correct3))
        var question4 = "Dummy question for debug"
        val answers4 = mutableListOf<String>("You are lucky", "I give you", "The answer", "This")
        val correct4 = 4
        save(Item(question4,answers4,correct4))
    }

    fun save(itemToSave : Item) = items.add(itemToSave)

    fun random() = items.random()

    fun size() = items.size
}