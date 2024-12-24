package ch1

/**
 * 의미 있는 값을 반환하지 않는 함수
 */
// 의미 있는 값을 반환하지 않는 함수
fun printSum(a:Int, b:Int): Unit {
    println("sum of $a and $b is ${a + b}")
}
/*
 * 함수의 반환 타입이 Unit
 * Unit은 코틀린에서 반환값이 없음을 나타내며, 자바의 void와 유사.
 * 명시적으로 Unit을 적지 않아도 코틀린 컴파일러는 자동으로 이해한다.
 */
fun main() {
    printSum(10,20)
}