package PolymorphismExercises;

/**
 * @author MD KUTUB UDDIN
 */
public class PolymorphismExercisesTest {

    public static void main(String[] args) {

        Manager m = new Manager(50000, 5000, "Sanaullah", "Manager");
        System.out.println(m);
        m.calculateSalary();

        Programmer p = new Programmer(40000, 5000, "Towhid", "Programmer");
        System.out.println(p);
        p.calculateSalary();

    }
}
