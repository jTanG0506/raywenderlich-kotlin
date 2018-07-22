fun main(args : Array<String>) {
    var namesAndScores = mapOf("Anna" to 2, "Brian" to 2, "Craig" to 8, "Donna" to 6)

    println(namesAndScores)
    println(namesAndScores["Anna"])
    println(namesAndScores["Greg"])

    println(namesAndScores.isEmpty())
    println(namesAndScores.count())

    val bobData = mutableMapOf("name" to "Bob",
            "profession" to "Card Player",
            "city" to "Oakland",
            "country" to "USA")

    println(bobData)
    bobData["profession"] = "Mailman"
    println(bobData)
    bobData.remove("city")
    println(bobData)

    for ((player, score) in namesAndScores) {
        println("$player - $score")
    }

    for (player in namesAndScores.keys) {
        println("$player - ${namesAndScores[player]}")
    }
}