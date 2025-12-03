package baseball.controller

import baseball.domain.computer.Computer
import baseball.view.OutputView
import baseball.view.InPutView

class GameController(
    private val outputView: OutputView,
    private val inputView: InPutView,
    private val computer: Computer
) {
    companion object {
        private const val RESTART_COMMAND = "1"
        private const val EXIT_COMMAND = "2"
    }

    fun run() {
        outputView.startGamePrompt()

        while (true) {
            computer.generateNumber()

            playSingleGame()

            if(!askRestart()){
                return
            }
        }
    }

    private fun playSingleGame() {
        while (true) {
            outputView.inputNumberPrompt()
            val guess = inputView.readLine()
            val gameResult = computer.circulateNumber(guess)
            outputView.gameResult(gameResult)

            if (gameResult.isFinished) {
                return
            }
        }
    }

    private fun askRestart(): Boolean {
        val command = inputView.readLine()
        return when (command) {
            RESTART_COMMAND -> true
            EXIT_COMMAND -> false
            else -> throw IllegalArgumentException("1 또는 2만 입력 가능합니다.")
        }
    }
}