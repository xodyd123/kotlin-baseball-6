package baseball.domain.computer

import baseball.domain.number.NumberGenerator

class Computer(private val numberGenerator: NumberGenerator) {

    private val numbers = mutableListOf<Int>()

    fun generateNumber(){
        val generateNumbers = numberGenerator.generateNumber()
        generateNumbers.forEach { number -> numbers.add(number) }
    }

    fun getNumbers() : List<Number> {
        return numbers
    }

}