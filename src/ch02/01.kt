package ch02

fun main() {
    /*
     * 6. 묵시적 변환 (자동 형변환)
     * Any 형은 자료형이 특별히 정해지지 않은 경우에 사용.
     * 코틀린의 Any 형은 모든 클래스의 뿌리. Int나 String 그리고 사용자가 직접 만든 클래스까지
     * 모든 Any 형의 자식 클래스.
     * 즉 코틀린의 모든 클래스는 바로 이 Any 형이라는 슈퍼 클래스 (SuperClass) 를 가짐.
     *
     * * Any 는 자바의 최상위 클래스인 Object와 비슷하지만 서로 다른 유형.
     *
     * Any 형은 무엇이든 될 수 있기 때문에 언제든 필요한 자료형으로 자동변환할 수 있음.
     * 이것을 묵시적 변환이라고 함.
     *
     */
    var a: Any = 1 // Any 형은 a는 1로 초기화 될 때 Int 형이 됨.
    a = "one" // Int 형이였던 a 는 변경된 값에 의해 String 이 됨.

    println("a $a type: ${a.javaClass}") // 자바의 기본형을 출력하면 String 나옴
    //a one type: class java.lang.String
    println("a ${a}type: ${a.javaClass}") // 자바의 기본형을 출력하면 String 나옴

    checking("Hello") // 문자열을 인자로 넣음
    checking("whatever you want")
    checking(134) // 숫자를 인자로 넣음

}

fun checking(x: Any) { // 인자를 Any형으로 받음.
    if (x is String) {
        println("x is String: $x")
    }
    if (x is Int) {
        println("x is Int: $x")
    }
}

