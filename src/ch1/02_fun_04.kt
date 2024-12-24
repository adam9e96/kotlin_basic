package ch1

// a, b 매개변수에 기본값을 설정 및 Unit 반환형 생략
fun printSum2(a: Int = 0, b: Int = 0): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun main() {
    printSum2(10, 20) // 모든 인자를 명시적으로 제공: "sum of 10 and 20 is 30" 출력
    printSum2(10) // b의 기본값 0이 사용됨: "sum of 10 and 0 is 10" 출력
    printSum2() // a와 b 모두 기본값이 사용됨: "sum of 0 and 0 is 0" 출력
}
