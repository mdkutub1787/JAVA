package exceptionhandeling;

/**
 * @author MD KUTUB UDDIN
 */
public class ExHandeling {

    public int quotion(int number1, int number2) {
        int result = 0;
        try {
            result = number1 / number2;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}
