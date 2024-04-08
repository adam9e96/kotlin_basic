package `03_loop`

fun main() {
    /*
     * 음수가 입력될 때까지, 사용자가 입력한 정수의 합계를 계산하여 출력하는 프로그램을 작성하세요.
	 * while문을 사용, break 사용하지 말 것
	 * 1) while문으로 작업
	 * 2) do while문으로 작업
     */

    // 사용자가 정수를 입력함
    var sum: Int = 0
    var value = 0
    do {
        println("정수를 입력하세요.")
        value = readln().toInt()
        if (value >= 0) {
            sum += value
        }
    } while (value >= 0)
    println("누적 합 : ${sum}")
}