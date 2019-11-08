import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RomanNumeralTest {

    val romanNumeral = RomanNumeral()

    @Test
    fun `We can convert any number to equal amount of "I"`(){

        val actualNumeral = romanNumeral.convertIntToBasicNumeral(5)

        assertEquals("IIIII", actualNumeral)
    }

    @Test
    fun `We have a list of main numerals`(){

        assertEquals(7, romanNumeral.allNumerals.size)
    }

}