import RomanNumeralHolder.RomanNumeralService
import RomanNumeralHolder.makeRomanNumeralGuess
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class RomanNumeralTest {

    @Nested
    inner class `Our roman numeral tests`() {

        val service = RomanNumeralService()

        @Test
        fun `our roman numeral class returns a map of numeral pairs`() {
            assertNotNull(service)
            assertTrue(service.romanNumerals.isNotEmpty())
        }

        @Test
        fun `we can guess a simple number less than 20`() {
            val romanNumeral = makeRomanNumeralGuess(19, service)

            assertEquals("XIX", romanNumeral)
        }

        @Test
        fun `we can guess a simple number less than 40`() {
            val romanNumeral = makeRomanNumeralGuess(39, service)

            assertEquals("XXXIX", romanNumeral)
        }

    }

    @Nested
    inner class `When we want to return single roman numeral`{

        @Test
        fun `we can with the following parameters`(){
            assertAll(
                { Assertions.assertEquals("I",returnRoman(1)) },
                { Assertions.assertEquals("V",returnRoman(5)) },
                { Assertions.assertEquals("X",returnRoman(10)) },
                { Assertions.assertEquals("L",returnRoman(50)) },
                { Assertions.assertEquals("C",returnRoman(100)) },
                { Assertions.assertEquals("D",returnRoman(500)) },
                { Assertions.assertEquals("M",returnRoman(1000)) }
            )
        }
    }

    @Nested
    inner class `When we want to return groupings of roman numerals`{

        @Test
        fun `we can with the following parameters`(){
            assertAll(
                { Assertions.assertEquals("II", returnRoman(2)) },
                { Assertions.assertEquals("III", returnRoman(3)) },
                { Assertions.assertEquals("IV", returnRoman(4)) },
                { Assertions.assertEquals("VIII", returnRoman(8)) }
            )
        }
    }
}