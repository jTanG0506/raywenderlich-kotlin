fun main(args: Array<String>) {
    // Create a Map with the following keys: name, profession, country, state, and city.
    // For the values, put your own name, profession, country, state, and city.
    val map = mutableMapOf("name" to "Jonathan Tang",
            "profession" to "Software Developer Intern",
            "country" to "United Kingdom",
            "state" to "Nottinghamshire",
            "city" to "Nottingham")

    // You suddenly decide to move to Albuquerque.
    // Update your city to Albuquerque, your state to New Mexico,
    // and your country to USA.
    map["city"] = "Albuquerque"
    map["state"] = "New Mexico"
    map["country"] = "USA"

    // Given a Map in the above format, write a function that
    // prints a given player's city and state.
    fun printLocation(person: Map<String, String>) {
        val state = if (person.containsKey("state")) person["state"] else ""
        val city = if (person.containsKey("city")) person["city"] else ""
        println("${person["name"]} is based in $city, $state")
    }

    printLocation(map)
}