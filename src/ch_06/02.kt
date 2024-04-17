package ch_06

/**
 * fileName       : `02`
 * date           : 2024-04-16
 * time           : 오후 2:43
 * ===========================================================
 * description    :
 */

/*
 4. 오브젝트
 오브젝트 Object 를 사용하면 클래스를 생성자로 인스턴스화 하지 않아도 블록 안의 프로퍼티와 메서드를 호출해서 사용할 수 있음.
 자바의 `static` 과 같은 역할.

 object 코드 블록 안의 프로퍼티와 메서드는 클래스명에 점 연산자를 붙여서 생성자 없이 직접 호출할 수 있음.
 주의할 점은 클래스명을 그대로 사용하기 떄문에 호출하는 클래스명의 첫 글자가 대문자.
 */
object Cat {
    var name: String = "pinky"
    fun prinName() {
        println("Cat의 이름은 ${name}입니다.")
    }
}
/*
  1. 컴패니언 오브젝트 companion object
  companion object 는 일반 클래스에 object 기능을 추가하기 위해서 사용.
  클래스 코드 안에 companion object 블록으로 감싸주면 생성과정없이 오브젝트 처럼 사용할 수 있음.
 */
fun main() {
    Cat.name = "minky"
    Cat.prinName() // Cat의 이름은 minky입니다.
}