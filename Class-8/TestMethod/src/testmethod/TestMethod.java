package testmethod;

// * @author MD KUTUB UDDIN
public class TestMethod {

    public static void main(String[] args) {

        System.out.println(doSum(140.00, 20.0));
        System.out.println(doSum(150.00, 500.0));
        System.out.println(doSum(120.00, 30.0));
        System.out.println(doSum(100.00, 10.0));

    }

    public static int doSum(double number1, double number2) {

        int result = (int) (number1 + number2);
        return result;

    }
}
