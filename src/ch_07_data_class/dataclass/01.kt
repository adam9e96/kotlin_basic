package ch_07_data_class.dataclass

/**
 * fileName       : `01`
 * date           : 24-06-09
 * time           : 오전 2:23
 * ===========================================================
 * description    :
 */

fun main() {
    val user1 = User("PAKA", 30, "paka9999@gmail.com", "add1")
    val user2 = User("Ralo", 30, "paka9999@gmail.com", "add1")

    println(user1)
    println(user2)
    println(user1.hashCode())
    println(user2.hashCode())
    println(user1.toString())
    println(user2.toString())

}

data class User(val name: String, val age: Int, val email: String, val address: String) {

}