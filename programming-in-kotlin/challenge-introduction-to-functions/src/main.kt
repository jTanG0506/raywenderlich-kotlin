fun main(args: Array<String>) {

    // Write a function named `printFullName` that takes two strings called `firstName` and `lastName`.
    // The function should print out the full name defined as `firstName` + " " + `lastName`.
    // Use it to print out your own full name using the parameter names.
    fun printFullName(firstName: String, secondName: String) {
        println("$firstName $secondName")
    }

    printFullName(firstName = "Jonathan", secondName = "Tang")

    // Use the printFullName function without any parameter names.
    printFullName("Jonathan", "Tang")

    // Write a funtion named `calculateFullName` that returns the full name as a string.
    // Use it to store your own full name in a constant and then print it.
    fun calculateFullName(firstName: String, secondName: String): String {
        return "$firstName $secondName"
    }

    val myFullName = calculateFullName("Jonathan", "Tang")
    println(myFullName)

    // Create `calculateFullNameWithLength` to return a pair containing both the full name and the
    // length of the name. You can find a string’s length by using the following  syntax:
    // `string.length`. Use this function to determine the length of your own full name.
    // Then print out the result of the function.
    fun calculateFullNameWithLength(firstName: String, secondName: String): Pair<String, Int> {
        val fullName = "$firstName $secondName"
        return Pair(fullName, fullName.length)
    }

    val (fullName, nameLength) = calculateFullNameWithLength("Jonathan", "Tang")
    println("My name is $fullName and it has length $nameLength")
}