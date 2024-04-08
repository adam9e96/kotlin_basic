package `03_loop`

fun main() {
    /*
     * 	컴퓨터가 주사위를 던지면 사용자가 주사위의 숫자를 맞히는 프로그램을 완성하세요.
        사용자가 맞힐 때까지 게임은 계속 됩니다.

        예)
        주사위 값은 얼마일까요? >>> 5
        오답입니다. 다시 시도하세요.
        주사위 값은 얼마일까요? >>> 1
        1! 정답입니다.

        1) break를 사용
        2) break를 사용안하는 경우
     */
    val num1 = (1..6).random()
    // 값이 실행하는 순간 정해짐
    println("num1 : $num1")

    // break 을 사용한 경우
    while (true) {

        print("주사위 값은 얼마일까요? >>> ")
        var userInput = readln().toInt()

        if (userInput == (num1 )) {
            println("${num1} 정답입니다!")
            break
        }else{
            println("오답입니다. 다시 시도하세요.")
        }
    }

}