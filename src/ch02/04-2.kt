package ch02

// 코틀린에서는 if를 표현식으로 사용하여 값을 직접 반환할 수 있습니다.
// 이는 삼항 연산자(조건 ? 참 : 거짓)의 필요성을 제거합니다(코틀린에는 삼항 연산자가 없습니다).
fun main() {
//    val result = if (조건) {
//        // 조건이 true일 때 반환될 값
//    } else {
//        // 조건이 false일 때 반환될 값
//    }

    val number = 7
    val result = if (number % 2 == 0) "짝수" else "홀수"
    println(result) // "홀수" 출력
    /*
     * 그래서 다음과 같이 'if 문을 활용하여 변수에 값을 할당할 수 있음'.
     * '값을 할당해아 하므로 반드시 else 문이 필요'.
     */

}