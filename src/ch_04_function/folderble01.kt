package ch_04_function

/**
 * fileName       : folderble01
 * date           : 2024-04-11
 * time           : 오후 4:07
 * ===========================================================
 * description    : https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?hl=ko#6
 */
/**
 * 일반적으로 전원 버튼을 누르면 휴대전화 화면이 켜지고 꺼집니다. 이와 달리 폴더블 휴대전화는 접으면 전원을 버튼을 눌렀을 때 기기의 기본 내부 화면이 켜지지 않습니다.
 *
 * 다음 코드 스니펫에 제공된 초기 코드에서 Phone 클래스에서 상속받는 FoldablePhone 클래스를 작성합니다. 다음을 포함해야 합니다.
 *
 *     휴대전화가 접혀 있는지 나타내는 속성
 *     Phone 클래스와는 다른 switchOn() 함수 동작을 사용하여 휴대전화가 접혀 있지 않을 때만 화면이 켜지도록 합니다.
 *     접기 상태를 변경하는 메서드
 *
 */
fun main() {

}
class Phone(var isScreenLightOn: Boolean = false){
    fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}