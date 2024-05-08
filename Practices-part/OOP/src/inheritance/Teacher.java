package inheritance;

/**
 * @author MD KUTUB UDDIN
 */
public class Teacher extends Persion {

    String qualification;

    void displayInformation2() {
        displayInformation1();
        System.out.println("Qualification :" + qualification);
        System.out.println("\n");
    }
}
