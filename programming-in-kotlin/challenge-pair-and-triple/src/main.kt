fun main(args : Array<String>) {
    // Pairs and Triples

    // Declare a constant Pair that contains two Int values.
    // Use this to represent a date (month, day).
    val date = Pair(3, 28)

    // In one line, read the day and month values into two constants.
    val (day, month) = date

    // Now create a Triple using the month, day and year.
    val date2 = Triple(month, day, 2018)
}