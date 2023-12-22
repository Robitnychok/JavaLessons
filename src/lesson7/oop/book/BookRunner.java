package lesson7.oop.book;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter","J.K.Rowling", 450, true );

        book.stringsAmount();
        book.stringsAmount(1);
        book.bookInformation();

    }
}
