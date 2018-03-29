fun main(args: Array<String>) {
    // Write a when statement that takes an age as an integer and prints out the life stage related to
    // that age. You can make up the life stages, or use my categorization as follows: 0-2 years,
    // Infant; 3-12 years, Child; 13-19 years, Teenager; 20-39, Adult;40-60, Middle aged; 61+, Elderly.

    var age = 19
    when (age) {
        in 0..2 -> println("Infant")
        in 3..12 -> println("Child")
        in 13..19 -> println("Teenager")
        in 20..39 -> println("Adult")
        in 40..60 -> println("Middle aged")
        in 61..110 -> println("Elderly")
        else -> println("Invalid Age")
    }

    val pair = Pair("Kevin", 40)
    when (pair.second) {
        in 0..2 -> println("${pair.first} is a Infant")
        in 3..12 -> println("${pair.first} is a Child")
        in 13..19 -> println("${pair.first} is a Teenager")
        in 20..39 -> println("${pair.first} is a Adult")
        in 40..60 -> println("${pair.first} is a Middle aged")
        in 61..110 -> println("${pair.first} is a Elderly")
        else -> println("Invalid Age")
    }

    val personsAge = when(age) {
        in 0..2 -> "Infant"
        in 3..12 -> "Child"
        in 13..19 -> "Teenager"
        in 20..39 -> "Adult"
        in 40..60 -> "Middle aged"
        in 61..110 -> "Elderly"
        else -> "Invalid Age"
    }
    println(personsAge)
}