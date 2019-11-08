class RomanNumeral {

    val allNumerals = mapOf(
        Pair("I",1),
        Pair("V",5),
        Pair("X",10),
        Pair("L",50),
        Pair("C",100),
        Pair("D",500),
        Pair("M",1000)
    )

    fun convertIntToBasicNumeral(number: Int): String = "I".repeat(number)

}