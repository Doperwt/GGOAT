interface LifeForm {
    var energy : Int
    val maxEnergy : Int
    var age : Int
    var reproductionStage : Int
    val name : String
    //we should implement size/growth early as it affects all things and breaks user plants if implemented later - robert
    // var size : Int
    // val maxSize : Int // maxSize could influence when a lifeform can start to reproduce/starting size/cost to reproduce
    fun update(){}
    //Plant/Carnivore/Herbivore class shouldn't implement update, this is up to the user/player

    fun move(){}

    fun eat(){}

    fun scan(){}

    fun reproduce(){}

    // fun grow(energy : Int){} //growth speed could depend on energy investment

    fun doNothing(){}  //wait is reserved, should carry minimal energy cost(think alligators waiting for days for prey/spiders laying traps)
}

class Plant : LifeForm {
    override var energy = 10
    override val maxEnergy = 100
    override var age = 0
    override var reproductionStage = 0
    override val name = "name"
    //plants only eat and reproduce, they eat 'nothing' to gain energy
    //Plant/Carnivore/Herbivore class shouldn't implement update, this is up to the user/player
    //
}