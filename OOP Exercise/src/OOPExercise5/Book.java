package OOPExercise5;

import java.util.ArrayList;

/**
 * @author MD KUTUB UDDIN
 */
public class Book {

    private String title;
    private String author;
    private String ISBN;

    private static ArrayList<Book> bookColl = new ArrayList<Book>();

    public Book() {
    }

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static ArrayList<Book> getBookColl() {
        return bookColl;
    }

    public static void setBookColl(ArrayList<Book> bookColl) {
        Book.bookColl = bookColl;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", ISBN=" + ISBN + '}';
    }

    public void addBook(Book b) {
        System.out.println(bookColl.add(b));

    }

    public void removeBook(Book r) {
        System.out.println(bookColl.remove(r));
    }

    public static ArrayList< Book> getBookCollection() {
        return bookColl;
    }

}
