package ch02
// 문제 2: 주어진 배열의 평균값 구하기
fun main() {
    val numbers = intArrayOf(10, 20, 30, 40, 50)
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    val average = sum.toDouble() / numbers.size
    println("평균값: $average")

}