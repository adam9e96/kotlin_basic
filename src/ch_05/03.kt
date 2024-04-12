package ch_05

import kotlin.reflect.typeOf

/**
 * fileName       : `03`
 * date           : 2024-04-12
 * time           : 오후 3:03
 * ===========================================================
 * description    :
 */
fun main() {
    /**
     *  2. 셋 Set
     *  셋은 중복을 허용하지 않는 리스트라고 할 수 있음.
     *  리스트와 유사한 구조이지만 인덱스로 조회할 수 없고, get() 메서드도 지원하지 않음
     *
     *  중복되지 않은 요소들로 만들어지므로 같은 값을 추가하더라도 해당 값은 하나만 저장.
     *  리스트와 마찬가지로 읽기 전용 셋과 읽기/쓰기 모두 가능한 셋, 총 2가지를 제공
     *  각각 setOf(), mutableSetOf() 함수로 객체를 생성.
     */
    // 읽기 전용 셋
    val immutableSet = setOf(1, 1, 2, 2, 2, 3, 3)
    println(immutableSet)

    /**
     * 1) 빈셋으로 초기화하고 값 입력하기
     */
    var set = mutableSetOf<String>()
    set.add("JAN")
    set.add("FEB")
    set.add("MAR")
    set.add("JAN") // 셋은 중복을 허용하지 않기 때문에 동일한 값을 입력되지 않음

    /**
     * 2) 셋 사용하기
     * 인덱스로 조회하는 메서드가 없기 때문에 특정 위치의 값을 직접 사용할 수 없음
     */
    println("Set 전체 출력 : ${set}") // Set 전체 출력 : [JAN, FEB, MAR]

    /**
     * 3) 셋 삭제 하기
     * 값이 중복되 지 않기 떄문에 값으로 직접 조회해서 삭제할 수 있음
     */
    set.remove("FEB")
    println("Set 전체 출력 ${set}")  //Set 전체 출력 [JAN, MAR]

    // 읽기 쓰기 모두 가능한 셋
    val mutableSet = mutableSetOf(1, 1, 2, 2, 2, 3, 3)
    println(mutableSet)
    mutableSet.add(100)
    mutableSet.add(3)

    println(mutableSet.add(101)) // true
    println(mutableSet.add(3)) // false

//    mutableSet.remove(1) //
    println(mutableSet.remove(1)) // true

    println(mutableSet) // [2, 3, 100, 101]

    // add, remove 반환형이 Boolean 인 이유 <-- 조건문으로도 쓰기 위함임

    println(mutableSet.contains(1)) // false
    println(mutableSet.contains(2)) // true
}
