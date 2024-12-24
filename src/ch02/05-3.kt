package ch02

/*
 *
 */

fun main() {
    /*
     * 3) 범위 값을 비교하기
     * in 을 사용해서 범위 값을 비교할 수 있음. if 문의 비교 연산자 중 <=, >= 과 같은 기능을 구현할 수 있음.
     */
    val ageOfMichael = 19
    when (ageOfMichael){
        // between a and b 와 유사함
        in 10..19 -> {
            println("마이클은 10대입니다.")
        }
        !in 10..19 ->{
            println("마이클은 10대가 아닙니다.")
        }
        else ->{
            println("마이클의 나이를 알 수 없습니다.")
        }
    }
}