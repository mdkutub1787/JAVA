package inheritance;

/**
 * @author MD KUTUB UDDIN
 */
public class Test {

    public static void main(String[] args) {
        Teacher t = new Teacher();

        t.name = "Kutub Uddin";
        t.mail = "Kutubuddin123@gmail.com";
        t.age = 23;
        t.qualification = "JEE";
        t.displayInformation2();
        
        Teacher t1 = new Teacher();

        t1.name = "Imtiaz Hossain";
        t1.mail = "Imtiazuddin523@gmail.com";
        t1.age = 24;
        t1.qualification = "NT";
        t1.displayInformation2();
    }
}
