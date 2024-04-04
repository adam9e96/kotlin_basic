package `02`

fun main() {

    println("성적을 입력하세요 :")
    val num = readln().trim().toInt()

    // case1
    val result3: String = when (num / 10 * 10) {
        90, 100 -> "A"
        80 -> "B"
        70 -> "C"
        60 -> "D"
        else -> "F"
    }
    // case2
    val result6: String = when {
        num >= 90 -> "A"
        num >= 80 -> "B"
        num >= 70 -> "C"
        num >= 60 -> "D"
        else -> "F"
    }

    println("입력하신 성적은 ${num}점이고, 학점은 $result3 입니다.")
    println("입력하신 성적은 ${num}점이고, 학점은 $result6 입니다.")
}
