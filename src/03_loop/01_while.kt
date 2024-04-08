package `03_loop`

/**
 * fileName       : `01_while`
 * date           : 2024-04-08
 * time           : 오후 9:49
 * ===========================================================
 * description    :
 */

fun main() {
    /*
     * 2. while 반복문
     */

// current 변수가 인덱스의 역할
    var current = 1
    val until = 12
    while (current < until) {
        println("현재 값은 ${current}입니다.")
        current++
    }
    /*
     * 2) do 와 함께 사용하기
     * do 와 함께 사용하면 while 문의 조건식과 관계없이 do 블록 안의 코드를 한 번 실행
     *
     */
    var game = 1
    val match = 6
    do {
        println("${game}게임 이겼습니다. 우승까지 ${match - game} 게임 남앗습니다.")
        game++

    } while (game < match)
    /*
     * 3) while 과 do ~ while의 차이점
     * 가장 큰 차이점은 최초 값이 조건식을 만족하지 않았을 경우 실행 코드가 달라지는 것.
     * do ~ while 은 조건과 상관없이 처음 한 번 로그가 출력.
     */
    game = 6
    while (game < match) {
        println("while 테스트입니다.")
        game++
    }


    // do ~ while 테스트
    game = 6
    do {
        println("do ~ while 테스트입니다.")
        game++
    } while (game < match)
}
