package towdinmensionalarray;

public class TowArraySum {

    public static void main(String[] args) {

        int[][] numer = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        int sum = doSumOfArrays(numer);
        System.out.println(sum);

    }

    public static int doSumOfArrays(int[][] myArrays) {
        int sum = 0;
        for (int row = 0; row < myArrays.length; row++) {
            for (int col = 0; col < myArrays[0].length; col++) {
                sum += myArrays[row][col];
            }

        }
        return sum;
    }

}
