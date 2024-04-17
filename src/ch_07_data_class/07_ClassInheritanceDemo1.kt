package ch_07_data_class

/**
 * fileName       : `07_ClassInheritanceDemo1`
 * date           : 2024-04-18
 * time           : 오전 12:08
 * ===========================================================
 * description    :
 *
 * 문제: 운송 수단 클래스 계층 구성하기
 * 코틀린으로 다양한 운송 수단을 모델링하는 클래스 계층을 구현하세요.
 *
 * 요구 사항:
 * Vehicle 기본 클래스 생성
 *
 * Vehicle 클래스는 모든 운송 수단의 기본이 됩니다.
 * move() 메서드를 포함하며, 이 메서드는 "Moves on its way."라는 메시지를 출력합니다.
 * vehicleInfo() 메서드는 "This is a vehicle"라는 메시지를 출력합니다.
 * Car 클래스 구현
 *
 * Vehicle 클래스를 상속받습니다.
 * move() 메서드를 오버라이드하여 "Car drives on the road."라는 메시지를 출력합니다.
 * vehicleInfo() 메서드를 오버라이드하여 "This is a car"라는 메시지를 출력합니다.
 * Boat 클래스 구현
 *
 * Vehicle 클래스를 상속받습니다.
 * move() 메서드를 오버라이드하여 "Boat sails on water."라는 메시지를 출력합니다.
 * vehicleInfo() 메서드를 오버라이드하여 "This is a boat"라는 메시지를 출력합니다.
 */

open class Vehicle() {  // 모든 운송 수단의 기본 클래스
    open fun move() {
        println("Moves on its way")  // 오타 수정
    }

    open fun vehicleInfo() {
        println("This is a vehicle")
    }
}

class Car : Vehicle() {  // Car 클래스는 Vehicle을 상속받음
    override fun move() {
        println("Car drives on the road.")  // 자동차의 특정 이동 방식 설명
    }

    override fun vehicleInfo() {
        println("This is a car")  // 메시지 일관성 유지
    }
}

class Boat : Vehicle() {  // Boat 클래스는 Vehicle을 상속받음
    override fun move() {
        println("Boat sails on water")  // 배의 특정 이동 방식 설명
    }

    override fun vehicleInfo() {
        println("This is a boat")  // 일관된 메시지 출력
    }
}

fun main() {
    val car = Car()
    car.move()  // "Car drives on the road."
    car.vehicleInfo()  // "This is a car"

    val boat = Boat()
    boat.move()  // "Boat sails on water"
    boat.vehicleInfo()  // "This is a boat"
}