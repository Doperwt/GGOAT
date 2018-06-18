interface LifeForm {
    var energy : Int
    val maxEnergy : Int
    var age : Int
    var reproductionStage : Int
    val name : String
    var coordinateX : Int
    var coordinateY : Int


    //we should implement size/growth early as it affects all things and breaks user plants if implemented later - robert
    // var size : Int
    // val maxSize : Int // maxSize could influence when a lifeform can start to reproduce/starting size/cost to reproduce
    fun update(){}
    //Plant/Carnivore/Herbivore class shouldn't implement update, this is up to the user/player

    fun move(moveX: Int, moveY: Int) : Boolean {
        if (this is Plant) {
            return false
        }
        energy -= 3 // we need a way to calculate energy cost of actions
        coordinateX += moveX
        coordinateY += moveY
        return true
        // I know, I was bad, I didn't write the test first.
    }

    fun eat() : Boolean { // only for plants currently. needs a check if it's not a plant, it needs a lifeform to eat
        energy += 5
        return true
    }

    fun scan(){}

    fun reproduce() : LifeForm

    // fun grow(energy : Int){} //growth speed could depend on energy investment

    fun age() : Boolean {
        energy -= 1
        age += 1
        return true
    }  //wait is reserved, should carry minimal energy cost(think alligators waiting for days for prey/spiders laying traps)

    fun die() : Boolean {
        energy = 0
        return true
    }
}

class Plant(coordinateX : Int, coordinateY : Int) : LifeForm {
    override var energy = 10
    override val maxEnergy = 100
    override var age = 0
    override var reproductionStage = 0
    override val name = "name"
    override var coordinateX = coordinateX
    override var coordinateY = coordinateY

    //
    //Plant/Carnivore/Herbivore class shouldn't implement update, this is up to the user/player


    override fun reproduce() : Plant {
        energy -= 7
        val childPlant = Plant(1,1)

        return childPlant
    }

    //plants only eat and reproduce, they eat 'nothing' to gain energy
}