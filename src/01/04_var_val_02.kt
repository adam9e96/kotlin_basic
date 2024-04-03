package `01`

fun main() {
    val number = 10 // number 변수는 Int 형으로 추론.
    val number2: Int = 10 // number 변수는 Int 형으로 추론.
    var language = "Korean" // language 변수는 String 으로 추론.
    language = "English" // var 키워드로 선언한 변수는 값을 다시 할당할 수 있음.
//    language = 10 // 파이썬 처럼 다른 데이터 타입의 데이터는 저장할 수 없음.
    val secondNumber: Int = 20 // secondNumber 변수는 자료형을 Int 로 명시적으로 지정.
//    secondNumber = 30 // val 로 선언한 변수를 값을 다시 할당할 수 없음

    println("number: $number")
    println("number: $number2")
    println("language: $language")
    println("secondNumber : $secondNumber")

}