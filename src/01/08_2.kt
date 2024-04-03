package `01`

fun main() {
    var test: Number = 12.2 // 처음에 Double 형으로 스마트 캐스트
    println("test is Double: ${test is Double}") // true

    test = 12 // Int 형으로 스마트 캐스트
    println("test is Int: ${test is Int}") // true

    test = 120L // Long 형으로 스마트 캐스트
    println("test is Long: ${test is Long}") // true

    test += 12.0F // Float 형으로 스마트 캐스트
    println("test is Float: ${test is Float}") // true
    println("test is Double: ${test is Double}") // false
}
