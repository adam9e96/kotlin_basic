package ch02

fun main() {
    /*
     * 3) step : 건너뛰기
     * 예를 들어 1부터 100까지 반복하면서 3의 배수만 사용하고 싶을 떄 사용.
     * 이럴 때 step을 사용하면 for 문의 블록을 step 수만큼 건너 뛰어서 실행.
     * for (변수 in 시작값..종료값 step 3){
     *     실행 코드
     * }
     */
    for (index in 0..100 step 3) {
        println("현재 숫자는 ${index}입니다.")
    }
    /*
     * 4) downTo : 감소시키기
     * .. 대신 downTo 를 사용하면 큰 수에서 작은 수로 감소시키면서 실행할 수 있음.
     */
    println()
    for (index in 10 downTo 0) {
        println("현재 숫자는 ${index}")
    }
    println()
    // 증가할 때와 같이 step 을 사용할 수도 있음.
    for (index in 10 downTo 0 step 3) {
        println("건너뛰면서 감소시키기: ${index}")
    }

    /*
     * 5) 배열, 컬렉션에 들어 있는 엘리먼트 반복하기
     * 배열이나 컬렉션을 엘리먼트의 개수만큼 반복하면서 사용.
     * for (변수 in 배열 또는 컬렉션) {
     *     실행 코드
     * }
     * 인덱스를 사용하는 방법보다 더 편하고 가동성이 좋음.
     */
    val arrayMonth = arrayOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN")
    for (month in arrayMonth) {
        println("현재 월은 ${month}")
    }

    // withIndex() 함수를 이용하면 요소의 인덱스도 함께 가져올 수 있음.
    val students = arrayOf("John", "Peter", "Jane")
    for ((index, name) in students.withIndex()) {
        println("Index: $index, Name: $name")
        // Index: 0, Name: John
        // Index: 1, Name: Peter
        // Index: 2, Name: Jane
    }
}