fun main(args : Array<String>) {
    val name = ArrayList<String>()
    name.add("Jonathan")
    name.add("Tang")

    fun printNames(names: List<String>) {
        println(names)
    }

    printNames(name)
    println(name)

    var myName = "Jonathan"
    myName = "Tang"
}