package generics;

/**
 * @author MD KUTUB UDDIN
 */
public class Rectangle<N> extends Geometry<N> {

    private N height;
    private N width;

    public Rectangle() {
    }

    public Rectangle(N height, N width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(N height, N width, N color, N filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public N getHeight() {
        return height;
    }

    public void setHeight(N height) {
        this.height = height;
    }

    public N getWidth() {
        return width;
    }

    public void setWidth(N width) {
        this.width = width;
    }

    @Override
    public <N> void getPerimetar() {
        // Perimeter = 2 * (height + width)
        double perimeter = 2 * (Double.parseDouble(height.toString()) + Double.parseDouble(width.toString()));
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    @Override
    public <N> void getArea() {
        // Area = height * width
        double area = Double.parseDouble(height.toString()) * Double.parseDouble(width.toString());
        System.out.println("Area of the rectangle: " + area);
    }

}
