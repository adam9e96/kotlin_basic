package `02`

//
    fun main() {
        print("임의의 양수를 입력하세요 >>> ")
        val userInput = readln().trim().toInt()
        val sum = (userInput * (userInput + 1)) / 2
        println("1부터 $userInput 사이의 모든 정수의 합계는 $sum 입니다.")
}