package innerfunction

/**
 * fileName       : `01`
 * date           : 2024-04-18
 * time           : 오전 1:49
 * ===========================================================
 * description    :

 */
fun main() {

    /*
        문제 1: 문자열 반전
        주어진 문자열을 반전시키는 함수를 작성하세요. 예를 들어, 입력된 문자열이 "hello"라면, "olleh"를 출력해야 합니다.

        요구 사항:
        reversed() 함수를 사용하여 문자열을 반전시킵니다.
        예상 출력:
        입력: "hello"
        출력: "olleh"
     */
    println("문자를 입력하세요")
    val userInput = readln().toString()
//    println(userInput)

    // 문자열 반전 테스트

    println(userInput.reversed())

    println(reverseString(userInput))

    /*
        문제 2: 리스트 필터링
        정수 리스트가 주어졌을 때, 짝수만을 포함하는 새로운 리스트를 반환하는 함수를 작성하세요.

        요구 사항:
        filter 함수를 사용하여 짝수만을 추출합니다.
        예상 출력:
        입력: [1, 2, 3, 4, 5, 6]
        출력: [2, 4, 6]
     */

    val numbers = listOf(1, 2, 3, 4, 5, 6)

    // 리스트 필터링 테스트

    print("짝수만 출력1: [")
    for (n in numbers) {
        if (n % 2 == 0) {
            print("${n}, ")
        }
    }
    print("]")

    println()

    println("짝수만 출력 2: ${numbers.filter {
        it % 2 == 0
    }}")
    println("짝수만 출력 3: ${filterEvenNumbers(numbers)}")


    /*
    문제 3: 최대값 찾기
    정수 리스트에서 최대값을 찾는 함수를 작성하세요.

    요구 사항:
    maxOrNull() 함수를 사용하여 리스트에서 최대값을 찾습니다.
    예상 출력:
    입력: [1, 2, 3, 4, 5, 6]
    출력: 6
     */
    val numbers2 = listOf(10,50,20,30,40)
    var result:Int = 0
    for (n in numbers2) {
        if (result < n){
            result = n
        }
    }

    // 최대값 찾기 테스트
    println("가장 큰 수 : $result")

    println("가장 큰 수2: ${findMaxNumber(numbers2)}")
}

fun reverseString(s: String): String {
    return s.reversed()
}

fun filterEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }
}

fun findMaxNumber(numbers: List<Int>): Int? {
    return numbers.maxOrNull()
}