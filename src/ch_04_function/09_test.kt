package ch_04_function

/**
 * fileName       : `09_test`
 * date           : 2024-04-11
 * time           : 오후 3:18
 * ===========================================================
 * description    :
 */
fun main() {


    /**
     * ### `in` 연산자와 범위 표현 (`..` 연산자)
     *
     * 코틀린에서는 `in` 과 범위를 표현하는 `..` 연산자를 사용하여 위 코드를 다르게 표현해볼 수 있다.
     * `..` 연산자를 사용하면 특정 수의 범위를 표현할 수 있고,
     * `in` 연산자를 사용하면 해당 범위에 특정 수가 포함되어있는지 검사할 수 있다.
     */

    println(65 in 51..100) // true
    println(30 in 51..100) // false

    val array = arrayOf("사과", "바나나", "체리")
    for (i in array.indices) {
        println("$i: ${array[i]}")
    }
}