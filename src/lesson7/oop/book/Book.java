package lesson7.oop.book;

public class Book {
    String nameOfTheBook;
    String nameOfTheAuthor;
    int amountOfPages;
    boolean documental;

    public Book(String nameOfTheBook, String nameOfTheAuthor, int amountOfPages, boolean documental) {
        this.nameOfTheBook = nameOfTheBook;
        this.nameOfTheAuthor = nameOfTheAuthor;
        this.amountOfPages = amountOfPages;
        this.documental = documental;
    }

    public void stringsAmount() {
        int strings = amountOfPages * 40;
        System.out.println(strings);
    }

    public void stringsAmount(int countOfStrings) {
        int strings = amountOfPages * countOfStrings;
        System.out.println(strings);
    }

    public void bookInformation (){

        System.out.printf("%s by %s - "+ (documental ? "documental" : "not documental"), nameOfTheBook, nameOfTheAuthor) ;

    }
}
