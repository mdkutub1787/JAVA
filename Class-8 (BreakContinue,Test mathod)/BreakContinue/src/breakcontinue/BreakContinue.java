package breakcontinue;

/**
 * @author MD KUTUB UDDIN
 */
public class BreakContinue {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i == 10) {
                continue;  //break;
            }
            System.out.println(i);

        }

    }

}
