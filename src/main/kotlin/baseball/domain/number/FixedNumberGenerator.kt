package baseball.domain.number

object FixedNumberGenerator : NumberGenerator {
    override fun generateNumber(): Set<Int> {
        return setOf(1,2,3)
    }
}