package abstracepractce;

public class Rectangle extends Super{

   private int heigth;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int heigth, int width) {
        this.heigth = heigth;
        this.width = width;
    }

    public Rectangle(int heigth, int width, String color) {
        super(color);
        this.heigth = heigth;
        this.width = width;
    }

     
    
    @Override
    public void getArea() {

        System.out.println("Rectangle: " + heigth*width);

    }

 
    
    
}
