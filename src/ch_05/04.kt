package ch_05

/**
 * fileName       : `04`
 * date           : 2024-04-12
 * time           : 오후 3:20
 * ===========================================================
 * description    :
 */
fun main() {
    /**
     * 3. 맵 Map
     * 맵은 키 Key 와 Value 의 쌍으로 입력되는 컬렉션.
     * 앱의 키는 리스트의 인덱스와 비슷한데 맵에는 키를 직접 입력해야 함.
     * 키는 중복되지 않도록 해야 함.
     *
     * 제네릭으로 키와 값의 데이터 타입을 지정해서 맵을 생성.
     * 맵의 요소는 Pair(A, B)를 사용하는데 이는 A to B 로도 표현할 수 있음.
     */
    // 읽기 전용 맵
    val immutableMap = mapOf("name" to "tom", "age" to 28, "age" to 20, "height" to 170)
    println(immutableMap) // {name=tom, age=20, height=170}
    // key 는 중복불가.
    // 중복되는 키값이 있을 경우 업데이트 된다.

    var map = mutableMapOf<String, String>()

    /**
     * 2) 값 추가하기
     * 값을 추가하기 위해 제공되는 put 메서드에 키와 값을 입력
     */
    map.put("키1", "값1")
    map.put("키2", "값2")
    map.put("키3", "값3")

    /**
     * 3) 맵 사용하기
     * get 메서드에 키를 직접 입력해서 값을 사용할 수 있음.
     */
    println("map에 입력된 키1의 값은 ${map.get("키1")}입니다.") // map에 입력된 키1의 값은 값1입니다.

    /**
     * 4) 맵 수정하기
     * put() 메서드를 사용할 때 동일한 키를 가진 값이 있으면 키는 유지된 채로 값만 수정.
     */
    map.put("키2","수정한 값")
    map["키2"] = "수정한 값"

    println("map에 입력된 키2의 값은 ${map.get("키2")}입니다.") // map에 입력된 키2의 값은 수정한 값입니다.

    /**
     * 5) 맵 삭제하기
     * remove() 메서드에 키를 입력해 값을 삭제할 수 있음..
     *
     */
    map.remove("키1")

    // 없는 값을 불러오면 null 이 출력됨
    println("map 에 입력된 키1의 값은 ${map.get("키1")}입니다.") // map 에 입력된 키1의 값은 null 입니다.

}