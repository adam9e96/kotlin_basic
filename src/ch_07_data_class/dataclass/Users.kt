package ch_07_data_class.dataclass

import com.google.gson.Gson

data class Users(val name: String, val age: Int, val email: String, val address: String)

fun main() {
    // User 객체 생성
    val user1 = User("PAKA", 30, "paka9999@gmail.com", "add1")

    // Gson 객체 생성
    val gson = Gson()

    // User 객체를 JSON 문자열로 변환
    val json = gson.toJson(user1)
    println("JSON String: $json")  // {"name":"PAKA","age":30,"email":"paka9999@gmail.com","address":"add1"}

    // JSON 문자열을 User 객체로 변환
    val jsonString = """{"name":"PAKA","age":30,"email":"paka9999@gmail.com","address":"add1"}"""
    val user2 = gson.fromJson(jsonString, User::class.java)
    println("User Object: $user2")  // User(name=PAKA, age=30, email=paka9999@gmail.com, address=add1)
}
