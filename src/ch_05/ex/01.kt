package ch_05.ex

/**
 * fileName       : `01`
 * date           : 2024-04-12
 * time           : 오후 3:36
 * ===========================================================
 * description    :
 */
// Book 클래스
class Book {
    var code: Int = 0;
    var stock: Int = 0;
    lateinit var title: String;
    lateinit var author: String;
    override fun toString(): String {
        return "Book{code=$code, stock=$stock, title='$title', author='$author')"
    }
    // code; // 코드, title; // 제목, author; // 작가, stock; // 재고 숫자
    // 기본형은 lateinit 안됨
}

class BookManager {

    // Book의 객체를 저장할 리스트
    private val books = mutableListOf<Book>()

    fun insertBook() {
        /* 책 등록 */
        // 책 객체 생성
        // 책 정보를 초기화하고 리스트에 추가하는 코드
        var book = Book()
        book.code = 1000
        book.stock = 1000
        book.title = "문문"
        book.author = "문작가"
        books.add(book) // 새 객체를 생성하여 리스트에 추가

        book = Book() // 새로운 객체 생성
        book.code = 1000
        book.stock = 1234
        book.title = "홍준표"
        book.author = "홍준표"
        books.add(book) // 새 객체를 생성하여 리스트에 추가

        book = Book() // 새로운 객체 생성
        book.code = 1000
        book.stock = 1234
        book.title = "문준용"
        book.author = "문준용"
        books.add(book) // 새 객체를 생성하여 리스트에 추가

        book = Book()
        println("등록할 책의 정보를 입력해 주세요.")

        print("코드: ")
        book.code = readln().toInt()
        print("제목: ")
        book.title = readln().toString()
        print("작가: ")
        book.author = readln().toString()
        print("재고: ")
        book.stock = readln().toInt()
        books.add(book)
        println("책이 등록되었습니다.")
        println(book)
    }

    fun searchByKeyWord() {
        /* 키워드로 책 검색 */
        println("검색할 책의 제목을 입력해 주세요.")

        print("제목: ")
        val title = readln().toString()
        val books2 = mutableListOf<Book>() // 검색 결과를 저장할 임시 리스트

        for (book in books) {
//            println(book)
            if (book.title.contains(title)) {
                books2.add(book)
            }
        }
        if (books2.size > 0) {
            println("검색한 책의 정보는 아래와 같습니다.")
            for (book in books2) {
                println("코드 : ${book.code}, 제목 : ${book.title}, 작가: ${book.author}, 재고: ${book.stock}")
            }
        } else {
            println("검색된 책이 없습니다.")
        }


    }

    fun printAll() {
        /* 전체 목록 출력 */
        for (book in books) {
            println("코드 : ${book.code}, 제목 : ${book.title}, 작가: ${book.author}, 재고: ${book.stock}")
        }
    }

    private fun searchBookByCode(code: Int): Int {
        /* 코드로 책 찾기 */
        for (idx in 0..<books.size) {
            if (books[idx].code == code) {
                return idx
            }
        }
        return -1
    }

    fun rentBook() {
        /* 책 대여 */

        println("대여할 책의 코드를 입력해 주세요.")
        print("코드: ")
        val code = readln().toInt()

        print("대여 권수: ")
        val stock = readln().toInt()

        val idx = searchBookByCode(code)

        if (idx != -1) {
            // 일단 책이 있다는거 재고 비교하면됨
            if (stock < books[idx].stock) {
                books[idx].stock -= stock
                println("대여 성공")
                println("${stock}권이 대여되었습니다.")
                println("남은권수 ${books[idx].stock}") // 테스트
            } else {
                println("재고가 ${books[idx].stock}권이여서 대여할 수 없습니다")
            }
        } else {
            println("입력하신 코드의 책은 없습니다.")
        }
    }

    fun returnBook() {
        /* 책 반납 */
        println("반납할 책의 코드를 입력해 주세요.")
        print("코드: ")
        val code = readln().toInt()

        print("재고: ")
        val stock = readln().toInt()

        val idx = searchBookByCode(code)

        if (idx != -1) {
            books[idx].stock += stock
            println("${stock}권이 반납되었습니다.")
        } else {
            println("입력하신 코드의 책은 없습니다.")
        }
    }
}

fun main() {
    val manager = BookManager()
//        Book = Book()
//    Book[0] = (1000, "홍길동", "1000",1000)


    // 테스트 코드 start
//    exam.exam02.Main.accounts.get(0) = Account("123", "홍길동", 1000)

    while (true) {
        printMenu()
        print("선택: ")
        val choice: Int = readln().toInt()
        when (choice) {
            1 -> manager.insertBook()
            2 -> manager.searchByKeyWord()
            3 -> manager.rentBook()
            4 -> manager.returnBook()
            5 -> manager.printAll()
            6 -> {
                println("종료합니다.")
                return
            }

            else -> println("잘못누르셨습니다.\n다시선택해주세요.")
        }
    }
}

fun printMenu() {
    println("============Menu============")
    println("1. 책 등록")
    println("2. 책 검색")
    println("3. 책 대여")
    println("4. 책 반납")
    println("5. 책 전체출력")
    println("6. 종료")
    println()
}