package ch02


fun main() {
    // 1. 사용자에게 성적을 입력 받음

    println("성적을 입력하세요 :")
    val num = readln().toInt()

    // if 표현식을 사용하여 result 변수에 직접 값을 할당
    val result: String = if (num >= 90) {
        "A"
    } else if (num >= 80) {
        "B"
    } else if (num >= 70) {
        "C"
    } else if (num >= 60) {
        "D"
    } else {
        "F"
    }

    println("학점 $result")
}
