fun main(args: Array<String>) {
    var nickname: String? = null

    fun printNickname(nickname: String?) {
        println("My nickname is $nickname")
    }

    printNickname(nickname)

    nickname = "Tang"
    printNickname(nickname)
}