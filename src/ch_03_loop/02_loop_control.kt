package ch_03_loop

/**
 * fileName       : `02_loop_control`
 * date           : 2024-04-08
 * time           : 오후 9:49
 * ===========================================================
 * description    :
 * 루프문(반복문)의 흐름을 제어하는 문법으로는 `break`와 `continue`가 있습니다.
 * - `break` : 루프에서 즉시 탈출하여 루프 다음의 코드 실행을 계속합니다.
 * - `continue` : 현재 반복을 즉시 종료하고, 루프의 다음 반복 조건을 평가하여 계속 진행합니다.
 */

fun main() {
    /*
     * 3. 반복문 제어하기
     *
     * 1) break : 반복문 탈출하기
     * `break`는 현재 실행 중인 반복문을 완전히 종료시키고,
     * 반복문 바깥의 다음 명령어로 프로그램의 흐름을 이동시킵니다.
     */
    for (index in 1..10) {
        println("현재 index : ${index}입니다.")
        if (index > 5) { // index가 5보다 크면 break 명령어로 현재 반복문을 벗어남.
            break
        }
    }

    /*
     * 2) continue : 다음 반복문으로
     * `continue`는 현재 진행 중인 반복을 건너뛰고, 루프의 다음 반복 조건을 평가하여
     * 루프를 계속 진행합니다. 이를 통해 특정 조건에서만 코드를 건너뛰고 싶을 때 유용합니다.
     */
    for (except in 1..10){
        // except가 3보다 크고 8보다 작으면 continue 명령으로 로그를 찍지 않고 다음 반복문으로 이동.
        if (except > 3 && except < 8) {
            continue
        }
        println("현재 index 는 ${except} 입니다.")
    }
}
