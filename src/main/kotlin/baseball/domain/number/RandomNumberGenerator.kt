package baseball.domain.number

import camp.nextstep.edu.missionutils.Randoms

object RandomNumberGenerator : NumberGenerator {
    override fun generateNumber(): Set<Int> {
         val set = mutableSetOf<Int>()
         while (set.size != 3){
             val randomNumber = Randoms.pickNumberInRange(1, 9)
             set.add(randomNumber)
         }
        return set
    }

}