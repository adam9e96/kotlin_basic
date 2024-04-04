package `02`

fun main() {
    /*
     * 1. for 반복문
     * for 다음의 괄호 (()) 안에 반복할 범위를 지정하면 for 블록의 코드가 지정한 횟수만큼 반복해서 동작.
     * for (반복할 범위) {
     *    실행 코드
     * }
     *
     * 1) for in ..  (온점2개): 일반적인 형태의 for 반복문
     * 시작값과 종료값으로 지정한 숫자 범위만큼 코드를 반복하는 일반적인 방법.
     * in을 사용해서 반복하는 범위의 숫자를 변수에 담아두고 사용.
     * for (변수 in 시작값..종료값){
     *     실행코드
     * }
     *
     * 1부터 10까지 열 번 반복하면서 그 숫자를 변수 index에 가장 먼저 저장하고, for 블록의 코드를 실행.
     * 첫 번째 반복에선느 변수 index에 '1'이 저장되고, 두 번째 반복에서는 index에 '2' 가 저장
     *
     */
    for (index in 1..10) {
        println("현재 숫자는 ${index}")
    }
    /*
     * 2) until : 마지막 숫자 제외하기
     * 시작값과 종료값 사이의 .. 대신에 until 을 사용하면 '종료값 이전' 까지만 반복.
     * for (변수 in 시작값 until 종료값) {
     *  실행 코드
     * }
     *
     *  배열의 index 가 항상 0 부터 시작하기 때문에 배열의 인덱스를 사용하여 처리하는 코드에서 사용.
     *  배열의 인덱스가 0부터 시작하기 때문에 배열의 크기는 항상 '마지막 인덱스+1 의 값'.
     *  따라서 반복을 할 때 배열의 크기 바로 전까지만 반복.
     *
     *
     */
    // 자바의 array를 코틀린으로 표현하자면
    // 컬렉션과 비슷함
    val array: Array<String> = arrayOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN")
//    for (index in 0 until array.size) {
    for (index in 0 until array.size) {
        println("현재 월은 ${array[index]}입니다.")
    }
}