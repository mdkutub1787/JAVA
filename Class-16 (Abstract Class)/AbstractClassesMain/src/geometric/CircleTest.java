package geometric;

/**
 * @author MD KUTUB UDDIN
 */
public class CircleTest extends GeometricObjectTest {

    private int radius;

    public CircleTest() {
    }

    public CircleTest(int radius) {
        this.radius = radius;
    }

    public CircleTest(int radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getRectangle() {
        return Math.PI * radius * 2;
    }

}
