fun main(args : Array<String>) {
    val yes1: Boolean = true
    val no1: Boolean = false

    val yes2 = true
    val no2 = false

    println("yes1 = yes2 ${yes1 == yes2} no1 = no2 ${no1 == no2}")

    val doesOneEqualTwo = (1 == 2)
    println("Does 1 equal 2 = $doesOneEqualTwo")

    val doesOneNotEqualTwo = (1 != 2)
    println("Does 1 not equal 2 = $doesOneNotEqualTwo")

    val longName = "Jonathan".length > 5
    println("Longname = $longName")

    val and = true && true
    println("and = $and")

    val or = true || true
    println("or = $or")

    val guess = "dog"
    val dogEqualCat = guess == "cat"
    println("dogEqualCat $dogEqualCat")

    val a = 5
    val b = 10

    val min: Int
    if (a < b) {
        min = a
    } else {
        min = b
    }

    println("min = $min")
}