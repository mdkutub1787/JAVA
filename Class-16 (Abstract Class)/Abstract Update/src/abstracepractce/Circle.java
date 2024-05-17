package abstracepractce;

public class Circle extends Super{

   private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }
    
    
    

    @Override
    public void getArea() {

        System.out.println( "Circle : " +Math.PI*radius*radius);
    }

  
}
