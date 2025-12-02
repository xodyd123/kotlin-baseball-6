package baseball.domain.computer

import baseball.domain.number.NumberGenerator

class Computer(private val numberGenerator: NumberGenerator) {

    private val numbers = mutableListOf<Int>()

    fun generateNumber(){
        val generateNumbers = numberGenerator.generateNumber()
        generateNumbers.forEach { number -> numbers.add(number) }
    }

    fun getNumbers() : List<Int> {
        return numbers
    }

    fun convertNumbers(inputs : String) : List<Int> {
        val convertNumbers = inputs.map { stringInput -> stringInput.digitToInt()  }
        return convertNumbers
    }

    fun circulateNumber(inputs  : String) : String {
        val convertNumbers = convertNumbers(inputs)

        if (convertNumbers[0] == numbers[0] && convertNumbers[1] == numbers[1] && convertNumbers[2] == numbers[2]) {
            return "3스트라이크"
        }

        return "낫싱"

    }


}