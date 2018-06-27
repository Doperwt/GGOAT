import org.assertj.core.api.Assertions
import kotlin.test.Test

class TestPlantImplementation{
    @Test
    fun isItAPlant(){
        //assign
        val fern = Fern(1,1)
        //act
        //assert
        Assertions.assertThat(fern.type).isEqualTo("plant")
    }

    @Test
    fun hasLocation(){
        //assign
        val fern = Fern(1,1)
        //act
        //assert
        Assertions.assertThat(fern.coordinateX).isEqualTo(1)
        Assertions.assertThat(fern.coordinateY).isEqualTo(1)
    }

    @Test
    fun ExecutesTurn(){
        //assign
        val fern = Fern(1,1)
        //act
        fern.turn()
        //assert
        Assertions.assertThat(fern.energy).isGreaterThan(10)
        Assertions.assertThat(fern.age).isEqualTo(1)
    }

    @Test
    fun Reproduces(){
        //assign
        val fern = Fern(1,1)
        //act
        for (i in 1..9){
            fern.turn()
        }
        //assert
        Assertions.assertThat(fern.age).isEqualTo(9)
        Assertions.assertThat(fern.energy).isEqualTo(11)
    }

    @Test
    fun Dies(){
        //assign
        val fern = Fern(1,1)
        //act
        for (i in 1..102){
            fern.turn()
        }
        //assert
        Assertions.assertThat(fern.age).isEqualTo(102)
        Assertions.assertThat(fern.energy).isEqualTo(0)
    }
}