package PolymorphismExercises;

public class Manager extends Employee {

    private double basicSalary;
    private double bonus;

    public Manager() {
    }

    public Manager(double basicSalary, double bonus) {
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public Manager(double basicSalary, double bonus, String name, String role) {
        super(name, role);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Total Salary Tk : " + (basicSalary + bonus));

    }

}
