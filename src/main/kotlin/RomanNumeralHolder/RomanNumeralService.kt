package RomanNumeralHolder

data class RomanNumeralService(
    val romanNumerals: Map<Int, String> = mapOf(
        Pair(0, ""),
        Pair(1, "I"),
        Pair(2, "II"),
        Pair(3, "III"),
        Pair(4, "IV"),
        Pair(5, "V"),
        Pair(6, "VI"),
        Pair(7, "VII"),
        Pair(8, "VIII"),
        Pair(9, "IX"),
        Pair(10, "X"),
        Pair(50, "L"),
        Pair(100, "C"),
        Pair(500, "D"),
        Pair(1000, "M")
    ),
    val indexing: Map<Int, Int> = mapOf(
        Pair(0, 1),
        Pair(1, 10),
        Pair(2, 100),
        Pair(3, 1000)
    )
) {

}
