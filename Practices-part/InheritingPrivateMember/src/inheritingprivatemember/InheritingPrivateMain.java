package inheritingprivatemember;

/**
 * @author MD KUTUB UDDIN
 */
public class InheritingPrivateMain {

    public static void main(String[] args) {

//        Apple a = new Apple();
//        a.setMakeText("Massage");
//        a.setCamera("50 Px");
//        a.setVideo("Mx Player");
//        a.setPlayStore("Game");
//        a.setAppStore("apple app");
//        a.displayInformation();
//
//        Apple a1 = new Apple();
//        a1.setMakeText("Massanger");
//        a1.setCamera("100 Px");
//        a1.setVideo("Q Player");
//        a1.setPlayStore("Free Fire ");
//        a1.setAppStore("apple app2");
//        a1.displayInformation();

        Student s = new Student();
        s.setName("Kutub Uddin");
        s.setMail("Kutub13@gmail.com");
        s.setAge(23);
        s.studentInformation();
    }
}
