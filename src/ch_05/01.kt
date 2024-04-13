package ch_05

/**
 * fileName       : `01`
 * date           : 2024-04-12
 * time           : 오후 2:06
 * 복습            : 2024-04-13,
 * ===========================================================
 * description    :
 *
 * 컬렉션
 * 자바에서도 리스트 List, 셋 Set, 맵 Map 등 여러 자료 구조를 사용.
 * 코틀린에서도 이러한 컬렉션을 모두 사용할 수 있을 뿐만 아니라 몇 가지 편리한 함수를 추가로 제공.
 * 또한 코틀린은 컬렉션을 읽기 전용 immutable 컬렉션과 읽기-쓰기 mutable 컬렉션으로 크게 두 가지로 구분
 */
fun main() {
    /*
     * 1. 리스트
     * 리스트 List 는 저장되는 데이터에 1) 인덱스를 부여한 컬렉션이며 2) 중복된 값을 입력할 수 있음.
     * 코틀린에서 동적으로 리스트를 사용하기 위해서는 리스트 자료형 앞에 뮤터블 Mutable 이라는 접두어 prefix 가 붙음.
     * 접두어가 있는 리스트도 있지만 잘 사용하지 않기 때문에 항상 mutableList, mutableMap, mutableSet 을 사용함.
     *
     *  뮤터플(mutable)이란
     * 프로그래밍 언어에서 뮤터블은 변할 수 있는 데이터 타입을 가르키는 용어. 변수로는 var 이 뮤터블.
     * 그리고 반대 개념인 이뮤터블 Immutable 이 있는데 이것은 val 과 같이 변할 수 없는 데이터 타입을 가르키는 용어임.
     *
     * 코틀린은 컬렉션 데이터 타입을 설계할 때 모두 이뮤터블로 설계
     * 기본 컬렉션인 리스트, 맵, 셋은 모두 한 번 입력된 값을 바꿀 수 없음.
     * 그래서 컬렉션의 원래 용도인 동적 배열로 사용하기 위해서는 뮤터블로 만들어진 데이터 타입을 사용해야 함.
     *
     * 먼저 읽기 전용 리스트를 만들 것인지, 읽기 쓰기 모두 가능한 리스트를 만들 것인지 정한 후,
     *
     * 읽기 전용 리스트는 listOf() 함수를 사용.
     */

    /**
     * 1. 읽기 전용 리스트 생성
     */
    val immutableList = listOf("apple", "banana", "cherry")
    println(immutableList)  // [apple,  banana, cherry]

    val numberList = listOf(1, 2, 3)

    println(numberList) // [1, 2, 3]

    println(numberList[1]) // 2

    // if) 0번 인덱스 값을 10으로 변경한다면
//    numberList[0] = 10 // immutable 라서 값 변경 불가능 <- ERROR
    // 48번 코드는 오류가 발생하는데, 그 이유는 리스트가 immutable(읽기 전용)이기 떄문.
    // 읽기 쓰기 모두 가능한 리스트를 만들려면 mutableListOf() 함수를 사용하면 됨.
//  ->> 요렇게 해라 val numberList = mutableListOf(1,2,3)

    /**
     * 2.리스트 생성하기 : mutableListOf
     */
    // 읽기 전용과 읽기/쓰기 타입추론도 다름
    // List<String>   <-> MutableList<String>
    val mutableList = mutableListOf("MON", "TUE", "WED") // 3 개의 값을 가진 크기가 3인 동적 배열 리스트가 생성
    println(mutableList) // [MON, TUE, WED]

    /**
     *
     * 2-2) 리스트에 추가하기 : add
     * mutableList 변수에 add 메서드를 사용해서 값을 추가.
     * 값이 추가되면서 동적으로 리스트의 공간이 자동으로 추가
     */
    // 요소 추가 제거 가능
    mutableList.add("THU") // 입력될 위치인 인덱스를 따로 지정해두지 않아도 입력되는 순서대로 인덱스가 지정.
    mutableList.add("JACK")
    mutableList.add("RALO")
    println(mutableList) // [MON, TUE, WED, THU, JACK, RALO]
    println(mutableList.size) // 6

    mutableList.remove("RALO")

    println(mutableList) // [MON, TUE, WED, THU, JACK]

    /**
     * 3.리스트에 입력된 값을 사용하기 : get
     * 입력할 때와는 다르게 사용할 때는 인덱스를 지정해서 몇 번째 값을 꺼낼 것인지 명시.
     *
     * 요소 꺼내근 건 서로 동일한듯 get(1) == [1]
     * 자바의 컬렉션 리스트에선 [] <-- 이게 안됬는데 코틀린은 된다!
     *
     * 고로 2가지 방법이 있음
     */
//    var variable = mutableList.get(1) // 두 번째 값을 변수에 저장.
    var variable = mutableList[1] // 두 번째 값을 변수에 저장.
    println(variable) // TUE
    variable = mutableList[1]
    println(variable) // TUE


    /**
     *  4.리스트 값 수정하기 : set
     *  특정 인덱스 값을 수정
     *
     *  여기도 2가지 방법이 있다.
     */
    mutableList.set(1, "수정할 값") // 두번째 값을 수정.
    println(mutableList) // [MON, 수정할 값, WED, THU, JACK]
    mutableList[1] = "수정할 값" // 두번째 값을 수정
    println(mutableList) // [MON, 수정할 값, WED, THU, JACK]


    for (item in mutableList) {
        println(item)
    }
    /*
    MON
    수정할 값
    WED
    THU
    JACK
     */
    for ((index, value) in mutableList.withIndex()) {
        println("$index : $value")
    }
    /*
    0 : MON
    1 : 수정할 값
    2 : WED
    3 : THU
    4 : JACK
     */

    /**
     * 5.리스트에 입력된 값을 제거하기 : removeAt
     * 리스트에 입력된 값의 인덱스를 지정해서 삭제.
     */
    println(mutableList.get(1)) // 수정할 값
    mutableList.removeAt(1) // 두번째 값을 삭제
    // 두번째 값을 삭제하면 세 번째 값부터 인덱스가 하나씩 감소 하면서 빈자리의 인덱스로 이동.
    println(mutableList.get(1)) // WEB <-- 3번째 인덱스값이 2번째 인덱스로 가면서 출력됨

    /**
     * 6.빈 리스트 사용하기
     * 아무것도 없는 빈 리스트를 생성하면 앞으로 입력되는 데이터 타입을 알 수 없기 떄문에 값의 타입을 추론할 수 없음.
     * 그래서 빈 컬렉션의 경우 앞에서 처럼 '데이터타입of' 만으로는 생성되지 않고 데이터 타입을 직접적으로 알려주는 방법을 사용해야 함.
     *
     * var 변수명 = mutableListOf<컬렉션에 입력될 값의 타입>()
     * var stringList = mutableListOf<String>()
     */
    //
    var intList = mutableListOf<Int>()
    println(intList) // []
    var stringList = mutableListOf<String>() // 문자열로 된 빈 컬렉션을 생성
    println(stringList) //
    stringList.add("월")
    stringList.add("화")
    println(stringList)

    // 화요일 출력
    println(stringList[1])

    // 수정
    stringList.set(1, "수정함화")

    // 삭제
    stringList.removeAt(1)
    println(stringList)

    /**
     * 7.컬렉션 개수 가져오기 : size
     * size 프로퍼티를 사용하면 컬렉션의 개수를 가져올 수 있음.
     *
     */
    println("stringList 에는 ${stringList.size}개의 값이 있습니다.") // stringList 에는 1개의 값이 있습니다.
}