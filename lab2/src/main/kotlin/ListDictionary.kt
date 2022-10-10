import IDictionary.Companion.DICTIONARY_NAME
import java.io.File
object  ListDictionary : IDictionary {
    private val words = mutableListOf<String>()

    init{
        File(IDictionary.DICTIONARY_NAME).forEachLine{
            add(it)
        }
    }
    override fun add(word: String): Boolean {
        return words.add(word)
    }
    override fun find(word: String) = words.find{ it==word } != null
    override fun size() = words.size
}
