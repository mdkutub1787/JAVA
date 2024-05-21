package OOPExercise3;

/**
 * @author MD KUTUB UDDIN
 */
public class Rectangle {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }

    public void getArea() {
        System.out.println(height*width);
    }

    public void getPerimeter() {
        System.out.println(2*(height+width));
    }
}
