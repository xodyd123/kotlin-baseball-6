package baseball.domain.computer

import baseball.domain.number.NumberGenerator
import baseball.dto.GameResultDto

class Computer(private val numberGenerator: NumberGenerator) {

    private var numbers = listOf<Int>()

    fun generateNumber(){
        val generateNumbers = numberGenerator.generateNumber()
        numbers = generateNumbers.toList()
    }

    fun getNumbers() : List<Int> {
        return numbers
    }

    fun convertNumbers(inputs : String) : List<Int> {
        val convertNumbers = inputs.map { stringInput -> stringInput.digitToInt()  }

        return convertNumbers
    }

    fun circulateNumber(inputs  : String) : GameResultDto {
        val gameResultDto = GameResultDto(0, 0, false)

        val convertNumbers = convertNumbers(inputs)

        for (i in convertNumbers.indices) {
            if (convertNumbers[i] == numbers[i]) {
                gameResultDto.strikeCount++
            } else if (numbers.contains(convertNumbers[i])) {
                gameResultDto.ballCount++
            }
        }
        if(gameResultDto.strikeCount == 3) gameResultDto.isFinished = true

        return gameResultDto

    }

}