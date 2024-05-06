package testclassinobject;

/**
 * @author MD KUTUB UDDIN
 */
public class PatametrisedMathod {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInformation("Kutub uddin", "Male", 1763001787);
        student1.displayInformation();

        Student student2 = new Student(); 
        student2.setInformation("Imtiaz", "Male", 1763121787);
        student2.displayInformation();

    }
}
