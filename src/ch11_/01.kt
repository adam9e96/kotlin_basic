package ch11_

/**
 * fileName       : `01`
 * date           : 2024-04-24
 * time           : 오후 2:04
 * ===========================================================
 * description    :
 */
/*
     지연 초기화
     코틀린은 지연 초기화를 사용하는데 이는 클래스의 코드에 Nullable 처리가 남용되는 것을 방지해 줌.

    1. lateinit
    개발을 하다 보면 클래스 안에서 변수(프로퍼티)만 Nullable로 미리 선언해 놓고 초기화(생성자 호출)를 나중에 해야 할 경우가 있는데,
    이럴 경우 lateinit 키워드를 사용할 수 있음.

    1) Nullable 로 선언하는 일반적인 방법
    일반적인 선언 방식으로 처음에 null 값을 입력해두고, 클래스의 다른 메서드 영역에서 값을 입력함.
 */
class Person {
    var name: String? = null

    init {
        name = "Jane"
    }

    fun process() {
        name?.plus("Messi")
        println("이름의 길이= ${name?.length}")
        println("이름의 첫글자 = ${name?.substring(0, 1)}")
    }
}

/*
    이 방식은 변수에 입력된 값의 메서드나 프로퍼티를 사용할 때 Safe Call(?.) 이 남용되어 가독성을 떨어트리는 문제가 있음.
 */
//fun main() {
//
//    val person = Person()
//    person.process()
//    println(person.name)
//}

/*
    2) lateinit 을 사용하는 방법
    lateinit 을 사용하면 Safe Call 을 쓰지 않을 수 있기 때문에 코드에서 발생할 수 있는 수많은 ? 를 방지할 수 있음.
 */

class Person2 {
    lateinit var name: String

    init {
        name = "Jane"
    }

    fun process() {
        name?.plus("Messi")
        println("이름의 길이= ${name?.length}")
        println("이름의 첫글자 = ${name?.substring(0, 1)}")
    }
}

/*
    lateinit의 특징은 다음 세 가지를 들 수 있다.
    var 로 선언된 클래스의 프로퍼티에서만 사용할 수 있음.
    null은 허용되지 않음.
    기본 자료형 Int, Long, DOuble, Float 등은 사용할 수 없다.

    lateinit을 사용할 때는 주의할 점이 있다.
    lateinit 은 변수를 미리 선언만 해놓은 방식이기 때문에 초기화되지 않은 상태에서 메서드나 프로퍼티를 참조하면 null 예외가 발생해서 앱이 종료.
    따라서 변수가 초기화 되지 않은 상황이 발생할 수 있다면 Nullable이나 빈 값으로 초기화하는 것이 좋음.
 */
