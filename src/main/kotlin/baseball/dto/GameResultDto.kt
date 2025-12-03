package baseball.dto

data class GameResultDto(
    var ballCount: Int,
    var strikeCount: Int,
    var isFinished: Boolean
) {
}
