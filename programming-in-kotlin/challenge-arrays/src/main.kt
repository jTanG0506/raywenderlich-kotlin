fun main(args: Array<String>) {
    var players = arrayOf("Alice", "Bob", "Dan", "Eli", "Frank")

    // Use index(of:) to determine the position of the element "Dan" in players.
    println("Index of Dan = ${players.indexOf("Dan")}")

    players = arrayOf("Anna", "Brian", "Craig", "Dan", "Donna", "Eli", "Franklin")
    val scores = arrayOf(2, 2, 8, 6, 1, 2, 1)

    // Write a for-in loop that prints the players' names and scores.
    var index = 0
    for (player in players) {
        println("${index + 1}. ${players[index]} - ${scores[index]}")
        index++
    }

    // Use the forEachIndexed method of an array to print the players' names and scores.
    players.forEachIndexed { index, s ->
        println("${index + 1}. ${players[index]} - ${scores[index]}")
    }
}