package ch02

// 하지만 코틀린의 when 문은 다른 언어와는 다르게 같은 값뿐만 아니라 범위 값도 처리할 수 있고 사용 방법도 더 많음.
// 코틀린에서의 when 문은 특정 값을 선택할 수 있는 switch 의 사용법에 if 문의 버무이 비교 기능이 더해진 if 문의 확장판임
fun main() {
    /*
     * 2) 콤마로 구분해서 when 사용하기
     * 특정 값을 비교하는데 결과 처리가 동일하다면 콤마(,) 로 구분해서 한 번에 비교할 수 있음
     */
    val now = 9
    when (now) {
        8, 9 -> {
            println("현재 시간은 8시 또는 9시입니다.")
        }

        else -> {
            println("현재 시간은 9시가 아닙니다.")
        }
    }

}