import org.assertj.core.api.Assertions
import kotlin.test.Test

class TestLifeForm {
    @Test
    fun hasEnergyCount(){
        //assign
        val plant = Plant()
        //act
        //assert
        Assertions.assertThat(plant.energy).isEqualTo(10)
    }
    @Test
    fun canEat(){
        //assign
        val plant = Plant()
        //act
        plant.eat()
        //assert
        Assertions.assertThat(plant.energy).isNotEqualTo(10)
    }
}

