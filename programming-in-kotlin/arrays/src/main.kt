fun main(args: Array<String>) {
    val evenNumbers = arrayOf(2, 4, 6, 8)
    val evenNumber2: Array<Int> = arrayOf(2, 4, 6, 8)
    val intNumbers = intArrayOf(2, 4, 6, 8)

    val players = arrayOf("Alice", "Bob", "Cindy", "Dan")

    if (players.size < 2) {
        println("We need at least two players")
    } else {
        println("Let's start")
    }

    println(players.isEmpty())
    println(players.first())

    val firstPlayer = players[0]
    println("First player is $firstPlayer")

    val upcomingPlayers = players.sliceArray(0..2)
    for (player in upcomingPlayers) {
        println(player)
    }

    fun isEliminated(player: String): Boolean {
        return !players.contains(player)
    }

    println(isEliminated("Jonathan"))

    players[2] = "Sammy"
    for (player in players) {
        println(player)
    }

    fun sumOfAllItems(array: Array<Int>): Int {
        var sum = 0
        for (number in array) {
            sum += number
        }
        return sum
    }

    println(sumOfAllItems(arrayOf(2, 5, 7, 8)))

    val prices = arrayOf(1, 5, 20, 50)
    val removeFirst = prices.drop(1)
    println(removeFirst)
    println(prices.drop(2))
    println(prices.dropLast(1))
}