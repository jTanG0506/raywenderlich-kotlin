fun main(args: Array<String>) {
    val number = 10
    when (number) {
        0 -> println("Zero")
        10 -> println("It's ten!")
        else -> println("Non-zero")
    }

    val string = "Dog"
    when (string) {
        "Cat", "Dog" -> println("Animal is a house pet")
        else -> println("Animal is not a house pet")
    }

    when (number) {
        in 1..9 -> println("Between 1 and 9")
        in 10..20 -> println("Between 10 and 20")
        else -> println("Some other number")
    }

    when {
        number % 2 == 0 -> println("Even")
        else -> println("Odd")
    }

    val testValue = 10
    val result = when {
        testValue < 10 -> "Less than 10"
        testValue > 10 -> "Greater than 10"
        else -> "is equal to 10"
    }
    println(result)
}