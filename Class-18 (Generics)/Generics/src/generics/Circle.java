package generics;

/**
 *
 * @author MD KUTUB UDDIN
 */
public class Circle<N> extends Geometry<N> {

    private N radius;

    public Circle() {
    }

    public Circle(N radius) {
        this.radius = radius;
    }

    public Circle(N radius, N color, N filled) {
        super(color, filled);
        this.radius = radius;
    }

    public N getRadius() {
        return radius;
    }

    public void setRadius(N radius) {
        this.radius = radius;
    }

    @Override
    public <N> void getPerimetar() {
        // Circumference = 2 * π * radius
        System.out.println("Circumference of the circle: " + (Math.PI * 2 * Double.parseDouble(radius.toString())));
    }

    @Override
    public <N> void getArea() {
        // Area = π * radius^2
        System.out.println("Area of the circle: " + (Math.PI * Math.pow(Double.parseDouble(radius.toString()), 2)));
    }

}
