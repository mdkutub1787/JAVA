
package question2;

/**
 * @author MD KUTUB UDDIN
 */
public abstract class Vehicle {
    
    private String regNumber;
    private String brand;
    private int year;

    public Vehicle() {
    }

    public Vehicle(String regNumber, String brand, int year) {
        this.regNumber = regNumber;
        this.brand = brand;
        this.year = year;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "regNumber=" + regNumber + ", brand=" + brand + ", year=" + year + '}';
    }
    
    public abstract void start();
    public abstract void stop();
    
}
