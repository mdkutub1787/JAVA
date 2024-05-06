
package testclassinobject;

/**
 * @author MD KUTUB UDDIN
 */
public class UseMathod {
    
public static void main(String[] args) {

        Student student1; // object declear
        student1 = new Student(); //object create

        student1.name = "Kutub uddin";
        student1.gender = "Male";
        student1.phone = 1763001787;
        student1.displayInformation();

        
        
        Student student2; // object declear
        student2 = new Student(); //object create

        student2.name = "imtiaz";
        student2.gender = "Male";
        student2.phone = 1763121787;

        student2.displayInformation();

    }
}
