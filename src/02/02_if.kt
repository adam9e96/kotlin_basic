package `02`

fun main() {
    /*
     * 제어문 : 코드의 흐름을 조건에 따라 바꿀 수 있음.
     * 제어문에는 크게 조건문에 해당하는 if, when 그리고 반복문에 해당하는 for, while 이 있음.
     *
     * 1. 조건문 if
     *  조건문 -> 주어진 조건식의 결과값이 참인지 거짓인지에 따라 코드를 실행할 것인지,
     * 혹은 다른 코드르 ㄹ실행할 서인ㄴ지 판단하기 이ㅜ한 프로그래임 문법.
     *
     * 1) if문을 사용하기 위한 조건
     * if문의 조건식에는 비교 연산자 와 논리 연산자 를 사용한 조건식만 사용 가능하며,
     * 조건식의 결과는 boolean 타입인 true 참과 false 거짓으로 나타남.
     *
     * 리턴형이 Boolean 인 변수나 함수도 된다.
     */
    /*
     * 2) 기본적인 if 문 사용
     *
     * if (조건) {
     *    // 조건이 true일 때 실행될 코드
     * }
     * 코드블록 , 코드 스코프 : 코드 중간의 영는 괄호로 { 시작해 단느 괄호 } 까지를 말함
     */
    var out = 0
    var strike = 3 // 여기서 경고 뜨는 이유 : IDE가 판단하기로 strike변수는 값 변경을 하지 않으므로 val로 하는게 어떻냐고 제안
    if (strike > 2) { // 여기 경고 : 해당 조건식은 항상참이라고 경고
        out = out + 1
    }
    println("out: : $out") // 1
//    strike  = 4

    var ball = 4
    if (ball > 3) { // 조건식이 참이면 여기 코드 블럭이 실행.
        println("4볼로 출루합니다.")

    } else { // 조건식이 거짓이면 여기 코드 블럭이 실행됨.
        println("타석에서 당므 타구를 기다립니다.")
    }


}