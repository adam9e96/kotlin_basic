package ch1

fun main() {
    /*
     * 기본 자료형
     * 자료형은 크게 기본 자료형 primitive data type 과 참조 자료형 reference data type 으로 나누어 짐.
     * 기본형은 순수하게 값을 저장하는 자료형이고 자바에서는 int, byte, boolean 등이 해당.
     * 참조형은 객체를 만들고 변수에는 객체의 참조값을 저장하고 자바에서는 String, Array 등이 해당.
     *
     * 코틀린의 자료형은 모두 참조형. 즉 모든 자료형이 객체 형태.
     *
     * 1. 정수 자료형
     * Byte, Short, Int, Long
     * 코틀린은 형추론을 통해서 자료형을 명시하지 않아도 알아서 추론.
     * 정수의 경우에는 숫자가 작아도 Int 형으로 추론하기 때문에 Byte 나 Short 같은 작은 범위를 사용할 때는 자료형을 지정해야 함.
     */
    val num1 = 10 // 타입을 따로 안적어주면 정수의 경우 Int로 타입추론을 함. Short, Byte 로 저장하고 싶으면 직접 자료형을 지정해야함.
    /*
     * 1) Int : 정수
     * 소수점이 없는 정수값을 저장할 때 사용.
     *
     * 가독성을 높이기 위해 언더바(_)로 자릿수를 구부할 수 있음.
     * 다만, 언더바는 개발자가 읽기 쉽게 하기 위한 것으로 컴퓨터는 동일하게 인식.
     */
    var intValue: Int
    intValue = 3
    intValue = 2_147_483_435

    println(intValue) // 2147483435

    /*
     * 2) Long : 정수
     * Int 보다 큰 범위의 정수를 저장할 수 있음.
     * Double 과 Float 의 관계처럼 int와 구분하기 위해서 숫자의 끝에 L을 붙여줌.
     * Long 타입의 경우에는 설정한 글꼴에 따라 숫자 1과 구분이 어려울 수 있기 떄문에 대문자를 사용.
     */
    var longValue: Long
    longValue = 3_141592L
    // L을 안붙이고 형추론을 시도하면 Int로 인식함
    var longValue2 = 3_14159233L // Long 로 인식함

    println(longValue)
    println(longValue2)

    /*
     * 3) Short 와 Byte : 정수
     * 역시 정숫값을 저장할 때 사용하는데 입력 할 수 있는 값의 크기가 Int 보다 작음.
     */
    var shortValue: Short = 32_767
    var byteValue: Byte = 127
    println(shortValue) // 32767
    println(byteValue) // 127

    /*
     * 2. 실수 자료형
     * Double, Float
     * 실수의 경우 자료형을 명시하지 않으면 Double 형이 됨. Float 형으로 지정하고 싶다면 값 뒤에 F를 추가로 붙여줌.
     *
     */
    var numFloat: Float = 100.0F // 자료형 생략 가능
    var numDouble: Double = 100.0 // 자료형 생략 가능
    var numFloatValue = 100.0 // Double 자료형으로 인식함
    println(numFloat)
    println(numDouble)

    /*
     * 1) Double : 실수
     * 소수점에 있는 값을 저장할 때 사용
     */
    var doubleValue:Double
    doubleValue = 3.141592

    /*
     * 2) Float : 실수
     * Double 과 동일한 용도이지만 더 작은 범위의 숫자를 저장할 때 사용.
     * Double 과 구분하기 위해 Float의 경우 숫자 끝에 'F'를 붙여줌.
     */
    var floatValue: Float
    floatValue = 3.141592F

    /*
     * 3. 문자 자료형
     * 문자 자료형은 문자하나를 표현하는 Char 형과 같은 문자열을 표현하는 String 형으로 나눌 수 있음.
     * Char 형은 문자를 작은 따옴표로 감싸고, String 형은 문자열을 큰 따옴표로 감쌈.
     */
    val char:Char = 'a' // 자료형 생략 가능
    val string:String = "abc" // 자료형 생략가능
    println(char)
    println(string)

    var char2 = "a" // String 으로 타입추론
//    var string3 = 'abc' // Too many characters in a character literal ''abc'' 오류
    /*

     * 1) Char : 문자형
     * Char 는 타입을 특정하지 않아도 외따옴표 안에 하나의 글자만 저장하기 때문에 Char
     */

    /*
     * 2) String : 문자열
     * 여러개의 문자를 지정
     */

    /*
     * 4. 논리 자료형
     * 참, 거짓을 표현하는 true, false 를 사용하고 주로 조건 검사에 사용.
     *
     */
    val isTure: Boolean = true // 자료형 생략가능
    println(isTure)

    /*
     * 읽기 전용 변수 val 선언하는 방법은 변수와 동일하며 이름 옆에 val 을 붙이면 읽기 전용 변수가 됨.
     */
    // val 변수명(이름) = 값
    val roadName = "귝제금융로"
    var address = roadName + "8길"
    println(address) // 귝제금융로8길


}
/*
    4. 상수 const
    상수는 주로 기준이 되는 변하지 않는 값을 입력해둘 때 사용하며, 읽기 전용 변수인 val 앞에 const 키워드를 붙여서 만듬.
    전역으로만 사용 가능.
 */
const val PI = 3.141592653589793

/*
 * val과 같이 읽기 전용인 것은 동일하지만, 컴파일 시에 값이 결정되기 때문에 Int, Long 과 같은 기본형과 문자열인 String 만 입력할 수 있음.
 *
 */