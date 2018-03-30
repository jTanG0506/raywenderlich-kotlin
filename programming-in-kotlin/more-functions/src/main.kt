typealias operation = (Int, Int) -> Int

fun main(args: Array<String>) {
    fun printMultipleOf(multiplier: Int, addvalue: Int) {}
    fun printMultipleOf(multiplier: Int, addvalue: Int, thirdValue: Int) {}
    fun printMultipleOf(multiplier: Int, addvalue: Int, thirdValue: Int, forthValue: Int) {}

    fun getValue(): Int {
        return 31
    }

    fun getValueString(): String {
        return "Jonathan Tang"
    }

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    var function: (Int, Int) -> Int = ::add
    println(function(4, 2))

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    function = ::subtract
    println(subtract(4, 2))

    fun printResult(function: (Int, Int) -> Int, a: Int, b: Int) {
        val result = function(a, b)
        println(result)
    }

    printResult(::add, 4, 2)

    fun printResult2(function: operation, a: Int, b: Int) {
        println(function(a, b))
    }

    // Returns nothing.
    fun noReturn(): Unit {
        // The :Unit is optional.
    }
}