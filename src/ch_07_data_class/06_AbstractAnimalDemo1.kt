package ch_07_data_class

/**
 * fileName       : `06_abstract_test`
 * date           : 2024-04-17
 * time           : 오후 11:53
 * ===========================================================
 * description    :
 *
 * 문제: 추상 클래스를 이용한 동물 클래스 구현
 * 요구 사항:
 * Animal 추상 클래스 생성
 *
 * makeSound()라는 추상 메서드를 포함합니다. 이 메서드는 동물의 소리를 출력합니다.
 * Dog 클래스 구현
 *
 * Animal 클래스를 상속받습니다.
 * makeSound() 메서드를 오버라이드하여 "Woof!"를 출력합니다.
 * Cat 클래스 구현
 *
 * Animal 클래스를 상속받습니다.
 * makeSound() 메서드를 오버라이드하여 "Meow!"를 출력합니다
 */

abstract class Animal { // Animal 추상 클래스 생성
    abstract fun makeSound() // 동물의 소리를 출력하는 추상 메서드
}

class Dog2 : Animal() { // Animal 클래스 상속
    override fun makeSound() {
        println("Woof!")
    }
}
class Cat2 : Animal() {
    override fun makeSound() {
        println("Meow!")
    }
}

fun main() {
    val myDog = Dog2()
    val myCat = Cat2()

    myDog.makeSound()
    myCat.makeSound()
    // Woof!
    // Meow!

}