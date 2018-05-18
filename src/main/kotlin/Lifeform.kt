import org.assertj.core.api.Assertions
import kotlin.test.Test
class TestLifeform {
    @Test
    fun hasEnergyCount(){
        
    }
}
interface Lifeform{
    val energy : Int
    val age : Int
    val reproductionStage : Int
    val name : String

    fun update(){}

    fun status(){
        return { age:age,energy:energy,reproductionStage:reproductionStage,name:name }
    }

    fun move(target){}

    fun eat(target){}

    fun scan(){}

    fun reproduce(){}

    fun wait(){}
}