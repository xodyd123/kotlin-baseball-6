package baseball.domain.numbers.computer

import baseball.domain.computer.Computer
import baseball.domain.number.FixedNumberGenerator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ComputerTest {

    private lateinit var computer : Computer

    @Test
    fun `컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다`(){

        computer = Computer(FixedNumberGenerator)

        computer.generateNumber()

        assertEquals(arrayListOf<Int>(7,1,3,) , computer.getNumbers())
    }

    @Test
    fun `문자열로 들어온 입력값을 숫자로 이루어진 리스트로 변환`(){
        computer = Computer(FixedNumberGenerator)

        val result = computer.convertNumbers("713")

        assertEquals(arrayListOf<Int>(7,1,3) , result)
    }

    @Test
    fun `컴퓨터 계산 결과가 모두 스트라이크일때`(){

        computer = Computer(FixedNumberGenerator)

        computer.generateNumber()

        val result = computer.circulateNumber("713")

        assertEquals("3스트라이크" , result)
    }

    @Test
    fun `컴퓨터 계산 결과가 낫싱일때`(){

        computer = Computer(FixedNumberGenerator)

        computer.generateNumber()

        val result = computer.circulateNumber("456")

        assertEquals("낫싱" , result)
    }

    @Test
    fun `컴퓨터 계산 결과가 3볼일때`(){

        computer = Computer(FixedNumberGenerator)

        computer.generateNumber()

        val result = computer.circulateNumber("371")

        assertEquals("3볼" , result)
    }

    @Test
    fun `컴퓨터 계산 결과가 스트라이크만 있을때`(){

        computer = Computer(FixedNumberGenerator)

        computer.generateNumber()

        val result = computer.circulateNumber("216")

        assertEquals("1스트라이크" , result)
    }

    @Test
    fun `컴퓨터 계산 결과가 볼만 일을때`(){

        computer = Computer(FixedNumberGenerator)

        computer.generateNumber()

        val result = computer.circulateNumber("671")

        assertEquals("2볼" , result)
    }

    @Test
    fun `컴퓨터 계산 결과가 1스트라이크 1볼 일때`(){

        computer = Computer(FixedNumberGenerator)

        computer.generateNumber()

        val result = computer.circulateNumber("123")

        assertEquals("1볼 1스트라이크" , result)
    }



}