import org.assertj.core.api.Assertions
import kotlin.test.Test

class TestLifeForm {
    @Test
    fun hasEnergyCount(){
        //assign
        val plant = Plant(0,0)
        //act
        //assert
        Assertions.assertThat(plant.energy).isEqualTo(10)
    }
    @Test
    fun plantCanEat(){
        //assign
        val plant = Plant(0,0)
        //act
        plant.eat()
        //assert
        Assertions.assertThat(plant.energy).isNotEqualTo(10)
    }
    @Test
    fun plantCannotMove() {
        //assign
        val plant = Plant(0,0)

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
        val plant = Plant(0,0)

        //act
        plant.age()
        //assert
        Assertions.assertThat(plant.coordinateX).isEqualTo(0)
        Assertions.assertThat(plant.coordinateY).isEqualTo(0)
        Assertions.assertThat(plant.energy).isEqualTo(9)
        Assertions.assertThat(plant.age).isEqualTo(1)
    }

    @Test
    fun plantCanReproduce(){
        //assign
        val plant = Plant(0,0)

        //act
        val plantChild = plant.reproduce()
        //assert

        Assertions.assertThat(plantChild).isInstanceOf(Plant::class.java)

    }

    @Test
    fun plantCanDie(){
        //assign
        val plant = Plant(0,0)

        //act
        plant.die()
        //assert

        Assertions.assertThat(plant.energy).isEqualTo(0)

    }
}