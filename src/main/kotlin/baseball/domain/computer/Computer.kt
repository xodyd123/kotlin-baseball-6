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

        var bollCount = 0

        var strikeCount = 0

        val convertNumbers = convertNumbers(inputs)

        for (i in convertNumbers.indices) {
            if (convertNumbers[i] == numbers[i]) {
                strikeCount++
            }
            else if (numbers.contains(convertNumbers[i])) {
                bollCount++
            }
        }

        if (strikeCount>0 && bollCount>0){
            return "${bollCount}볼 ${strikeCount}스트라이크"
        }

        if (strikeCount > 0){
            return "${strikeCount}스트라이크"
        }

        if (bollCount > 0) {
            return "${bollCount}볼"
        }

        return "낫싱"

    }


}