interface IDictionary {
    fun add(word:String) : Boolean
    fun find(word:String) : Boolean
    fun size() : Int
    companion object{
        val DICTIONARY_NAME = "F:\\IV. EV\\Android\\kotlin_2022_23\\lab2\\dict.txt"
    }
}