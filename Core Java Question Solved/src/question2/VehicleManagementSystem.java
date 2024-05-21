package question2;

/**
 * @author MD KUTUB UDDIN
 */
public class VehicleManagementSystem {

    public static void main(String[] args) {

       Vehicle car=new Car("2022094", "Tata", 2023);
       Vehicle motorcycle=new Motorcycle("12182001252", "Suzuki", 2022);
        
        System.out.println(car);
        car.start();
        car.stop();
        
        System.out.println(motorcycle);
        motorcycle.start();
        motorcycle.stop();
    }

}
