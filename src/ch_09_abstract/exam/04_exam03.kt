package ch_09_abstract.exam

/**
 * fileName       : `04_exam03`
 * date           : 2024-04-22
 * time           : 오후 9:03
 * ===========================================================
 * description    :
 *
 * 문제: 다중 인터페이스와 추상 클래스를 활용한 동물 행동 시뮬레이션
 * 설명:
 *
 * 동물원을 모델링하는 프로그램을 작성해야 합니다. 여러 종류의 동물이 있으며, 각 동물은 다양한 행동을 할 수 있습니다. 이 시스템은 동물들이 하는 행동을 관리하고 시뮬레이션할 수 있어야 합니다.
 * 요구 사항:
 *
 *     Animal이라는 추상 클래스를 만듭니다. 이 클래스는 다음과 같은 추상 메서드를 가집니다:
 *         eat(): 동물이 음식을 먹는 행동을 시뮬레이션합니다.
 *         sleep(): 동물이 잠을 자는 행동을 시뮬레이션합니다.
 *
 *     Flyable과 Swimmable 두 개의 인터페이스를 정의합니다:
 *         Flyable: fly() 메서드를 포함하여, 날 수 있는 동물이 구현해야 합니다.
 *         Swimmable: swim() 메서드를 포함하여, 수영할 수 있는 동물이 구현해야 합니다.
 *
 *     Bird, Fish, Duck 세 가지 구체적인 동물 클래스를 만듭니다:
 *         Bird는 Animal을 상속받고 Flyable 인터페이스를 구현합니다.
 *         Fish는 Animal을 상속받고 Swimmable 인터페이스를 구현합니다.
 *         Duck는 Animal을 상속받고 Flyable, Swimmable 두 인터페이스를 모두 구현합니다.
 *
 *     각 동물 클래스에 적절한 행동을 구현하고, Main 클래스에서 이들 동물의 행동을 시뮬레이션합니다.
 */

abstract class Animal {
    abstract fun eat()
    abstract fun sleep()
}

interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}

class Bird : Animal(), Flyable {
    override fun eat() {
        println("Bird is eating")
    }

    override fun sleep() {
        println("Bird is sleeping")
    }

    override fun fly() {
        println("Bird is flying")
    }
}

class Fish : Animal(), Swimmable {
    override fun eat() {
        println("Fish is eating")
    }

    override fun sleep() {
        println("Fish is sleeping")
    }

    override fun swim() {
        println("Fish is swimming")
    }
}

class Duck : Animal(), Flyable, Swimmable {
    override fun eat() {
        println("Duck is eating")
    }

    override fun sleep() {
        println("Duck is sleeping")
    }

    override fun fly() {
        println("Duck is flying")
    }

    override fun swim() {
        println("Duck is swimming")
    }
}

fun main() {
    val animals = listOf<Animal>(Bird(), Fish(), Duck())
    animals.forEach { animal ->
        animal.eat()
        animal.sleep()
        if (animal is Flyable) {
            (animal as Flyable).fly()
        }
        if (animal is Swimmable) {
            (animal as Swimmable).swim()
        }
    }
}
