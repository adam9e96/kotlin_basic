package `01`

fun main() {
    /*
     * 1. 자료형을 비교하고 검사하고 변환하기
     * 코틀린의 자료형은 모두 참조형으로 선언.
     *
     * 1) 자료형 변환
     * 코틀린에서는 자료형이 다른 변수에 재할당하면 자동 형 변환이 되지 않고 자료형 불일치 오류 Type Mismatch 발생.
     * 의도하지 않게 자료형이 변하는 것을 방지하기 위한 것.]
     */
    val a: Int = 1
//    val b: Double = a // 자동 자료형변환이 안됨 int 타입의 a를 더 큰 자료형인 Double에 자동형변환을 못함
    val c: Double = 1.1
//    val b: Double=a // 자료형 불일치 오류 발생. 자바와 차이점
//    val d: Int = 1.1 // 자료형 불일치 오류 발생

    /*
     * 변수 a는 Int 형이므로 Double 형 변수 b 에 다시 할당할 수 없음.
     * 만일 자료형을 변환해 할당하고 싶다면 코틀린에서는 자료형 변환 메서드를 이용해야 함.
     * Int 형 변수 a 에 명시적으로 Double 형으로 반환하는 toDouble() 메서드를 이용.
     *
     */
    val b: Double = a.toDouble()
    println("a = $a, b = $b") // a=1, b = 1.0

    /*
     * 표현식에 자료형이 서로 다른 값을 연산하면, 자료형이 표현할 수 있는 범위가 큰 자료형으로 자동 형변환하여 연산 <-- 연산을 할때는 자동 형변환이 된다!
     */
    val result = b + a
    println("result = $result") // result = 2.0
    /*
     * 코틀린에서 사용할 수 있는 형변환 메서드
     * toByte
     * toShort
     * toChar
     * toInt
     * toLong
     * toFloat
     * toDouble
     */
}