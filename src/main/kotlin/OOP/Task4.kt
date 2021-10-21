package main.kotlin.OOP

fun main() {
    val reader1 = Reader (  "Petrov V.V.", 34, "Design",
        "12/01/92", 8895958, 3)
    val reader2 = Reader ("Ivanov I.O.", 26, "Business",
        "24/12/86", 8895569, 4)

    val book1 = Book ("1984", "George Orwell")
    val book2 = Book ("The Idiot", "Fyodor Dostoevsky")
    val book3 = Book ("Orange Clockwork", "Anthony Burgess")
    val books = listOf(book1, book2, book3)

    reader1.takeBook()
    reader2.takeBook()
    reader1.returnBook()
    reader2.returnBook()
}

class Book(
    val bookName: String,
    val authorName: String,
    val books: List<String>,
    val fullName: String) {

    fun takeBook(books: List<Book>){
        println("$fullName взял следующие книги: $books")
    }
    fun returnBook(books: List<Book>){
        println("$fullName вернул следующие книги: $books")
    }
}
class Reader (
    val fullName: String,
    val readerNumber: Int,
    val faculty: String,
    val bithData: String,
    val phoneNumber: Int,
    val booknumber: Byte,
    val books: List<Book>)
{


    fun takeBook(){
        println("$fullName взял $booknumber книги")
    }

    fun returnBook(){
        println("$fullName вернул $booknumber книги")
    }
}