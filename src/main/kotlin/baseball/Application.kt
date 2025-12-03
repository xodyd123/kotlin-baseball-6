package baseball

import baseball.controller.GameController
import baseball.domain.computer.Computer
import baseball.domain.number.RandomNumberGenerator
import baseball.presenter.GameResultPresenter
import baseball.view.OutputView
import baseball.view.InPutView

fun main() {
    val gameController = GameController(GameResultPresenter(OutputView), InPutView , Computer(RandomNumberGenerator))
    gameController.run()
}
