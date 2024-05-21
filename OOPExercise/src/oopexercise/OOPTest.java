
package oopexercise;

/**
 * @author MD KUTUB UDDIN
 */
public class OOPTest {
    
 public static void main(String[] args) {

        Person prson = new Person("Kutub Uddin", 23);
        Person prson1 = new Person("Raju Ahmed", 25);
        prson.getName();
        prson.getAge();

        System.out.println(prson);     
        System.out.println(prson1);     
                

    }
}