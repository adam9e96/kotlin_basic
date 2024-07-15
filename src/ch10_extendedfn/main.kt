package ch10_extendedfn


fun main() {

    // list 예제
    val fruits = listOf("Apple", "Banana", "Cherry")
    println("Fruits: $fruits")

    val mutableFruits = mutableListOf("Apple", "Banana")
    mutableFruits.add("Cherry")
    println("Mutable Fruits: $mutableFruits")

    // List transformation
    val upperCaseFruits = fruits.map { it.uppercase() }
    println("Uppercase Fruits: $upperCaseFruits")

    // set 예제
    val numbers = setOf(1, 2, 3, 4, 5)
    println("Numbers: $numbers")

    val mutableNumbers = mutableSetOf(1, 2, 3)
    mutableNumbers.add(4)
    mutableNumbers.add(2) // 중복된 요소 추가 시도
    println("Mutable Numbers: $mutableNumbers")

    // Set operations
    val evenNumbers = setOf(2, 4, 6, 8)
    val intersect = numbers.intersect(evenNumbers)
    println("Intersection: $intersect")

    // map 예제
    val capitals = mapOf("France" to "Paris", "Germany" to "Berlin", "Japan" to "Tokyo")
    println("Capitals: $capitals")

    val mutableCapitals = mutableMapOf("France" to "Paris")
    mutableCapitals["Germany"] = "Berlin"
    mutableCapitals["Japan"] = "Tokyo"
    println("Mutable Capitals: $mutableCapitals")

    mutableCapitals["Korean"] = ""
    // Map transformation
    val capitalLengths = capitals.mapValues { it.value.length }
    println("Capital Lengths: $capitalLengths")

    println("테스트")
    capitalLengths.mapNotNull {
        println(it.value)
    }
}