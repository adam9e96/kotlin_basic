package ch_04_function

/**
 * fileName       : `03_function_unique`
 * date           : 2024-04-09
 * time           : 오후 2:41
 * ===========================================================
 * description    :
 */
fun main() {
    /**
     * 3. 함수 파라미터의 정의
     * 함수에 입력되는 파라미터는 마치 변수를 정의하듯이 '이름 : 타입'의 형태로 정의되며,
     * 여러 개의 파마티러가 정의될 경우 콤마로 구분.
     *
     * 코틀린에서 함수 파라미터를 통해 입력되는 모든 값은 변하지 않는 이뮤터블.
     * 따라서 코틀린에서는 함수 파라미터는 모드 읽기 전용 키워드인 `val` 이 생략된 형태라고 생각할 수 있음.
     *
     * 기본 형태
     * fun 함수이름 ((val 생략) name1: String, name2: Int, name3: Double) {실행코드}
     *
     *
     */

    /**
     * 3-1) 파라미터의 기본값 정의와 호출 (Default Parameter)
     * 파라미터는 정의할때 등호(=)를 사용해서 기본값을 설정할 수 있음.
     *
     * fun 함수이름 (name1: String, name2: Int =157, name3: Double = 34.5 ) { 실행코드 }
     *
     */
    fun newFun(name: String, age: Int = 29, weight: Double = 65.5) {
//        name = "tom"; // val cannot be reassigned
        println("name 값은 $name 입니다.")
        println("age 값은 ${age}입니다.")
        println("weight 값은 ${weight}입니다.")
    }
    // 정의된 nuwFun() 함수를 호출할 때 기본값이 없는 첫 번째 파라미터에만 값을 입력하면
    // 두 번째와 세 번째 파라미터에는 설정한 기본값이 자동으로 입력.


    newFun("Kim")
//    name 값은 Kim 입니다.
//    age 값은 29입니다.
//    weight 값은 65.5입니다.
//    newFun("")
    //    newFun() // Kotlin: No value passed for parameter 'name'

    /*
     * 2) 파라미터 이름으로 값을 입력하기
     * 함수에 정의된 파라미터가 많은 경우 입력하는 값의 의미가 명확하지 않을 때가 있음.
     * 이럴 경우 순서와 상관 없이 정의된 파라미터 이름을 지정해서 직접 값을 입력 할 수 있음.
     */
    // 자바스크립트에는 없는 기능
    newFun(name = "John HI NA", weight =100.0)
//    name 값은 John HI NA 입니다.
//    age 값은 29입니다.
//    weight 값은 100.0입니다.

    /*
     * 코틀린의 디폴트 파라미터를 자바에서 본다면 어떻게 처리할까
     * 자바와의 호환성
     * 자바에서는 디폴트 파라미터와 같은 기능이 없으므로, 코틀린 라이브러리의 디폴트 파라미터를 사용하는 함수를 자바 코드에서 호출할 때는 모든 인자를 명시적으로 제공해야 합니다.
     * 코틀린은 이 문제를 해결하기 위해 @JvmOverloads 어노테이션을 제공하여, 자바 코드에서 코틀린 함수를 오버로딩된 여러 버전으로 사용할 수 있게 합니다.
     */
    // 코틀린에서 @JvmOverloads 사용 예
    //    @JvmOverloads
    //    fun greet(name: String = "world") {
    //        println("Hello, $name!")
    //    }
    // 이렇게 하면, 자바에서 greet() 함수를 다양한 인자 조합으로 호출할 수 있게 됩니다.

}
