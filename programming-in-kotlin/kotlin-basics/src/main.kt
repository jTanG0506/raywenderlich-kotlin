fun main(args : Array<String>) {
    val temperature = 37.5
    val count : Int = 5
    var name = "Sam"

    name = "Fred"

    fun calculateTemperature(celsius : Double) : Double {
        return 9 / 5 * celsius + 32
    }

    println("Temp = ${calculateTemperature(20.0)}")
    println("Temp = ${calculateTemperature(50.0)}")

    var intValue = "32".toInt()
    println("inValue = $intValue")

    val intString = 32.toString()
    println("inttString = $intString")

    val fahrenheit = 32
    when (fahrenheit) {
        in 0..30 -> println("really cold")
        in 31..40 -> println("Getting colder")
        in 41..50 -> println("Kind of cold")
        in 51..60 -> println("Nippy")
        in 71..80 -> println("Just right")
    }

    var nullableName : String? = null
    var length = nullableName?.length ?: -1
    println(length)
    nullableName = "Sam"
    length = nullableName?.length ?: -1
    println(length)
}