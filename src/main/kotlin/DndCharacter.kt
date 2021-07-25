import kotlin.math.floor


class DndCharacter {

    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = 10 + modifier(constitution)

    companion object {

        fun ability(): Int {
            val die1 = (1..6).random()
            val die2 = (1..6).random()
            val die3 = (1..6).random()
            val die4 = (1..6).random()
            val fourDice = listOf(die1, die2, die3, die4)
            return fourDice.filter { it != fourDice.min() }.sum()
        }

        fun modifier(score: Int): Int {
            // Math.floor() kotlin function for rounding down decimals
            // But will do the reverse if -negative
            return floor((score - 10)/2.0).toInt()
        }
    }

}
