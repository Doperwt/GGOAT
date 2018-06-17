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
    fun plantCanEat(){
        //assign
        val plant = Plant()
        //act
        plant.eat()
        //assert
        Assertions.assertThat(plant.energy).isNotEqualTo(10)
    }
    @Test
    fun plantCannotMove() {
        //assign
        val plant = Plant()

        //act
        val moved = plant.move(1, 0)
        //assert
        Assertions.assertThat(moved).isEqualTo(false)
        Assertions.assertThat(plant.coordinateX).isEqualTo(0)
        Assertions.assertThat(plant.coordinateY).isEqualTo(0)
        Assertions.assertThat(plant.energy).isEqualTo(10)
    }
    @Test
    fun plantCanDoNothing(){
        //assign
        val plant = Plant()

        //act
        plant.doNothing()
        //assert
        Assertions.assertThat(plant.coordinateX).isEqualTo(0)
        Assertions.assertThat(plant.coordinateY).isEqualTo(0)
        Assertions.assertThat(plant.energy).isEqualTo(9)
    }

    @Test
    fun plantCanReproduce(){
        //assign
        val plant = Plant()

        //act
        val plantChild = plant.reproduce()
        //assert

        Assertions.assertThat(plantChild).isInstanceOf(Plant::class.java)

    }

}