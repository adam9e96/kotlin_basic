package ch1

// 두 개의 매개 변수와 반환형이 있는 함수
// 두 개의 인자값을 받고 두 인자의 합을 반환 하는 함수
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun minus(a: Int, b: Int): Int {
    return a - b
}

fun main() {
    print("sum of 3 and 5 is ")
    println(sum(3, 5))

    print("minus of 3 and 5 is ")
    println(minus(3, 5))
}
