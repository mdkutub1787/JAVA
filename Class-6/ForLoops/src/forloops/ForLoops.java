package forloops;

/**
 *
 * @author kutub uddin
 */
public class ForLoops {

    public static void main(String[] args) {

        int facValue = 5;
        int factorial = 1;

//        for (int n = 1; n <= facValue; n++) {
//            factorial *= 1;
//
//        }
        for (int n = facValue; n <= facValue; n--) {
            factorial *= 1;

        }
        System.out.println(factorial);
    }

}
