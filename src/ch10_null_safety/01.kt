package ch10_null_safety

/**
 * fileName       : `01`
 * date           : 2024-04-23
 * time           : 오후 2:04
 * ===========================================================
 * description    :
 */
/*
7. 제네릭
제네릭 Generics은 입력되는 값의 타입을 자유롭게 사용하기 위한 도구,

다음은 실제 MutableList의 선언부.
public interface MutableList<E> : List<E>, MutableCollection<E>

클래스명 옆에<E>부분에 String 같은 특정 타입이 지정되면 클래스 내부에 선언된 모든 E에 String 타입으로 지정.
결과적으로 var list: Array<E>가 var list: Array<String>으로 변경이 되는 것.

이렇게 설계된 클래스는 주로 구현하는 용도로 사용하며 컬렉션이나 배열에서 입력되는 값의 타입을 특정하기 위해 다음과 같이 사용.
var list: MutableList<String> = mutableListOf("abc", "def", "ghi")
 */

fun testGenerics() {
    // String으로 제네릭을 사용했기 때문에 list 변수에는 문자열만 담을 수 있음.
    var list: MutableList<String> = mutableListOf()
    list.add("abc")
    list.add("def")
    list.add("ghi")
//    list.add(30) // 입력 오류가 발생

    // String 타입의 item 변수로 꺼내서 사용할 수 있음.
    for (item in list) {
        println("리스트에 저장된 값은 ${item}입니다")
    }
}