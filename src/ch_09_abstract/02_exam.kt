package ch_09_abstract

import kotlin.math.PI
import kotlin.time.times

/**
 * fileName       : `02_exam`
 * date           : 2024-04-22
 * time           : 오후 8:27
 * ===========================================================
 * description    :
 *
 * 문제: 도형의 넓이 계산
 * 설명:
 *
 * 여러분은 도형의 넓이를 계산하는 프로그램을 작성해야 합니다. 이 프로그램은 여러 종류의 도형을 처리할 수 있어야 하며, 각 도형의 넓이를 계산하는 로직은 해당 도형 클래스에서 구현해야 합니다.
 * 요구 사항:
 *
 *     추상 클래스 Shape를 정의합니다. 이 클래스에는 area()라는 추상 메소드가 있어야 하며, 이 메소드는 도형의 넓이를 반환합니다.
 *     두 개의 하위 클래스 Circle과 Rectangle을 만들어 Shape 클래스를 상속받습니다.
 *         Circle 클래스는 반지름을 인자로 받아 객체를 초기화하고, 넓이를 계산하는 area() 메소드를 구현합니다.
 *         Rectangle 클래스는 너비와 높이를 인자로 받아 객체를 초기화하고, 넓이를 계산하는 area() 메소드를 구현합니다.
 *     main 함수에서는 Circle과 Rectangle 객체를 생성하고 각각의 넓이를 출력합니다.
 */
abstract class Shape{
    abstract fun area():Double // 도형의 넓이를 반환

}

class Circle(val radius:Int) : Shape() {
    override fun area(): Double {
        return radius * radius * PI
    }

}
class Rectangle(val width:Int, val height:Int) : Shape() {
    override fun area(): Double {
        return width * height.toDouble()
    }
}

fun main() {
    val circle = Circle(5)
    println("Circle area: ${circle.area()}")  // 원의 넓이 출력

    val rect = Rectangle(5, 10)
    println("Rectangle area: ${rect.area()}")  // 직사각형의 넓이 출력
}