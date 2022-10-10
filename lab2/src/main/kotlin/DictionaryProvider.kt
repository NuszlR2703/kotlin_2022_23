class DictionaryProvider {
    companion object{
        fun createDictionary(type: DictionaryType) : IDictionary {
            return when (type){
                DictionaryType.HASH_SET -> HashSetDictionary
                DictionaryType.TREE_SET -> TreeSetDictionary
                DictionaryType.ARRAY_LIST -> ListDictionary
            }
        }
    }
}