package `03_loop`

fun main() {
    /*
     * 쓬닔媛 엯젰맆 븣源뚯, 궗슜옄媛 엯젰븳 젙닔쓽 빀怨꾨 怨꾩궛븯뿬 異쒕젰븯뒗 봽濡쒓렇옩쓣 옉꽦븯꽭슂.
	 * while臾몄쓣 궗슜, break 궗슜븯吏 留 寃
	 * 1) while臾몄쑝濡 옉뾽
	 * 2) do while臾몄쑝濡 옉뾽
     */

    // 궗슜옄媛 젙닔瑜 엯젰븿
    var value = 0
    var sum: Int = 0
    while (value >=0) {
        println("젙닔瑜 엯젰븯꽭슂.")
        value = readln().toInt()
        sum += value
    }
    println("늻쟻 빀 : ${sum}")
}