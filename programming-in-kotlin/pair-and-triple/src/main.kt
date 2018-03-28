fun main(args : Array<String>) {
    val coordinates = Pair(2, 3)
    val (x, y) = coordinates
    println("x = $x y = $y")

    println("x = ${coordinates.first} y = ${coordinates.second}")

    val coordinatesDouble = Pair(2.1, 3.5)
    println("x = ${coordinatesDouble.first} y = ${coordinatesDouble.second}")

    val coordinatesMixed = Pair(2.1, 3)
    println("x = ${coordinatesMixed.first} y = ${coordinatesMixed.second}")

    val x1 = coordinates.first
    val y1 = coordinates.first
    println("x1 = $x1 y1 = $y1")

    val coordinates3D = Triple(2, 3, 1)
    val (x3, y3, z3) = coordinates3D
    println("x3 = $x3 y3 = $y3 z3 = $z3")

    val (x4, y4, _) = coordinates3D
    println("x4 = $x4 y4 = $y4")
}