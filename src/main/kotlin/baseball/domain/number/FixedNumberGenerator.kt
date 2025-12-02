package baseball.domain.number

object FixedNumberGenerator : NumberGenerator {
    override fun generateNumber(): Set<Int> {
        return setOf(7,1,3)
    }
}