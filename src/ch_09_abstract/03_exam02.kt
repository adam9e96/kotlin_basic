package ch_09_abstract

import kotlin.math.PI
import kotlin.math.sqrt

/**
 * fileName       : `03_exam02`
 * date           : 2024-04-22
 * time           : 오후 8:40
 * ===========================================================
 * description    :
 *
 * 문제: 도형 관리 시스템 구축
 * 설명:
 *
 * 여러분은 다양한 도형의 넓이와 둘레를 계산하고, 이 도형들을 관리할 수 있는 시스템을 구축해야 합니다. 이 시스템은 도형의 추가, 제거, 그리고 도형의 유형에 따른 분류 기능을 제공해야 합니다.
 * 요구 사항:
 *
 *     Shape라는 추상 클래스를 만듭니다. 이 클래스는 다음과 같은 메소드를 가집니다:
 *         area(): 도형의 넓이를 계산하여 반환합니다.
 *         perimeter(): 도형의 둘레를 계산하여 반환합니다.
 *
 *     여러 하위 클래스를 만들어 Shape 클래스를 상속받습니다:
 *         Circle: 원의 넓이와 둘레를 계산합니다.
 *         Rectangle: 직사각형의 넓이와 둘레를 계산합니다.
 *         Triangle: 삼각형의 넓이와 둘레를 계산합니다. (헤론의 공식 사용)
 *
 *     ShapeManager라는 클래스를 만들어 다양한 도형을 관리합니다. 이 클래스는 다음 기능을 제공해야 합니다:
 *         도형 추가
 *         도형 제거
 *         도형 리스트 출력
 *         특정 조건(예: 넓이가 50 이상인 도형)에 맞는 도형 찾기
 */
abstract class Shape2 {
    abstract fun area(): Double // 도형의 넓이를 계산하여 반환
    abstract fun perimeter(): Double
}

class Circle2(private val radius: Double) : Shape2() {
    override fun area(): Double {
        return radius * radius * PI
    }

    override fun perimeter(): Double {
        return 2 * radius * PI
    }
}

class Rectangle2(private val width: Double, private val height: Double) : Shape2() {
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width * height)
    }
}

class Triangle(val a: Double, val b: Double, val c: Double) : Shape2() {
    override fun area(): Double {
        val s = (a + b + c) / 2
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }

    override fun perimeter(): Double {
        return a + b + c
    }
}

class ShapeManager {
    private val shapes = mutableListOf<Shape2>()

    //       도형 추가
    fun addShape(shape: Shape2) {
        shapes.add(shape)
    }

    //       도형 제거
    fun removeShape(abc: Shape2) {
        shapes.remove(abc)
    }

    //       도형 리스트 출력
    fun listShapes() {
        shapes.forEach { shape ->
            println("Shape: ${shape::class.simpleName}, Area: ${shape.area()}, Perimeter: ${shape.perimeter()}")
        }
    }

    //       특정 조건(예: 넓이가 50 이상인 도형)에 맞는 도형 찾기
    fun findShapes(condition: (Shape2) -> Boolean): List<Shape2> {
        return shapes.filter(condition)
    }
}

fun main() {
    val manager = ShapeManager()
//    println(manager.listShapes())
    manager.addShape(Circle2(5.0))
    manager.addShape(Rectangle2(4.0, 3.0))
    manager.addShape(Triangle(3.0, 4.0, 5.0))

    manager.listShapes()

    val largeShapes = manager.findShapes { it.area() > 50 }
    println("Large Shapes: ${largeShapes.size}")
}