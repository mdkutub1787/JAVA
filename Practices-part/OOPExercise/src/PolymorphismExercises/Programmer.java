package PolymorphismExercises;

public class Programmer extends Employee {

    private double basicSalary;
    private double overtimePay;

    public Programmer() {
    }

    public Programmer(double basicSalary, double overtimePay) {
        this.basicSalary = basicSalary;
        this.overtimePay = overtimePay;
    }

    public Programmer(double basicSalary, double overtimePay, String name, String role) {
        super(name, role);
        this.basicSalary = basicSalary;
        this.overtimePay = overtimePay;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Total Salary Tk : " + (basicSalary + overtimePay));
    }

}
