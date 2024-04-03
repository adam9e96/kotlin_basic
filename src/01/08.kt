package `01`

fun main() {
    /*
     * 3. 스마트 캐스트  알아보기
     * 만약 어떤 값이 정수일 수도 있고 실수 일 수도 있는 경우에는 그때마다 자료형을 변환해도 되지만 스마트 캐스트를 사용할 수도 있음.
     * 스마트 캐스트 Smart Cast 는 컴파일러가 자동으로 형 변환.
     *
     * 대표적으로 스마트 캐스트가 적용되는 자료형은 Number 형이 있음.
     * Number 형을 사용하면 숫자를 저장하기 위한 특수한 자료형 객체를 만듬.
     * Number 형으로 정의된 변수에는 저장되는 값에 따라 정수형이나 실수형 등으로 자료형이 변환됨.
     */

    var test: Number = 12.2 // 12.2 에 의해 test 는 Double 형으로 스마트 캐스트
    println("$test") // 12.2

    test = 12 // Int 형으로 스마트 캐스트
    println("$test") // 12

    test = 120L // Long 형으로 스마트 캐스트
    println("$test") // 120

    test += 12.0F // Float 형으로 스마트 캐스트
    println("$test") // 132.0


}