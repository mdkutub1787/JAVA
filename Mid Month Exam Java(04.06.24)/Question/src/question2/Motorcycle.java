package question2;

/**
 * @author MD KUTUB UDDIN
 */
public class Motorcycle extends Vehicle {

    public Motorcycle() {
    }

    public Motorcycle(String regNumber, String brand, int year) {
        super(regNumber, brand, year);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle engine stopped");
    }
    
    

}
