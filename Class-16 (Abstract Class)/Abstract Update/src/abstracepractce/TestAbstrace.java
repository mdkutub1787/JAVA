
package abstracepractce;


public class TestAbstrace {

    
    public static void main(String[] args) {

        Super r=new Rectangle(10, 20, "Red");
        
        r.getArea();
        
        Super c=new Circle(10, "Sobuj");
        c.getArea();
        
       Super t=new Triangle(10, 20, 30, "Blue");
        
        t.getArea();

    }
    
}
