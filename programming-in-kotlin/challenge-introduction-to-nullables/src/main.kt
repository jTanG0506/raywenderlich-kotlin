fun main(args: Array<String>) {
    // Make an Nullable `String` called `myFavoriteSong`. If you have a favorite song,
    // set it to a string representing that song. If you have more than one favorite song
    // or no favorite, set the Nullable to `null`.
    var myFavouriteSong: String? = null

    // Create a method named printFavoriteSong that takes a nullable song and print the value
    fun printFavouriteSong(song: String?) {
        println("My favourite song is $song")
    }

    printFavouriteSong(myFavouriteSong)
    myFavouriteSong = null
    printFavouriteSong(myFavouriteSong)
}