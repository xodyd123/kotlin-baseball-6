package baseball

import baseball.controller.GameController
import baseball.domain.computer.Computer
import baseball.domain.number.RandomNumberGenerator
import baseball.view.OutputView
import baseball.view.InPutView

fun main() {
    val gameController = GameController(OutputView, InPutView , Computer(RandomNumberGenerator))
    gameController.run()
}
