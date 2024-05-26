package InterfaceExercise;

/**
 * @author MD KUTUB UDDIN
 */
public class TestInterfaceExercise {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 12);
        rectangle.getArea();
        rectangle.getPerimeter();

        Circle circle = new Circle(10);
        circle.getArea();
        circle.getPerimeter();

        Triangle triangle = new Triangle(10, 20, 30);
        triangle.getArea();
        triangle.getPerimeter();
    }
}
