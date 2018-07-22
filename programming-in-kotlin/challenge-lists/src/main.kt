fun main(args: Array<String>) {
    // Create a list with the following states that you have lived in:
    var myCities = mutableListOf<String>("Oldham", "Manchester")
    myCities.add("Nottingham")
    println(myCities)

    // Given a function to print out all states but the third one
    fun printCities(cities: List<String>) {
        for (i in 0..cities.size - 1) {
            if (i != 2) {
                println("$i. ${cities[i]}")
            }
        }
    }

    printCities(myCities)
}
