package OOPExercise6;

/**
 * @author MD KUTUB UDDIN
 */
public class OOPExerciseTest6 {

    public static void main(String[] args) {

        Employee emp = new Employee("Emran Hossain", "HR Manager", 50000);

        System.out.println("Employee Details:");
        emp.employeeDetails();

        emp.updateSalary(10);
        System.out.println("\nAfter Update Salary + 10%:");
        emp.employeeDetails();

    }
}
