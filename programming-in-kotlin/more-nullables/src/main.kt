fun main(args: Array<String>) {
    var result: Int? = 30
    println(result)
    val newResult = result?.plus(5)

    var x: Int? = null
    if (x != null) {
        x += 1
    }
    println(x)

    println(result!! + 1)

    var authorName: String? = "Jonathan Tang"
    var authorAge: Int? = 19

    var unwrappedAuthorName = authorName!!
    println("Author is $unwrappedAuthorName")

    // Causes NullPointerException.
    //  authorName = null
    // println("Author is ${authorName!!}")

//    authorName = null
    if (authorName != null) {
        println("Author is ${authorName!!}")
    } else {
        println("No author")
    }

    authorName?.let { name ->
        println("Author is $name")
    }

    authorName?.let {
        println("Author is $it")
    }

    var nullableInt: Int? = 10
    var mustHaveResult = nullableInt ?: 0
}