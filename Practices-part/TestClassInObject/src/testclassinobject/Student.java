package testclassinobject;

/**
 * @author MD KUTUB UDDIN
 */
public class Student {

    String name, gender;
    int phone;

   void setInformation(String n,String g,int ph) {
        name=n;
        gender=g;
        phone=ph;
            
    }

    void displayInformation() {

        System.out.println("Name  :" + name);
        System.out.println("Gender:" + gender);
        System.out.println("Phone : " + phone);
        System.out.println("\n");
    }

}
