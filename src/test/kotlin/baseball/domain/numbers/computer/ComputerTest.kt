package baseball.domain.numbers.computer

import baseball.domain.computer.Computer
import baseball.domain.number.FixedNumberGenerator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ComputerTest {

    @Test
    fun `컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다`(){

        val computer = Computer(FixedNumberGenerator)

        computer.generateNumber()

        assertEquals(arrayListOf<Int>(1,2,3,) , computer.getNumbers())

    }
}