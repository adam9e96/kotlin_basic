package ch_04_function

/**
 * fileName       : `04_function_exam02`
 * date           : 2024-04-09
 * time           : 오후 3:25
 * ===========================================================
 * description    :
 */

fun main() {
    /* 배열을 전달 받아 짝수만 출력하는 메서드 작업 */
    val numbers = IntArray(10)
    for (n in numbers.indices) {
        numbers[n] = n + 1
    }
    //
    println("main() : ")
    for (i in numbers.indices) {
        println(numbers[i])
        if (i < numbers.size - 1) {
            print(", ")
        }
    }
    println()
    printOdd(numbers) // printOdd() : 2, 4, 6, 8, 10

}

fun printOdd(numbers: IntArray) {
    print("printOdd() :")
    // case1
//    for (i in numbers.indices) {
////        print(numbers[i])
//        if (numbers[i] % 2 == 0) {
//            print(numbers[i])
////            println("임 ${numbers[i]}")
//            if (i < numbers.size - 1) {
//                print(", ")
//            }
//        }
//    }
    // 필터 함수도 사용가능하다!
    val odds = numbers.filter { result -> result % 2 == 0 }
    print(odds)

}
