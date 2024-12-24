package ch02

fun main() {
    /*
     * 예) 성적을 입력하세요: 90
     * 입력하신 성적은 90점이고, 학점은 A 입니다.
     */
    println("성적을 입력하세요 :")
    val num = readln().trim().toInt()
//    println(num)
    val result: String
    when {
        num >= 90 -> {
            result = "A"
        }

        num >= 80 -> {
            result = "B"
        }

        num >= 70 -> {
            result = "C"
        }

        num >= 60 -> {
            result = "D"
        }

        else -> {
            result = "F"
        }
    }
    println("입력하신 성적은 ${num}이고,학점은 $result 입니다.")
}