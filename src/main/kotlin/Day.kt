interface DayForm {

}

class Day() : DayForm {

    fun nextDay(daysPassed: Int): Int {
        return daysPassed + 1
    }

}