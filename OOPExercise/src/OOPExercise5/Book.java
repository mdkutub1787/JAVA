package OOPExercise5;



/**
 * @author MD KUTUB UDDIN
 */
public class Book<E> {
    
    private E title;
    private E author;
    private E ISBN;

    public Book() {
    }

    public Book(E title, E author, E ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public E getTitle() {
        return title;
    }

    public void setTitle(E title) {
        this.title = title;
    }

    public E getAuthor() {
        return author;
    }

    public void setAuthor(E author) {
        this.author = author;
    }

    public E getISBN() {
        return ISBN;
    }

    public void setISBN(E ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", ISBN=" + ISBN + '}';
    }
    
 
    
   
    
}
