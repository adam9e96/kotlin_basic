package ch10_null_safety

/**
 * fileName       : `04`
 * date           : 2024-04-23
 * time           : 오후 2:34
 * ===========================================================
 * description    :
 */
/*
    2. 안전한 호출 : ?.
    변수를 Nullable 로 만들기 위해서 물음표를 사용.
    ?. (Safe Call, 물음표와 점) 을 사용하면 null 체크를 간결하게 할 수 있음.

    Nullable 인 변수 다음에 ?. 을 사용하면 해당 변수가 null 일 경우 ?. 다음의 메서드나 프로퍼티를 호출하지 않음.
 */
fun testSafeCall(str: String?): Int? {
    // 문자열 길이를 반환하는 length 프로퍼티를 호출헀는데 str 변수 자체가 null 일 경우에는 length 프로퍼티를 호출하지 않고
    // null 을 반환.

    var result: Int? = str?.length
    return result
}
/*
    3. Null 값 대체하기 : ?:
    ?: (Elvis Operator, 물음표와 콜론)을 사용하면 원본 변수가 null 일 때 넘겨줄 기본값을 설정할 수 있음.

    다음 코드에서 Safe Call 다음에 호출되는 프로퍼티 뒤에 다시 ?: 을 붙이고 0이라는 값을 표시.
    이렇게 호출하면 str 변수가 null 일 경우 가장 뒤에 표시한 0을 반환.
 */

fun testElvis(str: String?): Int {
    // length 오른쪽에 ?: 을 사용하면 null 일 경우 ?: 오른쪽의 값이 반환.
    var resultNonNull: Int = str?.length ?: 0
    return resultNonNull
}

/*
    물음표의 위치와 형태에 따라서 Nullable, Safe Call, Elvis Operator 가 구분.

    Nullable
    표기법 : 선언하는 변수의 타입 다음에 ? 표기.
    사용 목적 : null 을 입력 받기 위해 사용.
    사용 예 : var nullable: String?

    Safe Call
    표기법 : 선언된 변수의 이름 다음에 ?. 표기
    사용목적 : null 일 때 ?. 다음에 나오는 속성이나 명령어를 처리하지 않기 위해 사용.
    사용 예 : var result = 변수?.length

    Elvis Operator
    표기법 : 선언된 변수의 이름 다음에 ?: 표기.
    사용 목적 : null 일 때 ?: 다음에 나오는 값을 기본 값으로 사용.
    사용 예 : var result = 변수 ?: 0
 */
fun main() {
    println(testElvis(null)) // 0
}