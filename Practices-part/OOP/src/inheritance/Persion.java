package inheritance;

/**
 * @author MD KUTUB UDDIN
 */
public class Persion {

    String name;
    String mail;
    int age;

    public Persion() {
    }

    public Persion(String name, String mail, int age) {
        this.name = name;
        this.mail = mail;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persion{" + "name=" + name + ", mail=" + mail + ", age=" + age + '}';
    }

    public void displayInformation() {

    }

   
}
