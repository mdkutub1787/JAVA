package Exercises2;

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRedius() {
        return radius;
    }

    public void setRedius(double radius) {
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
