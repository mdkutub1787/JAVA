package Exercises2;

/**
 * @author MD KUTUB UDDIN
 */
public class TestExercise2 {

    public static void main(String[] args) {

        Shape circle = new Circle(4);
        circle.getArea();
        circle.getPerimeter();
        System.out.println(circle);

        Shape tringle = new Triangle(3, 4, 5);
        tringle.getArea();
        tringle.getPerimeter();
        System.out.println(tringle);

    }

}
