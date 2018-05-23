interface LifeForm {
    var energy : Int
    val maxEnergy : Int
    var age : Int
    var reproductionStage : Int
    val name : String

    fun update(){}


    fun move(target : Object){}

    fun eat(){}

    fun scan(){}

    fun reproduce(){}

    fun doNothing(){}  //wait is reserved
}

class Plant : LifeForm {
    override var energy = 10
    override val maxEnergy = 100
    override var age = 0
    override var reproductionStage = 0
    override val name = "name"
    //plants only eat and reproduce, they eat 'nothing' to gain energy

}