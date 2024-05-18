package bubblesort;

/**
 * @author MD KUTUB UDDIN
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] b = {30, 20, 50, 60, 70, 90, 12, 5, 35};

        int temp;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length - 1 - i; j++) {
                if (b[j] > b[j + 1]) {
                    temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.print("New Bubble Sort : ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
        }
        System.out.println();
    }

}
