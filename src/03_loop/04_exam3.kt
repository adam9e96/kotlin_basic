package `03_loop`

fun main() {
    /*
     * 음수가 입력될 때까지, 사용자가 입력한 정수의 합계를 계산하여 출력하는 프로그램을 작성하세요.
	 * while문을 사용, break 사용하지 말 것
	 * 1) while문으로 작업
	 * 2) do while문으로 작업
     */

    // 사용자가 정수를 입력함
    var isTrue: Boolean = true
    var result: Int = 0
    while (isTrue) {
        println("정수를 입력하세요.")
        val num = readln().toInt()
        result += num
        if (num <= 0) {
            isTrue = false
        }
    }
    println("누적 합 : ${result}")
}