package ch02

fun main() {
    /*
     * 1. 범위 클래스
     * 코틀린을 이용하면 특정 범위의 값들을 간편하게 표현할 수 있다.
     * 범위 클래스로는 IntRange, LongRange, CharRange 등이 있음.
     * 예 ) IntRange 클래스를 사용해 1에서 5까지 숫자의 범위를 생성하는 코드
     */
    val numRange: IntRange = 1..5
    println(numRange) // 1..5

    println(numRange.contains(3)) // true
    println(numRange.contains(10)) // false

    /*
     * 알파벳의 범위도 마찬가지. CharRange 클래스를 사용
     */
    val charRange: CharRange = 'a'..'e'
    println(charRange.contains('b')) // true
    println(charRange.contains('z')) // false
}