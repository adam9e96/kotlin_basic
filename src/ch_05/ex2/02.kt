package ch_05.ex2


/**
 * fileName       : `02`
 * date           : 2024-04-14
 * time           : 오후 7:11
 * ===========================================================
 * description    :
 */
class Book(var code: Int, var stock: Int, var title: String, var author: String) {
    override fun toString() = "Book{code=$code, stock=$stock, title='$title', author='$author')"
}

class BookManager {
    private val books = mutableListOf<Book>()

    fun insertBook() {
        val book = readBookDetails()
        books.add(book)
        println("책이 등록되었습니다.")
        println(book)
    }

    fun searchByKeyWord() {
        println("검색할 책의 제목을 입력해 주세요.")
        val title = readln()
        val filteredBooks = books.filter { it.title.contains(title) }

        if (filteredBooks.isNotEmpty()) {
            println("검색한 책의 정보는 아래와 같습니다.")
            filteredBooks.forEach { println(it) }
        } else {
            println("검색된 책이 없습니다.")
        }
    }

    fun rentBook() {
        val code = readInt("대여할 책의 코드를 입력해 주세요.")
        val stock = readInt("대여 권수:")
        val book = books.find { it.code == code }

        book?.let {
            if (stock < it.stock) {
                it.stock -= stock
                println("대여 성공\n${stock}권이 대여되었습니다.\n남은권수 ${it.stock}")
            } else {
                println("재고가 ${it.stock}권이여서 대여할 수 없습니다")
            }
        } ?: println("입력하신 코드의 책은 없습니다.")
    }

    fun returnBook() {
        val code = readInt("반납할 책의 코드를 입력해 주세요.")
        val stock = readInt("재고:")
        val book = books.find { it.code == code }

        book?.let {
            it.stock += stock
            println("${stock}권이 반납되었습니다.")
        } ?: println("입력하신 코드의 책은 없습니다.")
    }

    fun printAll() {
        books.forEach { println(it) }
    }

    private fun readBookDetails(): Book {
        println("등록할 책의 정보를 입력해 주세요.")
        val code = readInt("코드:")
        val title = readString("제목:")
        val author = readString("작가:")
        val stock = readInt("재고:")
        return Book(code, stock, title, author)
    }

    private fun readInt(prompt: String): Int {
        println(prompt)
        return readln().toInt()
    }

    private fun readString(prompt: String): String {
        println(prompt)
        return readln()
    }
}

fun main() {
    val manager = BookManager()
    while (true) {
        printMenu()
        when (val choice = readInt("선택:")) {
            1 -> manager.insertBook()
            2 -> manager.searchByKeyWord()
            3 -> manager.rentBook()
            4 -> manager.returnBook()
            5 -> manager.printAll()
            6 -> return println("종료합니다.")
            else -> println("잘못누르셨습니다. 다시 선택해주세요.")
        }
    }
}

fun printMenu() {
    println("""
    ============Menu============
    1. 책 등록
    2. 책 검색
    3. 책 대여
    4. 책 반납
    5. 책 전체출력
    6. 종료
    """.trimIndent())
}
fun readInt(prompt: String): Int {
    println(prompt)
    return try {
        readln().toInt()
    } catch (e: NumberFormatException) {
        println("잘못된 숫자 형식입니다. 다시 입력해 주세요.")
        readInt(prompt)  // 재귀적으로 호출하여 올바른 숫자를 입력할 때까지 반복
    }
}

fun readString(prompt: String): String {
    println(prompt)
    return readln()
}
