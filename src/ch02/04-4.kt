package ch02

import java.util.Scanner

fun main() {
    /*
     * 사용자에게 입력 받은
     * 정수가 양수인지, 0인지, 음수인지 알려주는 코드를 완성하세요.
     */
    println("정수를 입력하세요.")
    // 코틀린에서 입력받기
//    val num = readln().toInt()
    // readIn : 콘솔로 입력을 받는데 반환타입이 String 임
    val result3: String

    // 자바에 있는 라이브러리를 가져와서 사용하는 것도 가능하다.
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()

    if (num > 0) {
        result3 = "양수"
    } else if (num < 0) {
        result3 = "음수"
    } else {
        result3 = "0입니다."
    }
    println(result3)
}