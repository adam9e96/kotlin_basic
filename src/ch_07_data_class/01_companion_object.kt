package ch_07_data_class

/**
 * fileName       : `01`
 * date           : 2024-04-17
 * time           : 오후 2:03
 * ===========================================================
 * description    : companion object
 */

object Cat {
    var name: String = "pinky"
    fun prinName() {
        println("Cat의 이름은 ${name}입니다.")
    }
}
//  Cat은 object로 선언되었기 때문에 프로그램 전체에서 하나의 Cat 인스턴스만 존재합니다.
//  따라서 Cat 객체에 직접 접근하여 속성과 메서드를 사용할 수 있습니다.
//  Cat.name을 변경하고 prinName()을 호출하여 이름을 출력합니다.

/*
  1. 컴패니언 오브젝트 companion object
  companion object 는 일반 클래스에 object 기능을 추가하기 위해서 사용.
  클래스 코드 안에 companion object 블록으로 감싸주면 생성과정없이 오브젝트 처럼 사용할 수 있음.
 */

class Dog {
    companion object {
        var name: String = "None"
        fun pritName() {
            println("Dog 이름은 ${name} 입니다.")
        }
    }

    fun walk() {
        println("Dog가 뛰어갑니다.")
    }

}

fun main() {
    Cat.name = "mikey"
    Cat.prinName()  // 출력: Cat의 이름은 mikey입니다.

    // companion object 안의 코드 사용하기
    Dog.name = "SHIBA_INU"
    Dog.pritName() // Dog 이름은 SHIBA_INU 입니다.

//    Dog.walk()  // companion object 밖에 선언된 메서드는 사용하지 못함. 객체 생성 필요

    // companion object 밖의 코드 사용하기
    val dog = Dog()
    dog.walk()  // 출력: Dog가 뛰어갑니다.

}
