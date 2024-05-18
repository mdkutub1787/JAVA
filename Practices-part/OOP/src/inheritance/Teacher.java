package inheritance;

/**
 * @author MD KUTUB UDDIN
 */
public class Teacher extends Persion {

    String qualification;

    public Teacher() {
    }

    public Teacher(String qualification) {
        this.qualification = qualification;
    }

    public Teacher(String qualification, String name, String mail, int age) {
        super(name, mail, age);
        this.qualification = qualification;
    }

    
    @Override
    public void displayInformation() {
        System.out.println(this.qualification+" "+super.name+" "+super.mail+" " +super.age);

    }

  

   
    
    

}
