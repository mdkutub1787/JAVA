package febonacciofmathod;

public class SubFebonacci {

  private long index;

    public long febonacci(long index) {

        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;

        } else {

            return febonacci(index - 1) + febonacci(index - 2);
        }

    }

}
