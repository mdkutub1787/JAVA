package abstractclassesmain;

import geometric.CircleTest;
import geometric.GeometricObjectTest;
import geometric.RectangleTest;

/**
 * @author MD KUTUB UDDIN
 */
public class AbstractClassMain {

    public static void main(String[] args) {

        GeometricObjectTest circle = new CircleTest(10);
        GeometricObjectTest rectangle = new RectangleTest(20, 15);

        circle.setColor("Black");

        displayGeometricObject(circle);
        displayGeometricObject(rectangle);
    }

    public static void displayGeometricObject(GeometricObjectTest obj) {
        System.out.println();
        System.out.println("The Area is : " + obj.getArea());
        System.out.println("The Rectangle is : " + obj.getArea());

    }

}
