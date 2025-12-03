package baseball.view

import baseball.dto.GameResultDto

object OutputView {

    const val BALL = "볼"

    const val STRIKE = "스트라이크"

    const val NOTHING = "낫싱"

    fun startGamePrompt() = println("숫자 야구 게임을 시작합니다.")
    fun inputNumberPrompt() = print("숫자를 입력해주세요 : ")


    fun showGameFinished(strikeCount: Int) {
        println("${strikeCount}스트라이크")
        println("${strikeCount}개의 숫자를 모두 맞히셨습니다! 게임 종료")
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
    }

    fun showBallAndStrike(ball: Int, strike: Int) =
        println("${ball}볼 ${strike}스트라이크")

    fun showStrike(strike: Int) =
        println("${strike}스트라이크")

    fun showBall(ball: Int) =
        println("${ball}볼")

    fun showNothing() =
        println("낫싱")


}