package OOPExercise4;

/**
 * @author MD KUTUB UDDIN
 */
public class Circle {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    public void getArea() {
        System.out.println("The area of the circle is : " + Math.PI * radius * radius);
    }

    public void getCircumference() {
        System.out.println("The circumference of the circle is : " + 2 * Math.PI * radius);
    }
}
