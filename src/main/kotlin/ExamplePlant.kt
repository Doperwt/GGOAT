

class Fern(coordinateX : Int, coordinateY : Int) : Plant(coordinateX, coordinateY ) {
    override val name = "Fern"

    override fun update() : Boolean  {
        if (energy >= 40) {
            reproduce()
        } else {
            eat()
        }
        return true
    }
}