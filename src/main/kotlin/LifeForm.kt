

interface LifeForm {
    var energy : Int
    val maxEnergy : Int
    var age : Int
    var maxAge : Int
    var reproductionStage : Int
    val name : String
    var coordinateX : Int
    var coordinateY : Int
    val type : String

    //we should implement size/growth early as it affects all things and breaks user plants if implemented later - robert
    // var size : Int
    // val maxSize : Int // maxSize could influence when a lifeform can start to reproduce/starting size/cost to reproduce
    //Plant/Carnivore/Herbivore class shouldn't implement update, this is up to the user/player

    fun move(moveX: Int, moveY: Int) : Boolean {
        if (this.type == "Plant" ) {
            return false
        }
        energy -= 3 // we need a way to calculate energy cost of actions
        coordinateX += moveX
        coordinateY += moveY
        return true
        // I know, I was bad, I didn't write the test first.
    }

    fun update() : Boolean {
        return false
    }

    // fun scan() : LifeForm

    fun reproduce() : LifeForm

    fun eat():Boolean {
        return false
    }
    // fun grow(energy : Int){} //growth speed could depend on energy investment

    fun turn() : Boolean {
        energy -= 1
        age += 1
        update()
        if(age>=maxAge){
            die()
        }
        return true
    }  //wait is reserved, should carry minimal energy cost(think alligators waiting for days for prey/spiders laying traps)

    fun die() : Boolean {
        energy = 0
        return true
    }

    fun randomLocation() : Int {
        return (Math.random() * (2 - -4) - 3).toInt()
    } // returns a random number -2 to 2 for spawning a child
}

open class Plant(coordinateX : Int, coordinateY : Int) : LifeForm {
    override var energy = 10
    override val maxEnergy = 100
    override var age = 0
    override var reproductionStage = 0
    override var coordinateX = coordinateX
    override var coordinateY = coordinateY
    override val type = "Plant"
    override val name = "Plant"
    override var maxAge = 100

    override fun reproduce() : Plant {
        if(energy<30){
            energy -= 30
            val childPlant = Plant(coordinateX+randomLocation(),coordinateY+randomLocation())

            return childPlant
        }
        return this
    }
    override fun eat() : Boolean { // only for plants currently. needs a check if it's not a plant, it needs a lifeform to eat
        energy += 5
        return true
    }
    //plants only eat and reproduce, they eat 'nothing' to gain energy
}