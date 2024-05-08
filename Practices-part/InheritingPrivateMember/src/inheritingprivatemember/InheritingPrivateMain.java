package inheritingprivatemember;

/**
 * @author MD KUTUB UDDIN
 */
public class InheritingPrivateMain {

    public static void main(String[] args) {

        Apple a = new Apple();
        a.setMakeText("Massage");
        a.setCamera("50 Px");
        a.setVideo("Mx Player");
        a.setPlayStore("Game");
        a.setAppStore("apple app");

        a.displayInformation();
    }
}
