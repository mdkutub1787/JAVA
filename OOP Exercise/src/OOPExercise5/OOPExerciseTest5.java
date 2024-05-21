package OOPExercise5;

import java.util.ArrayList;

/**
 * @author MD KUTUB UDDIN
 */
public class OOPExerciseTest5 {

    public static void main(String[] args) {

        Book b1 = new Book(" Java Programming", "Dennis Ritchie", "ISBN: 9780131101630");

        Book.addBook(b1);
     

        ArrayList< Book> b = Book.getBookCollection();

        for (Book book : b) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }

}
