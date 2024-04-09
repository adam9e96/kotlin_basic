package `03_loop`

import java.util.*


/**
 * fileName       : `08_exam05`
 * date           : 2024-04-09
 * time           : 오후 4:40
 * ===========================================================
 * description    :
 */
fun main() {

    val max = 3
    val anos = Array(max, { "" }) // 통장번호
    val owners = Array(max, { "" }) // 예금주
    val balances = IntArray(max) // 잔액
    var idx = 0 // 생성된 계좌수
    var run = true

    while (run) {
        println("----------------------------------------------------------")
        println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료")
        println("----------------------------------------------------------")
        print("선택> ")

        val selectNo: Int = readln().trim().toInt()
        when (selectNo) {
            1 -> createAccount(idx, max)
//			2 -> viewAccountList()
//			3 -> deposit()
//			4 -> withdraw()
//			5 -> viewAccount()
            6 -> run = false
        }
    }
    println("프로그램 종료")
}

fun createAccount(idx: Int, max: Int) {

    if (idx == max) {
        println("생성 가능한 계좌의 범위를 초과했습니다.")
        return
    }
    println("--------------")
    println("계좌생성")
    println("--------------")
    print("계좌번호: ")
    val ano: String = readln().trim().toString()
    print("계좌주: ")
    val owner: String = readln().trim().toString()
    print("초기입금액: ")
    val balance: Int = readln().trim().toInt()
//    val newAccount: Account = Account(ano, owner, balance)
//    accounts.get(idx++) = newAccount
//    println("계좌가 생성되었습니다.")
//    println(Arrays.toString(accounts))
//    System.out.println(idx)

}
