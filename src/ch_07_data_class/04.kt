package ch_07_data_class

/**
 * fileName       : `04`
 * date           : 2024-04-17
 * time           : 오후 2:35
 * ===========================================================
 * description    :
 */
/*
 3. 클래스의 상속
 코틀린에서 클래스를 상속 받으려면 부모 클래스에 open 키워드를 추가해야 함.
 메서드도 자식 클래스에서 오버라이딩하려면 부모 클래스의 메서드에 open 키워드를 추가.

 자바는 막을때 final 키워드를 사용했다면 코틀린은 허용할 때 open
 */

fun main() {
    open class Flower  {
        open fun waterFlower() {
            println("Water Flower")
        }
    }
    // 콜론 : 을 이용해 상속을 나타내면 됨
    class Rose: Flower() {
        // ()을 붙인다 -> 부모클래스의 생성자를 실행(호출)한다는 의미
        override fun waterFlower() {
            super.waterFlower()
            println("Rose is water flower")
        }
    }
    val rose = Rose()
    rose.waterFlower()
    // Water Flower
    // Rose is water flower
}