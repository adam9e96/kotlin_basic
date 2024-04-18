package ch_06

/**
 * fileName       : `03_ObjectDemo1`
 * date           : 2024-04-18
 * time           : 오후 5:50
 * ===========================================================
 * description    :
 */
/*
문제: 코틀린에서 싱글톤 패턴 구현하기
목표: Kotlin에서 싱글톤 패턴을 구현하여 애플리케이션 전체에서 하나의 인스턴스만 존재하도록 해야 합니다.

요구 사항:
DatabaseManager라는 클래스를 만듭니다.
이 클래스는 데이터베이스 연결을 관리해야 합니다.
클래스는 전체 애플리케이션에서 단 하나의 인스턴스만 존재해야 합니다.
인스턴스는 필요할 때 생성되어야 하며, 반복적인 초기화는 피해야 합니다.
작업 지시:
object 키워드를 사용하여 싱글톤을 구현합니다.
싱글톤 내부에서 초기화 블록을 사용하여 데이터베이스 연결을 시뮬레이션합니다.
인스턴스가 생성된 후 메시지를 출력하여 인스턴스가 성공적으로 생성되었음을 알립니다.
 */

// 싱글톤 객체로 DatabaseManager를 정의합니다.
object DatabaseManager {
    init {
        // 객체가 생성될 때 호출되는 초기화 블록
        println("객체생성 완료!")
    }

    fun connect() {
        // 데이터베이스 연결 로직을 시뮬레이션합니다.
        println("Database connected")
    }
}

fun main() {
    // DatabaseManager 인스턴스에 접근하여 connect 함수를 호출합니다.
//    DatabaseManager

    DatabaseManager.connect()
}
