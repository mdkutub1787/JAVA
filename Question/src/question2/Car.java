package question2;

/**
 * @author MD KUTUB UDDIN
 */
public class Car extends Vehicle {

    public Car() {
    }

    public Car(String regNumber, String brand, int year) {
        super(regNumber, brand, year);
    }

    @Override
    public void start() {
        System.out.println("Car engine started");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }

}
