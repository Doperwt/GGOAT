import org.assertj.core.api.Assertions
import kotlin.test.Test

class TestDay {
    @Test
    fun worksWithOneDay(){
        //assign
        val day = Day()
//        val passed = 0
        //act
        //assert
        Assertions.assertThat(day.nextDay(5)).isEqualTo(5)
    }
//    @Test
//    fun worksWithTwoDays(){
//        //assign
//        val day = Day()
//        val passedDays = 0
//        //act
//        day.nextDay(passedDays)
//        day.nextDay(passedDays)
//        //assert
//        Assertions.assertThat(passedDays).isEqualTo(2)
//    }
}

