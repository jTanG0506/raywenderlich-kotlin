fun main(args: Array<String>) {
    var myFavouriteSong: String? = "Some song name"

    myFavouriteSong?.let {
        println(myFavouriteSong)
    } ?: println("I don't have a favourite song")

    fun printNickname(nickname: String?) {
        nickname?.let {
            println(nickname)
        } ?: println("No nickname")
    }

    printNickname(null)
}