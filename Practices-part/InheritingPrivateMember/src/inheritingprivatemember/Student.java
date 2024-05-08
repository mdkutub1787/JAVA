package inheritingprivatemember;

/**
 * @author MD KUTUB UDDIN
 */
public class Student extends Mobail {

    private String name;
    private String mail;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void studentInformation() {

        System.out.println(getName());
        System.out.println(getMail());
        System.out.println(getAge());

        System.out.println("\n");
    }
}
