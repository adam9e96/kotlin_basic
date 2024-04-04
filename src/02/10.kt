package `02`

fun main() {
    /*
     * 	사용자로부터 임의의 양의 정수를 하나 입력받은 뒤 1부터 입력받은 정수까지 모든 정수의 합계를 출력하는 프로그램을 구현하세요.
        실행 예)
        임의의 양수를 입력하세요 >>> 5
        1부터 5사이의 모든 정수의 합계는 15입니다.
     */
    print("임의의 양수를 입력하세요 >>> ")
    var sum = 0
    var userInput = readln().trim().toInt()
    for (index in 1..userInput){
        sum += index
    }
    println("1부터 ${userInput}사이의 모든 정수의 합게는 ${sum}입니다.")
}