import RomanNumeralHolder.RomanNumeralService

fun returnRoman(num: Int): String? {

    val romanNumerals = RomanNumeralService()

    return guessRomanNumeral(num, romanNumerals.romanNumerals)
}

private fun guessRomanNumeral(
    num: Int,
    assigment: Map<Int, String>
): String {
    var strNum = num.toString()
    var wholeStr = ""
    val lastChar = strNum.last().toString().toInt()

    if (num in assigment.keys)
        return assigment.getValue(num)
    else {
        for (x in (strNum.length downTo 1)) {
            wholeStr += assigment.getValue(lastChar)
            strNum.dropLast(1).plus(0)
        }
    }
    return wholeStr
}
