package baseball.domain.numbers

import baseball.domain.number.FixedNumberGenerator
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberGeneratorTest {


    @Test
    fun `1에서 9까지 서로다른 임의의 숫자 3개를 제공한다`(){

        val numberGenerators = FixedNumberGenerator

        val numbers = numberGenerators.generateNumber()

        Assertions.assertEquals(setOf(7, 1, 3), numbers)

    }
}