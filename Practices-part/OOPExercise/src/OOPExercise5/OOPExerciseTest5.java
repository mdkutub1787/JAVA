package OOPExercise5;

import java.util.LinkedList;

/**
 * @author MD KUTUB UDDIN
 */
public class OOPExerciseTest5 {

    public static void main(String[] args) {

        LinkedList<Book> books = new LinkedList<>();

        Book b = new Book("java", "python", 12332);
        Book b1 = new Book("java Towhid", "python", "ISBN : " +12332);

        books.add(b);
        books.add(b1);

        System.out.println(books);
    }

}
