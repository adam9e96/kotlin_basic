package `04_function`

import  kotlin.math.PI

/**
 * 원의 넓이를 계산하는 함수
 */

fun circleArea(radius: Double): Double {
    //    radius++
    // Val cannot be reassigned
    // 코틀린의 함수 파라미터는 기본적으로 val(불변)이다. 즉, 함수 본문에서 파라미터 값을 변경하면 컴파일 오류가 발생한다.
    return PI * radius * radius
}

fun main() {
    print("Enter radius : ")
    val radius = readLine()!!.toDouble()
    println("Circle area : ${circleArea(radius)}")
}