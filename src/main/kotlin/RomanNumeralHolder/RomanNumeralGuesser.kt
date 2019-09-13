package RomanNumeralHolder

import java.lang.IllegalArgumentException

fun makeRomanNumeralGuess(numberToGuess: Int, romanNumeralService: RomanNumeralService): String {

    val indexes = romanNumeralService.indexing
    val numerals = romanNumeralService.romanNumerals

    val numberCharacters = numberToGuess.toString().toCharArray().reversed()

    return numberCharacters.mapIndexed { index, character ->
        val multiplyBy = indexes[index] ?:
                throw IllegalArgumentException("Fuck off, we only do 1000's")

        println("Multiply by: $multiplyBy")

        val characterAsInt = character.toString().toInt()

        val realNumber = characterAsInt * multiplyBy

        when {
            realNumber in numerals.keys -> numerals[realNumber]
            realNumber !in numerals.keys -> {
                println("$realNumber = $character * $multiplyBy")

                (0 until characterAsInt)
                    .map { numerals[multiplyBy] }
                    .joinToString(separator = "")
            }
            else -> "We don't know? ¯\\_(ツ)_/¯"
        }
    }.reversed().joinToString(separator = "")
}