package geometric;

/**
 * @author MD KUTUB UDDIN
 */
public class RectangleTest extends GeometricObjectTest {

    private int heigth;
    private int width;

    public RectangleTest() {
    }

    public RectangleTest(int heigth, int width) {
        this.heigth = heigth;
        this.width = width;
    }

    public RectangleTest(int heigth, int width, String color, boolean filled) {
        super(color, filled);
        this.heigth = heigth;
        this.width = width;
    }

    @Override
    public double getArea() {
        return heigth * width;
    }

    @Override
    public double getRectangle() {
        return 2 * (heigth + width);
    }

}
