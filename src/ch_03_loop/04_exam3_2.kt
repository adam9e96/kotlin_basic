package ch_03_loop

fun main() {/*
     * 음수가 입력될 때까지, 사용자가 입력한 정수의 합계를 계산하여 출력하는 프로그램을 작성하세요.
	 * while문을 사용, break 사용하지 말 것
	 * 1) while문으로 작업
	 * 2) do while문으로 작업
     */

    // 사용자가 정수를 입력함
        var result = 0
        var num: Int // 변수 선언

        println("\ndo..while 문으로 작업")
        do {
            println("정수를 입력하세요. (음수를 입력하면 종료)")
            num = readln().toInt() // 사용자 입력 받기
            if (num >= 0) result += num // 음수가 아닐 경우에만 결과에 추가
        } while (num >= 0) // 조건 검사는 사용자 입력 후에 이루어짐

        println("누적 합 : $result")

}