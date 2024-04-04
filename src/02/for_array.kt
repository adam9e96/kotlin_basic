package `02`

fun main() {
// 1.  for 기본 배열 예제
    val arr = arrayOf(1, 2, 3, 4, 5)

    for (num in arr) {
        println(num)
        // 1
        // 2
        // 3
        // 4
        // 5
    }

    println()

//     2) 변수의 증가, step 사용
    for (i in 0..10 step 2) {
        println(i)
    }

    println()

    // 3. 변수의 감소 downTo 사용
    for (i in 10 downTo 0 step 2) {
        println(i)
    }
}