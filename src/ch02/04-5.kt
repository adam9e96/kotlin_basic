package ch02

fun main() {
    /*
     * 사용자에게 성적을 입력받아
     * if 문을 사용해서 학점을 출력하는 코드를 완성하세요.
     * 입력은 0 ~ 100 까지 입력이 됩니다.
     * * 기준은 아래와 같습니다.
     * * A : 90 ~ 100
     * * B : 80 ~ 89
     * * C : 70 ~ 79
     * * D : 60 ~ 69
     * * F : 0 ~ 59
     * 
     * 예) 성적을 입력하세요 : 81
     * 학점 B
     */
    println("성적을 입력하세요")
    // 1. 사용자에게 성적을 입력 받음
    val num = readln().toInt()
    val result: String
    if (num >= 90) {
        result = "A"
    } else if (num >= 80) {
        result = "B"
    } else if (num >= 70) {
        result = "C"
    } else if (num >= 60) {
        result = "D"
    } else {
        result = "F"
    }

    println("학점 $result")

}