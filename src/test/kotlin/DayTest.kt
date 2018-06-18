import org.assertj.core.api.Assertions
import kotlin.test.Test

class TestDay {
    @Test
    fun worksWithOneDay(){
        //assign
        val day = Day()
        val daysPassed = 0
        //act
        //assert
        Assertions.assertThat(day.nextDay(daysPassed)).isEqualTo(1)
    }
    @Test
    fun worksWithTwoDays(){
        //assign
        val day = Day()
        var passedDaysNr = 0
        //act
        passedDaysNr = day.nextDay(passedDaysNr)
        passedDaysNr = day.nextDay(passedDaysNr)
        //assert
        Assertions.assertThat(passedDaysNr).isEqualTo(2)
    }
}

