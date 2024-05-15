package generics;

/**
 * @author MD KUTUB UDDIN
 */
public class GenericsMain {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        circle.getArea();
        circle.getPerimetar();

        
        Rectangle rectangle=new Rectangle(20, 15);
        rectangle.getArea();
        rectangle.getPerimetar();
    }
}
