package `01`

fun main() {
    /*
     * 2) 기본형과 참조형의 비교 원리
     *
     * 자료형을 비교할 때는 단순히 값만 비교하는 방법과 참조 주소까지 비교하는 방법이 있음.
     * (자바에서는 기본 자료형은 값을 비교, 참조 자료형은 주소 비교.)
     * 단순히 값만 비교할 때는 이중 등호(==)를 사용하고, 참조 주소를 비교하려면 삼중 등호(===)를 사용
     *
     * 이중 등호는 참조와 상관없이 값이 동일하면 true 를, 값이 다르면 false 를 반환.
     * 삼중 등호는 값과 상광없이 참조가 동일하면 true 를 반환, 값이 다르더라도 참조 주소가 다르면 false 를 반환.
     *
     * 다음은 Int형으로 선언한 변수a, b에 128을 대입하고 이중 등호와 삼중 등호로 비교한 것.
     * 비교 결과는 모두 true. 이 때 참조형으로 선언된 a 와 b는 코틀린 컴파일러가 기본형으로 변환하여 저장한다는 점에 주의
     * 즉, 여기서는 삼중 등호가 비교하는 값도 저장된 값인 128.
     *
     */
    // 코틀린은 모든 것이 참조형이기 때문에 비교 시 2가지 방법을 사용
    val a: Int = 128
    val b: Int = 128
    println(a == b) // true
    println(a === b) // true

    /*
     * 참조 주소가 달라지는 경우는 null 을 허용한 변수.
     * null 을 허용한 변수는 같은 값을 저장해도 이중 등호와 삼중 등호를 사용한 결과값이 다름.
     */
    val c: Int? = 128
    val d: Int? = 128
    println(c == d) // true
    println(c === d) // false
    // 코틀린은 모든 것이 객체. 객체에는 null을 기본적으로 넣을 수 없다.
    // 만약 null 을 허용하고 싶다면 null pointer exception 을 허용하고 싶다면 자료형에다가 ?을 붙인다.

}