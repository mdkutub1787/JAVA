package InterfaceExercise;

public class Circle implements ShapeSuper {

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
    public void getArea() {
        System.out.println(Math.PI * radius * radius);

    }

    @Override
    public void getPerimeter() {
        System.out.println(Math.PI * 2 * radius);
    }

}
