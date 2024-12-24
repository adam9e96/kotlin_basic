package ch02

fun main() {
    /*
     * 5) 변수에 직접 if 문 사용하기
     * if문의 조건식 결과를 변수에 대입할 수 있음.
     *
     *
     */
    var a = 5
    var b = 3
    var bigger = if (a > b) a else b
    // 변수에 if의 결과를 넣을때는 if-else 형식이여야 하면 if,else 일때 결과 코드를 명시해야함
    println("bigger: $bigger") // 5

    /*
     * 6) if 문의 마지막 값을 반환값으로 사용하기
     * 위의 코드와 같은데 if문의 코드 영역이 여러 줄일 경우에도 마지막 줄을 변수값으로 사용할 수 있음.
     */
    bigger = if (a > b){
        var c = 30
        a // 마지막 줄의 a 값이 bigger 에 저장
    } else {
        b
    }
    println("bigger : $bigger") // 5
}