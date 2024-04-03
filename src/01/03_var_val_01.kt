package `01`

fun main() {
    /*
     * 1. 변수
     * 코틀린에서 값을 변경할 수 잇는 변수 variable 는 `var` 로,
     * 값을 변경할 수 없는 변수값 value 는 `val` 로 선언한다.
     */
    val pi: Double = 3.14 // val 변수명: 자료형 = 값
    // 코틀린의 기본 자료형은 대문자로 시작한다.

    // 자료형을 앞에 쓰던 자바와는 다르게 코틀린은 변수명을 먼저 쓰고, 콜론 : 을 쓴 후 자료형을 명시.
    // 문맥상 추론이 가능하다면 자료형을 생략할 수 있음. 이를 코틀린의 형추론이라고도 함.

    val name = "tom" // String 으로 형 부론.
    val name2: String // String 으로 형으로 추론되어 오류가 안뜸 // 이렇게 선언만하고 할당을 안할때도 타입을 명시해야 오류안뜸
//    val name3 // name3 변수가 어떤 타입으로 올 지 알 수 없어서 오류가 뜸

    // val 은 값을 변경할 수 없는 변수이므로 값을 재할당을 하면 다음과 같이 컴파일 오류가 남.
//    pi = .31415923 // 오류 Val cannot be reassigned

    println(name)
//    println(name2)
    // 값을 변경하고 싶을 떄는 var 을 사용해야 됨. var로 정의된 변수는 값을 바꿀 수 있음.

    var age = 21 // 형추론 Int
    println(age) // 21
    age = 25
    println(age) // 25

}