package baseball.view

import baseball.dto.GameResultDto

object OutputView {

    const val BALL = "볼"

    const val STRIKE = "스트라이크"

    const val NOTHING = "낫싱"


    fun startGamePrompt() {
        println("숫자 야구 게임을 시작합니다.")
    }

    fun inputNumberPrompt(){
        print("숫자를 입력해주세요 : ")
    }

    private fun formatGameResult(gameResultDto: GameResultDto): List<String> {
        val ballCount = gameResultDto.ballCount
        val strikeCount = gameResultDto.strikeCount

        if (gameResultDto.isFinished) {
            return listOf(
                "${strikeCount}$STRIKE",
                "${strikeCount}개의 숫자를 모두 맞히셨습니다! 게임 종료",
                "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."
            )
        }

        val line = when {
            strikeCount > 0 && ballCount > 0 ->
                "${ballCount}$BALL ${strikeCount}$STRIKE"

            strikeCount > 0 ->
                "${strikeCount}$STRIKE"

            ballCount > 0 ->
                "${ballCount}$BALL"

            else ->
                NOTHING

        }
        return listOf(line)
    }

    fun gameResult(gameResultDto: GameResultDto){
        formatGameResult(gameResultDto).forEach<String>(::println)
    }


}