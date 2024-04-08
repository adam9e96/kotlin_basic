package `03_loop`

fun main() {
    var result = 0
    var num = 0 // 초기 값 0으로 설정

    println("while 문으로 작업")
    while (num >= 0) {
        println("정수를 입력하세요. (음수를 입력하면 종료)")
        num = readln().toInt() // 사용자 입력 받기
        if (num >= 0) result += num // 음수가 아닐 경우에만 결과에 추가
    }
    println("누적 합 : $result")
}
