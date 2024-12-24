package ch02

fun main() {
    /*
     * 4) 파라미터 없는 when 사용하기
     * when 다음에 오는 괄호를 생략하고 마치 if 문처럼 사용할 수 있음.
     */
    val currentTime = 6
    // when에 파라미터가없고 if 문처럼 사용이 가능하다.
    when {
        currentTime == 5 -> {
            println("현재 시간은 5시입니다.")
        }

        currentTime > 5 -> {
            println("현재 시간은 5시가 넘었습니다.")
        }

        else -> {
            println("현재 시간은 5시 이전입니다.")
        }
    }
}