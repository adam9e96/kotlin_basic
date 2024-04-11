package `04_function`

/**
 * fileName       : array_01_exam
 * date           : 2024-04-11
 * time           : 오후 3:48
 * ===========================================================
 * description    :
 *     정수 배열 numbers가 주어집니다. 이 배열에는 [3, 1, 4, 1, 5, 9, 2, 6] 값이 포함되어 있습니다.
 *     배열 numbers에서 짝수만을 추출하여 새 배열 evenNumbers를 생성하세요.
 *     evenNumbers 배열의 모든 요소의 합을 계산하세요.
 *     결과를 출력하는 코드를 포함하세요.
 */
fun main() {
    // 1. 정수 배열 numbers 선언 및 초기화
    var numbers = arrayOf(3, 1, 4, 1, 5, 9, 2, 6)

    // 2. 배열 numbers에서 짝수만 추출 -> filter 사용
    val evenNumbers = numbers.filter { number -> number % 2 == 0 }.toTypedArray()

    evenNumbers.forEach { println(it) }

    println(evenNumbers.sum())

}
