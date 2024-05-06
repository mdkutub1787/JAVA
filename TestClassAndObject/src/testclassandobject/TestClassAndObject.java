
package testclassandobject;

/**
 * @author Kutub Uddin
 */
public class TestClassAndObject {

  
   public static void main(String[] args) {
       
        GetCircle getcircle =new GetCircle(10);
        
        double gc=getcircle.getArea();
        double gp=getcircle.getPerimeter();
        
        System.out.println(gc);
        System.out.println(gp);
        
    }
    
}
