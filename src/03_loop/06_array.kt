package `03_loop`

fun main() {
    /*
     * 코틀린 뿐만 아니라 대부분의 컴퓨터 언어들은 이 처럼 여러 개의 값을 하나의 변수에 저장할 수 있도록
     * 배열 Array 과 컬렉션 Collection 이라는 데이터 타입을 제공.
     *
     * 1. 배열 Array
     * 여러 개의 값을 담을 수 있는 대표적인 자료형인 배열은 값을 담기 전에 먼저 배열 공간의 개수를 할당하거나
     * 초기화 시에 데이터를 저장해 두면 데이터의 개수만큼 배열을 크기가 결정.
     * 먼저 개수를 정해 놓고 사용해야 하며 중간에 개수를 추가하거나 제거할 수는 없음.
     *
     * 배열은 다른 데이터 타입과 마찬가지로 변수로 저장해서 사용할 수 있으며 다음과 같은 형태로 선언.
     * var 변수 = Array(개수)
     *
     *
     */
    // 배열 객체는 Int, Long, Char 등과 같은 기본 타입 뒤에 Array 를 붙여서 만듬
    val students: IntArray = IntArray(10) // 변수 student 에 Int(정수형) 공간을 10개 할당하라는 의미.
    println(students) // [I@6d311334 <-- 주소값 나옴
    var longArray = LongArray(10)
    var charArray = CharArray(10)
    var floatArray = FloatArray(10)
    var doubleArray = DoubleArray(10)

    println(students[0]) // -> 따로 초기화 하지 않으면 0으로 초기화.
    /*
     * 1) 문자열 배열에 빈 공간 할당하기
     * String 은 기본 타입이 아니기 때문에 StringArray는 없지만 다음과 같이 사용할 수 있음.
     * 수식이 조금 특이해 보일 수 있지만 일단은 괄호 안의 첫 번째 숫자인 10만 변경해서 사용하면
     * 그 숫자만큼 빈 문자열로 된 배열 공간을 할당.
     * -> 자바에서는 문자열 배열을 생성하면서 초기화 하지 않으면 `null` 이 초기값이 됨.
     * 하지만 코틀린은 기본적으로 null 사용을 허용하지 않기 때문에
     * 빈 문자열을 이용해서 따로 초기화 해야 함.
     */


    var stringArray = Array(10, {item->""}) // 빈문자열을 집어 넣음
    println(stringArray) // [Ljava.lang.String;@682a0b20
    println(stringArray[0])
//    var stringArray2 = Array(10, { abc => "" }) // test

    /*
     * 2) 값으로 배열 공간을 할당하기
     * arrayOf() 함수를 사용해서 String 값을 직접할당 할 수 있음.
     */
    var dayArray: Array<String> = arrayOf("MON","TUE","WED","THU","FRI","SAT","SUN")
    println(dayArray[0])

//    var intArray:IntArray = arrayOf(1,2,3,4,5,6,7,8,9,10) // <-- 이렇게 타입을 쓰면 안됨 맞기는 한데 직접 타입지정할려면 아래처럼 해야됨
    var intArray:Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)


    val squares = Array(10) { item -> ("") }
    println("squares : ${squares}")
    println(squares[0])
    /*
     * 3) 배열에 값 입력하기
     *
     * 다음은 배열의 인덱스에 있는 값을 바꾸는 방법을 다른 방식으로 표현한 것.
     * 이 두 방식은 표현식만 다를 뿐 동일한 코드
     * 1. 배열을 선언한 변수영 옆에 대괄호([])를 사용하고, 대괄호 안에 값을 저장할 위치의 인덱스 번호를 작성
     * 그리고 등호(=)를 사용해서 값을 입력하면 됨.
     * 배열명[인덱스] = 값
     *
     * 2. set메서드를 사용할 수 있음. 배열이 제공하는 set() 메서드에 인덱스와 값을 파라미터로 넘겨주면 됨.
     * 배열명.set(인덱스, 값)
     */
    students[0] = 90
    students.set(1,91)
    println(students[0])
    println(students[1])

    /*
     * 4) 배열에 있는 값 꺼내기
     * 값을 입력할 때와 같은 방식으로 인덱스로 값을 가져올 수 있음.
     * 저장할 때와 마찬가지로 대괄호 안에 인덱스를 입력해서 가져올 수 있으며 값을 꺼내는 배열의 메서드는 get()
     * 배열명[인덱스]
     * 배열명.get(인덱스)
     */
    // 배열 students의 일곱번째 값을 seventhValue 변수에 저장
    var seventhValue = students[6]

    // 배열 students의 열번째 값을 tenthValue 변수에 저장
    var tenthValue = students.get(9)

    println(seventhValue)
    println(tenthValue)

}