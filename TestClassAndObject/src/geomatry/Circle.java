
package geomatry;

/**
 * @author MD KUTUB UDDIN
 */
public class Circle {
    
}
package geometry;

public class Circle {
    
    private double radius = 1; // Changed variable name to 'radius' and marked it private
    
    public Circle() {
    }
    
    public Circle(double newRadius){
        radius = newRadius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double newRadius) {
        if (newRadius >= 0) { // Ensures that the radius cannot be negative
            radius = newRadius;
        } else {
            System.out.println("Radius cannot be negative.");
        }
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
