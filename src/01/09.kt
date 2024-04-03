package `01`

fun main() {
    /*
     * 4. 자료형 검사하기
     * 변수의 자료형을 알아낼때는 is 키워드를 사용.
     * is 는 왼쪽 항의 변수가 오른쪽 항의 자료형과 같으면 true를 , 아니면 false 를 반환
     */
    var num = 256

    if (num is Int){ // num 의 자료형이 Int 라면 실행
        println(num)
    } else if (num !is Int){
        println("Not an Int")
    }
    /*
     * is 는 변수의 자료형을 검사한 다음 그 변수를 해당 자료형으로 변환하는 기능도 있음.
     * Any 형을 사용하면 자료형을 결정하지 않은 채로 변수를 선언할 수 있음.
     * Any 형은 코틀린의 최상위 기본 클래스로 어떤 자료형이라도 될 수 있는 특수한 자료형.
     * 이때 is 를 사용하여 자료형을 검사하면 검사한 자료형으로 스마트 캐스트.
     */
    val x: Any
    x = "Hello"
    if (x is String){
        println(x.length) // 5
    }
    /*
     * 변수 x 는 Any 형으로 선언. 그 후에 "Hello"라는 값을 대입. 아직 x의 자료형은 Any 형.
     * 이후 if문으로 is의 x의 자료형을 검사할 때 String 으로 스마트 캐스트 되어 조건문으로 실행.
     */
}