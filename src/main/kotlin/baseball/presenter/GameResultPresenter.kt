package baseball.presenter

import baseball.dto.GameResultDto
import baseball.view.OutputView

class GameResultPresenter(
    private val outputView: OutputView,
) {
    fun showStartGame() {
        outputView.startGamePrompt()
    }

    fun showInputPrompt() {
        outputView.inputNumberPrompt()
    }

    fun present(dto: GameResultDto) {
        if (dto.isFinished) {
            outputView.showGameFinished(dto.strikeCount)
            return
        }

        val b = dto.ballCount
        val s = dto.strikeCount

        when {
            b > 0 && s > 0 -> outputView.showBallAndStrike(b, s)
            s > 0 -> outputView.showStrike(s)
            b > 0 -> outputView.showBall(b)
            else -> outputView.showNothing()
        }
    }
}
