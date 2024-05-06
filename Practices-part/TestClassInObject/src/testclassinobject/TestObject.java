package testclassinobject;

/**
 * @author MD KUTUB UDDIN
 */
public class TestObject {

    public static void main(String[] args) {

        Student student1; // object declear
        student1 = new Student(); //object create

        student1.name = "Kutub uddin";
        student1.gender = "Male";
        student1.phone = 1763001787;

        System.out.println("Name  : " + student1.name);
        System.out.println("Gender:" + student1.gender);
        System.out.println("Phone : " + student1.phone);
        
        
        Student student2; // object declear
        student2 = new Student(); //object create

        student2.name = "imtiaz";
        student2.gender = "Male";
        student2.phone = 1763121787;

        System.out.println("Name  : " + student2.name);
        System.out.println("Gender:" + student2.gender);
        System.out.println("Phone : " + student2.phone);

    }
}
