package ch_08

/**
 * fileName       : `01`
 * date           : 2024-04-18
 * time           : 오후 2:05
 * ===========================================================
 * description    :
 */
fun main() {
    /*
    클래스 상속과 확장
    코틀린은 클래스의 재사용을 위해서 상속을 지원

    상속을 지원하는 예를 들면 `Activity` 라는 클래스가 미리 만들어지고, 이 Activity 클래스 내부에는
    글자를 쓰는 기능, 그림을 그리는 기능, 화면에 새로운 창을 보여주는 기능이 미리 정의되어 있음.
    상속이 있기에 이런 기능을 직접 구현하지 않고 Activity 클래스를 상속받아 약간의 코드만 추가하면 앱에 필요한 기능을 추가할 수 있음.

    상속은 코드를 재활용하는 측면도 있지만, 코드를 체계적으로 관리할 수 있기 때문에 규모가 큰 프로젝트로 효과적으로 설계할 수 있음.

    1. 클래스의 상속
    상속 대상이 되는 부모 클래스는 open 키워드로 만들어야만 자식 클래스에서 사용할 수 있음.
    만약 open 키워드로 열려 있지 않으면 상속할 수 없음.
    상속을 받을 자식 클래스에서는 콜론을 이용해서 상속할 부모 클래스를 지정.

    그리고 상속은 부모 클래스를 자식이 갖는 과정이기 떄문에 부모 클래스명 다음에  괄호를 입력해서 꼭 부모의 생성자를 호출해야 함.

    open class 상속될 부모 클래스 {
        // 코드
    }

    class 자식 클래스 : 부모 클래스() { // ()는 부모 클래스의 생성자 호출
        // 코드
    }

    2. 생성자가 있는 클래스의 상속
    상속될 부모 클래스의 생성자에 파라미터가 있다면 자식 클래스를 통해 값을 전달할 수 있음.

    open class 상속될 부모 클래스(value : String){
        // 코드
    }
    class 자식 클래스(value : String) : 부모 클래스(value){
        // 코드
    }
    부모 클래스에 세컨더리 생성자가 있다면, 역시 자식 클래스의 세컨더리 생성자에서 super 키워드로 부모 클래스에 전달할 수 있음.
    부모 클래스의 세컨더리 생성자를 이용하는 경우에는 부모 클래스명 다음에 오는 괄호를 생략.
     */

    open class Parent {
        var hello: String = "안녕하세요"
        fun sayHello() {
            println(hello)
        }
    }

    class Child : Parent() {
        fun myHello() {
            hello = "Hello"
            sayHello()
        }

    }

    val child = Child()
    child.myHello()
    /*
     4. 프로퍼티와 메서드 재정의 : 오버라이드
     상속받은 부모 클래스의 프로퍼티와 메서드 중에 자식 클래스에서는 다른 용도로 사용해야 하는 경우가 있음.
     동일한 이름의 메서드나 프로퍼티를 사용할 필요가 있을 경우에 override 키워드를 사용해서 재정의 할 수 있음.
     오버라이드 할 때는 프로퍼티나 메서드도 클래스 처럼 앞에 open 을 붙여서 상속할 준비가 되어 있어야 함.

     1. 메서드 오버라이드
     상속할 메서드 앞에 open 키워드를 붙이면 오버라이드 할 수 있지만, open 키워드가 없는 메서드는 오버라이드 할 수 없음.
     */
    open class BaseClass {
        open fun opened() {

        }

        fun notOpened() {

        }
    }

    class ChildClass : BaseClass() {
        override fun opened() {
            super.opened()
        }
    }

    /*
    2. 프로퍼티 오버라이드
    메서드 오버라이드처럼 프로퍼티 역시 open 으로 열려 있어야만 오버라이드를 할 수 있음.
     */
    open class BaseClass2 {
        open var opened: String = "I am"
    }

    class ChildClass2 : BaseClass2() {
        override var opened: String = "You are"
    }

    /*
     3. 익스텐션
     코틀린은 클래스 , 메서드, 프로퍼티에 대한 익스텐션 extensions 을 지원.
     이미 만들어져 있는 클래스에 다음과 같은 형태로 추가할 수 있음.

     fun 클래스.확장할 메서드() {
     // 코드
     }
     */
    // 자바의 경우 새로운 클래스를 만들고 원본 클래스를 상속받아 메서드 2개를 추가해야 했는데 코틀린은 쉽다.

    /*
     상속이 미리 만들어져 있는 클래스를 가져다 쓰는 개념이라는 익스텐션은 미리 만들어져 있는 클래스에 메서드를 넣는 개념.
     자신이 만든 클래스에 사용하기 보다는 누군가 작성해둔, 이미 컴파일 되어 있는 클래스에 메서드를 추가하기 위한 용도로 사용하는 것이 좋음

     익스텐션을 사용한다고 해서 실제 클래스의 코드가 변경되는 것은 아니며 단지 실행 시에 점 연산자로 호출해서 사용할 수 있도록 해줌.
     특별한 경우를 제외하곤느 거의 메서드 확장 용도로 사용이 됨.

     아래 코드는 기본 클래스인 String 에 addText 메서드를 확장하는 코드.
     test 함수에 선언한 original 에 문자열을 입력했기 때문에 original 은 String 의 익스텐션 메서드인 addText 호출해서 사용할 수있음.
     
     */

    fun String.addText(word: String): String {
        return this + word
    }
    fun testStringExtension() {
        val original = "Hello"
        val added = "Guys~"

        print("added를 더한 값은 ${original.addText(added)}입니다.")

    }
        testStringExtension(); // 출력 : added를 더한 값은 HelloGuys~입니다.

}